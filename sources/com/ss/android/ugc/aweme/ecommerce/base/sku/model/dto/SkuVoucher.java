package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.RT0;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuVoucher implements Parcelable {
    public static final Parcelable.Creator<SkuVoucher> CREATOR = new RT0();

    @InterfaceC65349Pkn("best_voucher_type_ids")
    public final List<String> bestVoucherTypeIds;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SkuVoucher) && o.LJ(this.bestVoucherTypeIds, ((SkuVoucher) obj).bestVoucherTypeIds);
    }

    public final int hashCode() {
        List<String> list = this.bestVoucherTypeIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeStringList(this.bestVoucherTypeIds);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuVoucher(bestVoucherTypeIds=");
        return C1NE.LIZIZ(LIZ, this.bestVoucherTypeIds, ')', LIZ);
    }

    public SkuVoucher(List<String> list) {
        this.bestVoucherTypeIds = list;
    }
}
