package com.ss.android.ugc.aweme.challenge.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

/* loaded from: classes8.dex */
public class ChallengeList extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("is_match")
    public boolean isMatch;

    @InterfaceC65349Pkn("challenge_list")
    public List<Challenge> items;

    @InterfaceC65349Pkn("max_cursor")
    public long maxCursor;

    @InterfaceC65349Pkn("min_cursor")
    public long minCursor;
}
