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
public final class Video2StickerPostedVideoResponse extends BaseResponse {

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> awemeList;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("max_create_time")
    public final Long maxCreateTime;

    /* JADX WARN: Multi-variable type inference failed */
    public Video2StickerPostedVideoResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Video2StickerPostedVideoResponse copy$default(Video2StickerPostedVideoResponse video2StickerPostedVideoResponse, List list, Boolean bool, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = video2StickerPostedVideoResponse.awemeList;
        }
        if ((i & 2) != 0) {
            bool = video2StickerPostedVideoResponse.hasMore;
        }
        if ((i & 4) != 0) {
            l = video2StickerPostedVideoResponse.maxCreateTime;
        }
        return video2StickerPostedVideoResponse.copy(list, bool, l);
    }

    public final Video2StickerPostedVideoResponse copy(List<? extends Aweme> list, Boolean bool, Long l) {
        return new Video2StickerPostedVideoResponse(list, bool, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video2StickerPostedVideoResponse)) {
            return false;
        }
        Video2StickerPostedVideoResponse video2StickerPostedVideoResponse = (Video2StickerPostedVideoResponse) obj;
        return o.LJ(this.awemeList, video2StickerPostedVideoResponse.awemeList) && o.LJ(this.hasMore, video2StickerPostedVideoResponse.hasMore) && o.LJ(this.maxCreateTime, video2StickerPostedVideoResponse.maxCreateTime);
    }

    public int hashCode() {
        List<Aweme> list = this.awemeList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.maxCreateTime;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Video2StickerPostedVideoResponse(awemeList=");
        LIZ.append(this.awemeList);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", maxCreateTime=");
        return JBR.LJ(LIZ, this.maxCreateTime, ')', LIZ);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final Long getMaxCreateTime() {
        return this.maxCreateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Video2StickerPostedVideoResponse(List<? extends Aweme> list, Boolean bool, Long l) {
        this.awemeList = list;
        this.hasMore = bool;
        this.maxCreateTime = l;
    }

    public /* synthetic */ Video2StickerPostedVideoResponse(List list, Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : l);
    }
}
