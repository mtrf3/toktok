package X;

import com.bytedance.keva.Keva;
import defpackage.b0;
import java.util.TimerTask;

/* renamed from: X.Fta, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40414Fta extends TimerTask {
    public static void LIZ() {
        if (C40415Ftb.LIZ != 0) {
            C40413FtZ c40413FtZ = C40415Ftb.LIZIZ;
            long LIZ = c40413FtZ.LIZ() + C40415Ftb.LIZ;
            c40413FtZ.LJIIIIZZ = LIZ;
            Keva keva = c40413FtZ.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            String LJFF = JBR.LJFF(LIZ2, c40413FtZ.LIZIZ, "key_today_play_time", LIZ2);
            StringBuilder LIZ3 = X1D.LIZ();
            b0.LJ(LIZ3, c40413FtZ.LJIIIZ, "__", LIZ);
            keva.storeString(LJFF, X1D.LIZIZ(LIZ3));
            C40415Ftb.LIZ = 0L;
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
