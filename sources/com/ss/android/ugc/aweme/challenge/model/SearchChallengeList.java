package com.ss.android.ugc.aweme.challenge.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import java.util.List;

/* loaded from: classes8.dex */
public class SearchChallengeList extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("keyword_disabled")
    public boolean isDisabled;

    @InterfaceC65349Pkn("is_match")
    public boolean isMatch;

    @InterfaceC65349Pkn("challenge_list")
    public List<SearchChallenge> items;
    public String keyword;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;
}
