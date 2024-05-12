package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ReplyInviteMessage {
    public final CustomLinkMessage customMessage;
    public final LinkUser inviteOperator;
    public final LinkUser invitee;
    public final OnLineMicInfo inviteeFixedMicInfo;
    public final int replyStatus;
    public final User replyUserInfo;

    public static /* synthetic */ ReplyInviteMessage copy$default(ReplyInviteMessage replyInviteMessage, LinkUser linkUser, int i, OnLineMicInfo onLineMicInfo, CustomLinkMessage customLinkMessage, User user, LinkUser linkUser2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            linkUser = replyInviteMessage.invitee;
        }
        if ((i2 & 2) != 0) {
            i = replyInviteMessage.replyStatus;
        }
        if ((i2 & 4) != 0) {
            onLineMicInfo = replyInviteMessage.inviteeFixedMicInfo;
        }
        if ((i2 & 8) != 0) {
            customLinkMessage = replyInviteMessage.customMessage;
        }
        if ((i2 & 16) != 0) {
            user = replyInviteMessage.replyUserInfo;
        }
        if ((i2 & 32) != 0) {
            linkUser2 = replyInviteMessage.inviteOperator;
        }
        return replyInviteMessage.copy(linkUser, i, onLineMicInfo, customLinkMessage, user, linkUser2);
    }

    public final ReplyInviteMessage copy(LinkUser invitee, int i, OnLineMicInfo onLineMicInfo, CustomLinkMessage customMessage, User user, LinkUser linkUser) {
        o.LJIIIZ(invitee, "invitee");
        o.LJIIIZ(customMessage, "customMessage");
        return new ReplyInviteMessage(invitee, i, onLineMicInfo, customMessage, user, linkUser);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyInviteMessage)) {
            return false;
        }
        ReplyInviteMessage replyInviteMessage = (ReplyInviteMessage) obj;
        return o.LJ(this.invitee, replyInviteMessage.invitee) && this.replyStatus == replyInviteMessage.replyStatus && o.LJ(this.inviteeFixedMicInfo, replyInviteMessage.inviteeFixedMicInfo) && o.LJ(this.customMessage, replyInviteMessage.customMessage) && o.LJ(this.replyUserInfo, replyInviteMessage.replyUserInfo) && o.LJ(this.inviteOperator, replyInviteMessage.inviteOperator);
    }

    public int hashCode() {
        int hashCode = ((this.invitee.hashCode() * 31) + this.replyStatus) * 31;
        OnLineMicInfo onLineMicInfo = this.inviteeFixedMicInfo;
        int hashCode2 = (this.customMessage.hashCode() + ((hashCode + (onLineMicInfo == null ? 0 : onLineMicInfo.hashCode())) * 31)) * 31;
        User user = this.replyUserInfo;
        int hashCode3 = (hashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        LinkUser linkUser = this.inviteOperator;
        return hashCode3 + (linkUser != null ? linkUser.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReplyInviteMessage(invitee=");
        LIZ.append(this.invitee);
        LIZ.append(", replyStatus=");
        LIZ.append(this.replyStatus);
        LIZ.append(", inviteeFixedMicInfo=");
        LIZ.append(this.inviteeFixedMicInfo);
        LIZ.append(", customMessage=");
        LIZ.append(this.customMessage);
        LIZ.append(", replyUserInfo=");
        LIZ.append(this.replyUserInfo);
        LIZ.append(", inviteOperator=");
        LIZ.append(this.inviteOperator);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final UnifiedReplyInviteMessage toUnifiedReplyInviteMessage() {
        return new UnifiedReplyInviteMessage(this.invitee, this.replyStatus, this.inviteeFixedMicInfo, this.customMessage, this.replyUserInfo, this.inviteOperator);
    }

    public final CustomLinkMessage getCustomMessage() {
        return this.customMessage;
    }

    public final LinkUser getInviteOperator() {
        return this.inviteOperator;
    }

    public final LinkUser getInvitee() {
        return this.invitee;
    }

    public final OnLineMicInfo getInviteeFixedMicInfo() {
        return this.inviteeFixedMicInfo;
    }

    public final int getReplyStatus() {
        return this.replyStatus;
    }

    public final User getReplyUserInfo() {
        return this.replyUserInfo;
    }

    public ReplyInviteMessage(LinkUser invitee, int i, OnLineMicInfo onLineMicInfo, CustomLinkMessage customMessage, User user, LinkUser linkUser) {
        o.LJIIIZ(invitee, "invitee");
        o.LJIIIZ(customMessage, "customMessage");
        this.invitee = invitee;
        this.replyStatus = i;
        this.inviteeFixedMicInfo = onLineMicInfo;
        this.customMessage = customMessage;
        this.replyUserInfo = user;
        this.inviteOperator = linkUser;
    }

    public /* synthetic */ ReplyInviteMessage(LinkUser linkUser, int i, OnLineMicInfo onLineMicInfo, CustomLinkMessage customLinkMessage, User user, LinkUser linkUser2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(linkUser, i, onLineMicInfo, customLinkMessage, (i2 & 16) != 0 ? null : user, (i2 & 32) == 0 ? linkUser2 : null);
    }
}
