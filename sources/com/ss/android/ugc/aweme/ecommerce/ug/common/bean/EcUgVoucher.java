package com.ss.android.ugc.aweme.ecommerce.ug.common.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcUgVoucher {

    @InterfaceC65349Pkn("voucher_id")
    public final String voucherId;

    /* JADX WARN: Multi-variable type inference failed */
    public EcUgVoucher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EcUgVoucher copy$default(EcUgVoucher ecUgVoucher, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecUgVoucher.voucherId;
        }
        return ecUgVoucher.copy(str);
    }

    public final EcUgVoucher copy(String str) {
        return new EcUgVoucher(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EcUgVoucher) && o.LJ(this.voucherId, ((EcUgVoucher) obj).voucherId);
    }

    public int hashCode() {
        String str = this.voucherId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcUgVoucher(voucherId=");
        return q.LIZIZ(LIZ, this.voucherId, ')', LIZ);
    }

    public final String getVoucherId() {
        return this.voucherId;
    }

    public EcUgVoucher(String str) {
        this.voucherId = str;
    }

    public /* synthetic */ EcUgVoucher(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
