package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSKUSaleProp;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BundleSku {

    @InterfaceC65349Pkn("sku_sale_props")
    public final List<PackedSKUSaleProp> saleProps;

    @InterfaceC65349Pkn("sku_id")
    public final String skuId;

    @InterfaceC65349Pkn("warehouse_id")
    public final String wareHouseId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleSku)) {
            return false;
        }
        BundleSku bundleSku = (BundleSku) obj;
        return o.LJ(this.skuId, bundleSku.skuId) && o.LJ(this.saleProps, bundleSku.saleProps) && o.LJ(this.wareHouseId, bundleSku.wareHouseId);
    }

    public final int hashCode() {
        String str = this.skuId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PackedSKUSaleProp> list = this.saleProps;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.wareHouseId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BundleSku(skuId=");
        LIZ.append(this.skuId);
        LIZ.append(", saleProps=");
        LIZ.append(this.saleProps);
        LIZ.append(", wareHouseId=");
        return q.LIZIZ(LIZ, this.wareHouseId, ')', LIZ);
    }

    public BundleSku(String str, List<PackedSKUSaleProp> list, String str2) {
        this.skuId = str;
        this.saleProps = list;
        this.wareHouseId = str2;
    }
}
