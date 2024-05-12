package com.ss.android.ugc.aweme.shoutouts.network;

import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;

/* loaded from: classes7.dex */
public final class ShoutoutOrderListApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes7.dex */
    public interface Api {
        @E8L("/tiktok/shoutouts/order/list/v1")
        InterfaceC37276Ek4<ShoutoutsGetListResponse> get(@InterfaceC64986Pew("filter") int i, @InterfaceC64986Pew("product_id") String str, @InterfaceC64986Pew("count") int i2);
    }
}
