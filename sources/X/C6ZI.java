package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6ZI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZI {
    public final int LIZ;
    public final String LIZIZ;
    public final Throwable LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6ZI)) {
            return false;
        }
        C6ZI c6zi = (C6ZI) obj;
        return this.LIZ == c6zi.LIZ && o.LJ(this.LIZIZ, c6zi.LIZIZ) && o.LJ(this.LIZJ, c6zi.LIZJ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.LIZJ;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CompileResultExtra(errorCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", errorMsg=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", exception=");
        return C169696lJ.LIZLLL(LIZ, this.LIZJ, ')', LIZ);
    }

    public C6ZI(int i, Throwable th, int i2) {
        th = (i2 & 4) != 0 ? null : th;
        this.LIZ = i;
        this.LIZIZ = null;
        this.LIZJ = th;
    }
}
