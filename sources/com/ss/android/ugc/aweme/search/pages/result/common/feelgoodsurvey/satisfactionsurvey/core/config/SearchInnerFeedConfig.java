package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.config;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchInnerFeedConfig implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("bgd_video")
    public SearchForceVideo forceVideo;

    @InterfaceC65349Pkn("bgd_video_cover")
    public SearchForceVideo videoCover;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchInnerFeedConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchInnerFeedConfig copy$default(SearchInnerFeedConfig searchInnerFeedConfig, SearchForceVideo searchForceVideo, SearchForceVideo searchForceVideo2, int i, Object obj) {
        if ((i & 1) != 0) {
            searchForceVideo = searchInnerFeedConfig.forceVideo;
        }
        if ((i & 2) != 0) {
            searchForceVideo2 = searchInnerFeedConfig.videoCover;
        }
        return searchInnerFeedConfig.copy(searchForceVideo, searchForceVideo2);
    }

    public final SearchInnerFeedConfig copy(SearchForceVideo searchForceVideo, SearchForceVideo searchForceVideo2) {
        return new SearchInnerFeedConfig(searchForceVideo, searchForceVideo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchInnerFeedConfig)) {
            return false;
        }
        SearchInnerFeedConfig searchInnerFeedConfig = (SearchInnerFeedConfig) obj;
        return o.LJ(this.forceVideo, searchInnerFeedConfig.forceVideo) && o.LJ(this.videoCover, searchInnerFeedConfig.videoCover);
    }

    public int hashCode() {
        SearchForceVideo searchForceVideo = this.forceVideo;
        int hashCode = (searchForceVideo == null ? 0 : searchForceVideo.hashCode()) * 31;
        SearchForceVideo searchForceVideo2 = this.videoCover;
        return hashCode + (searchForceVideo2 != null ? searchForceVideo2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchInnerFeedConfig(forceVideo=");
        LIZ.append(this.forceVideo);
        LIZ.append(", videoCover=");
        LIZ.append(this.videoCover);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final SearchForceVideo getForceVideo() {
        return this.forceVideo;
    }

    public final SearchForceVideo getVideoCover() {
        return this.videoCover;
    }

    public final void setForceVideo(SearchForceVideo searchForceVideo) {
        this.forceVideo = searchForceVideo;
    }

    public final void setVideoCover(SearchForceVideo searchForceVideo) {
        this.videoCover = searchForceVideo;
    }

    public SearchInnerFeedConfig(SearchForceVideo searchForceVideo, SearchForceVideo searchForceVideo2) {
        this.forceVideo = searchForceVideo;
        this.videoCover = searchForceVideo2;
    }

    public /* synthetic */ SearchInnerFeedConfig(SearchForceVideo searchForceVideo, SearchForceVideo searchForceVideo2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchForceVideo, (i & 2) != 0 ? null : searchForceVideo2);
    }
}
