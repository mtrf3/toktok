package com.ss.android.ugc.aweme.placediscovery2.api;

import X.E4Q;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.placediscovery.api.NearbyPoiCategoryResponse;
import com.ss.android.ugc.aweme.placediscovery2.model.DiscoverMapResponse;

/* loaded from: classes10.dex */
public interface DiscoveryPoiListApi {
    @E4Q("tiktok/poi/category/tab/get/v1")
    Object getPoiCategoryList(@InterfaceC64986Pew("show_type") int i, @InterfaceC64986Pew("manual_region") String str, @InterfaceC64986Pew("manual_region_name") String str2, @InterfaceC64986Pew("scene") int i2, InterfaceC67352kd<? super NearbyPoiCategoryResponse> interfaceC67352kd);

    @E4Q("tiktok/poi/card_feed/get/v1")
    Object getPoiCategoryList(@InterfaceC64986Pew("target_region") String str, @InterfaceC64986Pew("tab_code") String str2, @InterfaceC64986Pew("page") Integer num, @InterfaceC64986Pew("limit") Integer num2, @InterfaceC64986Pew("scene") int i, @InterfaceC64986Pew("region_name") String str3, @InterfaceC64986Pew("poi_id") String str4, @InterfaceC64986Pew("recommend_max_lng") String str5, @InterfaceC64986Pew("recommend_max_lat") String str6, @InterfaceC64986Pew("recommend_min_lng") String str7, @InterfaceC64986Pew("recommend_min_lat") String str8, @InterfaceC64986Pew("nearby_tab_name") String str9, @InterfaceC64986Pew("recommend_center_lng") String str10, @InterfaceC64986Pew("recommend_center_lat") String str11, @InterfaceC64986Pew("gps_is_encrypted") Boolean bool, InterfaceC67352kd<? super DiscoverMapResponse> interfaceC67352kd);
}
