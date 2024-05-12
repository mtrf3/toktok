package com.ss.android.ugc.aweme.commercialize.advideo;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoAuthorizationResponse implements Serializable {

    @InterfaceC65349Pkn("pushing_invitation")
    public final InvitationInfo pushingInvitation;

    @InterfaceC65349Pkn("status_code")
    public final int status_code;

    @InterfaceC65349Pkn("status_msg")
    public final String status_msg;

    public static /* synthetic */ VideoAuthorizationResponse copy$default(VideoAuthorizationResponse videoAuthorizationResponse, int i, String str, InvitationInfo invitationInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoAuthorizationResponse.status_code;
        }
        if ((i2 & 2) != 0) {
            str = videoAuthorizationResponse.status_msg;
        }
        if ((i2 & 4) != 0) {
            invitationInfo = videoAuthorizationResponse.pushingInvitation;
        }
        return videoAuthorizationResponse.copy(i, str, invitationInfo);
    }

    public final VideoAuthorizationResponse copy(int i, String status_msg, InvitationInfo invitationInfo) {
        o.LJIIIZ(status_msg, "status_msg");
        return new VideoAuthorizationResponse(i, status_msg, invitationInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAuthorizationResponse)) {
            return false;
        }
        VideoAuthorizationResponse videoAuthorizationResponse = (VideoAuthorizationResponse) obj;
        return this.status_code == videoAuthorizationResponse.status_code && o.LJ(this.status_msg, videoAuthorizationResponse.status_msg) && o.LJ(this.pushingInvitation, videoAuthorizationResponse.pushingInvitation);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoAuthorizationResponse(status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", status_msg=");
        LIZ.append(this.status_msg);
        LIZ.append(", pushingInvitation=");
        LIZ.append(this.pushingInvitation);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.status_msg, this.status_code * 31, 31);
        InvitationInfo invitationInfo = this.pushingInvitation;
        if (invitationInfo == null) {
            hashCode = 0;
        } else {
            hashCode = invitationInfo.hashCode();
        }
        return LJ + hashCode;
    }

    public final InvitationInfo getPushingInvitation() {
        return this.pushingInvitation;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public VideoAuthorizationResponse(int i, String status_msg, InvitationInfo invitationInfo) {
        o.LJIIIZ(status_msg, "status_msg");
        this.status_code = i;
        this.status_msg = status_msg;
        this.pushingInvitation = invitationInfo;
    }
}
