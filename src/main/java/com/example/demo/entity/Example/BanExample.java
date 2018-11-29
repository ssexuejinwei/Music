package com.example.demo.entity.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNull() {
            addCriterion("ADMINID is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("ADMINID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(String value) {
            addCriterion("ADMINID =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(String value) {
            addCriterion("ADMINID <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(String value) {
            addCriterion("ADMINID >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINID >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(String value) {
            addCriterion("ADMINID <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(String value) {
            addCriterion("ADMINID <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLike(String value) {
            addCriterion("ADMINID like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotLike(String value) {
            addCriterion("ADMINID not like", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<String> values) {
            addCriterion("ADMINID in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<String> values) {
            addCriterion("ADMINID not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(String value1, String value2) {
            addCriterion("ADMINID between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(String value1, String value2) {
            addCriterion("ADMINID not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andBantimeIsNull() {
            addCriterion("BANTIME is null");
            return (Criteria) this;
        }

        public Criteria andBantimeIsNotNull() {
            addCriterion("BANTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBantimeEqualTo(Date value) {
            addCriterion("BANTIME =", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeNotEqualTo(Date value) {
            addCriterion("BANTIME <>", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeGreaterThan(Date value) {
            addCriterion("BANTIME >", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BANTIME >=", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeLessThan(Date value) {
            addCriterion("BANTIME <", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeLessThanOrEqualTo(Date value) {
            addCriterion("BANTIME <=", value, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeIn(List<Date> values) {
            addCriterion("BANTIME in", values, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeNotIn(List<Date> values) {
            addCriterion("BANTIME not in", values, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeBetween(Date value1, Date value2) {
            addCriterion("BANTIME between", value1, value2, "bantime");
            return (Criteria) this;
        }

        public Criteria andBantimeNotBetween(Date value1, Date value2) {
            addCriterion("BANTIME not between", value1, value2, "bantime");
            return (Criteria) this;
        }

        public Criteria andBanreasonIsNull() {
            addCriterion("BANREASON is null");
            return (Criteria) this;
        }

        public Criteria andBanreasonIsNotNull() {
            addCriterion("BANREASON is not null");
            return (Criteria) this;
        }

        public Criteria andBanreasonEqualTo(String value) {
            addCriterion("BANREASON =", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonNotEqualTo(String value) {
            addCriterion("BANREASON <>", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonGreaterThan(String value) {
            addCriterion("BANREASON >", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonGreaterThanOrEqualTo(String value) {
            addCriterion("BANREASON >=", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonLessThan(String value) {
            addCriterion("BANREASON <", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonLessThanOrEqualTo(String value) {
            addCriterion("BANREASON <=", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonLike(String value) {
            addCriterion("BANREASON like", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonNotLike(String value) {
            addCriterion("BANREASON not like", value, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonIn(List<String> values) {
            addCriterion("BANREASON in", values, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonNotIn(List<String> values) {
            addCriterion("BANREASON not in", values, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonBetween(String value1, String value2) {
            addCriterion("BANREASON between", value1, value2, "banreason");
            return (Criteria) this;
        }

        public Criteria andBanreasonNotBetween(String value1, String value2) {
            addCriterion("BANREASON not between", value1, value2, "banreason");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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