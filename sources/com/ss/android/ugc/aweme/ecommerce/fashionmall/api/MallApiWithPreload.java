package com.ss.android.ugc.aweme.ecommerce.fashionmall.api;

import X.AbstractC73672Svk;
import X.C30N;
import X.C64797Pbt;
import X.E4T;
import X.InterfaceC195747mE;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.MallToolPanelData;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainResponse;

/* loaded from: classes10.dex */
public interface MallApiWithPreload {
    public static final C30N LIZ = C30N.LIZ;

    @E4T("api/v1/ttf_mall/tool_panel/get")
    AbstractC73672Svk<Response<MallToolPanelData>> getMallToolPanel();

    @E4T("api/v1/ttf_mall/homepage/get")
    Object getShopMainData(@InterfaceC64989Pez("scene") String str, @InterfaceC64989Pez("tab_id") int i, @InterfaceC64989Pez("pixel_ratio") int i2, @InterfaceC64989Pez("top_product_id") String str2, @InterfaceC64989Pez("img_prefetch") boolean z, InterfaceC67352kd<? super C64797Pbt<Response<ShopMainResponse>>> interfaceC67352kd);

    @E4T
    AbstractC73672Svk<C64797Pbt<Response<ShopMainResponse>>> getShopMainDataPreload(@InterfaceC195747mE String str, @InterfaceC64989Pez("scene") String str2, @InterfaceC64989Pez("tab_id") int i, @InterfaceC64989Pez("pixel_ratio") int i2, @InterfaceC64989Pez("top_product_id") String str3, @InterfaceC64989Pez("img_prefetch") boolean z);

    @E4T("api/v1/ttf_mall/homepage/get")
    Object refreshShopMainData(@InterfaceC64989Pez("scene") String str, @InterfaceC64989Pez("tab_id") int i, @InterfaceC64989Pez("pixel_ratio") int i2, @InterfaceC64989Pez("top_product_id") String str2, @InterfaceC64989Pez("channel_tag") String str3, @InterfaceC64989Pez("personal_tab_pool_id") String str4, InterfaceC67352kd<? super C64797Pbt<Response<ShopMainResponse>>> interfaceC67352kd);
}
