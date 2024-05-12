package X;

import kotlin.jvm.internal.o;

/* renamed from: X.AjP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27043AjP {
    public final C27042AjO LIZ;
    public final C27724AuO LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27043AjP)) {
            return false;
        }
        C27043AjP c27043AjP = (C27043AjP) obj;
        return o.LJ(this.LIZ, c27043AjP.LIZ) && o.LJ(this.LIZIZ, c27043AjP.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        C27724AuO c27724AuO = this.LIZIZ;
        return hashCode + (c27724AuO == null ? 0 : c27724AuO.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("USOrderSummaryVO(summaryVO=");
        LIZ.append(this.LIZ);
        LIZ.append(", discountsVO=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C27043AjP(C27042AjO c27042AjO, C27724AuO c27724AuO) {
        this.LIZ = c27042AjO;
        this.LIZIZ = c27724AuO;
    }
}
