package com.ss.android.ugc.aweme.favorites.business.collection;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CollectionDetailResponse extends BaseResponse {

    @InterfaceC65349Pkn("item_archive")
    public final CollectionDetail collectionDetail;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollectionDetailResponse) && o.LJ(this.collectionDetail, ((CollectionDetailResponse) obj).collectionDetail);
    }

    public final int hashCode() {
        CollectionDetail collectionDetail = this.collectionDetail;
        if (collectionDetail == null) {
            return 0;
        }
        return collectionDetail.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectionDetailResponse(collectionDetail=");
        LIZ.append(this.collectionDetail);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public CollectionDetailResponse(CollectionDetail collectionDetail) {
        this.collectionDetail = collectionDetail;
    }
}
