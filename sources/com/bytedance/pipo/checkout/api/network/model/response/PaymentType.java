package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PaymentType {

    @InterfaceC65349Pkn("configuration")
    public String configuration;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl;

    @InterfaceC65349Pkn("payment_method_type")
    public String paymentMethodType;

    @InterfaceC65349Pkn("starling_key")
    public String starlingKey;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentType() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PaymentType copy$default(PaymentType paymentType, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentType.paymentMethodType;
        }
        if ((i & 2) != 0) {
            str2 = paymentType.iconUrl;
        }
        if ((i & 4) != 0) {
            str3 = paymentType.configuration;
        }
        if ((i & 8) != 0) {
            str4 = paymentType.extra;
        }
        if ((i & 16) != 0) {
            str5 = paymentType.starlingKey;
        }
        return paymentType.copy(str, str2, str3, str4, str5);
    }

    public final PaymentType copy(String str, String str2, String str3, String str4, String str5) {
        return new PaymentType(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentType)) {
            return false;
        }
        PaymentType paymentType = (PaymentType) obj;
        return o.LJ(this.paymentMethodType, paymentType.paymentMethodType) && o.LJ(this.iconUrl, paymentType.iconUrl) && o.LJ(this.configuration, paymentType.configuration) && o.LJ(this.extra, paymentType.extra) && o.LJ(this.starlingKey, paymentType.starlingKey);
    }

    public int hashCode() {
        String str = this.paymentMethodType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.configuration;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.extra;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.starlingKey;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentType(paymentMethodType=");
        LIZ.append((Object) this.paymentMethodType);
        LIZ.append(", iconUrl=");
        LIZ.append((Object) this.iconUrl);
        LIZ.append(", configuration=");
        LIZ.append((Object) this.configuration);
        LIZ.append(", extra=");
        LIZ.append((Object) this.extra);
        LIZ.append(", starlingKey=");
        LIZ.append((Object) this.starlingKey);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getConfiguration() {
        return this.configuration;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final String getStarlingKey() {
        return this.starlingKey;
    }

    public final void setConfiguration(String str) {
        this.configuration = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setPaymentMethodType(String str) {
        this.paymentMethodType = str;
    }

    public final void setStarlingKey(String str) {
        this.starlingKey = str;
    }

    public PaymentType(String str, String str2, String str3, String str4, String str5) {
        this.paymentMethodType = str;
        this.iconUrl = str2;
        this.configuration = str3;
        this.extra = str4;
        this.starlingKey = str5;
    }

    public /* synthetic */ PaymentType(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
