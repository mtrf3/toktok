package com.ss.android.ugc.aweme.emoji.stickerstore.api;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.FavStickerStruct;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FavStickerListResponse extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("stickers")
    public final List<FavStickerStruct> favStickerList;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    /* JADX WARN: Multi-variable type inference failed */
    public FavStickerListResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavStickerListResponse copy$default(FavStickerListResponse favStickerListResponse, List list, Boolean bool, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = favStickerListResponse.favStickerList;
        }
        if ((i & 2) != 0) {
            bool = favStickerListResponse.hasMore;
        }
        if ((i & 4) != 0) {
            l = favStickerListResponse.cursor;
        }
        return favStickerListResponse.copy(list, bool, l);
    }

    public final FavStickerListResponse copy(List<FavStickerStruct> list, Boolean bool, Long l) {
        return new FavStickerListResponse(list, bool, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavStickerListResponse)) {
            return false;
        }
        FavStickerListResponse favStickerListResponse = (FavStickerListResponse) obj;
        return o.LJ(this.favStickerList, favStickerListResponse.favStickerList) && o.LJ(this.hasMore, favStickerListResponse.hasMore) && o.LJ(this.cursor, favStickerListResponse.cursor);
    }

    public int hashCode() {
        List<FavStickerStruct> list = this.favStickerList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.cursor;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FavStickerListResponse(favStickerList=");
        LIZ.append(this.favStickerList);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", cursor=");
        return JBR.LJ(LIZ, this.cursor, ')', LIZ);
    }

    public final Long getCursor() {
        return this.cursor;
    }

    public final List<FavStickerStruct> getFavStickerList() {
        return this.favStickerList;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public FavStickerListResponse(List<FavStickerStruct> list, Boolean bool, Long l) {
        this.favStickerList = list;
        this.hasMore = bool;
        this.cursor = l;
    }

    public /* synthetic */ FavStickerListResponse(List list, Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : l);
    }
}
