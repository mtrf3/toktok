package com.ss.android.ugc.aweme.ecommercelive.common.api;

import X.C64797Pbt;
import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface ProductListApi {
    @E8L("/aweme/v1/oec/affiliate/creator/live/product/pop")
    InterfaceC37276Ek4<BaseResponse<PopProductResp>> getBroadcastIntroduceProduct(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("is_owner") boolean z, @InterfaceC64986Pew("product_id") long j2);

    @E8L("/aweme/v1/oec/live/product/pop")
    InterfaceC37276Ek4<BaseResponse<PopProductResp>> getIntroduceProduct(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("pop_id") String str2, @InterfaceC64986Pew("promotion_response_style") Integer num, @InterfaceC64986Pew("traffic_source_list") String str3, @InterfaceC64986Pew("user_type") Integer num2, @InterfaceC64986Pew("time_tag") JSONObject jSONObject);

    @E8L("/aweme/v1/oec/live/product/pop")
    Object queryPin(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("promotion_response_style") int i, @InterfaceC64986Pew("traffic_source_list") String str, @InterfaceC64986Pew("user_type") Integer num, InterfaceC67352kd<? super C64797Pbt<BaseResponse<PopProductResp>>> interfaceC67352kd);
}
