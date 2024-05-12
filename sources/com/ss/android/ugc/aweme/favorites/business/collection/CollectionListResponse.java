package com.ss.android.ugc.aweme.favorites.business.collection;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CollectionListResponse extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("item_archive_detail_list")
    public final List<CollectionDetail> items;

    @InterfaceC65349Pkn("total")
    public final Long total;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionListResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionListResponse)) {
            return false;
        }
        CollectionListResponse collectionListResponse = (CollectionListResponse) obj;
        return o.LJ(this.items, collectionListResponse.items) && o.LJ(this.cursor, collectionListResponse.cursor) && o.LJ(this.hasMore, collectionListResponse.hasMore) && o.LJ(this.total, collectionListResponse.total);
    }

    public final int hashCode() {
        List<CollectionDetail> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.cursor;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.total;
        return hashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectionListResponse(items=");
        LIZ.append(this.items);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", total=");
        return JBR.LJ(LIZ, this.total, ')', LIZ);
    }

    public CollectionListResponse(List<CollectionDetail> list, Long l, Boolean bool, Long l2) {
        this.items = list;
        this.cursor = l;
        this.hasMore = bool;
        this.total = l2;
    }

    public /* synthetic */ CollectionListResponse(List list, Long l, Boolean bool, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : l2);
    }
}
