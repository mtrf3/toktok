package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3PT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PT {
    public final C3PO LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3PT)) {
            return false;
        }
        C3PT c3pt = (C3PT) obj;
        return this.LIZ == c3pt.LIZ && o.LJ(this.LIZIZ, c3pt.LIZIZ) && this.LIZJ == c3pt.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LJ + i;
    }

    public final String toString() {
        if (this.LIZ == C3PO.REMOVE) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("remove ");
            LIZ.append(this.LIZIZ);
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("remove all; isManual ");
        LIZ2.append(this.LIZJ);
        return X1D.LIZIZ(LIZ2);
    }

    public C3PT(C3PO c3po, String uid, boolean z, int i) {
        uid = (i & 2) != 0 ? "" : uid;
        z = (i & 4) != 0 ? false : z;
        o.LJIIIZ(uid, "uid");
        this.LIZ = c3po;
        this.LIZIZ = uid;
        this.LIZJ = z;
    }
}
