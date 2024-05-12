package com.ss.android.ugc.aweme.ecommercelive.business.audience.api;

import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.FansPopUpDatas;

/* loaded from: classes8.dex */
public interface AudienceProductListApi {
    @E8L("/aweme/v1/oec/live/popup/prebuy/get")
    InterfaceC37276Ek4<BaseResponse<FansPopUpDatas>> getFansPopUp(@InterfaceC64986Pew("source") int i, @InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("anchor_id") String str2, @InterfaceC64986Pew("product_ids") String str3);
}
