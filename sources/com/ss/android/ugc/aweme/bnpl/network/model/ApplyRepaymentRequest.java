package com.ss.android.ugc.aweme.bnpl.network.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class ApplyRepaymentRequest {

    @InterfaceC65349Pkn("amount")
    public final String amount;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplyRepaymentRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApplyRepaymentRequest) && o.LJ(this.amount, ((ApplyRepaymentRequest) obj).amount);
    }

    public final int hashCode() {
        String str = this.amount;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApplyRepaymentRequest(amount=");
        LIZ.append(this.amount);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ApplyRepaymentRequest(String str) {
        this.amount = str;
    }

    public /* synthetic */ ApplyRepaymentRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
