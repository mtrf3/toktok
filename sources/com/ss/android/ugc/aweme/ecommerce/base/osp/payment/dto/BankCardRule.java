package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BankCardRule {

    @InterfaceC65349Pkn("card_brand")
    public final String cardBrand;

    @InterfaceC65349Pkn("card_brand_display_name")
    public final String cardBrandDisplayName;

    @InterfaceC65349Pkn("card_brand_length")
    public final int[] cardBrandLength;

    @InterfaceC65349Pkn("card_brand_regex")
    public final String cardBrandRegex;

    @InterfaceC65349Pkn("cvv_length")
    public final int[] cvvLength;

    @InterfaceC65349Pkn("payment_method_id")
    public final String paymentMethodId;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.cvvLength;
        int i6 = 0;
        if (iArr != null) {
            i = Arrays.hashCode(iArr);
        } else {
            i = 0;
        }
        int i7 = i * 31;
        String str = this.cardBrandRegex;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        int[] iArr2 = this.cardBrandLength;
        if (iArr2 != null) {
            i3 = Arrays.hashCode(iArr2);
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str2 = this.cardBrandDisplayName;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        String str3 = this.cardBrand;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        String str4 = this.paymentMethodId;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i11 + i6;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(BankCardRule.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule");
        BankCardRule bankCardRule = (BankCardRule) obj;
        int[] iArr = this.cvvLength;
        if (iArr != null) {
            int[] iArr2 = bankCardRule.cvvLength;
            if (iArr2 == null || !Arrays.equals(iArr, iArr2)) {
                return false;
            }
        } else if (bankCardRule.cvvLength != null) {
            return false;
        }
        if (!o.LJ(this.cardBrandRegex, bankCardRule.cardBrandRegex)) {
            return false;
        }
        int[] iArr3 = this.cardBrandLength;
        if (iArr3 != null) {
            int[] iArr4 = bankCardRule.cardBrandLength;
            if (iArr4 == null || !Arrays.equals(iArr3, iArr4)) {
                return false;
            }
        } else if (bankCardRule.cardBrandLength != null) {
            return false;
        }
        if (o.LJ(this.cardBrandDisplayName, bankCardRule.cardBrandDisplayName) && o.LJ(this.cardBrand, bankCardRule.cardBrand) && o.LJ(this.paymentMethodId, bankCardRule.paymentMethodId)) {
            return true;
        }
        return false;
    }

    public BankCardRule(int[] iArr, String str, int[] iArr2, String str2, String str3, String str4) {
        this.cvvLength = iArr;
        this.cardBrandRegex = str;
        this.cardBrandLength = iArr2;
        this.cardBrandDisplayName = str2;
        this.cardBrand = str3;
        this.paymentMethodId = str4;
    }
}
