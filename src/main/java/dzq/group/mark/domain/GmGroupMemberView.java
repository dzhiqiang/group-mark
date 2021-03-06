package dzq.group.mark.domain;

import java.util.Date;

/**
 * 团成员
 */
public class GmGroupMemberView {

    private Long id;

    private Long groupId;

    private String memberName;

    private boolean muchPeopleChecked;

    private Date createdDate;

    private Date modifiedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public boolean isMuchPeopleChecked() {
        return muchPeopleChecked;
    }

    public void setMuchPeopleChecked(boolean muchPeopleChecked) {
        this.muchPeopleChecked = muchPeopleChecked;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}
