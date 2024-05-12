package com.ss.android.ugc.aweme.commercialize.utils;

import X.C76L;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;

/* loaded from: classes2.dex */
public interface CreateOrderApi$RealApi {
    @InterfaceC195787mI
    @E4T("/aweme/v1/dypay/open/order/create/")
    C76L<Object> createOrder(@InterfaceC64987Pex("prepay_order_id") String str);
}
