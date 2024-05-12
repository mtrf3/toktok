package com.ss.android.ugc.aweme.im.sdk.dmfilter.data.api;

import X.E4T;
import X.E8L;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.dmfilter.data.model.FilterKeywords;

/* loaded from: classes2.dex */
public interface FilterKeywordsService {
    @E8L("im/filter/get_keywords")
    Object getFilterKeywords(InterfaceC67352kd<? super FilterKeywords> interfaceC67352kd);

    @E4T("im/filter/update_keywords")
    Object setFilterKeywords(@InterfaceC64989Pez("keywords") String str, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);
}
