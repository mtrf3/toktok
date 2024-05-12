package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.services.IWebViewService;
import com.ss.android.ugc.aweme.main.service.ILanguageService;

/* renamed from: X.9g2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242869g2 {
    public static void LIZ(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", str2);
        c35936E8m.LIZLLL("enter_from", str);
        FMX.LJIIL("click_feedback_entrance", c35936E8m.LIZ);
        try {
            SmartRouter.buildRoute(context, C2YJ.LIZIZ.LIZ.getFeedbackConf().getNotLoggedIn()).open();
        } catch (C158056If unused) {
            C38281F0r c38281F0r = new C38281F0r("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/?id=5678&hide_nav_bar=1");
            c38281F0r.LIZLLL("enter_from", str);
            c38281F0r.LIZLLL("locale", ((ILanguageService) C58725N2z.LIZIZ(ILanguageService.class)).getAppLanguage());
            ((IWebViewService) C58725N2z.LIZIZ(IWebViewService.class)).LIZ(context, c38281F0r.LJ(), true);
        }
    }

    public static void LIZIZ(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", str2);
        c35936E8m.LIZLLL("enter_from", str);
        FMX.LJIIL("click_feedback_entrance", c35936E8m.LIZ);
        try {
            String normalEntry = C2YJ.LIZIZ.LIZ.getFeedbackConf().getNormalEntry();
            if (normalEntry != null) {
                C61200O0e.LIZLLL().LJII(normalEntry);
            } else {
                C38281F0r c38281F0r = new C38281F0r("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/?hide_nav_bar=1");
                c38281F0r.LIZLLL("enter_from", str);
                c38281F0r.LIZLLL("locale", ((ILanguageService) C58725N2z.LIZIZ(ILanguageService.class)).getAppLanguage());
                ((IWebViewService) C58725N2z.LIZIZ(IWebViewService.class)).LIZ(context, c38281F0r.LJ(), true);
            }
        } catch (Exception unused) {
            C38281F0r c38281F0r2 = new C38281F0r("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/?hide_nav_bar=1");
            c38281F0r2.LIZLLL("enter_from", str);
            c38281F0r2.LIZLLL("locale", ((ILanguageService) C58725N2z.LIZIZ(ILanguageService.class)).getAppLanguage());
            ((IWebViewService) C58725N2z.LIZIZ(IWebViewService.class)).LIZ(context, c38281F0r2.LJ(), true);
        }
    }
}
