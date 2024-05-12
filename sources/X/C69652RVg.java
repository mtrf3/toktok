package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RVg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69652RVg {
    public boolean LIZ;
    public boolean LIZIZ;
    public java.util.Map<String, String> LIZJ;

    public C69652RVg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69652RVg)) {
            return false;
        }
        C69652RVg c69652RVg = (C69652RVg) obj;
        return this.LIZ == c69652RVg.LIZ && this.LIZIZ == c69652RVg.LIZIZ && o.LJ(this.LIZJ, c69652RVg.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.LIZIZ ? 1 : 0)) * 31;
        java.util.Map<String, String> map = this.LIZJ;
        return i + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AtmosphereRefreshResult(needShow=");
        LIZ.append(this.LIZ);
        LIZ.append(", showChanged=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", atmosphereItems=");
        return C15890jp.LIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C69652RVg(int i) {
        this.LIZ = false;
        this.LIZIZ = false;
        this.LIZJ = null;
    }
}
