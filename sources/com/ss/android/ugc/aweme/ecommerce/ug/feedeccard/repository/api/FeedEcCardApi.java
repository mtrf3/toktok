package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.api;

import X.C36050ECw;
import X.C64797Pbt;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean.FeedEcCardRequest;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean.FeedEcCardResponse;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean.RecImpressRequest;

/* loaded from: classes7.dex */
public interface FeedEcCardApi {
    public static final C36050ECw LIZ = C36050ECw.LIZ;

    @E8M("/api/v1/mall/feed/ecom_card/get")
    Object fetchFeedEcCardData(@InterfaceC195727mC FeedEcCardRequest feedEcCardRequest, InterfaceC67352kd<? super C64797Pbt<Response<FeedEcCardResponse>>> interfaceC67352kd);

    @E8M("/api/v1/shop/recommend/impression/write")
    Object reportRecProductImpress(@InterfaceC195727mC RecImpressRequest recImpressRequest, InterfaceC67352kd<? super C64797Pbt<Response<Object>>> interfaceC67352kd);
}
