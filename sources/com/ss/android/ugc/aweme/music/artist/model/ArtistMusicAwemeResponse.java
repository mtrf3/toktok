package com.ss.android.ugc.aweme.music.artist.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class ArtistMusicAwemeResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> awemeList;

    @InterfaceC65349Pkn("cursor")
    public final String cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }
}
