package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeOptSetting;

/* renamed from: X.Twb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76273Twb {
    public static boolean LIZIZ;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static long LIZ = Long.MAX_VALUE;
    public static String LIZJ = "";
    public static String LIZLLL = "";

    public static long LIZ() {
        if (LIZIZ) {
            return (SystemClock.elapsedRealtime() - LJII) + LJI;
        }
        return System.currentTimeMillis();
    }

    public static void LIZIZ(long j, long j2, String str, String str2) {
        long j3 = j + j2;
        if (j3 > 0 && j2 < LIZ && j2 <= MatchTimeOptSetting.INSTANCE.getMatchHalfRttLimit()) {
            LIZ = j2;
            LJI = j3;
            LJ = j;
            LJFF = System.currentTimeMillis();
            LJII = SystemClock.elapsedRealtime();
            LIZIZ = true;
            LIZLLL = str;
            LIZJ = str2;
        }
    }
}
