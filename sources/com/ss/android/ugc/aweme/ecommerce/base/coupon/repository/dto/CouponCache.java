package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C16880lQ;
import X.C47135Ieh;
import X.C48256Iwm;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class CouponCache implements Parcelable, Serializable {
    public static final Parcelable.Creator<CouponCache> CREATOR = new C48256Iwm();

    @InterfaceC65349Pkn("claim_status")
    public int claimStatus;

    @InterfaceC65349Pkn("update_millis")
    public long updateMillis;

    @InterfaceC65349Pkn("voucher_id")
    public final String voucherId;

    @InterfaceC65349Pkn("voucher_type_id")
    public final String voucherTypeID;

    public static /* synthetic */ CouponCache copy$default(CouponCache couponCache, String str, String str2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = couponCache.voucherId;
        }
        if ((i2 & 2) != 0) {
            str2 = couponCache.voucherTypeID;
        }
        if ((i2 & 4) != 0) {
            i = couponCache.claimStatus;
        }
        if ((i2 & 8) != 0) {
            j = couponCache.updateMillis;
        }
        return couponCache.copy(str, str2, i, j);
    }

    public final CouponCache copy(String str, String voucherTypeID, int i, long j) {
        o.LJIIIZ(voucherTypeID, "voucherTypeID");
        return new CouponCache(str, voucherTypeID, i, j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponCache)) {
            return false;
        }
        CouponCache couponCache = (CouponCache) obj;
        return o.LJ(this.voucherId, couponCache.voucherId) && o.LJ(this.voucherTypeID, couponCache.voucherTypeID) && this.claimStatus == couponCache.claimStatus && this.updateMillis == couponCache.updateMillis;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.voucherId);
        out.writeString(this.voucherTypeID);
        out.writeInt(this.claimStatus);
        out.writeLong(this.updateMillis);
    }

    public int hashCode() {
        int hashCode;
        String str = this.voucherId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return C16880lQ.LLJIJIL(this.updateMillis) + ((C79062V1e.LJ(this.voucherTypeID, hashCode * 31, 31) + this.claimStatus) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CouponCache(voucherId=");
        LIZ.append(this.voucherId);
        LIZ.append(", voucherTypeID=");
        LIZ.append(this.voucherTypeID);
        LIZ.append(", claimStatus=");
        LIZ.append(this.claimStatus);
        LIZ.append(", updateMillis=");
        return C47135Ieh.LIZIZ(LIZ, this.updateMillis, ')', LIZ);
    }

    public final int getClaimStatus() {
        return this.claimStatus;
    }

    public final long getUpdateMillis() {
        return this.updateMillis;
    }

    public final String getVoucherId() {
        return this.voucherId;
    }

    public final String getVoucherTypeID() {
        return this.voucherTypeID;
    }

    public final void setClaimStatus(int i) {
        this.claimStatus = i;
    }

    public final void setUpdateMillis(long j) {
        this.updateMillis = j;
    }

    public CouponCache(String str, String voucherTypeID, int i, long j) {
        o.LJIIIZ(voucherTypeID, "voucherTypeID");
        this.voucherId = str;
        this.voucherTypeID = voucherTypeID;
        this.claimStatus = i;
        this.updateMillis = j;
    }
}
