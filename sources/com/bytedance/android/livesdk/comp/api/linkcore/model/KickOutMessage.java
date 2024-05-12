package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class KickOutMessage extends F9E {
    public final CustomLinkMessage customMessage;
    public final int kickOutReason;
    public final LinkUser owner;

    public static /* synthetic */ KickOutMessage copy$default(KickOutMessage kickOutMessage, LinkUser linkUser, int i, CustomLinkMessage customLinkMessage, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            linkUser = kickOutMessage.owner;
        }
        if ((i2 & 2) != 0) {
            i = kickOutMessage.kickOutReason;
        }
        if ((i2 & 4) != 0) {
            customLinkMessage = kickOutMessage.customMessage;
        }
        return kickOutMessage.copy(linkUser, i, customLinkMessage);
    }

    public final KickOutMessage copy(LinkUser owner, int i, CustomLinkMessage customMessage) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(customMessage, "customMessage");
        return new KickOutMessage(owner, i, customMessage);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.owner, Integer.valueOf(this.kickOutReason), this.customMessage};
    }

    public final CustomLinkMessage getCustomMessage() {
        return this.customMessage;
    }

    public final int getKickOutReason() {
        return this.kickOutReason;
    }

    public final LinkUser getOwner() {
        return this.owner;
    }

    public KickOutMessage(LinkUser owner, int i, CustomLinkMessage customMessage) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(customMessage, "customMessage");
        this.owner = owner;
        this.kickOutReason = i;
        this.customMessage = customMessage;
    }
}
