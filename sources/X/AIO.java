package X;

import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.services.LanguageService;
import com.ss.android.ugc.aweme.setting.ui.beta.BetaTesterInfoPage;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AIO implements View.OnClickListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ BetaTesterInfoPage LJLILLLLZI;
    public final /* synthetic */ SY4 LJLJI;
    public final /* synthetic */ float LJLJJI;

    public AIO(View view, BetaTesterInfoPage betaTesterInfoPage, SY4 sy4, float f) {
        this.LJLIL = view;
        this.LJLILLLLZI = betaTesterInfoPage;
        this.LJLJI = sy4;
        this.LJLJJI = f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        C38281F0r c38281F0r = new C38281F0r("https://feedback.tiktokv.com/falcon/fe_tiktok_common/faq/feedback/");
        c38281F0r.LIZLLL("locale", LanguageService.LIZ().getAppLanguage());
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL.getContext(), "aweme://webview/");
        buildRoute.withParam("url", c38281F0r.LJ());
        buildRoute.withParam("hide_nav_bar", "1");
        buildRoute.withParam("container_color_auto_dark", "1");
        buildRoute.open();
        this.LJLILLLLZI.LJLJI.storeBoolean(BetaTesterInfoPage.LJLJJLL, true);
        BetaTesterInfoPage betaTesterInfoPage = this.LJLILLLLZI;
        SY4 vFeedback = this.LJLJI;
        o.LJIIIIZZ(vFeedback, "vFeedback");
        betaTesterInfoPage.Al(vFeedback, true, this.LJLJJI);
        C188727au c188727au = new C188727au();
        Bundle arguments = this.LJLILLLLZI.getArguments();
        if (arguments == null || (str = arguments.getString("enter_from")) == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("clicked_content", "share_feedback");
        FMX.LJIIL("tiktok_beta_page_click", c188727au.LIZ);
    }
}
