package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentInfo {

    @InterfaceC65349Pkn("is_valid")
    public Boolean isValid;

    @InterfaceC65349Pkn("payment_method")
    public PaymentMethod paymentMethod;

    @InterfaceC65349Pkn("payment_method_info")
    public final PaymentMethodInfo paymentMethodInfo;

    @InterfaceC65349Pkn("region_geo_id")
    public String regionGeoId;

    @InterfaceC65349Pkn("region_string")
    public String regionName;

    @InterfaceC65349Pkn("use_shipping_address")
    public final Boolean useShippingAddress;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInfo)) {
            return false;
        }
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        return o.LJ(this.paymentMethodInfo, paymentInfo.paymentMethodInfo) && o.LJ(this.paymentMethod, paymentInfo.paymentMethod) && o.LJ(this.useShippingAddress, paymentInfo.useShippingAddress) && o.LJ(this.isValid, paymentInfo.isValid) && o.LJ(this.regionName, paymentInfo.regionName) && o.LJ(this.regionGeoId, paymentInfo.regionGeoId);
    }

    public final int hashCode() {
        PaymentMethodInfo paymentMethodInfo = this.paymentMethodInfo;
        int hashCode = (paymentMethodInfo == null ? 0 : paymentMethodInfo.hashCode()) * 31;
        PaymentMethod paymentMethod = this.paymentMethod;
        int hashCode2 = (hashCode + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        Boolean bool = this.useShippingAddress;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isValid;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.regionName;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.regionGeoId;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentInfo(paymentMethodInfo=");
        LIZ.append(this.paymentMethodInfo);
        LIZ.append(", paymentMethod=");
        LIZ.append(this.paymentMethod);
        LIZ.append(", useShippingAddress=");
        LIZ.append(this.useShippingAddress);
        LIZ.append(", isValid=");
        LIZ.append(this.isValid);
        LIZ.append(", regionName=");
        LIZ.append(this.regionName);
        LIZ.append(", regionGeoId=");
        return q.LIZIZ(LIZ, this.regionGeoId, ')', LIZ);
    }

    public static PaymentInfo LIZ(PaymentInfo paymentInfo, PaymentMethodInfo paymentMethodInfo, PaymentMethod paymentMethod, Boolean bool, int i) {
        Boolean bool2;
        String str;
        Boolean bool3 = bool;
        PaymentMethodInfo paymentMethodInfo2 = paymentMethodInfo;
        PaymentMethod paymentMethod2 = paymentMethod;
        if ((i & 1) != 0) {
            paymentMethodInfo2 = paymentInfo.paymentMethodInfo;
        }
        if ((i & 2) != 0) {
            paymentMethod2 = paymentInfo.paymentMethod;
        }
        String str2 = null;
        if ((i & 4) != 0) {
            bool2 = paymentInfo.useShippingAddress;
        } else {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            bool3 = paymentInfo.isValid;
        }
        if ((i & 16) != 0) {
            str = paymentInfo.regionName;
        } else {
            str = null;
        }
        if ((i & 32) != 0) {
            str2 = paymentInfo.regionGeoId;
        }
        paymentInfo.getClass();
        return new PaymentInfo(paymentMethodInfo2, paymentMethod2, bool2, bool3, str, str2);
    }

    public PaymentInfo(PaymentMethodInfo paymentMethodInfo, PaymentMethod paymentMethod, Boolean bool, Boolean bool2, String str, String str2) {
        this.paymentMethodInfo = paymentMethodInfo;
        this.paymentMethod = paymentMethod;
        this.useShippingAddress = bool;
        this.isValid = bool2;
        this.regionName = str;
        this.regionGeoId = str2;
    }

    public /* synthetic */ PaymentInfo(PaymentMethodInfo paymentMethodInfo, PaymentMethod paymentMethod, Boolean bool, Boolean bool2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentMethodInfo, paymentMethod, bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : str, (i & 32) == 0 ? str2 : null);
    }
}
