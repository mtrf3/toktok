package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.beforelive.slot.preview.model.ProductNum;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import java.util.Map;

/* loaded from: classes7.dex */
public interface ProductApi {
    @E8M("/aweme/v1/oec/affiliate/live/product/del")
    @InterfaceC195757mF
    InterfaceC37276Ek4<BaseResponse<String>> deleteProducts(@InterfaceC36229EJt Map<String, String> map);

    @E8L("/aweme/v1/oec/affiliate/live/product/num")
    InterfaceC37276Ek4<BaseResponse<ProductNum>> getProductsCount(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("is_owner") boolean z);
}
