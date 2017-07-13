package party.pjc.blog.dao;

import java.util.List;

import party.pjc.blog.model.PageBean;
import party.pjc.blog.model.Post;
import party.pjc.blog.model.Post_Categories;
import party.pjc.blog.model.Post_Tags;

public interface PostDao {

	public Post findPostById(int id);//根据ID查找博文
	public Post findPostByTitle(String title);//根据标题查找博文
	public List<Post> findAllPost(int id);//查找所有博文
	
	public int insertPost(Post post);//插入博文
	public int insertPostAndTag(Post_Tags post_tag);//插入博文标签
	public int insertPostAndCate(Post_Categories post_cate);//插入博文类型
	public int updatePost(Post post);//更新博文
	public int deletePost(int id);//删除博文
	public int updatePostByRate(Post post);
	
	public List<Post> findPostLimit(PageBean pageBean);//分页显示博文
	
	public int getPostCount();//博文总数
	
	
	public List<Post> selectPostsAndTags(PageBean pageBean);//分页显示博文和标签
	
	
	public Post findUpPost(Integer id);//返回上一页博文
	public Post findDownPost(Integer id);//返回下一页博文
	
}
