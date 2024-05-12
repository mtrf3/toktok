package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TzE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76436TzE {
    public final C75883TqJ LIZ;
    public final boolean LIZIZ;

    public C76436TzE() {
        this(null, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76436TzE)) {
            return false;
        }
        C76436TzE c76436TzE = (C76436TzE) obj;
        return o.LJ(this.LIZ, c76436TzE.LIZ) && this.LIZIZ == c76436TzE.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C75883TqJ c75883TqJ = this.LIZ;
        int hashCode = (c75883TqJ == null ? 0 : c75883TqJ.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiScoreClickData(user=");
        LIZ.append(this.LIZ);
        LIZ.append(", isMate=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C76436TzE(C75883TqJ c75883TqJ, boolean z) {
        this.LIZ = c75883TqJ;
        this.LIZIZ = z;
    }
}
