package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RWF;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuInfo implements Parcelable {
    public static final Parcelable.Creator<SkuInfo> CREATOR = new RWF();

    @InterfaceC65349Pkn("sale_props")
    public final List<SaleProp> salePropList;

    @InterfaceC65349Pkn("sku_common_config")
    public final SkuCommonConfig skuCommonConfig;

    @InterfaceC65349Pkn("skus")
    public final List<SkuItem> skuList;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuInfo)) {
            return false;
        }
        SkuInfo skuInfo = (SkuInfo) obj;
        return o.LJ(this.skuList, skuInfo.skuList) && o.LJ(this.salePropList, skuInfo.salePropList) && o.LJ(this.skuCommonConfig, skuInfo.skuCommonConfig);
    }

    public final int hashCode() {
        List<SkuItem> list = this.skuList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SaleProp> list2 = this.salePropList;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        SkuCommonConfig skuCommonConfig = this.skuCommonConfig;
        return hashCode2 + (skuCommonConfig != null ? skuCommonConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuInfo(skuList=");
        LIZ.append(this.skuList);
        LIZ.append(", salePropList=");
        LIZ.append(this.salePropList);
        LIZ.append(", skuCommonConfig=");
        LIZ.append(this.skuCommonConfig);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<SkuItem> list = this.skuList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((SkuItem) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        List<SaleProp> list2 = this.salePropList;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((SaleProp) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        SkuCommonConfig skuCommonConfig = this.skuCommonConfig;
        if (skuCommonConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            skuCommonConfig.writeToParcel(out, i);
        }
    }

    public SkuInfo(List<SkuItem> list, List<SaleProp> list2, SkuCommonConfig skuCommonConfig) {
        this.skuList = list;
        this.salePropList = list2;
        this.skuCommonConfig = skuCommonConfig;
    }
}
