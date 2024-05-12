package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import X.T28;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import java.util.List;

/* loaded from: classes9.dex */
public class SearchUserList extends SearchApiResult {

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("user_list")
    public List<SearchUser> userList;

    @Override // com.ss.android.ugc.aweme.discover.model.SearchApiResult, X.K4J
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return T28.LIZ(this);
    }
}
