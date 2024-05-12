package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public final class O6Z {
    public static final O6Z LIZ = new O6Z();
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static void LIZJ() {
        TopViewJsonManager topViewJsonManager;
        SharedPreferences sharedPreferences;
        NPQ LIZIZ2 = NPQ.LIZIZ();
        if (NPQ.LIZIZ != null) {
            LIZIZ2.getClass();
            if (NPQ.LIZJ() || (sharedPreferences = (topViewJsonManager = NPQ.LIZIZ).LIZJ) == null || !sharedPreferences.getBoolean("awesome_splash_preload_json", false)) {
                return;
            }
            topViewJsonManager.LJFF();
            return;
        }
        LIZIZ2.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O6Z.LJ(android.content.Context):boolean");
    }

    public final boolean LIZ(Context context) {
        o.LJIIIZ(context, "context");
        if (LIZJ) {
            return LIZLLL;
        }
        synchronized (this) {
            if (!LIZJ) {
                if (((Boolean) C87549YXp.LJ.getValue()).booleanValue()) {
                    LIZJ();
                }
                NPU LIZ2 = NW6.LIZ();
                if (LIZ2 != null) {
                    LIZ2.LJJIFFI("get_splash_manager", true, false);
                }
                C61358O6g.LIZIZ(context);
                NPU LIZ3 = NW6.LIZ();
                if (LIZ3 != null) {
                    LIZ3.LJJIFFI("get_splash_manager", false, false);
                }
                NPU LIZ4 = NW6.LIZ();
                if (LIZ4 != null) {
                    LIZ4.LJJIFFI("has_splash_ad", true, false);
                }
                boolean LIZIZ2 = LIZIZ(context, true);
                LIZLLL = LIZIZ2;
                if (LIZIZ2 && ((Boolean) C2305693c.LIZIZ.getValue()).booleanValue()) {
                    MDW.LIZIZ();
                }
                if (LIZLLL && ((Boolean) C35041Dp7.LIZIZ.getValue()).booleanValue()) {
                    MDY.LIZIZ();
                }
                NPU LIZ5 = NW6.LIZ();
                if (LIZ5 != null) {
                    LIZ5.LJJIFFI("has_splash_ad", false, false);
                }
                LIZJ = true;
            }
        }
        return LIZLLL;
    }

    public static boolean LIZIZ(Context context, boolean z) {
        if (!a.LJIJI().LIZ()) {
            return false;
        }
        C61358O6g.LIZIZ(context);
        C61358O6g.LIZIZ.getClass();
        C61359O6h.LJJIJIIJI = z ? 1 : 0;
        C61358O6g.LIZIZ(context);
        return C61360O6i.LIZLLL();
    }

    public final boolean LIZLLL(int i, Context context) {
        boolean z;
        o.LJIIIZ(context, "context");
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            if (!LIZIZ) {
                FR4.LIZIZ = false;
                FR4.LJ = false;
                FR4.LIZJ = false;
                return false;
            }
            LIZIZ = false;
            if (!FR4.LIZJ && (context instanceof Activity)) {
                if (context instanceof NormalSplashAdActivity) {
                    return false;
                }
                NPU LIZ2 = NW6.LIZ();
                if ((LIZ2 != null && LIZ2.isActivityAwemeAuthorize((Activity) context)) || !LIZIZ(context, false)) {
                    return false;
                }
                z = LJ(context);
                FR4.LJ = z;
            } else {
                FR4.LIZIZ = false;
                FR4.LJ = false;
                z = false;
            }
            FR4.LIZJ = false;
            return z;
        }
        if (!C61358O6g.LJFF() || !LIZ(context)) {
            return false;
        }
        return LJ(context);
    }
}
