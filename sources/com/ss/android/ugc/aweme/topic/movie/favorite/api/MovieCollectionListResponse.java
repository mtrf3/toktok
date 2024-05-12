package com.ss.android.ugc.aweme.topic.movie.favorite.api;

import X.C61878OQg;
import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MovieCollectionListResponse extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("movie_list")
    public final List<TopicRawInfo> movieList;

    public MovieCollectionListResponse() {
        this(null, 0L, false, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MovieCollectionListResponse) {
            return C78966Uyw.LJIIIZ(((MovieCollectionListResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{this.movieList, Long.valueOf(this.cursor), Boolean.valueOf(this.hasMore)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("MovieCollectionListResponse:%s,%s,%s", getObjects());
    }

    public MovieCollectionListResponse(List<TopicRawInfo> movieList, long j, boolean z) {
        o.LJIIIZ(movieList, "movieList");
        this.movieList = movieList;
        this.cursor = j;
        this.hasMore = z;
    }

    public MovieCollectionListResponse(List list, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z);
    }
}
