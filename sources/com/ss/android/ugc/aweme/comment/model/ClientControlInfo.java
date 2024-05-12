package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ClientControlInfo {

    @InterfaceC65349Pkn("event_tracking_info")
    public final EventTrackingInfo eventTrackingInfo;

    @InterfaceC65349Pkn("invite_card_control_info")
    public final InviteCardControlInfo inviteCardControlInfo;

    @InterfaceC65349Pkn("rec_card_control_info")
    public final RecCardControlInfo recCardControlInfo;

    public static /* synthetic */ ClientControlInfo copy$default(ClientControlInfo clientControlInfo, RecCardControlInfo recCardControlInfo, InviteCardControlInfo inviteCardControlInfo, EventTrackingInfo eventTrackingInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            recCardControlInfo = clientControlInfo.recCardControlInfo;
        }
        if ((i & 2) != 0) {
            inviteCardControlInfo = clientControlInfo.inviteCardControlInfo;
        }
        if ((i & 4) != 0) {
            eventTrackingInfo = clientControlInfo.eventTrackingInfo;
        }
        return clientControlInfo.copy(recCardControlInfo, inviteCardControlInfo, eventTrackingInfo);
    }

    public final ClientControlInfo copy(RecCardControlInfo recCardControlInfo, InviteCardControlInfo inviteCardControlInfo, EventTrackingInfo eventTrackingInfo) {
        return new ClientControlInfo(recCardControlInfo, inviteCardControlInfo, eventTrackingInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientControlInfo)) {
            return false;
        }
        ClientControlInfo clientControlInfo = (ClientControlInfo) obj;
        return o.LJ(this.recCardControlInfo, clientControlInfo.recCardControlInfo) && o.LJ(this.inviteCardControlInfo, clientControlInfo.inviteCardControlInfo) && o.LJ(this.eventTrackingInfo, clientControlInfo.eventTrackingInfo);
    }

    public int hashCode() {
        RecCardControlInfo recCardControlInfo = this.recCardControlInfo;
        int hashCode = (recCardControlInfo == null ? 0 : recCardControlInfo.hashCode()) * 31;
        InviteCardControlInfo inviteCardControlInfo = this.inviteCardControlInfo;
        int hashCode2 = (hashCode + (inviteCardControlInfo == null ? 0 : inviteCardControlInfo.hashCode())) * 31;
        EventTrackingInfo eventTrackingInfo = this.eventTrackingInfo;
        return hashCode2 + (eventTrackingInfo != null ? eventTrackingInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClientControlInfo(recCardControlInfo=");
        LIZ.append(this.recCardControlInfo);
        LIZ.append(", inviteCardControlInfo=");
        LIZ.append(this.inviteCardControlInfo);
        LIZ.append(", eventTrackingInfo=");
        LIZ.append(this.eventTrackingInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ClientControlInfo(RecCardControlInfo recCardControlInfo, InviteCardControlInfo inviteCardControlInfo, EventTrackingInfo eventTrackingInfo) {
        this.recCardControlInfo = recCardControlInfo;
        this.inviteCardControlInfo = inviteCardControlInfo;
        this.eventTrackingInfo = eventTrackingInfo;
    }
}
