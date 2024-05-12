package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C279017q;
import X.C28084B0m;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import defpackage.q;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VoucherInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<VoucherInfo> CREATOR = new C28084B0m();

    @InterfaceC65349Pkn("best_voucher_type_ids")
    public final List<String> bestVoucherTypeIds;

    @InterfaceC65349Pkn("coupon_schema")
    public final String coupon_schema;

    @InterfaceC65349Pkn("lowest_price")
    public final Price lowestPrice;

    @InterfaceC65349Pkn("vouchers")
    public List<Voucher> vouchers;

    /* JADX WARN: Multi-variable type inference failed */
    public VoucherInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoucherInfo copy$default(VoucherInfo voucherInfo, Price price, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            price = voucherInfo.lowestPrice;
        }
        if ((i & 2) != 0) {
            list = voucherInfo.vouchers;
        }
        if ((i & 4) != 0) {
            list2 = voucherInfo.bestVoucherTypeIds;
        }
        if ((i & 8) != 0) {
            str = voucherInfo.coupon_schema;
        }
        return voucherInfo.copy(price, list, list2, str);
    }

    public final VoucherInfo copy(Price price, List<Voucher> list, List<String> list2, String str) {
        return new VoucherInfo(price, list, list2, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherInfo)) {
            return false;
        }
        VoucherInfo voucherInfo = (VoucherInfo) obj;
        return o.LJ(this.lowestPrice, voucherInfo.lowestPrice) && o.LJ(this.vouchers, voucherInfo.vouchers) && o.LJ(this.bestVoucherTypeIds, voucherInfo.bestVoucherTypeIds) && o.LJ(this.coupon_schema, voucherInfo.coupon_schema);
    }

    public int hashCode() {
        Price price = this.lowestPrice;
        int hashCode = (price == null ? 0 : price.hashCode()) * 31;
        List<Voucher> list = this.vouchers;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.bestVoucherTypeIds;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.coupon_schema;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoucherInfo(lowestPrice=");
        LIZ.append(this.lowestPrice);
        LIZ.append(", vouchers=");
        LIZ.append(this.vouchers);
        LIZ.append(", bestVoucherTypeIds=");
        LIZ.append(this.bestVoucherTypeIds);
        LIZ.append(", coupon_schema=");
        return q.LIZIZ(LIZ, this.coupon_schema, ')', LIZ);
    }

    public final List<String> getBestVoucherTypeIds() {
        return this.bestVoucherTypeIds;
    }

    public final String getCoupon_schema() {
        return this.coupon_schema;
    }

    public final Price getLowestPrice() {
        return this.lowestPrice;
    }

    public final List<Voucher> getVouchers() {
        return this.vouchers;
    }

    public final void setVouchers(List<Voucher> list) {
        this.vouchers = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Price price = this.lowestPrice;
        if (price == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            price.writeToParcel(out, i);
        }
        List<Voucher> list = this.vouchers;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((Voucher) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeStringList(this.bestVoucherTypeIds);
        out.writeString(this.coupon_schema);
    }

    public VoucherInfo(Price price, List<Voucher> list, List<String> list2, String str) {
        this.lowestPrice = price;
        this.vouchers = list;
        this.bestVoucherTypeIds = list2;
        this.coupon_schema = str;
    }

    public /* synthetic */ VoucherInfo(Price price, List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : price, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str);
    }
}
