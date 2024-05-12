package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public final class AAZ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void LIZIZ(ActivityC45651qj activityC45651qj) {
        if (!LIZ()) {
            C5S1 c5s1 = new C5S1(activityC45651qj);
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
            return;
        }
        C38281F0r c38281F0r = new C38281F0r("https://www.tiktok.com/community-guidelines");
        c38281F0r.LIZLLL("lang", LocalServiceImpl.LIZIZ().LIZ(activityC45651qj));
        c38281F0r.LIZLLL("enter_from", "settings");
        SmartRoute buildRoute = SmartRouter.buildRoute(activityC45651qj, "aweme://webview");
        buildRoute.withParam("url", c38281F0r.LJ());
        buildRoute.withParam("title", activityC45651qj.getString(R.string.drq));
        buildRoute.withParam("show_separate_line", true);
        buildRoute.open();
        C116484hg.LIZ("enter_from", "settings_page", "enter_community_guidelines");
    }

    public static void LIZJ(ActivityC45651qj activityC45651qj) {
        if (!LIZ()) {
            C5S1 c5s1 = new C5S1(activityC45651qj);
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
            return;
        }
        if (C25727A7v.LIZ()) {
            ICompliancePolicyService LJII = a.LJII();
            if (LJII != null) {
                LJII.LIZIZ(new O0X(AGJ.SETTINGS_PRIVACY_PAGE.getValue(), "copyright-policy", true, true, 4), new C1A7());
            }
        } else {
            SmartRoute buildRoute = SmartRouter.buildRoute(activityC45651qj, "aweme://webview");
            buildRoute.withParam(UriProtector.parse("https://www.tiktok.com/legal/copyright-policy"));
            C0NY.LIZJ(buildRoute, "title", activityC45651qj.getString(R.string.dwf), "show_separate_line", true);
        }
        C116484hg.LIZ("enter_from", "settings_page", "enter_copyright_policy");
    }

    public static void LIZLLL(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        if (!LIZ()) {
            C5S1 c5s1 = new C5S1(activity);
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
            return;
        }
        String lowerCase = SettingServiceImpl.LIZ().getAppLanguage().toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C38281F0r c38281F0r = new C38281F0r(C0F0.LIZLLL("https://www.tiktok.com/creators/creator-portal/", lowerCase, '/'));
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "aweme://webview");
        buildRoute.withParam("url", c38281F0r.LJ());
        buildRoute.withParam("title", activity.getString(R.string.eck));
        buildRoute.open();
    }

    public static void LJ(ActivityC45651qj activityC45651qj) {
        if (!LIZ()) {
            C5S1 c5s1 = new C5S1(activityC45651qj);
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
            return;
        }
        C38281F0r c38281F0r = new C38281F0r("https://support.tiktok.com");
        c38281F0r.LIZLLL("lang", LocalServiceImpl.LIZIZ().LIZ(activityC45651qj));
        SmartRoute buildRoute = SmartRouter.buildRoute(activityC45651qj, "aweme://webview");
        buildRoute.withParam("url", c38281F0r.LJ());
        buildRoute.withParam("title", activityC45651qj.getString(R.string.geu));
        buildRoute.withParam("show_separate_line", true);
        buildRoute.open();
        C116484hg.LIZ("enter_from", "settings_page", "enter_help_center");
    }

    public static void LJFF(ActivityC45651qj activityC45651qj) {
        if (!LIZ()) {
            C40328FsC.LIZLLL(activityC45651qj, R.string.img);
            return;
        }
        FMX.LJIIL("enter_safety_center", C51029K0z.LJJIIZI(new OSZ("enter_from", "settings_page")));
        String LIZIZ = C85999Xp5.LIZIZ();
        String LIZJ = C31461Li.LIZJ("new_safety_center_link", "", "getInstance().getStringV…rLinkSetting::class.java)");
        if (LIZJ.length() == 0) {
            LIZJ = C0F0.LIZLLL("https://www.tiktok.com/safety/", LIZIZ, '/');
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(activityC45651qj, "aweme://webview");
        buildRoute.withParam("url", LIZJ);
        C0NY.LIZJ(buildRoute, "title", activityC45651qj.getString(R.string.q7y), "show_separate_line", true);
    }

    public static void LJI(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (!LIZ()) {
            C5S1 c5s1 = new C5S1(activity);
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
        } else {
            if (C25727A7v.LIZ()) {
                ICompliancePolicyService LJII = a.LJII();
                if (LJII != null) {
                    LJII.LIZIZ(new O0X(AGJ.SETTINGS_PRIVACY_PAGE.getValue(), "terms-of-use", true, true, 4), new HHD());
                    return;
                }
                return;
            }
            C38281F0r c38281F0r = new C38281F0r(C25934AFu.LIZ("terms-of-use"));
            c38281F0r.LIZLLL("lang", LocalServiceImpl.LIZIZ().LIZ(activity));
            SmartRoute buildRoute = SmartRouter.buildRoute(activity, "aweme://webview");
            buildRoute.withParam("url", c38281F0r.LJ());
            C0NY.LIZJ(buildRoute, "title", activity.getString(R.string.ien), "show_separate_line", true);
        }
    }
}
