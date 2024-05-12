package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class DestroyChannelMessage extends F9E {
    public final CustomLinkMessage customMessage;
    public final LinkUser owner;

    public static /* synthetic */ DestroyChannelMessage copy$default(DestroyChannelMessage destroyChannelMessage, LinkUser linkUser, CustomLinkMessage customLinkMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            linkUser = destroyChannelMessage.owner;
        }
        if ((i & 2) != 0) {
            customLinkMessage = destroyChannelMessage.customMessage;
        }
        return destroyChannelMessage.copy(linkUser, customLinkMessage);
    }

    public final DestroyChannelMessage copy(LinkUser owner, CustomLinkMessage customMessage) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(customMessage, "customMessage");
        return new DestroyChannelMessage(owner, customMessage);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.owner, this.customMessage};
    }

    public final CustomLinkMessage getCustomMessage() {
        return this.customMessage;
    }

    public final LinkUser getOwner() {
        return this.owner;
    }

    public DestroyChannelMessage(LinkUser owner, CustomLinkMessage customMessage) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(customMessage, "customMessage");
        this.owner = owner;
        this.customMessage = customMessage;
    }
}
