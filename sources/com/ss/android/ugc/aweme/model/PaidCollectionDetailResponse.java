package com.ss.android.ugc.aweme.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PaidCollectionDetailResponse extends BaseResponse {

    @InterfaceC65349Pkn("collection")
    public final CollectionDetailModel collectionDetail;

    /* JADX WARN: Multi-variable type inference failed */
    public PaidCollectionDetailResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaidCollectionDetailResponse) && o.LJ(this.collectionDetail, ((PaidCollectionDetailResponse) obj).collectionDetail);
    }

    public final int hashCode() {
        CollectionDetailModel collectionDetailModel = this.collectionDetail;
        if (collectionDetailModel == null) {
            return 0;
        }
        return collectionDetailModel.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidCollectionDetailResponse(collectionDetail=");
        LIZ.append(this.collectionDetail);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PaidCollectionDetailResponse(CollectionDetailModel collectionDetailModel) {
        this.collectionDetail = collectionDetailModel;
    }

    public /* synthetic */ PaidCollectionDetailResponse(CollectionDetailModel collectionDetailModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : collectionDetailModel);
    }
}
