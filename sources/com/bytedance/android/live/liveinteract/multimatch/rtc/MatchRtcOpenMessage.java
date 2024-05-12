package com.bytedance.android.live.liveinteract.multimatch.rtc;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MatchRtcOpenMessage {

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

    @InterfaceC65349Pkn("team_member")
    public List<? extends TeamUsersInfo> teamUsers;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchRtcOpenMessage)) {
            return false;
        }
        MatchRtcOpenMessage matchRtcOpenMessage = (MatchRtcOpenMessage) obj;
        return this.inviteType == matchRtcOpenMessage.inviteType && this.actionUserId == matchRtcOpenMessage.actionUserId && this.battleId == matchRtcOpenMessage.battleId && this.duration == matchRtcOpenMessage.duration && this.createTime == matchRtcOpenMessage.createTime && o.LJ(this.teamUsers, matchRtcOpenMessage.teamUsers);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.createTime, (JBR.LIZJ(this.battleId, JBR.LIZJ(this.actionUserId, this.inviteType * 31, 31), 31) + this.duration) * 31, 31);
        List<? extends TeamUsersInfo> list = this.teamUsers;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LIZJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchRtcOpenMessage(inviteType=");
        LIZ.append(this.inviteType);
        LIZ.append(", actionUserId=");
        LIZ.append(this.actionUserId);
        LIZ.append(", battleId=");
        LIZ.append(this.battleId);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", createTime=");
        LIZ.append(this.createTime);
        LIZ.append(", teamUsers=");
        return C1NE.LIZIZ(LIZ, this.teamUsers, ')', LIZ);
    }

    public MatchRtcOpenMessage(int i, long j, long j2, int i2, long j3, List<? extends TeamUsersInfo> list) {
        this.inviteType = i;
        this.actionUserId = j;
        this.battleId = j2;
        this.duration = i2;
        this.createTime = j3;
        this.teamUsers = list;
    }

    public /* synthetic */ MatchRtcOpenMessage(int i, long j, long j2, int i2, long j3, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, j2, i2, j3, (i3 & 32) != 0 ? null : list);
    }
}
