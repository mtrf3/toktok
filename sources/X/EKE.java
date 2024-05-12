package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EKE {
    public final String LIZ;
    public String LIZIZ;
    public final int LIZJ;
    public final Throwable LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EKE)) {
            return false;
        }
        EKE eke = (EKE) obj;
        return o.LJ(this.LIZ, eke.LIZ) && o.LJ(this.LIZIZ, eke.LIZIZ) && this.LIZJ == eke.LIZJ && o.LJ(this.LIZLLL, eke.LIZLLL) && this.LJ == eke.LJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZJ) * 31;
        Throwable th = this.LIZLLL;
        return C16880lQ.LLJIJIL(this.LJ) + ((hashCode2 + (th != null ? th.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogModel(tag=");
        LIZ.append(this.LIZ);
        LIZ.append(", msg=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", level=");
        LIZ.append(this.LIZJ);
        LIZ.append(", throwable=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", timestamp=");
        return C0H1.LIZJ(LIZ, this.LJ, ")", LIZ);
    }

    public EKE(String str, String msg, int i, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        o.LJIIIZ(msg, "msg");
        this.LIZ = str;
        this.LIZIZ = msg;
        this.LIZJ = i;
        this.LIZLLL = th;
        this.LJ = currentTimeMillis;
    }
}
