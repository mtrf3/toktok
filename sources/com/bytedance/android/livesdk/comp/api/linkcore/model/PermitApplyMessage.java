package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PermitApplyMessage {
    public final OnLineMicInfo applicantFixedMicInfo;
    public final LinkUser applier;
    public final LinkUser approver;
    public final CustomLinkMessage customMessage;
    public final LayoutDSLConfig layoutDSLConfig;
    public final int permitStatus;

    public static /* synthetic */ PermitApplyMessage copy$default(PermitApplyMessage permitApplyMessage, LinkUser linkUser, int i, OnLineMicInfo onLineMicInfo, LayoutDSLConfig layoutDSLConfig, CustomLinkMessage customLinkMessage, LinkUser linkUser2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            linkUser = permitApplyMessage.approver;
        }
        if ((i2 & 2) != 0) {
            i = permitApplyMessage.permitStatus;
        }
        if ((i2 & 4) != 0) {
            onLineMicInfo = permitApplyMessage.applicantFixedMicInfo;
        }
        if ((i2 & 8) != 0) {
            layoutDSLConfig = permitApplyMessage.layoutDSLConfig;
        }
        if ((i2 & 16) != 0) {
            customLinkMessage = permitApplyMessage.customMessage;
        }
        if ((i2 & 32) != 0) {
            linkUser2 = permitApplyMessage.applier;
        }
        return permitApplyMessage.copy(linkUser, i, onLineMicInfo, layoutDSLConfig, customLinkMessage, linkUser2);
    }

    public final PermitApplyMessage copy(LinkUser approver, int i, OnLineMicInfo onLineMicInfo, LayoutDSLConfig layoutDSLConfig, CustomLinkMessage customMessage, LinkUser linkUser) {
        o.LJIIIZ(approver, "approver");
        o.LJIIIZ(customMessage, "customMessage");
        return new PermitApplyMessage(approver, i, onLineMicInfo, layoutDSLConfig, customMessage, linkUser);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermitApplyMessage)) {
            return false;
        }
        PermitApplyMessage permitApplyMessage = (PermitApplyMessage) obj;
        return o.LJ(this.approver, permitApplyMessage.approver) && this.permitStatus == permitApplyMessage.permitStatus && o.LJ(this.applicantFixedMicInfo, permitApplyMessage.applicantFixedMicInfo) && o.LJ(this.layoutDSLConfig, permitApplyMessage.layoutDSLConfig) && o.LJ(this.customMessage, permitApplyMessage.customMessage) && o.LJ(this.applier, permitApplyMessage.applier);
    }

    public int hashCode() {
        int hashCode = ((this.approver.hashCode() * 31) + this.permitStatus) * 31;
        OnLineMicInfo onLineMicInfo = this.applicantFixedMicInfo;
        int hashCode2 = (hashCode + (onLineMicInfo == null ? 0 : onLineMicInfo.hashCode())) * 31;
        LayoutDSLConfig layoutDSLConfig = this.layoutDSLConfig;
        int hashCode3 = (this.customMessage.hashCode() + ((hashCode2 + (layoutDSLConfig == null ? 0 : layoutDSLConfig.hashCode())) * 31)) * 31;
        LinkUser linkUser = this.applier;
        return hashCode3 + (linkUser != null ? linkUser.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PermitApplyMessage(approver=");
        LIZ.append(this.approver);
        LIZ.append(", permitStatus=");
        LIZ.append(this.permitStatus);
        LIZ.append(", applicantFixedMicInfo=");
        LIZ.append(this.applicantFixedMicInfo);
        LIZ.append(", layoutDSLConfig=");
        LIZ.append(this.layoutDSLConfig);
        LIZ.append(", customMessage=");
        LIZ.append(this.customMessage);
        LIZ.append(", applier=");
        LIZ.append(this.applier);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final OnLineMicInfo getApplicantFixedMicInfo() {
        return this.applicantFixedMicInfo;
    }

    public final LinkUser getApplier() {
        return this.applier;
    }

    public final LinkUser getApprover() {
        return this.approver;
    }

    public final CustomLinkMessage getCustomMessage() {
        return this.customMessage;
    }

    public final LayoutDSLConfig getLayoutDSLConfig() {
        return this.layoutDSLConfig;
    }

    public final int getPermitStatus() {
        return this.permitStatus;
    }

    public PermitApplyMessage(LinkUser approver, int i, OnLineMicInfo onLineMicInfo, LayoutDSLConfig layoutDSLConfig, CustomLinkMessage customMessage, LinkUser linkUser) {
        o.LJIIIZ(approver, "approver");
        o.LJIIIZ(customMessage, "customMessage");
        this.approver = approver;
        this.permitStatus = i;
        this.applicantFixedMicInfo = onLineMicInfo;
        this.layoutDSLConfig = layoutDSLConfig;
        this.customMessage = customMessage;
        this.applier = linkUser;
    }

    public /* synthetic */ PermitApplyMessage(LinkUser linkUser, int i, OnLineMicInfo onLineMicInfo, LayoutDSLConfig layoutDSLConfig, CustomLinkMessage customLinkMessage, LinkUser linkUser2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(linkUser, i, onLineMicInfo, layoutDSLConfig, customLinkMessage, (i2 & 32) != 0 ? null : linkUser2);
    }
}
