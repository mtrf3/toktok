package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class RepaymentPoint {

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("show_red_dot")
    public final boolean showRedDot;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepaymentPoint)) {
            return false;
        }
        RepaymentPoint repaymentPoint = (RepaymentPoint) obj;
        return this.showRedDot == repaymentPoint.showRedDot && o.LJ(this.description, repaymentPoint.description);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.showRedDot;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.description;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RepaymentPoint(showRedDot=");
        LIZ.append(this.showRedDot);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public RepaymentPoint(boolean z, String str) {
        this.showRedDot = z;
        this.description = str;
    }
}
