package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A56 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final A59 LIZLLL;
    public final A5A LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A56)) {
            return false;
        }
        A56 a56 = (A56) obj;
        return this.LIZ == a56.LIZ && this.LIZIZ == a56.LIZIZ && this.LIZJ == a56.LIZJ && this.LIZLLL == a56.LIZLLL && o.LJ(this.LJ, a56.LJ) && this.LJFF == a56.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LJ.hashCode() + ((this.LIZLLL.hashCode() + (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31)) * 31)) * 31;
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidSeriesActionAdapterParams(priceColor=");
        LIZ.append(this.LIZ);
        LIZ.append(", actionButtonText=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", completedStateButtonText=");
        LIZ.append(this.LIZJ);
        LIZ.append(", completedStateButtonStyle=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", listener=");
        LIZ.append(this.LJ);
        LIZ.append(", showNumbering=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public A56(int i, int i2, int i3, A59 completedStateButtonStyle, A5A listener, boolean z) {
        o.LJIIIZ(completedStateButtonStyle, "completedStateButtonStyle");
        o.LJIIIZ(listener, "listener");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = completedStateButtonStyle;
        this.LJ = listener;
        this.LJFF = z;
    }
}
