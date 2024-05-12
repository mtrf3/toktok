package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G2Y {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2Y)) {
            return false;
        }
        G2Y g2y = (G2Y) obj;
        return this.LIZ == g2y.LIZ && o.LJ(this.LIZIZ, g2y.LIZIZ) && this.LIZJ == g2y.LIZJ;
    }

    public final int hashCode() {
        return C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectedInterestInfo(categoryPosition=");
        LIZ.append(this.LIZ);
        LIZ.append(", interestId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", interestPosition=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public G2Y(int i, String str, int i2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = i2;
    }
}
