package demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModelDataExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	public ModelDataExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andSelectDateIsNull() {
			addCriterion("select_date is null");
			return (Criteria) this;
		}

		public Criteria andSelectDateIsNotNull() {
			addCriterion("select_date is not null");
			return (Criteria) this;
		}

		public Criteria andSelectDateEqualTo(Date value) {
			addCriterion("select_date =", value, "selectDate");
			return (Criteria) this;
		}

		public Criteria andSelectDateNotEqualTo(Date value) {
			addCriterion("select_date <>", value, "selectDate");
			return (Criteria) this;
		}

		public Criteria andSelectDateGreaterThan(Date value) {
			addCriterion("select_date >", value, "selectDate");
			return (Criteria) this;
		}

		public Criteria andSelectDateGreaterThanOrEqualTo(Date value) {
			addCriterion("select_date >=", value, "selectDate");
			return (Criteria) this;
		}

		public Criteria andSelectDateLessThan(Date value) {
			addCriterion("select_date <", value, "selectDate");
			return (Criteria) this;
		}

		public Criteria andSelectDateLessThanOrEqualTo(Date value) {
			addCriterion("select_date <=", value, "selectDate");
			return (Criteria) this;
		}

		public Criteria andSelectDateIn(List<Date> values) {
			addCriterion("select_date in", values, "selectDate");
			return (Criteria) this;
		}

		public Criteria andSelectDateNotIn(List<Date> values) {
			addCriterion("select_date not in", values, "selectDate");
			return (Criteria) this;
		}

		public Criteria andSelectDateBetween(Date value1, Date value2) {
			addCriterion("select_date between", value1, value2, "selectDate");
			return (Criteria) this;
		}

		public Criteria andSelectDateNotBetween(Date value1, Date value2) {
			addCriterion("select_date not between", value1, value2, "selectDate");
			return (Criteria) this;
		}

		public Criteria andPlusyearIsNull() {
			addCriterion("plusYear is null");
			return (Criteria) this;
		}

		public Criteria andPlusyearIsNotNull() {
			addCriterion("plusYear is not null");
			return (Criteria) this;
		}

		public Criteria andPlusyearEqualTo(Integer value) {
			addCriterion("plusYear =", value, "plusyear");
			return (Criteria) this;
		}

		public Criteria andPlusyearNotEqualTo(Integer value) {
			addCriterion("plusYear <>", value, "plusyear");
			return (Criteria) this;
		}

		public Criteria andPlusyearGreaterThan(Integer value) {
			addCriterion("plusYear >", value, "plusyear");
			return (Criteria) this;
		}

		public Criteria andPlusyearGreaterThanOrEqualTo(Integer value) {
			addCriterion("plusYear >=", value, "plusyear");
			return (Criteria) this;
		}

		public Criteria andPlusyearLessThan(Integer value) {
			addCriterion("plusYear <", value, "plusyear");
			return (Criteria) this;
		}

		public Criteria andPlusyearLessThanOrEqualTo(Integer value) {
			addCriterion("plusYear <=", value, "plusyear");
			return (Criteria) this;
		}

		public Criteria andPlusyearIn(List<Integer> values) {
			addCriterion("plusYear in", values, "plusyear");
			return (Criteria) this;
		}

		public Criteria andPlusyearNotIn(List<Integer> values) {
			addCriterion("plusYear not in", values, "plusyear");
			return (Criteria) this;
		}

		public Criteria andPlusyearBetween(Integer value1, Integer value2) {
			addCriterion("plusYear between", value1, value2, "plusyear");
			return (Criteria) this;
		}

		public Criteria andPlusyearNotBetween(Integer value1, Integer value2) {
			addCriterion("plusYear not between", value1, value2, "plusyear");
			return (Criteria) this;
		}

		public Criteria andPlusmonthIsNull() {
			addCriterion("plusMonth is null");
			return (Criteria) this;
		}

		public Criteria andPlusmonthIsNotNull() {
			addCriterion("plusMonth is not null");
			return (Criteria) this;
		}

		public Criteria andPlusmonthEqualTo(Integer value) {
			addCriterion("plusMonth =", value, "plusmonth");
			return (Criteria) this;
		}

		public Criteria andPlusmonthNotEqualTo(Integer value) {
			addCriterion("plusMonth <>", value, "plusmonth");
			return (Criteria) this;
		}

		public Criteria andPlusmonthGreaterThan(Integer value) {
			addCriterion("plusMonth >", value, "plusmonth");
			return (Criteria) this;
		}

		public Criteria andPlusmonthGreaterThanOrEqualTo(Integer value) {
			addCriterion("plusMonth >=", value, "plusmonth");
			return (Criteria) this;
		}

		public Criteria andPlusmonthLessThan(Integer value) {
			addCriterion("plusMonth <", value, "plusmonth");
			return (Criteria) this;
		}

		public Criteria andPlusmonthLessThanOrEqualTo(Integer value) {
			addCriterion("plusMonth <=", value, "plusmonth");
			return (Criteria) this;
		}

		public Criteria andPlusmonthIn(List<Integer> values) {
			addCriterion("plusMonth in", values, "plusmonth");
			return (Criteria) this;
		}

		public Criteria andPlusmonthNotIn(List<Integer> values) {
			addCriterion("plusMonth not in", values, "plusmonth");
			return (Criteria) this;
		}

		public Criteria andPlusmonthBetween(Integer value1, Integer value2) {
			addCriterion("plusMonth between", value1, value2, "plusmonth");
			return (Criteria) this;
		}

		public Criteria andPlusmonthNotBetween(Integer value1, Integer value2) {
			addCriterion("plusMonth not between", value1, value2, "plusmonth");
			return (Criteria) this;
		}

		public Criteria andPlusdayIsNull() {
			addCriterion("plusDay is null");
			return (Criteria) this;
		}

		public Criteria andPlusdayIsNotNull() {
			addCriterion("plusDay is not null");
			return (Criteria) this;
		}

		public Criteria andPlusdayEqualTo(Integer value) {
			addCriterion("plusDay =", value, "plusday");
			return (Criteria) this;
		}

		public Criteria andPlusdayNotEqualTo(Integer value) {
			addCriterion("plusDay <>", value, "plusday");
			return (Criteria) this;
		}

		public Criteria andPlusdayGreaterThan(Integer value) {
			addCriterion("plusDay >", value, "plusday");
			return (Criteria) this;
		}

		public Criteria andPlusdayGreaterThanOrEqualTo(Integer value) {
			addCriterion("plusDay >=", value, "plusday");
			return (Criteria) this;
		}

		public Criteria andPlusdayLessThan(Integer value) {
			addCriterion("plusDay <", value, "plusday");
			return (Criteria) this;
		}

		public Criteria andPlusdayLessThanOrEqualTo(Integer value) {
			addCriterion("plusDay <=", value, "plusday");
			return (Criteria) this;
		}

		public Criteria andPlusdayIn(List<Integer> values) {
			addCriterion("plusDay in", values, "plusday");
			return (Criteria) this;
		}

		public Criteria andPlusdayNotIn(List<Integer> values) {
			addCriterion("plusDay not in", values, "plusday");
			return (Criteria) this;
		}

		public Criteria andPlusdayBetween(Integer value1, Integer value2) {
			addCriterion("plusDay between", value1, value2, "plusday");
			return (Criteria) this;
		}

		public Criteria andPlusdayNotBetween(Integer value1, Integer value2) {
			addCriterion("plusDay not between", value1, value2, "plusday");
			return (Criteria) this;
		}

		public Criteria andSelectPlusDateIsNull() {
			addCriterion("select_plus_date is null");
			return (Criteria) this;
		}

		public Criteria andSelectPlusDateIsNotNull() {
			addCriterion("select_plus_date is not null");
			return (Criteria) this;
		}

		public Criteria andSelectPlusDateEqualTo(Date value) {
			addCriterion("select_plus_date =", value, "selectPlusDate");
			return (Criteria) this;
		}

		public Criteria andSelectPlusDateNotEqualTo(Date value) {
			addCriterion("select_plus_date <>", value, "selectPlusDate");
			return (Criteria) this;
		}

		public Criteria andSelectPlusDateGreaterThan(Date value) {
			addCriterion("select_plus_date >", value, "selectPlusDate");
			return (Criteria) this;
		}

		public Criteria andSelectPlusDateGreaterThanOrEqualTo(Date value) {
			addCriterion("select_plus_date >=", value, "selectPlusDate");
			return (Criteria) this;
		}

		public Criteria andSelectPlusDateLessThan(Date value) {
			addCriterion("select_plus_date <", value, "selectPlusDate");
			return (Criteria) this;
		}

		public Criteria andSelectPlusDateLessThanOrEqualTo(Date value) {
			addCriterion("select_plus_date <=", value, "selectPlusDate");
			return (Criteria) this;
		}

		public Criteria andSelectPlusDateIn(List<Date> values) {
			addCriterion("select_plus_date in", values, "selectPlusDate");
			return (Criteria) this;
		}

		public Criteria andSelectPlusDateNotIn(List<Date> values) {
			addCriterion("select_plus_date not in", values, "selectPlusDate");
			return (Criteria) this;
		}

		public Criteria andSelectPlusDateBetween(Date value1, Date value2) {
			addCriterion("select_plus_date between", value1, value2, "selectPlusDate");
			return (Criteria) this;
		}

		public Criteria andSelectPlusDateNotBetween(Date value1, Date value2) {
			addCriterion("select_plus_date not between", value1, value2, "selectPlusDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateEqualTo(Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThan(Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThan(Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIn(List<Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (Criteria) this;
		}

		public Criteria andCreateDateIsNotNull() {
			addCriterion("create_date is not null");
			return (Criteria) this;
		}

		public Criteria andCreateDateEqualTo(Date value) {
			addCriterion("create_date =", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotEqualTo(Date value) {
			addCriterion("create_date <>", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateGreaterThan(Date value) {
			addCriterion("create_date >", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
			addCriterion("create_date >=", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateLessThan(Date value) {
			addCriterion("create_date <", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateLessThanOrEqualTo(Date value) {
			addCriterion("create_date <=", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateIn(List<Date> values) {
			addCriterion("create_date in", values, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotIn(List<Date> values) {
			addCriterion("create_date not in", values, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateBetween(Date value1, Date value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotBetween(Date value1, Date value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (Criteria) this;
		}

		public Criteria andDeleteDateIsNull() {
			addCriterion("delete_date is null");
			return (Criteria) this;
		}

		public Criteria andDeleteDateIsNotNull() {
			addCriterion("delete_date is not null");
			return (Criteria) this;
		}

		public Criteria andDeleteDateEqualTo(Date value) {
			addCriterion("delete_date =", value, "deleteDate");
			return (Criteria) this;
		}

		public Criteria andDeleteDateNotEqualTo(Date value) {
			addCriterion("delete_date <>", value, "deleteDate");
			return (Criteria) this;
		}

		public Criteria andDeleteDateGreaterThan(Date value) {
			addCriterion("delete_date >", value, "deleteDate");
			return (Criteria) this;
		}

		public Criteria andDeleteDateGreaterThanOrEqualTo(Date value) {
			addCriterion("delete_date >=", value, "deleteDate");
			return (Criteria) this;
		}

		public Criteria andDeleteDateLessThan(Date value) {
			addCriterion("delete_date <", value, "deleteDate");
			return (Criteria) this;
		}

		public Criteria andDeleteDateLessThanOrEqualTo(Date value) {
			addCriterion("delete_date <=", value, "deleteDate");
			return (Criteria) this;
		}

		public Criteria andDeleteDateIn(List<Date> values) {
			addCriterion("delete_date in", values, "deleteDate");
			return (Criteria) this;
		}

		public Criteria andDeleteDateNotIn(List<Date> values) {
			addCriterion("delete_date not in", values, "deleteDate");
			return (Criteria) this;
		}

		public Criteria andDeleteDateBetween(Date value1, Date value2) {
			addCriterion("delete_date between", value1, value2, "deleteDate");
			return (Criteria) this;
		}

		public Criteria andDeleteDateNotBetween(Date value1, Date value2) {
			addCriterion("delete_date not between", value1, value2, "deleteDate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table select_plus_db
	 * @mbg.generated  Tue May 12 17:26:00 JST 2020
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table select_plus_db
     *
     * @mbg.generated do_not_delete_during_merge Tue May 12 17:18:56 JST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}