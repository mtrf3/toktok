package com.ss.android.ugc.aweme.challenge.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SearchSugChallengeList extends BaseResponse {

    @InterfaceC65349Pkn("is_match")
    public boolean isMatch;

    @InterfaceC65349Pkn("sug_list")
    public List<AVChallenge> items = new ArrayList();
    public String keyword = "";

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("words_query_record")
    public final RecommendWordMob recommendWordMob;

    public final void setItems(List<AVChallenge> list) {
        o.LJIIIZ(list, "<set-?>");
        this.items = list;
    }

    public final void setKeyword(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.keyword = str;
    }
}
