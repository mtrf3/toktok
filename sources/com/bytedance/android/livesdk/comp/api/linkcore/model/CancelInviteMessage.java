package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CancelInviteMessage extends F9E {
    public final CustomLinkMessage customMessage;
    public final LinkUser inviter;

    public static /* synthetic */ CancelInviteMessage copy$default(CancelInviteMessage cancelInviteMessage, LinkUser linkUser, CustomLinkMessage customLinkMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            linkUser = cancelInviteMessage.inviter;
        }
        if ((i & 2) != 0) {
            customLinkMessage = cancelInviteMessage.customMessage;
        }
        return cancelInviteMessage.copy(linkUser, customLinkMessage);
    }

    public final CancelInviteMessage copy(LinkUser inviter, CustomLinkMessage customMessage) {
        o.LJIIIZ(inviter, "inviter");
        o.LJIIIZ(customMessage, "customMessage");
        return new CancelInviteMessage(inviter, customMessage);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.inviter, this.customMessage};
    }

    public final CustomLinkMessage getCustomMessage() {
        return this.customMessage;
    }

    public final LinkUser getInviter() {
        return this.inviter;
    }

    public CancelInviteMessage(LinkUser inviter, CustomLinkMessage customMessage) {
        o.LJIIIZ(inviter, "inviter");
        o.LJIIIZ(customMessage, "customMessage");
        this.inviter = inviter;
        this.customMessage = customMessage;
    }
}
