package com.ss.android.ugc.aweme.search.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* loaded from: classes4.dex */
public final class SearchUserSugResponse {

    @InterfaceC65349Pkn("has_more")
    public Integer hasMore;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPbBean;

    @InterfaceC65349Pkn("rid")
    public String requestId;

    @InterfaceC65349Pkn("sug_list")
    public List<? extends SearchSugEntity> sugList;

    public final boolean LIZ() {
        Integer num = this.hasMore;
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }
}
