package dzq.group.mark.domain;

import org.springframework.util.StringUtils;

import java.math.BigDecimal;

public class MemberSetResponse {

    private long groupMemberId;

    private String memberName;

    private String direction;

    private BigDecimal setMoney = new BigDecimal(0);

    public long getGroupMemberId() {
        return groupMemberId;
    }

    public void setGroupMemberId(long groupMemberId) {
        this.groupMemberId = groupMemberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public BigDecimal getSetMoney() {
        return setMoney;
    }

    public void setSetMoney(BigDecimal setMoney) {
        this.setMoney = setMoney;
    }

    public void accumulate(String dirType, BigDecimal moneyValue) {
        if ("payer".equals(dirType)) {
            setMoney.add(moneyValue);
        }
        if ("share".equals(moneyValue)) {
            setMoney.subtract(moneyValue);
        }
    }
}
