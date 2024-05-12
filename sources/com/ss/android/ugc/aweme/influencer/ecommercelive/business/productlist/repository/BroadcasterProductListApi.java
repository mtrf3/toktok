package com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.repository;

import X.C64797Pbt;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.data.BroadcasterProductsData;

/* loaded from: classes13.dex */
public interface BroadcasterProductListApi {
    @E8L("/aweme/v1/oec/affiliate/live/product/list")
    Object getBroadcasterProductList(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("is_owner") boolean z, @InterfaceC64986Pew("kol_id") String str, InterfaceC67352kd<? super C64797Pbt<Response<BroadcasterProductsData>>> interfaceC67352kd);
}
