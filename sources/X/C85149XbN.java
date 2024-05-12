package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XbN, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85149XbN {
    public final C85136XbA LIZ;
    public final IO0 LIZIZ;

    public C85149XbN() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85149XbN)) {
            return false;
        }
        C85149XbN c85149XbN = (C85149XbN) obj;
        return o.LJ(this.LIZ, c85149XbN.LIZ) && this.LIZIZ == c85149XbN.LIZIZ;
    }

    public final int hashCode() {
        C85136XbA c85136XbA = this.LIZ;
        int hashCode = (c85136XbA == null ? 0 : c85136XbA.hashCode()) * 31;
        IO0 io0 = this.LIZIZ;
        return hashCode + (io0 != null ? io0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopUpParam(methodModel=");
        LIZ.append(this.LIZ);
        LIZ.append(", popUpType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C85149XbN(C85136XbA c85136XbA, IO0 io0) {
        this.LIZ = c85136XbA;
        this.LIZIZ = io0;
    }
}
