package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class P2PGroupChangeMessage {
    public final BusinessContent businessContent;
    public final LinkLayerMessage linkLayerMessage;

    public static /* synthetic */ P2PGroupChangeMessage copy$default(P2PGroupChangeMessage p2PGroupChangeMessage, LinkLayerMessage linkLayerMessage, BusinessContent businessContent, int i, Object obj) {
        if ((i & 1) != 0) {
            linkLayerMessage = p2PGroupChangeMessage.linkLayerMessage;
        }
        if ((i & 2) != 0) {
            businessContent = p2PGroupChangeMessage.businessContent;
        }
        return p2PGroupChangeMessage.copy(linkLayerMessage, businessContent);
    }

    public final P2PGroupChangeMessage copy(LinkLayerMessage linkLayerMessage, BusinessContent businessContent) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        return new P2PGroupChangeMessage(linkLayerMessage, businessContent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PGroupChangeMessage)) {
            return false;
        }
        P2PGroupChangeMessage p2PGroupChangeMessage = (P2PGroupChangeMessage) obj;
        return o.LJ(this.linkLayerMessage, p2PGroupChangeMessage.linkLayerMessage) && o.LJ(this.businessContent, p2PGroupChangeMessage.businessContent);
    }

    public int hashCode() {
        int hashCode = this.linkLayerMessage.hashCode() * 31;
        BusinessContent businessContent = this.businessContent;
        return hashCode + (businessContent == null ? 0 : businessContent.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("P2PGroupChangeMessage(linkLayerMessage=");
        LIZ.append(this.linkLayerMessage);
        LIZ.append(", businessContent=");
        LIZ.append(this.businessContent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final BusinessContent getBusinessContent() {
        return this.businessContent;
    }

    public final LinkLayerMessage getLinkLayerMessage() {
        return this.linkLayerMessage;
    }

    public P2PGroupChangeMessage(LinkLayerMessage linkLayerMessage, BusinessContent businessContent) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        this.linkLayerMessage = linkLayerMessage;
        this.businessContent = businessContent;
    }
}
