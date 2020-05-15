package demo.model;

import java.util.Date;

public class ModelData {

	private Long id;

    private Date selectDate;

    private Integer plusyear = 0;

    private Integer plusmonth = 0;

    private Integer plusday = 0;

    private Date selectPlusDate;

    private Date updateDate;

    private Date createDate;

    private Date deleteDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSelectDate() {
        return selectDate;
    }

    public void setSelectDate(Date selectDate) {
        this.selectDate = selectDate;
    }

    public Integer getPlusyear() {
        return plusyear;
    }

    public void setPlusyear(Integer plusyear) {
        this.plusyear = plusyear;
    }

    public Integer getPlusmonth() {
        return plusmonth;
    }

    public void setPlusmonth(Integer plusmonth) {
        this.plusmonth = plusmonth;
    }

    public Integer getPlusday() {
        return plusday;
    }

    public void setPlusday(Integer plusday) {
        this.plusday = plusday;
    }

    public Date getSelectPlusDate() {
        return selectPlusDate;
    }

    public void setSelectPlusDate(Date selectPlusDate) {
        this.selectPlusDate = selectPlusDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }
}