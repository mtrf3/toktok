package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.experiment.prompt.ShowPromptToConfirmDynamicDataExperiment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UZ1 {
    public static R7H LIZ;
    public static final Keva LIZIZ = Keva.getRepo("show_prompt_repo");
    public static InterfaceC65784Pro<C76800UCe> LIZJ;
    public static InterfaceC65784Pro<C76800UCe> LIZLLL;
    public static final String LJ;
    public static long LJFF;

    static {
        SettingsManager.LIZLLL().getClass();
        String LJI = SettingsManager.LJI("account_prompt_help_center_link", "");
        if (LJI == null) {
            LJI = C52282KfW.LIZ;
        }
        o.LJIIIIZZ(LJI, "SettingsManager.getInsta….java)\n        ?: DEFAULT");
        LJ = LJI;
    }

    public static void LIZ() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = LIZLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        LIZLLL = null;
    }

    public static boolean LIZIZ(String str) {
        return ShowPromptToConfirmDynamicDataExperiment.LIZ().nonAutoVerifyCountries.contains(str);
    }

    public static void LJI(ActivityC45651qj activityC45651qj) {
        String str = LJ;
        if (str.length() == 0) {
            return;
        }
        String lang = LocalServiceImpl.LIZIZ().LIZ(activityC45651qj);
        o.LJIIIIZZ(lang, "lang");
        C38281F0r c38281F0r = new C38281F0r(ujb.o.LJJJJZ(str, "%s", lang, false));
        SmartRoute buildRoute = SmartRouter.buildRoute(activityC45651qj, "//webview/");
        buildRoute.withParam("url", c38281F0r.LJ());
        buildRoute.withParam("title", activityC45651qj.getString(R.string.dsy));
        buildRoute.withParam("show_separate_line", true);
        buildRoute.open();
        C116484hg.LIZ("enter_from", "verify_pii_page_show", "enter_help_center");
    }

    public static void LJ(String str, UZ8 uz8, int i) {
        java.util.Map<String, String> LJJL;
        LIZIZ.storeInt("not_now_time", 0);
        LIZLLL(str, uz8, i, "verify", "1");
        if (uz8 == UZ8.EMAIL) {
            LJJL = C113554cx.LJJL(new OSZ("source", "13"), new OSZ("type", "2"), new OSZ("decision_uid", String.valueOf(LJFF)));
        } else {
            LJJL = C113554cx.LJJL(new OSZ("source", "14"), new OSZ("type", "1"), new OSZ("decision_uid", String.valueOf(LJFF)));
        }
        C78886Uxe.LJIILJJIL().LIZIZ("/passport/identity/update_source/", LJJL, new C77340UWy());
    }

    public static void LIZJ(int i, UZ8 uz8, String str, String str2) {
        String str3;
        int i2 = UZ7.LIZ[uz8.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str3 = "phone";
            } else {
                throw new C162476Zf();
            }
        } else {
            str3 = "email";
        }
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", str), new OSZ("show_index", String.valueOf(i)), new OSZ("show_type", str2), new OSZ("verify_type", str3));
        LJJLIIIIJ.put("enter_method", "normal");
        FMX.LJIIL("verify_pii_page_show", LJJLIIIIJ);
    }

    public static void LJFF(int i, UZ8 uz8, String str, String str2) {
        C19N.LIZJ(LIZIZ, "not_now_time", 0, 1, "not_now_time");
        LIZLLL(str, uz8, i, str2, CardStruct.IStatusCode.DEFAULT);
    }

    public static void LIZLLL(String str, UZ8 uz8, int i, String str2, String str3) {
        String str4;
        int i2 = UZ7.LIZ[uz8.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str4 = "phone";
            } else {
                throw new C162476Zf();
            }
        } else {
            str4 = "email";
        }
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", str), new OSZ("show_index", String.valueOf(i)), new OSZ("click", str2), new OSZ("verify_type", str4), new OSZ("status", str3));
        LJJLIIIIJ.put("enter_method", "normal");
        FMX.LJIIL("verify_pii_page_click", LJJLIIIIJ);
    }
}
