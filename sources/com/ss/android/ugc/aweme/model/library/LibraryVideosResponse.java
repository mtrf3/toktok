package com.ss.android.ugc.aweme.model.library;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes10.dex */
public final class LibraryVideosResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("next_offset")
    public Integer cursor = 0;

    @InterfaceC65349Pkn("has_more")
    public Integer hasMore = 0;

    @InterfaceC65349Pkn("video_list")
    public List<? extends Aweme> videos;

    public final boolean isHasMore() {
        Integer num = this.hasMore;
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final Integer getHasMore() {
        return this.hasMore;
    }

    public final List<Aweme> getVideos() {
        return this.videos;
    }

    public final void setCursor(Integer num) {
        this.cursor = num;
    }

    public final void setHasMore(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        this.hasMore = Integer.valueOf(i);
    }

    public final void setVideos(List<? extends Aweme> list) {
        this.videos = list;
    }

    public final void setHasMore(Integer num) {
        this.hasMore = num;
    }
}
