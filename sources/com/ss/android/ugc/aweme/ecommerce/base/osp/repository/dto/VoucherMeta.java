package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VoucherMeta {

    @InterfaceC65349Pkn("voucher_id")
    public final String voucherId;

    @InterfaceC65349Pkn("voucher_type_id")
    public final String voucherTypeId;

    /* JADX WARN: Multi-variable type inference failed */
    public VoucherMeta() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VoucherMeta copy$default(VoucherMeta voucherMeta, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voucherMeta.voucherTypeId;
        }
        if ((i & 2) != 0) {
            str2 = voucherMeta.voucherId;
        }
        return voucherMeta.copy(str, str2);
    }

    public final VoucherMeta copy(String str, String str2) {
        return new VoucherMeta(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherMeta)) {
            return false;
        }
        VoucherMeta voucherMeta = (VoucherMeta) obj;
        return o.LJ(this.voucherTypeId, voucherMeta.voucherTypeId) && o.LJ(this.voucherId, voucherMeta.voucherId);
    }

    public int hashCode() {
        String str = this.voucherTypeId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.voucherId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoucherMeta(voucherTypeId=");
        LIZ.append(this.voucherTypeId);
        LIZ.append(", voucherId=");
        return q.LIZIZ(LIZ, this.voucherId, ')', LIZ);
    }

    public final String getVoucherId() {
        return this.voucherId;
    }

    public final String getVoucherTypeId() {
        return this.voucherTypeId;
    }

    public VoucherMeta(String str, String str2) {
        this.voucherTypeId = str;
        this.voucherId = str2;
    }

    public /* synthetic */ VoucherMeta(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
