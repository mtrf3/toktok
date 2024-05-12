package com.ss.android.ugc.aweme.favorites.business.collection;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CollectionManageResponse extends BaseResponse {

    @InterfaceC65349Pkn("item_archive_id")
    public final String collectionId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollectionManageResponse) && o.LJ(this.collectionId, ((CollectionManageResponse) obj).collectionId);
    }

    public final int hashCode() {
        String str = this.collectionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectionManageResponse(collectionId=");
        return q.LIZIZ(LIZ, this.collectionId, ')', LIZ);
    }

    public CollectionManageResponse(String str) {
        this.collectionId = str;
    }
}
