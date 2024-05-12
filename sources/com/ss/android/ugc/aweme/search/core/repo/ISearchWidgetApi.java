package com.ss.android.ugc.aweme.search.core.repo;

import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.search.core.model.SearchWidgetModel;

/* loaded from: classes2.dex */
public interface ISearchWidgetApi {
    @E8L("/aweme/v1/search/widget/suggest/guide/")
    InterfaceC37276Ek4<SearchWidgetModel> getSearchWidget(@InterfaceC64986Pew("req_source") String str);
}
