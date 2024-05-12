package com.ss.android.ugc.aweme.choosemusic.sug.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.List;

/* loaded from: classes9.dex */
public final class MusicSearchSugResponse extends BaseResponse {

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("words_query_record")
    public final RecommendWordMob recommendWordMob;

    @InterfaceC65349Pkn("rid")
    public String requestId = "";

    @InterfaceC65349Pkn("sug_list")
    public List<? extends SearchSugEntity> sugList;
}
