package com.ss.android.ugc.aweme.question.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes10.dex */
public final class QuestionVideosResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("cursor")
    public Integer cursor = 0;

    @InterfaceC65349Pkn("has_more")
    public Integer hasMore = 0;

    @InterfaceC65349Pkn("videos")
    public List<Aweme> videos;

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

    public final void setHasMore(Integer num) {
        this.hasMore = num;
    }

    public final void setVideos(List<Aweme> list) {
        this.videos = list;
    }
}
