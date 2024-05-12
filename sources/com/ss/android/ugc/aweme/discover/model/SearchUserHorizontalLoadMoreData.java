package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import X.T28;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* loaded from: classes9.dex */
public final class SearchUserHorizontalLoadMoreData extends SearchApiResult {

    @InterfaceC65349Pkn("aweme_list")
    public List<? extends Aweme> awemeList;

    @Override // com.ss.android.ugc.aweme.discover.model.SearchApiResult, X.K4J
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return T28.LIZ(this);
    }
}
