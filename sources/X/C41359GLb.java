package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GLb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41359GLb {
    public final String LIZ;
    public final boolean LIZIZ;
    public final C41759GaB LIZJ;

    public C41359GLb() {
        this(null, false, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41359GLb)) {
            return false;
        }
        C41359GLb c41359GLb = (C41359GLb) obj;
        return o.LJ(this.LIZ, c41359GLb.LIZ) && this.LIZIZ == c41359GLb.LIZIZ && o.LJ(this.LIZJ, c41359GLb.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        C41759GaB c41759GaB = this.LIZJ;
        return i2 + (c41759GaB == null ? 0 : c41759GaB.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelCause(cause=");
        LIZ.append(this.LIZ);
        LIZ.append(", removeTask=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", exception=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C41359GLb(String cause, boolean z, C41759GaB c41759GaB, int i) {
        cause = (i & 1) != 0 ? "" : cause;
        z = (i & 2) != 0 ? false : z;
        c41759GaB = (i & 4) != 0 ? null : c41759GaB;
        o.LJIIIZ(cause, "cause");
        this.LIZ = cause;
        this.LIZIZ = z;
        this.LIZJ = c41759GaB;
    }
}
