package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0NZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0NZ {
    public final C07070Pn<C23490w5, C1JN> LIZ;
    public long LIZIZ;

    public C0NZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NZ)) {
            return false;
        }
        C0NZ c0nz = (C0NZ) obj;
        return o.LJ(this.LIZ, c0nz.LIZ) && C23490w5.LIZ(this.LIZIZ, c0nz.LIZIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimData(anim=");
        LIZ.append(this.LIZ);
        LIZ.append(", startSize=");
        LIZ.append((Object) C23490w5.LIZJ(this.LIZIZ));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public C0NZ(C07070Pn c07070Pn, long j) {
        this.LIZ = c07070Pn;
        this.LIZIZ = j;
    }
}
