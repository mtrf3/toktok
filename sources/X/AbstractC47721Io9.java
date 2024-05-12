package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Io9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC47721Io9 {
    public final int LIZ;

    public abstract void LIZJ(int i);

    public abstract boolean LIZLLL(long j, TimeUnit timeUnit);

    public abstract void LJ(int i);

    public int LIZIZ() {
        return this.LIZ;
    }

    public AbstractC47721Io9(int i) {
        this.LIZ = i;
    }

    public static AbstractC47721Io9 LIZ(int i) {
        C05L.LJFF("create ABLock type: ", i, "ABLock");
        if (i == 0) {
            return new C47723IoB(i);
        }
        if (i == 1) {
            return new C47730IoI(i);
        }
        if (i == 2) {
            return new C47722IoA(i);
        }
        return new C47723IoB(0);
    }
}
