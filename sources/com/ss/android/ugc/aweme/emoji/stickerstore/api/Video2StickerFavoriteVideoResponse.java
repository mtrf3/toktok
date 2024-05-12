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
public final class Video2StickerFavoriteVideoResponse extends BaseResponse {

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> awemeList;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    /* JADX WARN: Multi-variable type inference failed */
    public Video2StickerFavoriteVideoResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Video2StickerFavoriteVideoResponse copy$default(Video2StickerFavoriteVideoResponse video2StickerFavoriteVideoResponse, List list, Boolean bool, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = video2StickerFavoriteVideoResponse.awemeList;
        }
        if ((i & 2) != 0) {
            bool = video2StickerFavoriteVideoResponse.hasMore;
        }
        if ((i & 4) != 0) {
            l = video2StickerFavoriteVideoResponse.cursor;
        }
        return video2StickerFavoriteVideoResponse.copy(list, bool, l);
    }

    public final Video2StickerFavoriteVideoResponse copy(List<? extends Aweme> list, Boolean bool, Long l) {
        return new Video2StickerFavoriteVideoResponse(list, bool, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video2StickerFavoriteVideoResponse)) {
            return false;
        }
        Video2StickerFavoriteVideoResponse video2StickerFavoriteVideoResponse = (Video2StickerFavoriteVideoResponse) obj;
        return o.LJ(this.awemeList, video2StickerFavoriteVideoResponse.awemeList) && o.LJ(this.hasMore, video2StickerFavoriteVideoResponse.hasMore) && o.LJ(this.cursor, video2StickerFavoriteVideoResponse.cursor);
    }

    public int hashCode() {
        List<Aweme> list = this.awemeList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.cursor;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Video2StickerFavoriteVideoResponse(awemeList=");
        LIZ.append(this.awemeList);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", cursor=");
        return JBR.LJ(LIZ, this.cursor, ')', LIZ);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final Long getCursor() {
        return this.cursor;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Video2StickerFavoriteVideoResponse(List<? extends Aweme> list, Boolean bool, Long l) {
        this.awemeList = list;
        this.hasMore = bool;
        this.cursor = l;
    }

    public /* synthetic */ Video2StickerFavoriteVideoResponse(List list, Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : l);
    }
}
