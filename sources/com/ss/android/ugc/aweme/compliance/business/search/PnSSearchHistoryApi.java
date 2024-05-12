package com.ss.android.ugc.aweme.compliance.business.search;

import X.AbstractC73672Svk;
import X.E7T;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes7.dex */
public interface PnSSearchHistoryApi {
    public static final E7T LIZ = E7T.LIZ;

    @E8M("/tiktok/search/history/delete/keywords/v1")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> deleteSearchItem(@InterfaceC64985Pev("deleted_keywords") String str);
}
