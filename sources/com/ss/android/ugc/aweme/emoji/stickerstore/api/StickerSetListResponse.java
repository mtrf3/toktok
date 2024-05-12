package com.ss.android.ugc.aweme.emoji.stickerstore.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.IMStickerMeta;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSetListResponse extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("sticker_meta")
    public final List<IMStickerMeta> stickerMeta;

    @InterfaceC65349Pkn("sticker_sets")
    public final List<StickerSetInfo> stickerSetInfoList;

    /* JADX WARN: Multi-variable type inference failed */
    public StickerSetListResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerSetListResponse copy$default(StickerSetListResponse stickerSetListResponse, List list, Boolean bool, Long l, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = stickerSetListResponse.stickerSetInfoList;
        }
        if ((i & 2) != 0) {
            bool = stickerSetListResponse.hasMore;
        }
        if ((i & 4) != 0) {
            l = stickerSetListResponse.cursor;
        }
        if ((i & 8) != 0) {
            list2 = stickerSetListResponse.stickerMeta;
        }
        return stickerSetListResponse.copy(list, bool, l, list2);
    }

    public final StickerSetListResponse copy(List<StickerSetInfo> list, Boolean bool, Long l, List<IMStickerMeta> list2) {
        return new StickerSetListResponse(list, bool, l, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerSetListResponse)) {
            return false;
        }
        StickerSetListResponse stickerSetListResponse = (StickerSetListResponse) obj;
        return o.LJ(this.stickerSetInfoList, stickerSetListResponse.stickerSetInfoList) && o.LJ(this.hasMore, stickerSetListResponse.hasMore) && o.LJ(this.cursor, stickerSetListResponse.cursor) && o.LJ(this.stickerMeta, stickerSetListResponse.stickerMeta);
    }

    public int hashCode() {
        List<StickerSetInfo> list = this.stickerSetInfoList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.cursor;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List<IMStickerMeta> list2 = this.stickerMeta;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerSetListResponse(stickerSetInfoList=");
        LIZ.append(this.stickerSetInfoList);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", stickerMeta=");
        return C1NE.LIZIZ(LIZ, this.stickerMeta, ')', LIZ);
    }

    public final Long getCursor() {
        return this.cursor;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<IMStickerMeta> getStickerMeta() {
        return this.stickerMeta;
    }

    public final List<StickerSetInfo> getStickerSetInfoList() {
        return this.stickerSetInfoList;
    }

    public StickerSetListResponse(List<StickerSetInfo> list, Boolean bool, Long l, List<IMStickerMeta> list2) {
        this.stickerSetInfoList = list;
        this.hasMore = bool;
        this.cursor = l;
        this.stickerMeta = list2;
    }

    public /* synthetic */ StickerSetListResponse(List list, Boolean bool, Long l, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : list2);
    }
}
