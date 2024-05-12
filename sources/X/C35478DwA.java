package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.internal.o;

/* renamed from: X.DwA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35478DwA {
    public static final C35478DwA LIZ = new C35478DwA();
    public static final Keva LIZIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
    public static boolean LIZJ;
    public static final C35479DwB LIZLLL;
    public static final C62822Ol8 LJ;
    public static final C62822Ol8 LJFF;

    static {
        C35477Dw9 initializer = C35477Dw9.LJLIL;
        o.LJIIIZ(initializer, "initializer");
        LIZLLL = new C35479DwB(initializer);
        LJ = C221108m2.LIZIZ(FTC.LJLIL);
        LJFF = C221108m2.LIZIZ(C54926Lh4.LJLIL);
    }

    public static int LIZ() {
        return ((Number) LIZLLL.LIZ()).intValue();
    }

    public static boolean LIZIZ() {
        if (LIZJ && LIZ() == 2) {
            return true;
        }
        return false;
    }

    public static void LIZJ(int i) {
        C35479DwB c35479DwB = LIZLLL;
        Integer valueOf = Integer.valueOf(i);
        if (o.LJ(c35479DwB.LIZIZ, C35480DwC.LIZ)) {
            synchronized (c35479DwB.LIZJ) {
                c35479DwB.LIZIZ = valueOf;
                c35479DwB.LIZ = null;
            }
            return;
        }
        c35479DwB.LIZIZ = valueOf;
    }
}
