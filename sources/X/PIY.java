package X;

import Y.ARunnableS18S0000000_11;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.util.Printer;

/* loaded from: classes12.dex */
public final class PIY implements Printer {
    @Override // android.util.Printer
    public final void println(String str) {
        int i;
        if (!PIX.LIZ) {
            return;
        }
        PIX.LJIIJ = str;
        if (!PIX.LJIIIZ) {
            PIX.LJIIIZ = true;
            PIX.LJIIL = Process.myTid();
            HandlerThreadC64288PKy LIZIZ = C64214PIc.LIZIZ();
            PIX.LJFF = SystemClock.uptimeMillis();
            new Handler(LIZIZ.getLooper()).postDelayed(new ARunnableS18S0000000_11(28), PIX.LJ);
        }
        if (PIX.LJIILJJIL == -1) {
            PIX.LJIILJJIL = 0L;
            PIX.LJIILL = 0L;
            return;
        }
        long j = PIX.LIZLLL;
        PIX.LJIILL = j;
        long j2 = j - PIX.LJIILJJIL;
        if (j2 <= 0) {
            PIX.LJIIIIZZ++;
            return;
        }
        if (j2 == 1) {
            int i2 = PIX.LJIIIIZZ;
            if (i2 > 1) {
                i = 7;
            } else if (i2 == 1) {
                i = 3;
            } else {
                i = 0;
            }
        } else {
            int i3 = PIX.LJIIIIZZ;
            if (i3 > 1) {
                i = 5;
            } else if (i3 == 1) {
                i = 6;
            } else {
                i = 1;
            }
        }
        long j3 = PIX.LJIILIIL;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!PIX.LJIIJJI) {
            C64180PGu LJI = PIX.LJI();
            long j4 = j3 - PIX.LJI;
            long j5 = uptimeMillis - PIX.LJII;
            int i4 = PIX.LJIIIIZZ;
            LJI.LJ = j4;
            LJI.LIZJ = j2;
            LJI.LIZLLL = j5;
            LJI.LIZ = i4;
            LJI.LIZIZ = i;
        }
        PIX.LJI = j3;
        PIX.LJII = uptimeMillis;
        PIX.LJIIIIZZ = 1;
        PIX.LJIILJJIL = j;
    }
}
