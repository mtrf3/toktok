package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api;

import X.AbstractC73672Svk;
import X.C64797Pbt;
import X.C74652wP;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC64986Pew;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;

/* loaded from: classes2.dex */
public interface OrderCenterApi {
    public static final C74652wP LIZ = C74652wP.LIZ;

    @E8M("/api/v1/aftersale/list_order/get")
    AbstractC73672Svk<C64797Pbt<TypedInput>> getGlobalOrderList(@InterfaceC195727mC ListOrderRequest listOrderRequest);

    @E8M("/api/v1/trade/order_center/get")
    AbstractC73672Svk<C64797Pbt<Response<Object>>> getOrderCenter(@InterfaceC64986Pew("experiment_version") String str, @InterfaceC64986Pew("previous_page") String str2);

    @E8L("/api/v1/trade/list_order/get")
    AbstractC73672Svk<C64797Pbt<TypedInput>> getOrderList(@InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("tab") Integer num, @InterfaceC64986Pew("size") int i2, @InterfaceC64986Pew("is_new_return_entrance") boolean z, @InterfaceC64986Pew("index") String str, @InterfaceC64986Pew("is_new_payment") boolean z2, @InterfaceC64986Pew("is_prefetch") boolean z3, @InterfaceC64986Pew("version") int i3);
}
