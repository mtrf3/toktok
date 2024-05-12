package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ClaimVoucherRequest {

    @InterfaceC65349Pkn("request_source")
    public final int requestSource;

    @InterfaceC65349Pkn("source")
    public final Integer trafficSource;

    @InterfaceC65349Pkn("voucher_type_id")
    public final String voucherTypeID;

    public static /* synthetic */ ClaimVoucherRequest copy$default(ClaimVoucherRequest claimVoucherRequest, String str, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = claimVoucherRequest.voucherTypeID;
        }
        if ((i2 & 2) != 0) {
            i = claimVoucherRequest.requestSource;
        }
        if ((i2 & 4) != 0) {
            num = claimVoucherRequest.trafficSource;
        }
        return claimVoucherRequest.copy(str, i, num);
    }

    public final ClaimVoucherRequest copy(String voucherTypeID, int i, Integer num) {
        o.LJIIIZ(voucherTypeID, "voucherTypeID");
        return new ClaimVoucherRequest(voucherTypeID, i, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimVoucherRequest)) {
            return false;
        }
        ClaimVoucherRequest claimVoucherRequest = (ClaimVoucherRequest) obj;
        return o.LJ(this.voucherTypeID, claimVoucherRequest.voucherTypeID) && this.requestSource == claimVoucherRequest.requestSource && o.LJ(this.trafficSource, claimVoucherRequest.trafficSource);
    }

    public int hashCode() {
        int hashCode = ((this.voucherTypeID.hashCode() * 31) + this.requestSource) * 31;
        Integer num = this.trafficSource;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClaimVoucherRequest(voucherTypeID=");
        LIZ.append(this.voucherTypeID);
        LIZ.append(", requestSource=");
        LIZ.append(this.requestSource);
        LIZ.append(", trafficSource=");
        return s0.LIZJ(LIZ, this.trafficSource, ')', LIZ);
    }

    public final int getRequestSource() {
        return this.requestSource;
    }

    public final Integer getTrafficSource() {
        return this.trafficSource;
    }

    public final String getVoucherTypeID() {
        return this.voucherTypeID;
    }

    public ClaimVoucherRequest(String voucherTypeID, int i, Integer num) {
        o.LJIIIZ(voucherTypeID, "voucherTypeID");
        this.voucherTypeID = voucherTypeID;
        this.requestSource = i;
        this.trafficSource = num;
    }

    public /* synthetic */ ClaimVoucherRequest(String str, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : num);
    }
}
