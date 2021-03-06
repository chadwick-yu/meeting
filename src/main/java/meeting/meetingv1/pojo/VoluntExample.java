package meeting.meetingv1.pojo;

import java.util.ArrayList;
import java.util.List;

public class VoluntExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table volunt
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table volunt
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table volunt
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbg.generated
     */
    public VoluntExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table volunt
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andMeetidIsNull() {
            addCriterion("meetid is null");
            return (Criteria) this;
        }

        public Criteria andMeetidIsNotNull() {
            addCriterion("meetid is not null");
            return (Criteria) this;
        }

        public Criteria andMeetidEqualTo(Integer value) {
            addCriterion("meetid =", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidNotEqualTo(Integer value) {
            addCriterion("meetid <>", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidGreaterThan(Integer value) {
            addCriterion("meetid >", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("meetid >=", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidLessThan(Integer value) {
            addCriterion("meetid <", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidLessThanOrEqualTo(Integer value) {
            addCriterion("meetid <=", value, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidIn(List<Integer> values) {
            addCriterion("meetid in", values, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidNotIn(List<Integer> values) {
            addCriterion("meetid not in", values, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidBetween(Integer value1, Integer value2) {
            addCriterion("meetid between", value1, value2, "meetid");
            return (Criteria) this;
        }

        public Criteria andMeetidNotBetween(Integer value1, Integer value2) {
            addCriterion("meetid not between", value1, value2, "meetid");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andIsproofIsNull() {
            addCriterion("isproof is null");
            return (Criteria) this;
        }

        public Criteria andIsproofIsNotNull() {
            addCriterion("isproof is not null");
            return (Criteria) this;
        }

        public Criteria andIsproofEqualTo(Integer value) {
            addCriterion("isproof =", value, "isproof");
            return (Criteria) this;
        }

        public Criteria andIsproofNotEqualTo(Integer value) {
            addCriterion("isproof <>", value, "isproof");
            return (Criteria) this;
        }

        public Criteria andIsproofGreaterThan(Integer value) {
            addCriterion("isproof >", value, "isproof");
            return (Criteria) this;
        }

        public Criteria andIsproofGreaterThanOrEqualTo(Integer value) {
            addCriterion("isproof >=", value, "isproof");
            return (Criteria) this;
        }

        public Criteria andIsproofLessThan(Integer value) {
            addCriterion("isproof <", value, "isproof");
            return (Criteria) this;
        }

        public Criteria andIsproofLessThanOrEqualTo(Integer value) {
            addCriterion("isproof <=", value, "isproof");
            return (Criteria) this;
        }

        public Criteria andIsproofIn(List<Integer> values) {
            addCriterion("isproof in", values, "isproof");
            return (Criteria) this;
        }

        public Criteria andIsproofNotIn(List<Integer> values) {
            addCriterion("isproof not in", values, "isproof");
            return (Criteria) this;
        }

        public Criteria andIsproofBetween(Integer value1, Integer value2) {
            addCriterion("isproof between", value1, value2, "isproof");
            return (Criteria) this;
        }

        public Criteria andIsproofNotBetween(Integer value1, Integer value2) {
            addCriterion("isproof not between", value1, value2, "isproof");
            return (Criteria) this;
        }

        public Criteria andFullIsNull() {
            addCriterion("full is null");
            return (Criteria) this;
        }

        public Criteria andFullIsNotNull() {
            addCriterion("full is not null");
            return (Criteria) this;
        }

        public Criteria andFullEqualTo(Integer value) {
            addCriterion("full =", value, "full");
            return (Criteria) this;
        }

        public Criteria andFullNotEqualTo(Integer value) {
            addCriterion("full <>", value, "full");
            return (Criteria) this;
        }

        public Criteria andFullGreaterThan(Integer value) {
            addCriterion("full >", value, "full");
            return (Criteria) this;
        }

        public Criteria andFullGreaterThanOrEqualTo(Integer value) {
            addCriterion("full >=", value, "full");
            return (Criteria) this;
        }

        public Criteria andFullLessThan(Integer value) {
            addCriterion("full <", value, "full");
            return (Criteria) this;
        }

        public Criteria andFullLessThanOrEqualTo(Integer value) {
            addCriterion("full <=", value, "full");
            return (Criteria) this;
        }

        public Criteria andFullIn(List<Integer> values) {
            addCriterion("full in", values, "full");
            return (Criteria) this;
        }

        public Criteria andFullNotIn(List<Integer> values) {
            addCriterion("full not in", values, "full");
            return (Criteria) this;
        }

        public Criteria andFullBetween(Integer value1, Integer value2) {
            addCriterion("full between", value1, value2, "full");
            return (Criteria) this;
        }

        public Criteria andFullNotBetween(Integer value1, Integer value2) {
            addCriterion("full not between", value1, value2, "full");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table volunt
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table volunt
     *
     * @mbg.generated
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
}