package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FQM implements InterfaceC38870FNi {
    public final int LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, this.LIZ * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OHRPredictResultImpl(hand=");
        LIZ.append(this.LIZ);
        LIZ.append(", leftPercent=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", rightPercent=");
        LIZ.append(this.LIZJ);
        LIZ.append(", confidence=");
        return C74221TAz.LIZLLL(LIZ, this.LIZLLL, ')', LIZ);
    }

    @Override // X.InterfaceC38870FNi
    public final float LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC38870FNi
    public final float LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC38870FNi
    public final int LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC38870FNi
    public final float LIZLLL() {
        return this.LIZIZ;
    }

    public FQM(FQN result) {
        float f;
        o.LJIIIZ(result, "result");
        int i = result.LJLIL;
        float f2 = result.LJLILLLLZI;
        float f3 = result.LJLJI;
        if (i != 1) {
            if (i != 2) {
                f = 0.0f;
            } else {
                f = f3;
            }
        } else {
            f = f2;
        }
        this.LIZ = i;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FQM)) {
            return false;
        }
        FQM fqm = (FQM) obj;
        if (this.LIZ == fqm.LIZ && Float.compare(this.LIZIZ, fqm.LIZIZ) == 0 && Float.compare(this.LIZJ, fqm.LIZJ) == 0 && Float.compare(this.LIZLLL, fqm.LIZLLL) == 0) {
            return true;
        }
        return false;
    }
}
