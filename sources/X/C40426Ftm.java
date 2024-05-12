package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ftm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40426Ftm extends AbstractC40428Fto {
    @Override // X.AbstractC40428Fto
    public final void LIZ() {
        C38281F0r c38281F0r;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "praise_dialog");
        java.util.Map<String, String> map = c188727au.LIZ;
        FMX.LJIIL("FAQ", map);
        FMX.LJIIL("click_feedback_entrance", map);
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LIZ, "aweme://webview");
        o.LJIIIIZZ(buildRoute, "buildRoute(activity, \"aweme://webview\")");
        if (AV1.LJIILLIIL()) {
            c38281F0r = new C38281F0r("https://www.tiktok.com/aweme/inapp/v2/c_feedback");
        } else {
            try {
                if (((RBX) HG3.LJIILL()).isLogin()) {
                    C61200O0e.LIZLLL().LJII(C2YJ.LIZIZ.LIZ.getFeedbackConf().getNormalEntry());
                    return;
                } else {
                    C61200O0e.LIZLLL().LJII(C2YJ.LIZIZ.LIZ.getFeedbackConf().getNotLoggedIn());
                    return;
                }
            } catch (C158056If unused) {
                c38281F0r = new C38281F0r("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/");
                c38281F0r.LIZLLL("locale", C39386Fd0.LIZIZ(this.LIZ).getLanguage());
            }
        }
        c38281F0r.LIZLLL("enter_from", "praise_dialog");
        buildRoute.withParam(UriProtector.parse(c38281F0r.LJ()));
        buildRoute.withParam("hide_nav_bar", true);
        buildRoute.open();
    }

    @Override // X.AbstractC40428Fto
    public final C40429Ftp LIZIZ() {
        String string = this.LIZ.getString(R.string.pso);
        o.LJIIIIZZ(string, "activity.getString(R.str…uPage_ratingModal_header)");
        String string2 = this.LIZ.getString(R.string.psl);
        o.LJIIIIZZ(string2, "activity.getString(R.str…ratingModal_body_Android)");
        try {
            AppStoreMessage appStoreScore = C2YJ.LIZIZ.LIZ.getAppStoreScore();
            String title = appStoreScore.getTitle();
            o.LJIIIIZZ(title, "message.title");
            if (title.length() > 0) {
                String title2 = appStoreScore.getTitle();
                o.LJIIIIZZ(title2, "message.title");
                string = title2;
            }
            String text = appStoreScore.getText();
            o.LJIIIIZZ(text, "message.text");
            if (text.length() > 0) {
                String text2 = appStoreScore.getText();
                o.LJIIIIZZ(text2, "message.text");
                string2 = text2;
            }
        } catch (C158056If unused) {
        }
        String string3 = this.LIZ.getString(R.string.ie6);
        o.LJIIIIZZ(string3, "activity.getString(R.string.mus_report_problem)");
        String string4 = this.LIZ.getString(R.string.psn);
        o.LJIIIIZZ(string4, "activity.getString(R.str…YouPage_ratingModal_btn2)");
        String string5 = this.LIZ.getString(R.string.psm);
        o.LJIIIIZZ(string5, "activity.getString(R.str…YouPage_ratingModal_btn1)");
        String packageName = this.LIZ.getPackageName();
        o.LJIIIIZZ(packageName, "activity.packageName");
        return new C40429Ftp(string, string2, string3, string4, string5, packageName);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40426Ftm(Activity activity, EnumC40416Ftc dialogType) {
        super(activity, dialogType);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(dialogType, "dialogType");
    }
}
