package X;

import android.util.SparseArray;

/* renamed from: X.Jm3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50139Jm3 {
    public static volatile boolean LIZ = true;
    public static final long LIZIZ = C56662Kg.LIZ().LJIIJ;
    public static long LIZJ = -1;
    public static final SparseArray<Long> LIZLLL = new SparseArray<>();
    public static final SparseArray<Long> LJ = new SparseArray<>();

    public static void LIZ(int i) {
        SparseArray<Long> sparseArray;
        Long l;
        if (i >= 0 && (l = (sparseArray = LIZLLL).get(i)) != null && l.longValue() > 0) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            sparseArray.put(i, -1L);
            LJ.put(i, Long.valueOf(currentTimeMillis));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("real put ");
            LIZ2.append(currentTimeMillis);
            X1D.LIZIZ(LIZ2);
        }
    }

    public static long LIZIZ(int i) {
        Long l = LJ.get(i);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public static void LIZJ(int i) {
        if (i < 0) {
            return;
        }
        LIZLLL.put(i, Long.valueOf(System.currentTimeMillis()));
    }
}
