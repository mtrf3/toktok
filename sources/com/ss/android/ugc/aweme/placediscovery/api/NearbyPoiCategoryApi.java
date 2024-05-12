package com.ss.android.ugc.aweme.placediscovery.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64986Pew;

/* loaded from: classes10.dex */
public interface NearbyPoiCategoryApi {
    @E4Q("tiktok/poi/category/tab/get/v1")
    AbstractC73672Svk<NearbyPoiCategoryResponse> getPoiCategoryList(@InterfaceC64986Pew("show_type") int i, @InterfaceC64986Pew("manual_region") String str, @InterfaceC64986Pew("manual_region_name") String str2, @InterfaceC64986Pew("scene") int i2);
}
