package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EQ5 {
    public long LIZ;
    public int LIZIZ;
    public C64797Pbt<?> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EQ5)) {
            return false;
        }
        EQ5 eq5 = (EQ5) obj;
        return this.LIZIZ == eq5.LIZIZ && o.LJ(this.LIZJ, eq5.LIZJ);
    }

    public final int hashCode() {
        int i = this.LIZIZ * 31;
        C64797Pbt<?> c64797Pbt = this.LIZJ;
        return i + (c64797Pbt != null ? c64797Pbt.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CacheRecord(maxAge=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", response=");
        LIZ.append(this.LIZJ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public EQ5(int i, C64797Pbt<?> c64797Pbt) {
        this.LIZIZ = i;
        this.LIZJ = c64797Pbt;
        this.LIZ = System.currentTimeMillis() + this.LIZIZ;
    }
}
