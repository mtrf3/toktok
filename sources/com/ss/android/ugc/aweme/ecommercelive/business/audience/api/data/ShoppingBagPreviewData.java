package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShoppingBagPreviewData {

    @InterfaceC65349Pkn("highlight_data")
    public HighlightData highlightData;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShoppingBagPreviewData) && o.LJ(this.highlightData, ((ShoppingBagPreviewData) obj).highlightData);
    }

    public final int hashCode() {
        HighlightData highlightData = this.highlightData;
        if (highlightData == null) {
            return 0;
        }
        return highlightData.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShoppingBagPreviewData(highlightData=");
        LIZ.append(this.highlightData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ShoppingBagPreviewData(HighlightData highlightData) {
        this.highlightData = highlightData;
    }
}
