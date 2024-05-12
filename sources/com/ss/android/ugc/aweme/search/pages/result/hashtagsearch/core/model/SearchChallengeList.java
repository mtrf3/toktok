package com.ss.android.ugc.aweme.search.pages.result.hashtagsearch.core.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import java.util.List;

/* loaded from: classes9.dex */
public class SearchChallengeList extends SearchApiResult {

    @InterfaceC65349Pkn("challenge_list")
    public List<SearchChallenge> challengeList;

    @InterfaceC65349Pkn(alternate = {"min_cursor"}, value = "cursor")
    public int cursor;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("is_match")
    public boolean isMatch;
}
