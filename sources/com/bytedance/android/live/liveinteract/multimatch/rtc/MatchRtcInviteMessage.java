package com.bytedance.android.live.liveinteract.multimatch.rtc;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.model.message.BattleInviteeGiftPermission;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestSetting;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MatchRtcInviteMessage {

    @InterfaceC65349Pkn("ab_test_setting")
    public List<BattleABTestSetting> abtestSettings;

    @InterfaceC65349Pkn("action_by_user")
    public final long actionUserId;

    @InterfaceC65349Pkn("battle_id")
    public final long battleId;

    @InterfaceC65349Pkn("create_time")
    public final long createTime;

    @InterfaceC65349Pkn("duration")
    public final int duration;

    @InterfaceC65349Pkn("invite_type")
    public final int inviteType;

    @InterfaceC65349Pkn("gift_permissions")
    public List<? extends BattleInviteeGiftPermission> inviteeGiftPermissionTypes;

    @InterfaceC65349Pkn("team_member")
    public List<? extends TeamUsersInfo> teamUsers;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchRtcInviteMessage)) {
            return false;
        }
        MatchRtcInviteMessage matchRtcInviteMessage = (MatchRtcInviteMessage) obj;
        return this.inviteType == matchRtcInviteMessage.inviteType && this.actionUserId == matchRtcInviteMessage.actionUserId && this.battleId == matchRtcInviteMessage.battleId && this.duration == matchRtcInviteMessage.duration && this.createTime == matchRtcInviteMessage.createTime && o.LJ(this.inviteeGiftPermissionTypes, matchRtcInviteMessage.inviteeGiftPermissionTypes) && o.LJ(this.teamUsers, matchRtcInviteMessage.teamUsers) && o.LJ(this.abtestSettings, matchRtcInviteMessage.abtestSettings);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.createTime, (JBR.LIZJ(this.battleId, JBR.LIZJ(this.actionUserId, this.inviteType * 31, 31), 31) + this.duration) * 31, 31);
        List<? extends BattleInviteeGiftPermission> list = this.inviteeGiftPermissionTypes;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        List<? extends TeamUsersInfo> list2 = this.teamUsers;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<BattleABTestSetting> list3 = this.abtestSettings;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchRtcInviteMessage(inviteType=");
        LIZ.append(this.inviteType);
        LIZ.append(", actionUserId=");
        LIZ.append(this.actionUserId);
        LIZ.append(", battleId=");
        LIZ.append(this.battleId);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", createTime=");
        LIZ.append(this.createTime);
        LIZ.append(", inviteeGiftPermissionTypes=");
        LIZ.append(this.inviteeGiftPermissionTypes);
        LIZ.append(", teamUsers=");
        LIZ.append(this.teamUsers);
        LIZ.append(", abtestSettings=");
        return C1NE.LIZIZ(LIZ, this.abtestSettings, ')', LIZ);
    }

    public MatchRtcInviteMessage(int i, long j, long j2, int i2, long j3, List<? extends BattleInviteeGiftPermission> list, List<? extends TeamUsersInfo> list2, List<BattleABTestSetting> list3) {
        this.inviteType = i;
        this.actionUserId = j;
        this.battleId = j2;
        this.duration = i2;
        this.createTime = j3;
        this.inviteeGiftPermissionTypes = list;
        this.teamUsers = list2;
        this.abtestSettings = list3;
    }

    public /* synthetic */ MatchRtcInviteMessage(int i, long j, long j2, int i2, long j3, List list, List list2, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, j2, i2, j3, (i3 & 32) != 0 ? null : list, (i3 & 64) != 0 ? null : list2, (i3 & 128) == 0 ? list3 : null);
    }
}
