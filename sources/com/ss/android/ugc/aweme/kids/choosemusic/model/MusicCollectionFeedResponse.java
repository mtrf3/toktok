package com.ss.android.ugc.aweme.kids.choosemusic.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes16.dex */
public class MusicCollectionFeedResponse extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("mcf_list")
    public List<MusicCollectionFeed> musicCollectionFeedList;
}
