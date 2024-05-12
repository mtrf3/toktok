package X;

import com.ss.android.ugc.aweme.nows.limit.exp.Limit2Config;

/* renamed from: X.2WW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WW {
    public static final Limit2Config LIZ = new Limit2Config(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);

    public static Limit2Config LIZ() {
        if (!MWW.LIZIZ()) {
            return LIZ;
        }
        FFL LJIIIZ = FFL.LJIIIZ();
        Limit2Config limit2Config = LIZ;
        LJIIIZ.getClass();
        Limit2Config limit2Config2 = (Limit2Config) FFL.LJIJ(true, "tt_limit_now_optimize_phase_2", 31744, Limit2Config.class, limit2Config);
        if (limit2Config2 == null) {
            return limit2Config;
        }
        return limit2Config2;
    }

    public static boolean LIZIZ() {
        Integer num = LIZ().distributedInFriendsTabEnabled;
        if (num == null || num.intValue() != 0) {
            return true;
        }
        return false;
    }

    public static Integer LIZJ() {
        return LIZ().trialDaysThenNeverGuide;
    }
}
