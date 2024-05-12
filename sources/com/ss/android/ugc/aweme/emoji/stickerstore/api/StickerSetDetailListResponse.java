package com.ss.android.ugc.aweme.emoji.stickerstore.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSet;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSetDetailListResponse extends BaseResponse {

    @InterfaceC65349Pkn("sticker_sets")
    public final List<StickerSet> stickerSetList;

    /* JADX WARN: Multi-variable type inference failed */
    public StickerSetDetailListResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerSetDetailListResponse copy$default(StickerSetDetailListResponse stickerSetDetailListResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = stickerSetDetailListResponse.stickerSetList;
        }
        return stickerSetDetailListResponse.copy(list);
    }

    public final StickerSetDetailListResponse copy(List<StickerSet> list) {
        return new StickerSetDetailListResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickerSetDetailListResponse) && o.LJ(this.stickerSetList, ((StickerSetDetailListResponse) obj).stickerSetList);
    }

    public int hashCode() {
        List<StickerSet> list = this.stickerSetList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerSetDetailListResponse(stickerSetList=");
        return C1NE.LIZIZ(LIZ, this.stickerSetList, ')', LIZ);
    }

    public final List<StickerSet> getStickerSetList() {
        return this.stickerSetList;
    }

    public StickerSetDetailListResponse(List<StickerSet> list) {
        this.stickerSetList = list;
    }

    public /* synthetic */ StickerSetDetailListResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
