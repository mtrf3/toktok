package X;

import android.content.SharedPreferences;
import java.lang.reflect.Array;

/* renamed from: X.QHa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66734QHa {
    public static final long[][] LJIIIZ = {new long[]{60000, 0, 12}, new long[]{120000, 5, 1}, new long[]{240000, 5, 1}, new long[]{480000, 4, 1}, new long[]{960000, 2, 1}};
    public final String LIZ;
    public final QH9 LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public long LJFF;
    public long LJI;
    public long[][] LJII;
    public final QHC LJIIIIZZ;

    public C66734QHa(String str, QH9 qh9, QHC qhc) {
        this.LIZIZ = qh9;
        this.LIZ = str;
        this.LJIIIIZZ = qhc;
        this.LIZJ = 0;
        SharedPreferences sharedPreferences = qh9.LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("downgrade_time");
        if (System.currentTimeMillis() - sharedPreferences.getLong(X1D.LIZIZ(LIZ), 0L) < 10800000) {
            SharedPreferences sharedPreferences2 = qh9.LJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append("downgrade_index");
            this.LIZJ = sharedPreferences2.getInt(X1D.LIZIZ(LIZ2), 0);
        } else {
            SharedPreferences.Editor edit = qh9.LJ.edit();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            LIZ3.append("downgrade_time");
            SharedPreferences.Editor remove = edit.remove(X1D.LIZIZ(LIZ3));
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(str);
            LIZ4.append("downgrade_index");
            remove.remove(X1D.LIZIZ(LIZ4)).apply();
        }
        long[][] jArr = LJIIIZ;
        this.LJII = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 5, jArr[0].length);
        int i = 0;
        do {
            long[] jArr2 = jArr[i];
            System.arraycopy(jArr2, 0, this.LJII[i], 0, jArr2.length);
            i++;
        } while (i < 5);
        QHC qhc2 = this.LJIIIIZZ;
        if (qhc2 != null) {
            int i2 = qhc2.LIZ;
            if (i2 == 0) {
                this.LJII[0][2] = 2147483647L;
            } else if (-1 != i2) {
                this.LJII[0][2] = 60;
            }
            long j = qhc2.LJ;
            if (j > 0) {
                int i3 = 1;
                while (true) {
                    long[][] jArr3 = this.LJII;
                    if (i3 < jArr3.length) {
                        if (i3 == 1) {
                            jArr3[i3][0] = 2 * j;
                        } else {
                            jArr3[i3][0] = jArr3[i3 - 1][0] * 2;
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
