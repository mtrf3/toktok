package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InviteMessage {
    public final CustomLinkMessage customMessage;
    public final int inviteSource;
    public final OnLineMicInfo inviteeFixedMicInfo;
    public final User inviteeUserInfo;
    public final LinkUser inviter;
    public final LayoutDSLConfig layoutDSLConfig;

    public static /* synthetic */ InviteMessage copy$default(InviteMessage inviteMessage, LinkUser linkUser, OnLineMicInfo onLineMicInfo, LayoutDSLConfig layoutDSLConfig, CustomLinkMessage customLinkMessage, int i, User user, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            linkUser = inviteMessage.inviter;
        }
        if ((i2 & 2) != 0) {
            onLineMicInfo = inviteMessage.inviteeFixedMicInfo;
        }
        if ((i2 & 4) != 0) {
            layoutDSLConfig = inviteMessage.layoutDSLConfig;
        }
        if ((i2 & 8) != 0) {
            customLinkMessage = inviteMessage.customMessage;
        }
        if ((i2 & 16) != 0) {
            i = inviteMessage.inviteSource;
        }
        if ((i2 & 32) != 0) {
            user = inviteMessage.inviteeUserInfo;
        }
        return inviteMessage.copy(linkUser, onLineMicInfo, layoutDSLConfig, customLinkMessage, i, user);
    }

    public final InviteMessage copy(LinkUser inviter, OnLineMicInfo onLineMicInfo, LayoutDSLConfig layoutDSLConfig, CustomLinkMessage customMessage, int i, User user) {
        o.LJIIIZ(inviter, "inviter");
        o.LJIIIZ(customMessage, "customMessage");
        return new InviteMessage(inviter, onLineMicInfo, layoutDSLConfig, customMessage, i, user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteMessage)) {
            return false;
        }
        InviteMessage inviteMessage = (InviteMessage) obj;
        return o.LJ(this.inviter, inviteMessage.inviter) && o.LJ(this.inviteeFixedMicInfo, inviteMessage.inviteeFixedMicInfo) && o.LJ(this.layoutDSLConfig, inviteMessage.layoutDSLConfig) && o.LJ(this.customMessage, inviteMessage.customMessage) && this.inviteSource == inviteMessage.inviteSource && o.LJ(this.inviteeUserInfo, inviteMessage.inviteeUserInfo);
    }

    public int hashCode() {
        int hashCode = this.inviter.hashCode() * 31;
        OnLineMicInfo onLineMicInfo = this.inviteeFixedMicInfo;
        int hashCode2 = (hashCode + (onLineMicInfo == null ? 0 : onLineMicInfo.hashCode())) * 31;
        LayoutDSLConfig layoutDSLConfig = this.layoutDSLConfig;
        int hashCode3 = (((this.customMessage.hashCode() + ((hashCode2 + (layoutDSLConfig == null ? 0 : layoutDSLConfig.hashCode())) * 31)) * 31) + this.inviteSource) * 31;
        User user = this.inviteeUserInfo;
        return hashCode3 + (user != null ? user.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteMessage(inviter=");
        LIZ.append(this.inviter);
        LIZ.append(", inviteeFixedMicInfo=");
        LIZ.append(this.inviteeFixedMicInfo);
        LIZ.append(", layoutDSLConfig=");
        LIZ.append(this.layoutDSLConfig);
        LIZ.append(", customMessage=");
        LIZ.append(this.customMessage);
        LIZ.append(", inviteSource=");
        LIZ.append(this.inviteSource);
        LIZ.append(", inviteeUserInfo=");
        LIZ.append(this.inviteeUserInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final CustomLinkMessage getCustomMessage() {
        return this.customMessage;
    }

    public final int getInviteSource() {
        return this.inviteSource;
    }

    public final OnLineMicInfo getInviteeFixedMicInfo() {
        return this.inviteeFixedMicInfo;
    }

    public final User getInviteeUserInfo() {
        return this.inviteeUserInfo;
    }

    public final LinkUser getInviter() {
        return this.inviter;
    }

    public final LayoutDSLConfig getLayoutDSLConfig() {
        return this.layoutDSLConfig;
    }

    public InviteMessage(LinkUser inviter, OnLineMicInfo onLineMicInfo, LayoutDSLConfig layoutDSLConfig, CustomLinkMessage customMessage, int i, User user) {
        o.LJIIIZ(inviter, "inviter");
        o.LJIIIZ(customMessage, "customMessage");
        this.inviter = inviter;
        this.inviteeFixedMicInfo = onLineMicInfo;
        this.layoutDSLConfig = layoutDSLConfig;
        this.customMessage = customMessage;
        this.inviteSource = i;
        this.inviteeUserInfo = user;
    }

    public /* synthetic */ InviteMessage(LinkUser linkUser, OnLineMicInfo onLineMicInfo, LayoutDSLConfig layoutDSLConfig, CustomLinkMessage customLinkMessage, int i, User user, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(linkUser, onLineMicInfo, layoutDSLConfig, customLinkMessage, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : user);
    }
}
