package X;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JoB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50271JoB extends ClickableSpan {
    public final /* synthetic */ SearchApiResult LJLIL;
    public final /* synthetic */ C50257Jnx LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("use_scenario", this.LJLIL.globalDoodleConfig.getUseScenario());
        c188727au.LJIIIZ("search_id", this.LJLIL.logPb.getImprId());
        c188727au.LJIIIZ("search_type", C50605JtZ.LJFF(this.LJLILLLLZI.LIZIZ.LLF));
        FMX.LJIIL("tns_click_community_link", c188727au.LIZ);
        C38281F0r c38281F0r = new C38281F0r("https://www.tiktok.com/community-guidelines");
        c38281F0r.LIZLLL("lang", LocalServiceImpl.LIZIZ().LIZ(this.LJLJI));
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLJI, "//webview");
        buildRoute.withParam("url", c38281F0r.LJ());
        buildRoute.withParam("title", this.LJLJI.getString(R.string.drq));
        buildRoute.open();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        int i;
        o.LJIIIZ(ds, "ds");
        Integer LJI = C79045V0n.LJI(R.attr.eb, this.LJLILLLLZI.LIZ);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        ds.setColor(i);
        ds.setUnderlineText(false);
    }

    public C50271JoB(SearchApiResult searchApiResult, C50257Jnx c50257Jnx, Activity activity) {
        this.LJLIL = searchApiResult;
        this.LJLILLLLZI = c50257Jnx;
        this.LJLJI = activity;
    }
}
