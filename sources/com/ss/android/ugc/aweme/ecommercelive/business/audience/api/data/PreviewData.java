package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PreviewData {

    @InterfaceC65349Pkn("bag_data")
    public final BagData bagData;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreviewData) && o.LJ(this.bagData, ((PreviewData) obj).bagData);
    }

    public final int hashCode() {
        BagData bagData = this.bagData;
        if (bagData == null) {
            return 0;
        }
        return bagData.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewData(bagData=");
        LIZ.append(this.bagData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PreviewData(BagData bagData) {
        this.bagData = bagData;
    }
}
