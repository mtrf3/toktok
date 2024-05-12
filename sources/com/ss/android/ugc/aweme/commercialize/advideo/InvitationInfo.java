package com.ss.android.ugc.aweme.commercialize.advideo;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class InvitationInfo implements Serializable {

    @InterfaceC65349Pkn("applied_end_time")
    public final long appliedEndTime;

    @InterfaceC65349Pkn("applied_start_time")
    public final long appliedStartTime;

    @InterfaceC65349Pkn("ba_user_id")
    public final String baUserId;

    @InterfaceC65349Pkn("ba_user_name")
    public final String baUserName;

    @InterfaceC65349Pkn("end_time")
    public final long endTime;

    @InterfaceC65349Pkn("invitation_status")
    public final InvitationStatus invitationStatus;

    @InterfaceC65349Pkn("start_time")
    public final long startTime;

    @InterfaceC65349Pkn("video_info")
    public final AdVideoInfo videoInfo;

    public static /* synthetic */ InvitationInfo copy$default(InvitationInfo invitationInfo, AdVideoInfo adVideoInfo, String str, String str2, InvitationStatus invitationStatus, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            adVideoInfo = invitationInfo.videoInfo;
        }
        if ((i & 2) != 0) {
            str = invitationInfo.baUserId;
        }
        if ((i & 4) != 0) {
            str2 = invitationInfo.baUserName;
        }
        if ((i & 8) != 0) {
            invitationStatus = invitationInfo.invitationStatus;
        }
        if ((i & 16) != 0) {
            j = invitationInfo.startTime;
        }
        if ((i & 32) != 0) {
            j2 = invitationInfo.endTime;
        }
        if ((i & 64) != 0) {
            j3 = invitationInfo.appliedStartTime;
        }
        if ((i & 128) != 0) {
            j4 = invitationInfo.appliedEndTime;
        }
        return invitationInfo.copy(adVideoInfo, str, str2, invitationStatus, j, j2, j3, j4);
    }

    public final InvitationInfo copy(AdVideoInfo adVideoInfo, String str, String str2, InvitationStatus invitationStatus, long j, long j2, long j3, long j4) {
        return new InvitationInfo(adVideoInfo, str, str2, invitationStatus, j, j2, j3, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvitationInfo)) {
            return false;
        }
        InvitationInfo invitationInfo = (InvitationInfo) obj;
        return o.LJ(this.videoInfo, invitationInfo.videoInfo) && o.LJ(this.baUserId, invitationInfo.baUserId) && o.LJ(this.baUserName, invitationInfo.baUserName) && this.invitationStatus == invitationInfo.invitationStatus && this.startTime == invitationInfo.startTime && this.endTime == invitationInfo.endTime && this.appliedStartTime == invitationInfo.appliedStartTime && this.appliedEndTime == invitationInfo.appliedEndTime;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        AdVideoInfo adVideoInfo = this.videoInfo;
        int i = 0;
        if (adVideoInfo == null) {
            hashCode = 0;
        } else {
            hashCode = adVideoInfo.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.baUserId;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.baUserName;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        InvitationStatus invitationStatus = this.invitationStatus;
        if (invitationStatus != null) {
            i = invitationStatus.hashCode();
        }
        return C16880lQ.LLJIJIL(this.appliedEndTime) + JBR.LIZJ(this.appliedStartTime, JBR.LIZJ(this.endTime, JBR.LIZJ(this.startTime, (i4 + i) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InvitationInfo(videoInfo=");
        LIZ.append(this.videoInfo);
        LIZ.append(", baUserId=");
        LIZ.append(this.baUserId);
        LIZ.append(", baUserName=");
        LIZ.append(this.baUserName);
        LIZ.append(", invitationStatus=");
        LIZ.append(this.invitationStatus);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", endTime=");
        LIZ.append(this.endTime);
        LIZ.append(", appliedStartTime=");
        LIZ.append(this.appliedStartTime);
        LIZ.append(", appliedEndTime=");
        return C47135Ieh.LIZIZ(LIZ, this.appliedEndTime, ')', LIZ);
    }

    public final long getAppliedEndTime() {
        return this.appliedEndTime;
    }

    public final long getAppliedStartTime() {
        return this.appliedStartTime;
    }

    public final String getBaUserId() {
        return this.baUserId;
    }

    public final String getBaUserName() {
        return this.baUserName;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final InvitationStatus getInvitationStatus() {
        return this.invitationStatus;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final AdVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public InvitationInfo(AdVideoInfo adVideoInfo, String str, String str2, InvitationStatus invitationStatus, long j, long j2, long j3, long j4) {
        this.videoInfo = adVideoInfo;
        this.baUserId = str;
        this.baUserName = str2;
        this.invitationStatus = invitationStatus;
        this.startTime = j;
        this.endTime = j2;
        this.appliedStartTime = j3;
        this.appliedEndTime = j4;
    }
}
