package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DiscountBackInfo {

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("discount_back_desc_text")
    public final String discountBackDescText;

    @InterfaceC65349Pkn("discount_back_title")
    public final String discountBackTitle;

    @InterfaceC65349Pkn("reduction_type")
    public final Integer reductionType;

    /* JADX WARN: Multi-variable type inference failed */
    public DiscountBackInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountBackInfo)) {
            return false;
        }
        DiscountBackInfo discountBackInfo = (DiscountBackInfo) obj;
        return o.LJ(this.reductionType, discountBackInfo.reductionType) && o.LJ(this.discountBackTitle, discountBackInfo.discountBackTitle) && o.LJ(this.discountBackDescText, discountBackInfo.discountBackDescText) && o.LJ(this.buttonText, discountBackInfo.buttonText) && o.LJ(this.daInfo, discountBackInfo.daInfo);
    }

    public final int hashCode() {
        Integer num = this.reductionType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.discountBackTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discountBackDescText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.daInfo;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiscountBackInfo(reductionType=");
        LIZ.append(this.reductionType);
        LIZ.append(", discountBackTitle=");
        LIZ.append(this.discountBackTitle);
        LIZ.append(", discountBackDescText=");
        LIZ.append(this.discountBackDescText);
        LIZ.append(", buttonText=");
        LIZ.append(this.buttonText);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public DiscountBackInfo(Integer num, String str, String str2, String str3, String str4) {
        this.reductionType = num;
        this.discountBackTitle = str;
        this.discountBackDescText = str2;
        this.buttonText = str3;
        this.daInfo = str4;
    }

    public /* synthetic */ DiscountBackInfo(Integer num, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? str4 : null);
    }
}
