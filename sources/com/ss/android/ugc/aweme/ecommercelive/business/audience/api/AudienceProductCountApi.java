package com.ss.android.ugc.aweme.ecommercelive.business.audience.api;

import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.ProductCount;

/* loaded from: classes2.dex */
public interface AudienceProductCountApi {
    @E8L("/aweme/v1/oec/live/product/num")
    Object getProductsCount(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("is_owner") boolean z, InterfaceC67352kd<? super BaseResponse<ProductCount>> interfaceC67352kd);
}
