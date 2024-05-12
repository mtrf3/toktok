package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.util.CountDownTimer;

/* loaded from: classes10.dex */
public final class LFT {
    public static CountDownTimer LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    public static long LJ;
    public static int LJFF = -1;

    public static void LIZ(int i) {
        if (LJ == -1) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                LIZJ += (int) (SystemClock.uptimeMillis() - LJ);
                return;
            }
            LIZLLL += (int) (SystemClock.uptimeMillis() - LJ);
            return;
        }
        LIZIZ += (int) (SystemClock.uptimeMillis() - LJ);
    }
}
