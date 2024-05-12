package com.ss.android.ugc.aweme.favorites.business.collection;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CollectionAllFavoritesResponse extends BaseResponse {

    @InterfaceC65349Pkn("item_archive_detail")
    public final CollectionDetail detail;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionAllFavoritesResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollectionAllFavoritesResponse) && o.LJ(this.detail, ((CollectionAllFavoritesResponse) obj).detail);
    }

    public final int hashCode() {
        CollectionDetail collectionDetail = this.detail;
        if (collectionDetail == null) {
            return 0;
        }
        return collectionDetail.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectionAllFavoritesResponse(detail=");
        LIZ.append(this.detail);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public CollectionAllFavoritesResponse(CollectionDetail collectionDetail) {
        this.detail = collectionDetail;
    }

    public /* synthetic */ CollectionAllFavoritesResponse(CollectionDetail collectionDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : collectionDetail);
    }
}
