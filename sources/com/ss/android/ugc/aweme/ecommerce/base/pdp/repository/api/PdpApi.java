package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api;

import X.AbstractC73672Svk;
import X.C70091Rf5;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC27212Am8;
import X.InterfaceC67352kd;
import X.RYH;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleDealRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecallBoxRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RefreshProductSKUInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RefreshProductSKUInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendResponse;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PdpAddToShowcaseRequest;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PdpAddToShowcaseResponse;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public interface PdpApi {
    public static final C70091Rf5 LIZ = C70091Rf5.LIZ;

    @E4T("/aweme/v1/i18nshop/showcase/add")
    Object addToShowCase(@InterfaceC27211Am7 PdpAddToShowcaseRequest pdpAddToShowcaseRequest, InterfaceC67352kd<? super PdpAddToShowcaseResponse> interfaceC67352kd);

    @E4T("/api/v2/shop/bundle_info/get")
    Object getBundleDeal(@InterfaceC27211Am7 BundleDealRequest bundleDealRequest, InterfaceC67352kd<? super BundleInfoResponse> interfaceC67352kd);

    @E4T("/api/v1/shop/product_info/get")
    Object getDelayRequest(@InterfaceC27211Am7 PdpRecallBoxRequest pdpRecallBoxRequest, InterfaceC67352kd<? super RYH> interfaceC67352kd);

    @E4T("/api/v1/shop/product_info/get")
    AbstractC73672Svk<RYH> getProductInfo(@InterfaceC27211Am7 Map<String, Object> map, @InterfaceC27212Am8 HashMap<String, String> hashMap);

    @E4T("/api/v1/shop/product_info/batch")
    AbstractC73672Svk<RYH> getProductInfoBatch(@InterfaceC27211Am7 Map<String, Object> map, @InterfaceC27212Am8 HashMap<String, String> hashMap);

    @E4T("/api/v1/shop/recommend/feed/pdp_get_preload")
    Object getProductRecommend(@InterfaceC27211Am7 PdpRecommendPreloadRequest pdpRecommendPreloadRequest, @InterfaceC27212Am8 HashMap<String, String> hashMap, InterfaceC67352kd<? super PdpRecommendPreloadResponse> interfaceC67352kd);

    @E4T("/api/v1/shop/recommend/same_shop/get")
    Object getShopRecommend(@InterfaceC27211Am7 PdpRecommendPreloadRequest pdpRecommendPreloadRequest, @InterfaceC27212Am8 HashMap<String, String> hashMap, InterfaceC67352kd<? super ShopRecommendResponse> interfaceC67352kd);

    @E4T("/api/v1/shop/product_sku_info/refresh")
    Object getSkuInfo(@InterfaceC27211Am7 RefreshProductSKUInfoRequest refreshProductSKUInfoRequest, InterfaceC67352kd<? super RefreshProductSKUInfoResponse> interfaceC67352kd);

    @E4T("https://oec-api.tiktokv.com/aweme/v1/oec/creator_union/chain_collector/visit_event/report")
    AbstractC73672Svk<Response<Object>> reportEnterPdp(@InterfaceC27211Am7 Map<String, Object> map);
}
