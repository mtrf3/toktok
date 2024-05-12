package X;

import Y.ACallableS0S2121101_3;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.9vP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252399vP {
    public static Aweme LIZ;
    public static int LIZIZ;
    public static boolean LIZJ;
    public static float LIZLLL;
    public static int LJ;
    public static long LJFF;
    public static float LJI;
    public static int LJII;
    public static long LJIIIIZZ;
    public static float LJIIIZ;
    public static int LJIIJ;
    public static long LJIIJJI;
    public static long LJIIL;
    public static String LJIILIIL = "";

    public static float LIZIZ(float f) {
        try {
            return new BigDecimal(f).setScale(2, 4).floatValue();
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public static long LIZLLL(Aweme aweme) {
        Video video;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            return video.getDuration();
        }
        return -1L;
    }

    public static float LIZ(long j, long j2) {
        if (j2 <= 0) {
            return 0.0f;
        }
        try {
            return new BigDecimal(j).divide(new BigDecimal(j2), 2, RoundingMode.HALF_UP).floatValue();
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public static long LIZJ(long j, long j2) {
        long abs = Math.abs(j - j2);
        if (abs > 86400000) {
            return 1000L;
        }
        return abs;
    }

    public static final void LJI(boolean z, String str, String enterMethod, Aweme aweme, String str2, long j, int i) {
        float f;
        o.LJIIIZ(enterMethod, "enterMethod");
        long LIZLLL2 = LIZLLL(aweme);
        if (z) {
            LJIIIZ = LIZ(j, LIZLLL2);
            LJIIJ = i;
            LJIIJJI = System.currentTimeMillis();
            LJIILIIL = enterMethod;
            C10K.LIZIZ(new ACallableS0S2121101_3(LJIIIZ, i, LIZLLL2, aweme, enterMethod, str, true, true, 0), FMX.LIZIZ(), null);
            return;
        }
        if (!C2MX.LIZ().LIZ(str)) {
            return;
        }
        float LIZ2 = LIZ(j, LIZLLL2);
        if (i > LJIIJ) {
            f = 1 - LJIIIZ;
        } else {
            f = LIZ2 - LJIIIZ;
        }
        if (f < 0.0f) {
            f = Math.abs(1 - LIZLLL);
        }
        LJ(LIZ2, i, LIZLLL2, aweme, str, str2, true, true);
        float LIZIZ2 = LIZIZ(f);
        int i2 = i - LJIIJ;
        long j2 = LJIIL;
        if (j2 <= 0) {
            j2 = System.currentTimeMillis();
        }
        LJFF(LIZIZ2, i2, LIZLLL2, LIZJ(j2, LJIIJJI), aweme, str, str2, true, true);
        LJIIIZ = 0.0f;
        LJIIJ = 0;
        LJIIJJI = 0L;
        LJIIL = 0L;
    }

    public static final void LJII(boolean z, String str, String enterMethod, Aweme aweme, String str2, InterfaceC46330IGg interfaceC46330IGg, IDP idp) {
        o.LJIIIZ(enterMethod, "enterMethod");
        if (interfaceC46330IGg != null && idp != null) {
            LJI(z, str, enterMethod, aweme, str2, interfaceC46330IGg.getCurrentPosition(), idp.LLILLJJLI);
        }
    }

    public static void LJ(float f, int i, long j, Aweme aweme, String str, String str2, boolean z, boolean z2) {
        C10K.LIZIZ(new ACallableS0S2121101_3(f, i, j, aweme, str2, str, z, z2, 1), FMX.LIZIZ(), null);
    }

    public static void LJFF(final float f, final int i, final long j, final long j2, final Aweme aweme, final String str, final String str2, final boolean z, final boolean z2) {
        C10K.LIZIZ(new Callable() { // from class: X.6ud
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str3;
                String str4;
                String str5;
                String authorUid;
                Aweme aweme2 = aweme;
                if (aweme2 != null) {
                    str3 = aweme2.getGroupId();
                } else {
                    str3 = null;
                }
                String str6 = "";
                if (str3 == null) {
                    str3 = "";
                }
                Aweme aweme3 = aweme;
                if (aweme3 != null && (authorUid = aweme3.getAuthorUid()) != null) {
                    str6 = authorUid;
                }
                C188727au c188727au = new C188727au();
                if (z) {
                    str4 = C252399vP.LJIILIIL;
                } else {
                    str4 = "slide";
                }
                c188727au.LJIIIZ("enter_method", str4);
                if (z) {
                    str5 = "stable";
                } else {
                    str5 = "unstable";
                }
                c188727au.LJIIIZ("status", str5);
                c188727au.LJIIIZ("quit_method", str2);
                c188727au.LJIIIZ("enter_from", str);
                c188727au.LJIIIZ("group_id", str3);
                c188727au.LJIIIZ("author_id", str6);
                c188727au.LIZIZ(f, "vPct_diff");
                c188727au.LJ(j, "vDuration");
                c188727au.LIZLLL(i, "vLoops_diff");
                c188727au.LJ(j2, "clear_screen_duration");
                c188727au.LIZLLL(z2 ? 1 : 0, "is_clear_mode");
                FMX.LJIIL("clear_screen_play_time", c188727au.LIZ);
                return null;
            }
        }, FMX.LIZIZ(), null);
    }
}
