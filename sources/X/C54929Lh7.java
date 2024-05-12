package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.GradientPunishWarning;
import kotlin.jvm.internal.o;

/* renamed from: X.Lh7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54929Lh7 {
    public static final KUN LIZ = new KUN(EF7.LIZIZ(), "gradient_punish_warning");

    public static final GradientPunishWarning LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            return (GradientPunishWarning) SettingsManager.LJII("gradient_punish_warning", GradientPunishWarning.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void LIZIZ(Context context, String enterFrom) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview");
        StringBuilder LIZ2 = X1D.LIZ();
        GradientPunishWarning LIZ3 = LIZ();
        if (LIZ3 != null) {
            str = LIZ3.getDetailUrl();
        } else {
            str = null;
        }
        C0NY.LIZJ(buildRoute, "url", C025908h.LIZIZ(LIZ2, str, "&enter_from=", enterFrom, LIZ2), "hide_nav_bar", true);
    }
}
