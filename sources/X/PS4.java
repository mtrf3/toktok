package X;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.performance.LiveApmInhibitionSettings;

/* loaded from: classes12.dex */
public final class PS4 {
    public static long LIZ = 500;
    public static long LIZIZ = 10000;
    public static long LIZJ = 10000;
    public static int LIZLLL;
    public static PSD LJ;
    public static Handler LJFF;
    public static volatile boolean LJI;

    public static void LIZIZ() {
        LJI = false;
        C64471PRz.LIZ();
        long j = 0;
        if (((Boolean) C35816E3w.LIZ.getValue()).booleanValue()) {
            C79146V4k.LIZ = false;
            C79146V4k.LIZIZ = 0L;
        }
        if (LJ == null) {
            return;
        }
        long j2 = LIZJ;
        if (j2 > 0) {
            int i = LIZLLL;
            if (i != 0) {
                j = i * j2;
            }
            Handler handler = LJFF;
            if (handler != null) {
                handler.postDelayed(PS6.LJLIL, j2 + j);
                return;
            }
            return;
        }
        LIZLLL();
    }

    public static void LIZ() {
        if (LJ == null) {
            return;
        }
        long blockDuration = LiveApmInhibitionSettings.INSTANCE.getBlockDuration();
        if (blockDuration > 0) {
            LJI = true;
            if (((Boolean) C34847Dlz.LIZJ.getValue()).booleanValue()) {
                C64471PRz.LIZ = true;
            }
            if (((Boolean) C35816E3w.LIZ.getValue()).booleanValue()) {
                C79146V4k.LIZ = true;
                C79146V4k.LIZIZ = 0L;
            }
            Handler handler = LJFF;
            if (handler != null) {
                handler.postDelayed(PS5.LJLIL, blockDuration);
                return;
            }
            return;
        }
        LIZLLL();
    }

    public static void LIZLLL() {
        PSD psd = LJ;
        if (psd != null) {
            psd.interrupt();
        }
        PSD psd2 = LJ;
        if (psd2 != null) {
            psd2.quitSafely();
        }
        LJ = null;
        LIZIZ();
        Handler handler = LJFF;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        LJFF = null;
    }

    public static void LIZJ(int i) {
        if (LiveApmInhibitionSettings.INSTANCE.isInhibitionEnabled() && LJI) {
            if (i > 1000) {
                LIZLLL = 1;
            } else {
                LIZLLL = 0;
            }
            while (LJI) {
                try {
                    Thread.sleep(LIZ);
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
        }
    }
}
