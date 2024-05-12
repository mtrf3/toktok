package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupPlayer;

/* loaded from: classes14.dex */
public final class InviteGroupMessage {
    public final BusinessContent businessContent;
    public final GroupPlayer joinUser;
    public final LinkLayerMessage linkLayerMessage;

    public static /* synthetic */ InviteGroupMessage copy$default(InviteGroupMessage inviteGroupMessage, LinkLayerMessage linkLayerMessage, GroupPlayer groupPlayer, BusinessContent businessContent, int i, Object obj) {
        if ((i & 1) != 0) {
            linkLayerMessage = inviteGroupMessage.linkLayerMessage;
        }
        if ((i & 2) != 0) {
            groupPlayer = inviteGroupMessage.joinUser;
        }
        if ((i & 4) != 0) {
            businessContent = inviteGroupMessage.businessContent;
        }
        return inviteGroupMessage.copy(linkLayerMessage, groupPlayer, businessContent);
    }

    public final InviteGroupMessage copy(LinkLayerMessage linkLayerMessage, GroupPlayer groupPlayer, BusinessContent businessContent) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        return new InviteGroupMessage(linkLayerMessage, groupPlayer, businessContent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteGroupMessage)) {
            return false;
        }
        InviteGroupMessage inviteGroupMessage = (InviteGroupMessage) obj;
        return o.LJ(this.linkLayerMessage, inviteGroupMessage.linkLayerMessage) && o.LJ(this.joinUser, inviteGroupMessage.joinUser) && o.LJ(this.businessContent, inviteGroupMessage.businessContent);
    }

    public int hashCode() {
        int hashCode = this.linkLayerMessage.hashCode() * 31;
        GroupPlayer groupPlayer = this.joinUser;
        int hashCode2 = (hashCode + (groupPlayer == null ? 0 : groupPlayer.hashCode())) * 31;
        BusinessContent businessContent = this.businessContent;
        return hashCode2 + (businessContent != null ? businessContent.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteGroupMessage(linkLayerMessage=");
        LIZ.append(this.linkLayerMessage);
        LIZ.append(", joinUser=");
        LIZ.append(this.joinUser);
        LIZ.append(", businessContent=");
        LIZ.append(this.businessContent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final BusinessContent getBusinessContent() {
        return this.businessContent;
    }

    public final GroupPlayer getJoinUser() {
        return this.joinUser;
    }

    public final LinkLayerMessage getLinkLayerMessage() {
        return this.linkLayerMessage;
    }

    public InviteGroupMessage(LinkLayerMessage linkLayerMessage, GroupPlayer groupPlayer, BusinessContent businessContent) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        this.linkLayerMessage = linkLayerMessage;
        this.joinUser = groupPlayer;
        this.businessContent = businessContent;
    }
}
