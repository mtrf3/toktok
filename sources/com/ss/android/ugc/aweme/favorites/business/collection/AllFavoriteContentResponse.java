package com.ss.android.ugc.aweme.favorites.business.collection;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AllFavoriteContentResponse extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public final Integer hasMore;

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> items;

    @InterfaceC65349Pkn("cursor")
    public final Long maxCursor;

    /* JADX WARN: Multi-variable type inference failed */
    public AllFavoriteContentResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllFavoriteContentResponse)) {
            return false;
        }
        AllFavoriteContentResponse allFavoriteContentResponse = (AllFavoriteContentResponse) obj;
        return o.LJ(this.items, allFavoriteContentResponse.items) && o.LJ(this.maxCursor, allFavoriteContentResponse.maxCursor) && o.LJ(this.hasMore, allFavoriteContentResponse.hasMore);
    }

    public final int hashCode() {
        List<Aweme> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.maxCursor;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.hasMore;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AllFavoriteContentResponse(items=");
        LIZ.append(this.items);
        LIZ.append(", maxCursor=");
        LIZ.append(this.maxCursor);
        LIZ.append(", hasMore=");
        return s0.LIZJ(LIZ, this.hasMore, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AllFavoriteContentResponse(List<? extends Aweme> list, Long l, Integer num) {
        this.items = list;
        this.maxCursor = l;
        this.hasMore = num;
    }

    public /* synthetic */ AllFavoriteContentResponse(List list, Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num);
    }
}
