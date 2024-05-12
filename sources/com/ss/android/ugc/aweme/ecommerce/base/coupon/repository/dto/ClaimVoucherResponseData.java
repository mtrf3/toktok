package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C1FL;
import X.C69639RUt;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ClaimVoucherResponseData implements Parcelable, Serializable {
    public static final Parcelable.Creator<ClaimVoucherResponseData> CREATOR = new C69639RUt();

    @InterfaceC65349Pkn("can_retry")
    public final Boolean canRetry;

    @InterfaceC65349Pkn("title_text")
    public final String titleText;

    @InterfaceC65349Pkn("voucher")
    public final Voucher voucher;

    public static /* synthetic */ ClaimVoucherResponseData copy$default(ClaimVoucherResponseData claimVoucherResponseData, Boolean bool, Voucher voucher, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = claimVoucherResponseData.canRetry;
        }
        if ((i & 2) != 0) {
            voucher = claimVoucherResponseData.voucher;
        }
        if ((i & 4) != 0) {
            str = claimVoucherResponseData.titleText;
        }
        return claimVoucherResponseData.copy(bool, voucher, str);
    }

    public final ClaimVoucherResponseData copy(Boolean bool, Voucher voucher, String str) {
        return new ClaimVoucherResponseData(bool, voucher, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimVoucherResponseData)) {
            return false;
        }
        ClaimVoucherResponseData claimVoucherResponseData = (ClaimVoucherResponseData) obj;
        return o.LJ(this.canRetry, claimVoucherResponseData.canRetry) && o.LJ(this.voucher, claimVoucherResponseData.voucher) && o.LJ(this.titleText, claimVoucherResponseData.titleText);
    }

    public int hashCode() {
        Boolean bool = this.canRetry;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Voucher voucher = this.voucher;
        int hashCode2 = (hashCode + (voucher == null ? 0 : voucher.hashCode())) * 31;
        String str = this.titleText;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClaimVoucherResponseData(canRetry=");
        LIZ.append(this.canRetry);
        LIZ.append(", voucher=");
        LIZ.append(this.voucher);
        LIZ.append(", titleText=");
        return q.LIZIZ(LIZ, this.titleText, ')', LIZ);
    }

    public final Boolean getCanRetry() {
        return this.canRetry;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final Voucher getVoucher() {
        return this.voucher;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Boolean bool = this.canRetry;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Voucher voucher = this.voucher;
        if (voucher == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            voucher.writeToParcel(out, i);
        }
        out.writeString(this.titleText);
    }

    public ClaimVoucherResponseData(Boolean bool, Voucher voucher, String str) {
        this.canRetry = bool;
        this.voucher = voucher;
        this.titleText = str;
    }
}
