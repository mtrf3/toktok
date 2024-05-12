package com.ss.android.ugc.aweme.ecommercelive.business.shopbag.api;

import X.C75202xI;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.HighlightData;

/* loaded from: classes2.dex */
public interface PromotionHighLightApi {
    public static final C75202xI LIZ = C75202xI.LIZ;

    @E8L("/aweme/v1/oec/live/promotion_highlight")
    Object getPromotionHighlightData(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("author_id") String str2, @InterfaceC64986Pew("traffic_source_list") String str3, @InterfaceC64986Pew("need_new_user_voucher") boolean z, @InterfaceC64986Pew("request_for_voucher_bubble") boolean z2, InterfaceC67352kd<? super BaseResponse<HighlightData>> interfaceC67352kd);
}
