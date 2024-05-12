package com.bytedance.pipo.checkout.api.network.model.request;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PaymentMethodInfo {

    @InterfaceC65349Pkn("card_number")
    public String cardNumber;

    @InterfaceC65349Pkn("cvv")
    public String cvv;

    @InterfaceC65349Pkn("expiration_month")
    public String expirationMonth;

    @InterfaceC65349Pkn("expiration_year")
    public String expirationYear;

    @InterfaceC65349Pkn("holder_name")
    public String holderName;

    @InterfaceC65349Pkn("type")
    public String type;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PaymentMethodInfo copy$default(PaymentMethodInfo paymentMethodInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethodInfo.type;
        }
        if ((i & 2) != 0) {
            str2 = paymentMethodInfo.cardNumber;
        }
        if ((i & 4) != 0) {
            str3 = paymentMethodInfo.cvv;
        }
        if ((i & 8) != 0) {
            str4 = paymentMethodInfo.expirationMonth;
        }
        if ((i & 16) != 0) {
            str5 = paymentMethodInfo.expirationYear;
        }
        if ((i & 32) != 0) {
            str6 = paymentMethodInfo.holderName;
        }
        return paymentMethodInfo.copy(str, str2, str3, str4, str5, str6);
    }

    public final PaymentMethodInfo copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new PaymentMethodInfo(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodInfo)) {
            return false;
        }
        PaymentMethodInfo paymentMethodInfo = (PaymentMethodInfo) obj;
        return o.LJ(this.type, paymentMethodInfo.type) && o.LJ(this.cardNumber, paymentMethodInfo.cardNumber) && o.LJ(this.cvv, paymentMethodInfo.cvv) && o.LJ(this.expirationMonth, paymentMethodInfo.expirationMonth) && o.LJ(this.expirationYear, paymentMethodInfo.expirationYear) && o.LJ(this.holderName, paymentMethodInfo.holderName);
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cvv;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expirationMonth;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.expirationYear;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.holderName;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentMethodInfo(type=");
        LIZ.append((Object) this.type);
        LIZ.append(", cardNumber=");
        LIZ.append((Object) this.cardNumber);
        LIZ.append(", cvv=");
        LIZ.append((Object) this.cvv);
        LIZ.append(", expirationMonth=");
        LIZ.append((Object) this.expirationMonth);
        LIZ.append(", expirationYear=");
        LIZ.append((Object) this.expirationYear);
        LIZ.append(", holderName=");
        LIZ.append((Object) this.holderName);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final String getExpirationMonth() {
        return this.expirationMonth;
    }

    public final String getExpirationYear() {
        return this.expirationYear;
    }

    public final String getHolderName() {
        return this.holderName;
    }

    public final String getType() {
        return this.type;
    }

    public final void setCardNumber(String str) {
        this.cardNumber = str;
    }

    public final void setCvv(String str) {
        this.cvv = str;
    }

    public final void setExpirationMonth(String str) {
        this.expirationMonth = str;
    }

    public final void setExpirationYear(String str) {
        this.expirationYear = str;
    }

    public final void setHolderName(String str) {
        this.holderName = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public PaymentMethodInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.type = str;
        this.cardNumber = str2;
        this.cvv = str3;
        this.expirationMonth = str4;
        this.expirationYear = str5;
        this.holderName = str6;
    }

    public /* synthetic */ PaymentMethodInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null);
    }
}
