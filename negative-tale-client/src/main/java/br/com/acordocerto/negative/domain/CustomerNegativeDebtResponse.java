package br.com.acordocerto.negative.domain;

import java.io.Serializable;

public class CustomerNegativeDebtResponse implements Serializable {
    private static final long serialVersionUID = 1483386774463821314L;
    private String  customerIdHash;
    private Integer score0;
    private Integer score1;
    private Integer score2;
    private Integer score3;
    private Integer score4;
    private Integer score5;
    private Double  percChangePrevMonth;

    public String getCustomerIdHash() {
        return customerIdHash;
    }

    public void setCustomerIdHash(String customerIdHash) {
        this.customerIdHash = customerIdHash;
    }

    public Integer getScore0() {
        return score0;
    }

    public void setScore0(Integer score0) {
        this.score0 = score0;
    }

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public Integer getScore3() {
        return score3;
    }

    public void setScore3(Integer score3) {
        this.score3 = score3;
    }

    public Integer getScore4() {
        return score4;
    }

    public void setScore4(Integer score4) {
        this.score4 = score4;
    }

    public Integer getScore5() {
        return score5;
    }

    public void setScore5(Integer score5) {
        this.score5 = score5;
    }

    public Double getPercChangePrevMonth() {
        return percChangePrevMonth;
    }

    public void setPercChangePrevMonth(Double percChangePrevMonth) {
        this.percChangePrevMonth = percChangePrevMonth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerNegativeDebtResponse)) return false;

        CustomerNegativeDebtResponse response = (CustomerNegativeDebtResponse) o;

        return getCustomerIdHash().equals(response.getCustomerIdHash());
    }

    @Override
    public int hashCode() {
        return getCustomerIdHash().hashCode();
    }

    @Override
    public String toString() {
        return "Response{" +
                "customerIdHash='" + customerIdHash + '\'' +
                ", score0=" + score0 +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", score3=" + score3 +
                ", score4=" + score4 +
                ", score5=" + score5 +
                ", percChangePrevMonth=" + percChangePrevMonth +
                '}';
    }
}
