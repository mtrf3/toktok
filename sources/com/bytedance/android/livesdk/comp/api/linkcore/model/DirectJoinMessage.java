package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class DirectJoinMessage {
    public final CustomLinkMessage customMessage;
    public final LinkUser joiner;
    public final OnLineMicInfo joinerFixedMicInfo;

    public static /* synthetic */ DirectJoinMessage copy$default(DirectJoinMessage directJoinMessage, LinkUser linkUser, OnLineMicInfo onLineMicInfo, CustomLinkMessage customLinkMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            linkUser = directJoinMessage.joiner;
        }
        if ((i & 2) != 0) {
            onLineMicInfo = directJoinMessage.joinerFixedMicInfo;
        }
        if ((i & 4) != 0) {
            customLinkMessage = directJoinMessage.customMessage;
        }
        return directJoinMessage.copy(linkUser, onLineMicInfo, customLinkMessage);
    }

    public final DirectJoinMessage copy(LinkUser joiner, OnLineMicInfo onLineMicInfo, CustomLinkMessage customMessage) {
        o.LJIIIZ(joiner, "joiner");
        o.LJIIIZ(customMessage, "customMessage");
        return new DirectJoinMessage(joiner, onLineMicInfo, customMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectJoinMessage)) {
            return false;
        }
        DirectJoinMessage directJoinMessage = (DirectJoinMessage) obj;
        return o.LJ(this.joiner, directJoinMessage.joiner) && o.LJ(this.joinerFixedMicInfo, directJoinMessage.joinerFixedMicInfo) && o.LJ(this.customMessage, directJoinMessage.customMessage);
    }

    public int hashCode() {
        int hashCode = this.joiner.hashCode() * 31;
        OnLineMicInfo onLineMicInfo = this.joinerFixedMicInfo;
        return this.customMessage.hashCode() + ((hashCode + (onLineMicInfo == null ? 0 : onLineMicInfo.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DirectJoinMessage(joiner=");
        LIZ.append(this.joiner);
        LIZ.append(", joinerFixedMicInfo=");
        LIZ.append(this.joinerFixedMicInfo);
        LIZ.append(", customMessage=");
        LIZ.append(this.customMessage);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final UnifiedReplyInviteMessage toUnifiedReplyInviteMessage() {
        return new UnifiedReplyInviteMessage(this.joiner, 1, this.joinerFixedMicInfo, this.customMessage, null, null, 48, null);
    }

    public final CustomLinkMessage getCustomMessage() {
        return this.customMessage;
    }

    public final LinkUser getJoiner() {
        return this.joiner;
    }

    public final OnLineMicInfo getJoinerFixedMicInfo() {
        return this.joinerFixedMicInfo;
    }

    public DirectJoinMessage(LinkUser joiner, OnLineMicInfo onLineMicInfo, CustomLinkMessage customMessage) {
        o.LJIIIZ(joiner, "joiner");
        o.LJIIIZ(customMessage, "customMessage");
        this.joiner = joiner;
        this.joinerFixedMicInfo = onLineMicInfo;
        this.customMessage = customMessage;
    }
}
