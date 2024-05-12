package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GroupChangeMessage {
    public final BusinessContent businessContent;
    public final LinkLayerMessage linkLayerMessage;

    public static /* synthetic */ GroupChangeMessage copy$default(GroupChangeMessage groupChangeMessage, LinkLayerMessage linkLayerMessage, BusinessContent businessContent, int i, Object obj) {
        if ((i & 1) != 0) {
            linkLayerMessage = groupChangeMessage.linkLayerMessage;
        }
        if ((i & 2) != 0) {
            businessContent = groupChangeMessage.businessContent;
        }
        return groupChangeMessage.copy(linkLayerMessage, businessContent);
    }

    public final GroupChangeMessage copy(LinkLayerMessage linkLayerMessage, BusinessContent businessContent) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        return new GroupChangeMessage(linkLayerMessage, businessContent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupChangeMessage)) {
            return false;
        }
        GroupChangeMessage groupChangeMessage = (GroupChangeMessage) obj;
        return o.LJ(this.linkLayerMessage, groupChangeMessage.linkLayerMessage) && o.LJ(this.businessContent, groupChangeMessage.businessContent);
    }

    public int hashCode() {
        int hashCode = this.linkLayerMessage.hashCode() * 31;
        BusinessContent businessContent = this.businessContent;
        return hashCode + (businessContent == null ? 0 : businessContent.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupChangeMessage(linkLayerMessage=");
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

    public GroupChangeMessage(LinkLayerMessage linkLayerMessage, BusinessContent businessContent) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        this.linkLayerMessage = linkLayerMessage;
        this.businessContent = businessContent;
    }
}
