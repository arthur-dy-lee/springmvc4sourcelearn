package arthur.dy.lee.util.page;

import java.io.Serializable;
import java.util.List;

/**
 * 此类为bootstrap-table类专用，因为要传入和传出一些参数，而且名字的属性不能更改
 * @author arthur.lee.paincupid
 *
 * @param <T>
 */
public class BootPageRst<T> extends BaseJsonRst<T> implements Serializable{

	private static final long serialVersionUID = -2499539888499662054L;
	
	private List<T> rows;
	/**
	 * 总记录数
	 */
	private int total;
	/**
	 * 当前页
	 */
	private int pageNumber = 1;
	/**
	 * 每页多少条
	 */
	private int pageSize = 20;
	//页面大小
	protected int limit=0;
	//页码
    protected int offset = 0;
     
    protected String order ="asc" ;

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public static <T> BootPageRst<T> newSucc(List<T> t,long totalNum){
		BootPageRst<T> rst = new BootPageRst<T>();
		rst.setRows(t);
		rst.setSuccess(true);
		return rst;
	}
	
	public static <T> BootPageRst<T> newSucc(List<T> t){
		BootPageRst<T> rst = new BootPageRst<T>();
		rst.setRows(t);
		rst.setSuccess(true);
		return rst;
	}
	
	public static <T> BootPageRst<T> newFail(String msg){
		BootPageRst<T> rst = new BootPageRst<T>();
		rst.setMessage(msg);
		rst.setSuccess(false);
		return rst;
	}
}
