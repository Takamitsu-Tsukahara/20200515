package demo.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ModelData {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column userinfo.id
	 * @mbg.generated  Fri May 15 12:21:17 JST 2020
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column userinfo.datadb
	 * @mbg.generated  Fri May 15 12:21:17 JST 2020
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date datadb;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column userinfo.id
	 * @return  the value of userinfo.id
	 * @mbg.generated  Fri May 15 12:21:17 JST 2020
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column userinfo.id
	 * @param id  the value for userinfo.id
	 * @mbg.generated  Fri May 15 12:21:17 JST 2020
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column userinfo.datadb
	 * @return  the value of userinfo.datadb
	 * @mbg.generated  Fri May 15 12:21:17 JST 2020
	 */
	public Date getDatadb() {
		return datadb;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column userinfo.datadb
	 * @param datadb  the value for userinfo.datadb
	 * @mbg.generated  Fri May 15 12:21:17 JST 2020
	 */
	public void setDatadb(Date datadb) {
		this.datadb = datadb;
	}
}