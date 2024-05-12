package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public abstract class E8H {
    public final Keva LIZ = C35908E7k.LIZIZ();

    public abstract long LIZIZ();

    public abstract String LIZJ();

    public abstract int LIZLLL();

    public String LJ() {
        return null;
    }

    public final boolean LIZ() {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        Keva keva = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZJ());
        LIZ.append("_count_");
        LIZ.append(curUserId);
        int i = keva.getInt(X1D.LIZIZ(LIZ), 0);
        Keva keva2 = this.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        String LJ = LJ();
        if (LJ == null) {
            LJ = LIZJ();
        }
        long j = keva2.getLong(C025908h.LIZIZ(LIZ2, LJ, "_ts_", curUserId, LIZ2), -1L);
        if (i < LIZLLL() && (j <= 0 || LIZIZ() <= System.currentTimeMillis() - j)) {
            return false;
        }
        return true;
    }
}
