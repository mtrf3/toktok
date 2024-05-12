package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LeaveMessage extends F9E {
    public final CustomLinkMessage customMessage;
    public final LinkUser leftUser;

    public static /* synthetic */ LeaveMessage copy$default(LeaveMessage leaveMessage, LinkUser linkUser, CustomLinkMessage customLinkMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            linkUser = leaveMessage.leftUser;
        }
        if ((i & 2) != 0) {
            customLinkMessage = leaveMessage.customMessage;
        }
        return leaveMessage.copy(linkUser, customLinkMessage);
    }

    public final LeaveMessage copy(LinkUser leftUser, CustomLinkMessage customMessage) {
        o.LJIIIZ(leftUser, "leftUser");
        o.LJIIIZ(customMessage, "customMessage");
        return new LeaveMessage(leftUser, customMessage);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.leftUser, this.customMessage};
    }

    public final CustomLinkMessage getCustomMessage() {
        return this.customMessage;
    }

    public final LinkUser getLeftUser() {
        return this.leftUser;
    }

    public LeaveMessage(LinkUser leftUser, CustomLinkMessage customMessage) {
        o.LJIIIZ(leftUser, "leftUser");
        o.LJIIIZ(customMessage, "customMessage");
        this.leftUser = leftUser;
        this.customMessage = customMessage;
    }
}
