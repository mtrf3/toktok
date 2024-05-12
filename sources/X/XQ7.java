package X;

import java.util.logging.Logger;

/* loaded from: classes16.dex */
public final class XQ7<K, V> {
    public static final XQX LJII = new XQX();
    public final int LIZ = -1;
    public final int LIZIZ = -1;
    public long LIZJ = -1;
    public final long LIZLLL = -1;
    public final long LJ = -1;
    public final long LJFF = -1;
    public final long LJI = -1;

    static {
        Logger.getLogger(XQ7.class.getName());
    }

    public final XQY LIZ() {
        if (this.LIZLLL == -1) {
            if (this.LJI == -1) {
                return new XQY(this);
            }
            throw new IllegalStateException("refreshAfterWrite requires a LoadingCache");
        }
        throw new IllegalStateException("maximumWeight requires weigher");
    }

    public final String toString() {
        VL3 vl3 = new VL3(C16880lQ.LJLLJ(XQ7.class));
        int i = this.LIZ;
        if (i != -1) {
            vl3.LIZ(String.valueOf(i), "initialCapacity");
        }
        int i2 = this.LIZIZ;
        if (i2 != -1) {
            vl3.LIZ(String.valueOf(i2), "concurrencyLevel");
        }
        long j = this.LIZJ;
        if (j != -1) {
            vl3.LIZ(String.valueOf(j), "maximumSize");
        }
        long j2 = this.LIZLLL;
        if (j2 != -1) {
            vl3.LIZ(String.valueOf(j2), "maximumWeight");
        }
        if (this.LJ != -1) {
            StringBuilder LIZ = X1D.LIZ();
            vl3.LIZ(C0H1.LIZJ(LIZ, this.LJ, "ns", LIZ), "expireAfterWrite");
        }
        if (this.LJFF != -1) {
            StringBuilder LIZ2 = X1D.LIZ();
            vl3.LIZ(C0H1.LIZJ(LIZ2, this.LJFF, "ns", LIZ2), "expireAfterAccess");
        }
        return vl3.toString();
    }

    public final void LIZIZ(long j) {
        long j2 = this.LIZJ;
        if (j2 == -1) {
            long j3 = this.LIZLLL;
            if (j3 == -1) {
                if (j >= 0) {
                    this.LIZJ = j;
                    return;
                }
                throw new IllegalArgumentException("maximum size must not be negative");
            }
            throw new IllegalStateException(C78915Uy7.LJIJJLI("maximum weight was already set to %s", Long.valueOf(j3)));
        }
        throw new IllegalStateException(C78915Uy7.LJIJJLI("maximum size was already set to %s", Long.valueOf(j2)));
    }
}
