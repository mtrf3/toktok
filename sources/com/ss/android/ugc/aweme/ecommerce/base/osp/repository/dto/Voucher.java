package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class Voucher {

    @InterfaceC65349Pkn("claim_user_type")
    public final Integer claimUserType;

    @InterfaceC65349Pkn("cost_type")
    public final Integer costType;

    @InterfaceC65349Pkn("voucher_id")
    public final String voucherId;

    @InterfaceC65349Pkn("voucher_type_id")
    public final String voucherTypeId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Voucher)) {
            return false;
        }
        Voucher voucher = (Voucher) obj;
        return o.LJ(this.voucherId, voucher.voucherId) && o.LJ(this.voucherTypeId, voucher.voucherTypeId) && o.LJ(this.claimUserType, voucher.claimUserType) && o.LJ(this.costType, voucher.costType);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.voucherTypeId, this.voucherId.hashCode() * 31, 31);
        Integer num = this.claimUserType;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        Integer num2 = this.costType;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Voucher(voucherId=");
        LIZ.append(this.voucherId);
        LIZ.append(", voucherTypeId=");
        LIZ.append(this.voucherTypeId);
        LIZ.append(", claimUserType=");
        LIZ.append(this.claimUserType);
        LIZ.append(", costType=");
        return s0.LIZJ(LIZ, this.costType, ')', LIZ);
    }

    public Voucher(String voucherId, String voucherTypeId, Integer num, Integer num2) {
        o.LJIIIZ(voucherId, "voucherId");
        o.LJIIIZ(voucherTypeId, "voucherTypeId");
        this.voucherId = voucherId;
        this.voucherTypeId = voucherTypeId;
        this.claimUserType = num;
        this.costType = num2;
    }
}
