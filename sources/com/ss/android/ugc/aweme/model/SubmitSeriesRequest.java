package com.ss.android.ugc.aweme.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SubmitSeriesRequest {

    @InterfaceC65349Pkn("collection_id")
    public final String collectionId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitSeriesRequest) && o.LJ(this.collectionId, ((SubmitSeriesRequest) obj).collectionId);
    }

    public final int hashCode() {
        String str = this.collectionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubmitSeriesRequest(collectionId=");
        return q.LIZIZ(LIZ, this.collectionId, ')', LIZ);
    }

    public SubmitSeriesRequest(String str) {
        this.collectionId = str;
    }
}
