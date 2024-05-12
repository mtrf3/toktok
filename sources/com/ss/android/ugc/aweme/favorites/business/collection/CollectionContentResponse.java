package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CollectionContentResponse extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("items")
    public final List<Aweme> items;

    @InterfaceC65349Pkn("max_cursor")
    public final Long maxCursor;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionContentResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionContentResponse)) {
            return false;
        }
        CollectionContentResponse collectionContentResponse = (CollectionContentResponse) obj;
        return o.LJ(this.items, collectionContentResponse.items) && o.LJ(this.maxCursor, collectionContentResponse.maxCursor) && o.LJ(this.hasMore, collectionContentResponse.hasMore);
    }

    public final int hashCode() {
        List<Aweme> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.maxCursor;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasMore;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectionContentResponse(items=");
        LIZ.append(this.items);
        LIZ.append(", maxCursor=");
        LIZ.append(this.maxCursor);
        LIZ.append(", hasMore=");
        return C78920UyC.LIZIZ(LIZ, this.hasMore, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionContentResponse(List<? extends Aweme> list, Long l, Boolean bool) {
        this.items = list;
        this.maxCursor = l;
        this.hasMore = bool;
    }

    public /* synthetic */ CollectionContentResponse(List list, Long l, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : bool);
    }
}
