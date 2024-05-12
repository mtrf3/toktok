package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.buytogether.api;

import X.C69928RcS;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC67352kd;

/* loaded from: classes13.dex */
public interface BuyTogetherApi {
    public static final C69928RcS LIZ = C69928RcS.LIZ;

    @E4T("/api/v1/shop/recommend/feed/bundle_price_get")
    Object getBundlePrice(@InterfaceC27211Am7 BundlePriceRequest bundlePriceRequest, InterfaceC67352kd<? super BundlePriceResponse> interfaceC67352kd);
}
