package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.repo;

import X.C64797Pbt;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model.HighlightResponseData;

/* loaded from: classes2.dex */
public interface HighlightsNetApi {
    @E8L("/api/live_creator/v1/highlight/get")
    Object highlightList(@InterfaceC64986Pew("author_id") String str, @InterfaceC64986Pew("offset") int i, InterfaceC67352kd<? super C64797Pbt<Response<HighlightResponseData>>> interfaceC67352kd);

    @E8M("/aweme/v1/oec/live/highlight/report")
    Object reportPinCardClick(@InterfaceC195727mC ReportPinCardClickRequest reportPinCardClickRequest, InterfaceC67352kd<? super C64797Pbt<Response<Object>>> interfaceC67352kd);
}
