package com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.repository;

import X.AbstractC73672Svk;
import X.C51754KSw;
import X.C64797Pbt;
import X.E4T;
import X.EKC;
import X.InterfaceC195747mE;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import java.util.Map;

/* loaded from: classes9.dex */
public interface LynxMallApiWithPreload {
    public static final C51754KSw LIZ = C51754KSw.LIZ;

    @E4T("api/v1/mall/homepage/lynx/get")
    @EKC({"scene:ttmall_homepage"})
    Object getShopMainData(@InterfaceC64989Pez("scene") String str, @InterfaceC64989Pez("tab_id") int i, @InterfaceC64989Pez("pixel_ratio") int i2, @InterfaceC64989Pez("cmpl_enc") String str2, @InterfaceC64989Pez("img_prefetch") boolean z, @InterfaceC64989Pez("diversion_params") String str3, InterfaceC67352kd<? super C64797Pbt<Response<Map<String, Object>>>> interfaceC67352kd);

    @E4T
    @EKC({"scene:ttmall_homepage"})
    AbstractC73672Svk<C64797Pbt<Response<Map<String, Object>>>> getShopMainDataPreload(@InterfaceC195747mE String str, @InterfaceC64989Pez("scene") String str2, @InterfaceC64989Pez("tab_id") int i, @InterfaceC64989Pez("pixel_ratio") int i2, @InterfaceC64989Pez("cmpl_enc") String str3, @InterfaceC64989Pez("img_prefetch") boolean z, @InterfaceC64989Pez("diversion_params") String str4);
}
