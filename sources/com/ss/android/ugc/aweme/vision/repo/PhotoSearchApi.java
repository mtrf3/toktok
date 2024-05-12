package com.ss.android.ugc.aweme.vision.repo;

import X.E8M;
import X.InterfaceC51460KHo;
import X.InterfaceC64978Peo;
import X.InterfaceC67352kd;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.m;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public interface PhotoSearchApi {
    @InterfaceC51460KHo
    @E8M("/aweme/v1/search/photo/ecom/")
    Object photoSearchRequest(@InterfaceC64978Peo("image") TypedOutput typedOutput, @InterfaceC64978Peo("image_uri") String str, @InterfaceC64978Peo("detection") String str2, @InterfaceC64978Peo("detection_index") String str3, @InterfaceC64978Peo("search_channel") String str4, @InterfaceC64978Peo("cursor") Long l, @InterfaceC64978Peo("keyword") String str5, @InterfaceC64978Peo("enter_from") String str6, @InterfaceC64978Peo("count") Integer num, @InterfaceC64978Peo("hot_search") Integer num2, @InterfaceC64978Peo("search_id") String str7, @InterfaceC64978Peo("last_search_id") String str8, @InterfaceC64978Peo("source") String str9, @InterfaceC64978Peo("search_source") String str10, @InterfaceC64978Peo("query_correct_type") Integer num3, @InterfaceC64978Peo("is_filter_search") Integer num4, @InterfaceC64978Peo("filter_by") Integer num5, @InterfaceC64978Peo("sort_type") Integer num6, @InterfaceC64978Peo LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC64978Peo("search_context") String str11, @InterfaceC64978Peo("sug_tag_text") String str12, @InterfaceC64978Peo("sug_type") String str13, @InterfaceC64978Peo("sug_query_state") String str14, @InterfaceC64978Peo("sug_creator_id") String str15, @InterfaceC64978Peo("attach_products") String str16, @InterfaceC64978Peo("traffic_source_list") String str17, @InterfaceC64978Peo("ec_search_session_id") String str18, @InterfaceC64978Peo("search_session_id") String str19, @InterfaceC64978Peo("product_detail_uri") String str20, @InterfaceC64978Peo("recall_shield") Integer num7, InterfaceC67352kd<? super m> interfaceC67352kd);
}
