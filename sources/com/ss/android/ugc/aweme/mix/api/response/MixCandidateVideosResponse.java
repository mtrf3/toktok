package com.ss.android.ugc.aweme.mix.api.response;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public final class MixCandidateVideosResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("max_cursor")
    public long maxCursor;

    @InterfaceC65349Pkn("min_cursor")
    public long minCursor;

    @InterfaceC65349Pkn("aweme_list")
    public List<? extends Aweme> mixVideos;

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final long getMinCursor() {
        return this.minCursor;
    }

    public final List<Aweme> getMixVideos() {
        return this.mixVideos;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public final void setMinCursor(long j) {
        this.minCursor = j;
    }

    public final void setMixVideos(List<? extends Aweme> list) {
        this.mixVideos = list;
    }
}
