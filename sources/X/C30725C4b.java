package X;

import Y.AfS17S0001000_5;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveNtpServerUrlSetting;
import java.util.concurrent.TimeUnit;

/* renamed from: X.C4b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30725C4b {
    public static volatile C30725C4b LIZIZ;
    public final C30726C4c LIZ;

    public static long LIZ() {
        if (LIZIZ == null || LIZIZ.LIZ == null || !LIZIZ.LIZ.LIZLLL) {
            return C31012CFc.LIZIZ();
        }
        C30726C4c c30726C4c = LIZIZ.LIZ;
        if (!c30726C4c.LIZLLL) {
            return C31012CFc.LIZIZ();
        }
        return c30726C4c.LJ + (SystemClock.elapsedRealtime() - c30726C4c.LJFF);
    }

    public static long LIZIZ() {
        if (LIZIZ == null || LIZIZ.LIZ == null || !LIZIZ.LIZ.LIZLLL) {
            return C31012CFc.LIZJ();
        }
        C30726C4c c30726C4c = LIZIZ.LIZ;
        if (!c30726C4c.LIZLLL) {
            return C31012CFc.LIZIZ();
        }
        return c30726C4c.LJ + (SystemClock.elapsedRealtime() - c30726C4c.LJFF);
    }

    public C30725C4b(Context context) {
        C30726C4c c30726C4c;
        String value = LiveNtpServerUrlSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            return;
        }
        synchronized (C30726C4c.class) {
            if (C30726C4c.LJI == null) {
                C30726C4c.LJI = new C30726C4c(value);
                C30726C4c.LJII = C16880lQ.LLLLL(context);
            }
            c30726C4c = C30726C4c.LJI;
        }
        this.LIZ = c30726C4c;
        TMC.LJJI(60L, TimeUnit.MINUTES).LJJLIIIJ(2147483647L).LJJL(T16.LIZIZ).LJJIJL(new C29991Fr()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS17S0001000_5(1, 12), new C1PL(2));
    }

    public static void LIZJ(Context context) {
        if (LIZIZ == null) {
            synchronized (C30725C4b.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C30725C4b(context);
                }
            }
        }
    }
}
