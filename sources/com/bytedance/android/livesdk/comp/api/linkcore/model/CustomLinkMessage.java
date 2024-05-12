package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CustomLinkMessage {
    public final BizContentWrapper bizContentWrapper;
    public final int businessId;
    public final ExtraDataWrapper extra;

    public static /* synthetic */ CustomLinkMessage copy$default(CustomLinkMessage customLinkMessage, int i, BizContentWrapper bizContentWrapper, ExtraDataWrapper extraDataWrapper, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = customLinkMessage.businessId;
        }
        if ((i2 & 2) != 0) {
            bizContentWrapper = customLinkMessage.bizContentWrapper;
        }
        if ((i2 & 4) != 0) {
            extraDataWrapper = customLinkMessage.extra;
        }
        return customLinkMessage.copy(i, bizContentWrapper, extraDataWrapper);
    }

    public final CustomLinkMessage copy(int i, BizContentWrapper bizContentWrapper, ExtraDataWrapper extraDataWrapper) {
        return new CustomLinkMessage(i, bizContentWrapper, extraDataWrapper);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomLinkMessage)) {
            return false;
        }
        CustomLinkMessage customLinkMessage = (CustomLinkMessage) obj;
        return this.businessId == customLinkMessage.businessId && o.LJ(this.bizContentWrapper, customLinkMessage.bizContentWrapper) && o.LJ(this.extra, customLinkMessage.extra);
    }

    public int hashCode() {
        int i = this.businessId * 31;
        BizContentWrapper bizContentWrapper = this.bizContentWrapper;
        int hashCode = (i + (bizContentWrapper == null ? 0 : bizContentWrapper.hashCode())) * 31;
        ExtraDataWrapper extraDataWrapper = this.extra;
        return hashCode + (extraDataWrapper != null ? extraDataWrapper.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomLinkMessage(businessId=");
        LIZ.append(this.businessId);
        LIZ.append(", bizContentWrapper=");
        LIZ.append(this.bizContentWrapper);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final BizContentWrapper getBizContentWrapper() {
        return this.bizContentWrapper;
    }

    public final int getBusinessId() {
        return this.businessId;
    }

    public final ExtraDataWrapper getExtra() {
        return this.extra;
    }

    public CustomLinkMessage(int i, BizContentWrapper bizContentWrapper, ExtraDataWrapper extraDataWrapper) {
        this.businessId = i;
        this.bizContentWrapper = bizContentWrapper;
        this.extra = extraDataWrapper;
    }
}
