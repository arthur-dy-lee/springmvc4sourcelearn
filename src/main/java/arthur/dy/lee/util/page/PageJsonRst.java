package arthur.dy.lee.util.page;

import java.io.Serializable;
import java.util.List;

/**
 * 常用分页类
 * @author arthur.lee.paincupid
 * @param <T>
 */
public class PageJsonRst<T> extends BaseJsonRst<T> implements Serializable{

	private static final long serialVersionUID = -2499539888499662054L;
	
	private List<T> rows;
	/**
	 * 总记录数
	 */
	private int total;
	/**
	 * 当前页
	 */
	private int currentPage = 1;
	/**
	 * 每页多少条
	 */
	private int pageSize = 20;
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public static <T> PageJsonRst<T> newSucc(List<T> t,long totalNum){
		PageJsonRst<T> rst = new PageJsonRst<T>();
		rst.setRows(t);
		rst.setSuccess(true);
		return rst;
	}
	
	public static <T> PageJsonRst<T> newSucc(List<T> t){
		PageJsonRst<T> rst = new PageJsonRst<T>();
		rst.setRows(t);
		rst.setSuccess(true);
		return rst;
	}
	
	public static <T> PageJsonRst<T> newFail(String msg){
		PageJsonRst<T> rst = new PageJsonRst<T>();
		rst.setMessage(msg);
		rst.setSuccess(false);
		return rst;
	}
}
