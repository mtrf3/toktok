package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RWG;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import defpackage.b0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuBizData implements Parcelable {
    public static final Parcelable.Creator<SkuBizData> CREATOR = new RWG();
    public final int skuIdsHashCode;

    @InterfaceC65349Pkn("skus")
    public final List<SkuItem> skuItems;

    @InterfaceC65349Pkn("sale_props")
    public final List<SaleProp> skuProps;

    /* JADX WARN: Multi-variable type inference failed */
    public SkuBizData() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuBizData)) {
            return false;
        }
        SkuBizData skuBizData = (SkuBizData) obj;
        return o.LJ(this.skuProps, skuBizData.skuProps) && o.LJ(this.skuItems, skuBizData.skuItems) && this.skuIdsHashCode == skuBizData.skuIdsHashCode;
    }

    public final int hashCode() {
        List<SaleProp> list = this.skuProps;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SkuItem> list2 = this.skuItems;
        return ((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31) + this.skuIdsHashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuBizData(skuProps=");
        LIZ.append(this.skuProps);
        LIZ.append(", skuItems=");
        LIZ.append(this.skuItems);
        LIZ.append(", skuIdsHashCode=");
        return b0.LIZJ(LIZ, this.skuIdsHashCode, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<SaleProp> list = this.skuProps;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((SaleProp) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        List<SkuItem> list2 = this.skuItems;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((SkuItem) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        out.writeInt(this.skuIdsHashCode);
    }

    public SkuBizData(List<SaleProp> list, List<SkuItem> list2, int i) {
        this.skuProps = list;
        this.skuItems = list2;
        this.skuIdsHashCode = i;
    }

    public /* synthetic */ SkuBizData(List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? 0 : i);
    }
}
