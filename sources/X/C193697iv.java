package X;

import com.ss.android.ugc.aweme.nows.limit.exp.TTLimitNowOptimizeConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.7iv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193697iv {
    public static final TTLimitNowOptimizeConfig LIZ = new TTLimitNowOptimizeConfig(0, 0, false, 0, 0, 31, null);

    public static boolean LIZ() {
        if (C00F.LIZ(31744, 0, "tt_now_never_guide_exp", true) == 2 && C78946Uyc.LJJ()) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ() {
        if (C00F.LIZ(31744, 0, "tt_now_never_guide_exp", true) == 2 && !C78946Uyc.LJJ()) {
            return false;
        }
        return true;
    }

    public static boolean LJ() {
        if (((Number) C194167jg.LIZ.getValue()).intValue() == 2) {
            return true;
        }
        return false;
    }

    public static TTLimitNowOptimizeConfig LIZJ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        TTLimitNowOptimizeConfig tTLimitNowOptimizeConfig = LIZ;
        LJIIIZ.getClass();
        TTLimitNowOptimizeConfig tTLimitNowOptimizeConfig2 = (TTLimitNowOptimizeConfig) FFL.LJIJ(true, "tt_limit_now_optimize", 31744, TTLimitNowOptimizeConfig.class, tTLimitNowOptimizeConfig);
        if (tTLimitNowOptimizeConfig2 == null) {
            return tTLimitNowOptimizeConfig;
        }
        return tTLimitNowOptimizeConfig2;
    }

    public static boolean LIZLLL() {
        if (MWW.LIZIZ() && !o.LJ(LIZJ(), LIZ)) {
            return true;
        }
        return false;
    }

    public static boolean LJFF() {
        if (LIZIZ() || !LJ() || LIZJ().getUninstallFriendGroup() != 2) {
            return false;
        }
        return true;
    }

    public static boolean LJI() {
        if (LIZIZ()) {
            return false;
        }
        if (LJ()) {
            if (LIZJ().getUninstallFriendGroup() != 1) {
                return false;
            }
            return true;
        }
        return LIZLLL();
    }

    public static boolean LJII() {
        if (LIZ() || LIZJ().getInstallOptimizeApp() != 1) {
            return false;
        }
        return true;
    }
}
