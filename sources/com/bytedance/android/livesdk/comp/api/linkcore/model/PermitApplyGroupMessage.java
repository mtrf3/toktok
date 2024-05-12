package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupPlayer;

/* loaded from: classes14.dex */
public final class PermitApplyGroupMessage {
    public final int agreeStatus;
    public final GroupPlayer approver;
    public final BusinessContent businessContent;
    public final LinkLayerMessage linkLayerMessage;

    public static /* synthetic */ PermitApplyGroupMessage copy$default(PermitApplyGroupMessage permitApplyGroupMessage, LinkLayerMessage linkLayerMessage, int i, GroupPlayer groupPlayer, BusinessContent businessContent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            linkLayerMessage = permitApplyGroupMessage.linkLayerMessage;
        }
        if ((i2 & 2) != 0) {
            i = permitApplyGroupMessage.agreeStatus;
        }
        if ((i2 & 4) != 0) {
            groupPlayer = permitApplyGroupMessage.approver;
        }
        if ((i2 & 8) != 0) {
            businessContent = permitApplyGroupMessage.businessContent;
        }
        return permitApplyGroupMessage.copy(linkLayerMessage, i, groupPlayer, businessContent);
    }

    public final PermitApplyGroupMessage copy(LinkLayerMessage linkLayerMessage, int i, GroupPlayer groupPlayer, BusinessContent businessContent) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        return new PermitApplyGroupMessage(linkLayerMessage, i, groupPlayer, businessContent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermitApplyGroupMessage)) {
            return false;
        }
        PermitApplyGroupMessage permitApplyGroupMessage = (PermitApplyGroupMessage) obj;
        return o.LJ(this.linkLayerMessage, permitApplyGroupMessage.linkLayerMessage) && this.agreeStatus == permitApplyGroupMessage.agreeStatus && o.LJ(this.approver, permitApplyGroupMessage.approver) && o.LJ(this.businessContent, permitApplyGroupMessage.businessContent);
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
        LIZ.append("PermitApplyGroupMessage(linkLayerMessage=");
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

    public PermitApplyGroupMessage(LinkLayerMessage linkLayerMessage, int i, GroupPlayer groupPlayer, BusinessContent businessContent) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        this.linkLayerMessage = linkLayerMessage;
        this.agreeStatus = i;
        this.approver = groupPlayer;
        this.businessContent = businessContent;
    }
}
