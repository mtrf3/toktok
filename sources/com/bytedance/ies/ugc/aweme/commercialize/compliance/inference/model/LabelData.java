package com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LabelData implements Serializable {

    @InterfaceC65349Pkn("interest_tag_active")
    public Boolean interestTagActive;

    @InterfaceC65349Pkn("interest_tag_id")
    public String interestTagId;

    @InterfaceC65349Pkn("interest_tag_value")
    public String interestTagValue;
    public int labelType;

    /* JADX WARN: Multi-variable type inference failed */
    public LabelData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LabelData copy$default(LabelData labelData, String str, String str2, Boolean bool, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = labelData.interestTagId;
        }
        if ((i2 & 2) != 0) {
            str2 = labelData.interestTagValue;
        }
        if ((i2 & 4) != 0) {
            bool = labelData.interestTagActive;
        }
        if ((i2 & 8) != 0) {
            i = labelData.labelType;
        }
        return labelData.copy(str, str2, bool, i);
    }

    public final LabelData copy(String str, String str2, Boolean bool, int i) {
        return new LabelData(str, str2, bool, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelData)) {
            return false;
        }
        LabelData labelData = (LabelData) obj;
        return o.LJ(this.interestTagId, labelData.interestTagId) && o.LJ(this.interestTagValue, labelData.interestTagValue) && o.LJ(this.interestTagActive, labelData.interestTagActive) && this.labelType == labelData.labelType;
    }

    public int hashCode() {
        String str = this.interestTagId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.interestTagValue;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.interestTagActive;
        return ((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.labelType;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LabelData(interestTagId=");
        LIZ.append(this.interestTagId);
        LIZ.append(", interestTagValue=");
        LIZ.append(this.interestTagValue);
        LIZ.append(", interestTagActive=");
        LIZ.append(this.interestTagActive);
        LIZ.append(", labelType=");
        return b0.LIZJ(LIZ, this.labelType, ')', LIZ);
    }

    public final Boolean getInterestTagActive() {
        return this.interestTagActive;
    }

    public final String getInterestTagId() {
        return this.interestTagId;
    }

    public final String getInterestTagValue() {
        return this.interestTagValue;
    }

    public final int getLabelType() {
        return this.labelType;
    }

    public final void setInterestTagActive(Boolean bool) {
        this.interestTagActive = bool;
    }

    public final void setInterestTagId(String str) {
        this.interestTagId = str;
    }

    public final void setInterestTagValue(String str) {
        this.interestTagValue = str;
    }

    public final void setLabelType(int i) {
        this.labelType = i;
    }

    public LabelData(String str, String str2, Boolean bool, int i) {
        this.interestTagId = str;
        this.interestTagValue = str2;
        this.interestTagActive = bool;
        this.labelType = i;
    }

    public /* synthetic */ LabelData(String str, String str2, Boolean bool, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? Boolean.FALSE : bool, (i2 & 8) != 0 ? -1 : i);
    }
}
