package X;

import Y.ARunnableS15S0000000_8;
import android.os.Handler;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IG0 {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static Aweme LIZJ;
    public static final Keva LIZLLL;
    public static long LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static final boolean LJII;
    public static final Handler LJIIIIZZ;
    public static final C46323IFz LJIIIZ;
    public static final ARunnableS15S0000000_8 LJIIJ;

    static {
        Keva.getRepo("deliverAdKeva");
        LJIIIIZZ = new Handler(C16880lQ.LLJJJJ());
        Keva repo = Keva.getRepo("keva_video_consume");
        o.LJIIIIZZ(repo, "getRepo(KEVA_VIDEO_CONSUME)");
        LIZLLL = repo;
        LJ = repo.getLong("video_consume_time_name", 0L);
        LJFF = repo.getBoolean("video_consume_10_minutes", false);
        boolean z = repo.getBoolean("video_consume_15_minutes", false);
        LJI = z;
        LIZIZ = !z;
        LJII = Keva.getRepo("deliverAdKeva").getBoolean("webtoon_platform_enabled", false);
        LIZIZ();
        LJIIIZ = new C46323IFz();
        LJIIJ = new ARunnableS15S0000000_8(0);
    }

    public static void LIZ() {
        if (LIZIZ && LJII) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("");
            LIZ2.append(LJ);
            c5s1.LIZLLL(X1D.LIZIZ(LIZ2));
            c5s1.LJ();
        }
    }

    public static void LIZIZ() {
        UgCommonServiceImpl.LJIJ().LJIILIIL();
        if (LJ >= 600 && !LJFF) {
            LJFF = true;
            FLJ.LJFF("af_playtime_10min");
            LIZLLL.storeBoolean("video_consume_10_minutes", true);
            LIZ();
        }
        if (LJ >= 900 && !LJI) {
            LJI = true;
            FLJ.LJFF("af_playtime_15min");
            LIZLLL.storeBoolean("video_consume_15_minutes", true);
            LIZ();
            LIZIZ = false;
            if (LIZ) {
                LIZ = false;
                LJIIIIZZ.removeCallbacks(LJIIJ);
            }
            LIZIZ();
        }
    }
}
