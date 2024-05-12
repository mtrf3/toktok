package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.RVV;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuUnavailableInfo implements Parcelable {
    public static final Parcelable.Creator<SkuUnavailableInfo> CREATOR = new RVV();

    @InterfaceC65349Pkn("unavailable_info_id")
    public final Integer pageStatus;

    @InterfaceC65349Pkn("unavailable_info")
    public final ProductUnavailableInfo unavailableInfo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuUnavailableInfo)) {
            return false;
        }
        SkuUnavailableInfo skuUnavailableInfo = (SkuUnavailableInfo) obj;
        return o.LJ(this.pageStatus, skuUnavailableInfo.pageStatus) && o.LJ(this.unavailableInfo, skuUnavailableInfo.unavailableInfo);
    }

    public final int hashCode() {
        Integer num = this.pageStatus;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ProductUnavailableInfo productUnavailableInfo = this.unavailableInfo;
        return hashCode + (productUnavailableInfo != null ? productUnavailableInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuUnavailableInfo(pageStatus=");
        LIZ.append(this.pageStatus);
        LIZ.append(", unavailableInfo=");
        LIZ.append(this.unavailableInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SkuUnavailableInfo(Integer num, ProductUnavailableInfo productUnavailableInfo) {
        this.pageStatus = num;
        this.unavailableInfo = productUnavailableInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.pageStatus;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        ProductUnavailableInfo productUnavailableInfo = this.unavailableInfo;
        if (productUnavailableInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            productUnavailableInfo.writeToParcel(out, i);
        }
    }
}
