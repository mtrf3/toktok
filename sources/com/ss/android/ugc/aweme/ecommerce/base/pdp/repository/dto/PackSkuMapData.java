package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PackSkuMapData {

    @InterfaceC65349Pkn("packed_sku_map")
    public final Map<String, PackedProductSKUInfo> packedSkuMap;

    /* JADX WARN: Multi-variable type inference failed */
    public PackSkuMapData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PackSkuMapData) && o.LJ(this.packedSkuMap, ((PackSkuMapData) obj).packedSkuMap);
    }

    public final int hashCode() {
        Map<String, PackedProductSKUInfo> map = this.packedSkuMap;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PackSkuMapData(packedSkuMap=");
        return C15890jp.LIZ(LIZ, this.packedSkuMap, ')', LIZ);
    }

    public PackSkuMapData(Map<String, PackedProductSKUInfo> map) {
        this.packedSkuMap = map;
    }

    public /* synthetic */ PackSkuMapData(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }
}
