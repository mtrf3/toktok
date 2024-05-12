package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress;

import X.EnumC27826Aw2;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BillingFragmentEnterParams {

    @InterfaceC65349Pkn("ccdcPayment")
    public final PaymentMethod ccdcPayment;

    @InterfaceC65349Pkn("dismissParent")
    public final boolean dismissParent;
    public final String oldKey;

    @InterfaceC65349Pkn("openFrom")
    public final EnumC27826Aw2 openFrom;

    @InterfaceC65349Pkn("paySource")
    public final String paySource;

    @InterfaceC65349Pkn("paymentInfo")
    public final PaymentInfo paymentInfo;

    @InterfaceC65349Pkn("shippingAddress")
    public final Address shippingAddress;

    @InterfaceC65349Pkn("trackParams")
    public final HashMap<String, Object> trackParams;

    /* JADX WARN: Multi-variable type inference failed */
    public BillingFragmentEnterParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public final PaymentMethod getCcdcPayment() {
        return this.ccdcPayment;
    }

    public final boolean getDismissParent() {
        return this.dismissParent;
    }

    public final String getOldKey() {
        return this.oldKey;
    }

    public final EnumC27826Aw2 getOpenFrom() {
        return this.openFrom;
    }

    public final String getPaySource() {
        return this.paySource;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public final Address getShippingAddress() {
        return this.shippingAddress;
    }

    public final HashMap<String, Object> getTrackParams() {
        return this.trackParams;
    }

    public BillingFragmentEnterParams(PaymentMethod paymentMethod, EnumC27826Aw2 openFrom, Address address, PaymentInfo paymentInfo, boolean z, String str, HashMap<String, Object> hashMap, String str2) {
        o.LJIIIZ(openFrom, "openFrom");
        this.ccdcPayment = paymentMethod;
        this.openFrom = openFrom;
        this.shippingAddress = address;
        this.paymentInfo = paymentInfo;
        this.dismissParent = z;
        this.paySource = str;
        this.trackParams = hashMap;
        this.oldKey = str2;
    }

    public /* synthetic */ BillingFragmentEnterParams(PaymentMethod paymentMethod, EnumC27826Aw2 enumC27826Aw2, Address address, PaymentInfo paymentInfo, boolean z, String str, HashMap hashMap, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentMethod, (i & 2) != 0 ? EnumC27826Aw2.OSP : enumC27826Aw2, (i & 4) != 0 ? null : address, (i & 8) != 0 ? null : paymentInfo, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : hashMap, (i & 128) == 0 ? str2 : null);
    }
}
