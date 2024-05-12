package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupPlayer;

/* loaded from: classes14.dex */
public final class ReplyInviteGroupMessage {
    public final int agreeStatus;
    public final GroupPlayer approver;
    public final BusinessContent businessContent;
    public final LinkLayerMessage linkLayerMessage;

    public static /* synthetic */ ReplyInviteGroupMessage copy$default(ReplyInviteGroupMessage replyInviteGroupMessage, LinkLayerMessage linkLayerMessage, int i, GroupPlayer groupPlayer, BusinessContent businessContent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            linkLayerMessage = replyInviteGroupMessage.linkLayerMessage;
        }
        if ((i2 & 2) != 0) {
            i = replyInviteGroupMessage.agreeStatus;
        }
        if ((i2 & 4) != 0) {
            groupPlayer = replyInviteGroupMessage.approver;
        }
        if ((i2 & 8) != 0) {
            businessContent = replyInviteGroupMessage.businessContent;
        }
        return replyInviteGroupMessage.copy(linkLayerMessage, i, groupPlayer, businessContent);
    }

    public final ReplyInviteGroupMessage copy(LinkLayerMessage linkLayerMessage, int i, GroupPlayer groupPlayer, BusinessContent businessContent) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        return new ReplyInviteGroupMessage(linkLayerMessage, i, groupPlayer, businessContent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyInviteGroupMessage)) {
            return false;
        }
        ReplyInviteGroupMessage replyInviteGroupMessage = (ReplyInviteGroupMessage) obj;
        return o.LJ(this.linkLayerMessage, replyInviteGroupMessage.linkLayerMessage) && this.agreeStatus == replyInviteGroupMessage.agreeStatus && o.LJ(this.approver, replyInviteGroupMessage.approver) && o.LJ(this.businessContent, replyInviteGroupMessage.businessContent);
    }

    public int hashCode() {
        int hashCode = ((this.linkLayerMessage.hashCode() * 31) + this.agreeStatus) * 31;
        GroupPlayer groupPlayer = this.approver;
        int hashCode2 = (hashCode + (groupPlayer == null ? 0 : groupPlayer.hashCode())) * 31;
        BusinessContent businessContent = this.businessContent;
        return hashCode2 + (businessContent != null ? businessContent.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReplyInviteGroupMessage(linkLayerMessage=");
        LIZ.append(this.linkLayerMessage);
        LIZ.append(", agreeStatus=");
        LIZ.append(this.agreeStatus);
        LIZ.append(", approver=");
        LIZ.append(this.approver);
        LIZ.append(", businessContent=");
        LIZ.append(this.businessContent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int getAgreeStatus() {
        return this.agreeStatus;
    }

    public final GroupPlayer getApprover() {
        return this.approver;
    }

    public final BusinessContent getBusinessContent() {
        return this.businessContent;
    }

    public final LinkLayerMessage getLinkLayerMessage() {
        return this.linkLayerMessage;
    }

    public ReplyInviteGroupMessage(LinkLayerMessage linkLayerMessage, int i, GroupPlayer groupPlayer, BusinessContent businessContent) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        this.linkLayerMessage = linkLayerMessage;
        this.agreeStatus = i;
        this.approver = groupPlayer;
        this.businessContent = businessContent;
    }
}
