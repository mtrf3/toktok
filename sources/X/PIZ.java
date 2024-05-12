package X;

import android.os.SystemClock;
import android.util.Printer;

/* loaded from: classes12.dex */
public final class PIZ implements Printer {
    @Override // android.util.Printer
    public final void println(String str) {
        int i;
        if (!PIX.LIZ || PIX.LJIILJJIL < 0) {
            return;
        }
        long j = PIX.LIZLLL;
        PIX.LJIIJ = "no message running";
        long j2 = j - PIX.LJIILJJIL;
        if (j2 <= 0) {
            return;
        }
        long j3 = PIX.LJIILIIL;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (j2 == 1) {
            if (PIX.LJIIIIZZ > 1) {
                i = 9;
            } else {
                if (PIX.LJIIIIZZ == 1) {
                    i = 2;
                }
                i = 0;
            }
        } else {
            if (j2 > 1) {
                if (PIX.LJIIIIZZ > 1) {
                    i = 4;
                } else if (PIX.LJIIIIZZ == 1) {
                    i = 8;
                }
            }
            i = 0;
        }
        if (!PIX.LJIIJJI) {
            C64180PGu LJI = PIX.LJI();
            long j4 = j3 - PIX.LJI;
            long j5 = uptimeMillis - PIX.LJII;
            int i2 = PIX.LJIIIIZZ;
            LJI.LJ = j4;
            LJI.LIZJ = j2;
            LJI.LIZLLL = j5;
            LJI.LIZ = i2;
            if (str != null) {
                LJI.LJFF = str;
            }
            LJI.LIZIZ = i;
        }
        PIX.LJI = j3;
        PIX.LJII = uptimeMillis;
        PIX.LJIIIIZZ = 0;
        PIX.LJIILJJIL = j;
    }
}
