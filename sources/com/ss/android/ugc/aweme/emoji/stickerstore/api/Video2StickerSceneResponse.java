package com.ss.android.ugc.aweme.emoji.stickerstore.api;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Video2StickerSceneResponse extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("video_stickers")
    public final List<VideoSticker> stickerList;

    /* JADX WARN: Multi-variable type inference failed */
    public Video2StickerSceneResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Video2StickerSceneResponse copy$default(Video2StickerSceneResponse video2StickerSceneResponse, List list, Long l, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = video2StickerSceneResponse.stickerList;
        }
        if ((i & 2) != 0) {
            l = video2StickerSceneResponse.cursor;
        }
        if ((i & 4) != 0) {
            bool = video2StickerSceneResponse.hasMore;
        }
        return video2StickerSceneResponse.copy(list, l, bool);
    }

    public final Video2StickerSceneResponse copy(List<VideoSticker> list, Long l, Boolean bool) {
        return new Video2StickerSceneResponse(list, l, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video2StickerSceneResponse)) {
            return false;
        }
        Video2StickerSceneResponse video2StickerSceneResponse = (Video2StickerSceneResponse) obj;
        return o.LJ(this.stickerList, video2StickerSceneResponse.stickerList) && o.LJ(this.cursor, video2StickerSceneResponse.cursor) && o.LJ(this.hasMore, video2StickerSceneResponse.hasMore);
    }

    public int hashCode() {
        List<VideoSticker> list = this.stickerList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.cursor;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasMore;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Video2StickerSceneResponse(stickerList=");
        LIZ.append(this.stickerList);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        return C78920UyC.LIZIZ(LIZ, this.hasMore, ')', LIZ);
    }

    public final Long getCursor() {
        return this.cursor;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<VideoSticker> getStickerList() {
        return this.stickerList;
    }

    public Video2StickerSceneResponse(List<VideoSticker> list, Long l, Boolean bool) {
        this.stickerList = list;
        this.cursor = l;
        this.hasMore = bool;
    }

    public /* synthetic */ Video2StickerSceneResponse(List list, Long l, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : bool);
    }
}
