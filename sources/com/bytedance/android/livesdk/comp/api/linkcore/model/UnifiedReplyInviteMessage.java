package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UnifiedReplyInviteMessage {
    public final CustomLinkMessage customMessage;
    public final LinkUser inviteOperator;
    public final LinkUser invitee;
    public final OnLineMicInfo inviteeFixedMicInfo;
    public final int replyStatus;
    public final User replyUserInfo;

    public static /* synthetic */ UnifiedReplyInviteMessage copy$default(UnifiedReplyInviteMessage unifiedReplyInviteMessage, LinkUser linkUser, int i, OnLineMicInfo onLineMicInfo, CustomLinkMessage customLinkMessage, User user, LinkUser linkUser2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            linkUser = unifiedReplyInviteMessage.invitee;
        }
        if ((i2 & 2) != 0) {
            i = unifiedReplyInviteMessage.replyStatus;
        }
        if ((i2 & 4) != 0) {
            onLineMicInfo = unifiedReplyInviteMessage.inviteeFixedMicInfo;
        }
        if ((i2 & 8) != 0) {
            customLinkMessage = unifiedReplyInviteMessage.customMessage;
        }
        if ((i2 & 16) != 0) {
            user = unifiedReplyInviteMessage.replyUserInfo;
        }
        if ((i2 & 32) != 0) {
            linkUser2 = unifiedReplyInviteMessage.inviteOperator;
        }
        return unifiedReplyInviteMessage.copy(linkUser, i, onLineMicInfo, customLinkMessage, user, linkUser2);
    }

    public final UnifiedReplyInviteMessage copy(LinkUser invitee, int i, OnLineMicInfo onLineMicInfo, CustomLinkMessage customMessage, User user, LinkUser linkUser) {
        o.LJIIIZ(invitee, "invitee");
        o.LJIIIZ(customMessage, "customMessage");
        return new UnifiedReplyInviteMessage(invitee, i, onLineMicInfo, customMessage, user, linkUser);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedReplyInviteMessage)) {
            return false;
        }
        UnifiedReplyInviteMessage unifiedReplyInviteMessage = (UnifiedReplyInviteMessage) obj;
        return o.LJ(this.invitee, unifiedReplyInviteMessage.invitee) && this.replyStatus == unifiedReplyInviteMessage.replyStatus && o.LJ(this.inviteeFixedMicInfo, unifiedReplyInviteMessage.inviteeFixedMicInfo) && o.LJ(this.customMessage, unifiedReplyInviteMessage.customMessage) && o.LJ(this.replyUserInfo, unifiedReplyInviteMessage.replyUserInfo) && o.LJ(this.inviteOperator, unifiedReplyInviteMessage.inviteOperator);
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
        LIZ.append("UnifiedReplyInviteMessage(invitee=");
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

    public UnifiedReplyInviteMessage(LinkUser invitee, int i, OnLineMicInfo onLineMicInfo, CustomLinkMessage customMessage, User user, LinkUser linkUser) {
        o.LJIIIZ(invitee, "invitee");
        o.LJIIIZ(customMessage, "customMessage");
        this.invitee = invitee;
        this.replyStatus = i;
        this.inviteeFixedMicInfo = onLineMicInfo;
        this.customMessage = customMessage;
        this.replyUserInfo = user;
        this.inviteOperator = linkUser;
    }

    public /* synthetic */ UnifiedReplyInviteMessage(LinkUser linkUser, int i, OnLineMicInfo onLineMicInfo, CustomLinkMessage customLinkMessage, User user, LinkUser linkUser2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(linkUser, i, onLineMicInfo, customLinkMessage, (i2 & 16) != 0 ? null : user, (i2 & 32) == 0 ? linkUser2 : null);
    }
}
