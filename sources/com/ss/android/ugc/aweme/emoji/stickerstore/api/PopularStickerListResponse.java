package com.ss.android.ugc.aweme.emoji.stickerstore.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.PopularStickerStruct;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PopularStickerListResponse extends BaseResponse {

    @InterfaceC65349Pkn("stickers")
    public final List<PopularStickerStruct> popularStickers;

    /* JADX WARN: Multi-variable type inference failed */
    public PopularStickerListResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PopularStickerListResponse copy$default(PopularStickerListResponse popularStickerListResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = popularStickerListResponse.popularStickers;
        }
        return popularStickerListResponse.copy(list);
    }

    public final PopularStickerListResponse copy(List<PopularStickerStruct> list) {
        return new PopularStickerListResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PopularStickerListResponse) && o.LJ(this.popularStickers, ((PopularStickerListResponse) obj).popularStickers);
    }

    public int hashCode() {
        List<PopularStickerStruct> list = this.popularStickers;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopularStickerListResponse(popularStickers=");
        return C1NE.LIZIZ(LIZ, this.popularStickers, ')', LIZ);
    }

    public final List<PopularStickerStruct> getPopularStickers() {
        return this.popularStickers;
    }

    public PopularStickerListResponse(List<PopularStickerStruct> list) {
        this.popularStickers = list;
    }

    public /* synthetic */ PopularStickerListResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
