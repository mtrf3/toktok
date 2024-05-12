package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Iws, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48262Iws {
    public boolean LIZ;
    public boolean LIZIZ;
    public int LIZLLL;
    public final ConcurrentHashMap<Integer, Integer> LIZJ = new ConcurrentHashMap<>();
    public int LJ = 8;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config:[opengSR:");
        LIZ.append(this.LIZ);
        LIZ.append(" opengSharpen:");
        LIZ.append(this.LIZIZ);
        LIZ.append(" config:");
        LIZ.append(this.LIZJ.toString());
        LIZ.append("]");
        return X1D.LIZIZ(LIZ);
    }

    public C48262Iws(int i) {
        this.LIZLLL = i;
    }

    public final boolean LIZ(int i) {
        Integer num = this.LIZJ.get(Integer.valueOf(i));
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ(C48262Iws c48262Iws) {
        if (c48262Iws.LIZ && !this.LIZ) {
            return false;
        }
        if (c48262Iws.LIZIZ && !this.LIZIZ) {
            return false;
        }
        if (c48262Iws.LIZ(14) && !LIZ(14)) {
            return false;
        }
        if (!c48262Iws.LIZIZ && !c48262Iws.LIZ && !c48262Iws.LIZ(14)) {
            if (this.LIZ || this.LIZIZ || LIZ(14)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void LIZLLL(boolean z) {
        this.LIZ = z;
        this.LIZJ.put(5, Integer.valueOf(z ? 1 : 0));
    }

    public final void LIZJ(int i, int i2) {
        boolean z;
        C48284IxE.LIZ(2, this.LIZLLL, "EffectConfig", C48263Iwt.LIZLLL("setEffectOpen effect:", i, ",isOpen:", i2));
        boolean z2 = false;
        if (i == 1) {
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LIZIZ = z;
        } else if (i == 5) {
            if (i2 == 1) {
                z2 = true;
            }
            this.LIZ = z2;
        }
        this.LIZJ.put(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
