package com.ss.android.ugc.aweme.shortvideo.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.AVSearchChallenge;
import java.util.List;

/* loaded from: classes8.dex */
public class AVSearchChallengeList {

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("keyword_disabled")
    public boolean isDisabled;

    @InterfaceC65349Pkn("is_match")
    public boolean isMatch;

    @InterfaceC65349Pkn("challenge_list")
    public List<AVSearchChallenge> items;
    public String keyword;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("words_query_record")
    public RecommendWordMob recommendWordMob;
}
