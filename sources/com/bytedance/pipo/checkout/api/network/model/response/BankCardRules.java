package com.bytedance.pipo.checkout.api.network.model.response;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BankCardRules {

    @InterfaceC65349Pkn("card_brand")
    public String cardBrand;

    @InterfaceC65349Pkn("card_brand_length")
    public List<Integer> cardBrandLength;

    @InterfaceC65349Pkn("card_brand_regex")
    public String cardBrandRegex;

    @InterfaceC65349Pkn("cvv_length")
    public List<Integer> cvvLength;

    @InterfaceC65349Pkn("payment_method_id")
    public String paymentMethodId;

    public BankCardRules() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BankCardRules copy$default(BankCardRules bankCardRules, String str, String str2, String str3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankCardRules.paymentMethodId;
        }
        if ((i & 2) != 0) {
            str2 = bankCardRules.cardBrand;
        }
        if ((i & 4) != 0) {
            str3 = bankCardRules.cardBrandRegex;
        }
        if ((i & 8) != 0) {
            list = bankCardRules.cvvLength;
        }
        if ((i & 16) != 0) {
            list2 = bankCardRules.cardBrandLength;
        }
        return bankCardRules.copy(str, str2, str3, list, list2);
    }

    public final BankCardRules copy(String str, String str2, String str3, List<Integer> cvvLength, List<Integer> cardBrandLength) {
        o.LJIIIZ(cvvLength, "cvvLength");
        o.LJIIIZ(cardBrandLength, "cardBrandLength");
        return new BankCardRules(str, str2, str3, cvvLength, cardBrandLength);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankCardRules)) {
            return false;
        }
        BankCardRules bankCardRules = (BankCardRules) obj;
        return o.LJ(this.paymentMethodId, bankCardRules.paymentMethodId) && o.LJ(this.cardBrand, bankCardRules.cardBrand) && o.LJ(this.cardBrandRegex, bankCardRules.cardBrandRegex) && o.LJ(this.cvvLength, bankCardRules.cvvLength) && o.LJ(this.cardBrandLength, bankCardRules.cardBrandLength);
    }

    public int hashCode() {
        String str = this.paymentMethodId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardBrand;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardBrandRegex;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.cvvLength.hashCode()) * 31) + this.cardBrandLength.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BankCardRules(paymentMethodId=");
        LIZ.append((Object) this.paymentMethodId);
        LIZ.append(", cardBrand=");
        LIZ.append((Object) this.cardBrand);
        LIZ.append(", cardBrandRegex=");
        LIZ.append((Object) this.cardBrandRegex);
        LIZ.append(", cvvLength=");
        LIZ.append(this.cvvLength);
        LIZ.append(", cardBrandLength=");
        LIZ.append(this.cardBrandLength);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getCardBrand() {
        return this.cardBrand;
    }

    public final List<Integer> getCardBrandLength() {
        return this.cardBrandLength;
    }

    public final String getCardBrandRegex() {
        return this.cardBrandRegex;
    }

    public final List<Integer> getCvvLength() {
        return this.cvvLength;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final void setCardBrand(String str) {
        this.cardBrand = str;
    }

    public final void setCardBrandLength(List<Integer> list) {
        o.LJIIIZ(list, "<set-?>");
        this.cardBrandLength = list;
    }

    public final void setCardBrandRegex(String str) {
        this.cardBrandRegex = str;
    }

    public final void setCvvLength(List<Integer> list) {
        o.LJIIIZ(list, "<set-?>");
        this.cvvLength = list;
    }

    public final void setPaymentMethodId(String str) {
        this.paymentMethodId = str;
    }

    public BankCardRules(String str, String str2, String str3, List<Integer> cvvLength, List<Integer> cardBrandLength) {
        o.LJIIIZ(cvvLength, "cvvLength");
        o.LJIIIZ(cardBrandLength, "cardBrandLength");
        this.paymentMethodId = str;
        this.cardBrand = str2;
        this.cardBrandRegex = str3;
        this.cvvLength = cvvLength;
        this.cardBrandLength = cardBrandLength;
    }

    public BankCardRules(String str, String str2, String str3, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : null, (i & 8) != 0 ? C61878OQg.INSTANCE : list, (i & 16) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
