package com.ss.android.ugc.aweme.commercialize.live.business.links.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCountResponse;

/* loaded from: classes7.dex */
public interface BusinessLinksLiveApi {
    @E8M("/aweme/v1/ad/ba/business/link/active/clear/")
    AbstractC73638SvC<BaseResponse> clearBusinessLinksCards();

    @E8L("/aweme/v1/ad/ba/business/link/active/count/")
    AbstractC73672Svk<BusinessLinksCountResponse> getActiveLinksCount();
}
