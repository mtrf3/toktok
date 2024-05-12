package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C15890jp;
import X.C77800Ug8;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* loaded from: classes14.dex */
public class LinkPlayerInfo {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    @InterfaceC65349Pkn("app_version")
    public int appVersion;

    @InterfaceC65349Pkn("is_last_meet_gift_score_threshold_applier")
    public boolean isLastMeetGiftScoreThresholdApplier;

    @InterfaceC65349Pkn("link_type_permission")
    public long linkTypePermission;

    @InterfaceC65349Pkn("fan_ticket")
    public long mFanTicket;

    @InterfaceC65349Pkn("fan_ticket_icon_type")
    public int mFanTicketType;

    @InterfaceC65349Pkn("linkmic_id_str")
    public String mInteractIdStr;

    @InterfaceC65349Pkn("link_type")
    public int mLinkType;

    @InterfaceC65349Pkn("modify_time")
    public long mModifyTime;

    @InterfaceC65349Pkn("role_type")
    public int mRoleType;

    @InterfaceC65349Pkn("user")
    public User mUser;

    @InterfaceC65349Pkn("online_status")
    public int onlineStatus;

    @InterfaceC65349Pkn("payed_money")
    public int paidMoney;

    @InterfaceC65349Pkn("permission_as_viewer")
    public int permissionAsViewer;

    @InterfaceC65349Pkn("shared_invitation_type")
    public int sharedInvitationType;

    @InterfaceC65349Pkn("tag_list")
    public List<String> tagKeyList;

    public final int hashCode() {
        User user = this.mUser;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkPlayerInfo{, mFanTicket=");
        LIZ.append(this.mFanTicket);
        LIZ.append(", mFanTicketType=");
        LIZ.append(this.mFanTicketType);
        LIZ.append(", mUser=");
        LIZ.append(this.mUser);
        LIZ.append(", mModifyTime=");
        LIZ.append(this.mModifyTime);
        LIZ.append(", mLinkStatus=");
        LIZ.append(this.LIZ);
        LIZ.append(", mLinkType=");
        LIZ.append(this.mLinkType);
        LIZ.append(", mRoleType=");
        LIZ.append(this.mRoleType);
        LIZ.append(", paidMoney=");
        C15890jp.LIZIZ(LIZ, this.paidMoney, ", linkDuration=", 0, ", mInteractIdStr='");
        return C77800Ug8.LIZJ(LIZ, this.mInteractIdStr, '\'', '}', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
        User user = this.mUser;
        if (user != null && linkPlayerInfo.mUser != null && user.getIdStr().equals(linkPlayerInfo.mUser.getIdStr())) {
            return true;
        }
        return false;
    }
}
