package com.ss.android.ugc.aweme.paidcontent.seriescreation.api;

import X.AbstractC73638SvC;
import X.C250959t5;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.model.CreatorCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.ManageCollectionRequest;
import com.ss.android.ugc.aweme.model.PricesResponse;

/* loaded from: classes5.dex */
public interface PaidContentCreationApi {
    public static final C250959t5 LIZ = C250959t5.LIZ;

    @E8L("/tiktok/v1/paid_content/creator/collection_detail")
    AbstractC73638SvC<CreatorCollectionDetailResponse> getCollectionDetail(@InterfaceC64986Pew("collection_id") String str);

    @E8L("/tiktok/v1/paid_content/product/prices")
    AbstractC73638SvC<PricesResponse> getPrices(@InterfaceC64986Pew("business_type") int i);

    @E8M("/tiktok/v1/paid_content/collection/manage")
    AbstractC73638SvC<CreatorCollectionDetailResponse> manageCollection(@InterfaceC195727mC ManageCollectionRequest manageCollectionRequest);
}
