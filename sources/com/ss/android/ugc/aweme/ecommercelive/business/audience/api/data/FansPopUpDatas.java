package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FansPopUpDatas {

    @InterfaceC65349Pkn("product_data")
    public final Map<String, FansPopUpData> productData;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FansPopUpDatas) && o.LJ(this.productData, ((FansPopUpDatas) obj).productData);
    }

    public final int hashCode() {
        Map<String, FansPopUpData> map = this.productData;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FansPopUpDatas(productData=");
        return C15890jp.LIZ(LIZ, this.productData, ')', LIZ);
    }

    public FansPopUpDatas(Map<String, FansPopUpData> map) {
        this.productData = map;
    }
}
