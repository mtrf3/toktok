package com.ss.android.ugc.aweme.emoji.stickerstore.api;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Video2StickerLikedVideoResponse extends BaseResponse {

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> awemeList;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("max_cursor")
    public final Long maxCursor;

    @InterfaceC65349Pkn("min_cursor")
    public final Long minCursor;

    /* JADX WARN: Multi-variable type inference failed */
    public Video2StickerLikedVideoResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Video2StickerLikedVideoResponse copy$default(Video2StickerLikedVideoResponse video2StickerLikedVideoResponse, List list, Boolean bool, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = video2StickerLikedVideoResponse.awemeList;
        }
        if ((i & 2) != 0) {
            bool = video2StickerLikedVideoResponse.hasMore;
        }
        if ((i & 4) != 0) {
            l = video2StickerLikedVideoResponse.maxCursor;
        }
        if ((i & 8) != 0) {
            l2 = video2StickerLikedVideoResponse.minCursor;
        }
        return video2StickerLikedVideoResponse.copy(list, bool, l, l2);
    }

    public final Video2StickerLikedVideoResponse copy(List<? extends Aweme> list, Boolean bool, Long l, Long l2) {
        return new Video2StickerLikedVideoResponse(list, bool, l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video2StickerLikedVideoResponse)) {
            return false;
        }
        Video2StickerLikedVideoResponse video2StickerLikedVideoResponse = (Video2StickerLikedVideoResponse) obj;
        return o.LJ(this.awemeList, video2StickerLikedVideoResponse.awemeList) && o.LJ(this.hasMore, video2StickerLikedVideoResponse.hasMore) && o.LJ(this.maxCursor, video2StickerLikedVideoResponse.maxCursor) && o.LJ(this.minCursor, video2StickerLikedVideoResponse.minCursor);
    }

    public int hashCode() {
        List<Aweme> list = this.awemeList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.maxCursor;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.minCursor;
        return hashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Video2StickerLikedVideoResponse(awemeList=");
        LIZ.append(this.awemeList);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", maxCursor=");
        LIZ.append(this.maxCursor);
        LIZ.append(", minCursor=");
        return JBR.LJ(LIZ, this.minCursor, ')', LIZ);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final Long getMaxCursor() {
        return this.maxCursor;
    }

    public final Long getMinCursor() {
        return this.minCursor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Video2StickerLikedVideoResponse(List<? extends Aweme> list, Boolean bool, Long l, Long l2) {
        this.awemeList = list;
        this.hasMore = bool;
        this.maxCursor = l;
        this.minCursor = l2;
    }

    public /* synthetic */ Video2StickerLikedVideoResponse(List list, Boolean bool, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2);
    }
}
