package com.ss.android.ugc.aweme.setting.page.security;

import X.C188727au;
import X.C253579xJ;
import X.C38281F0r;
import X.C85999Xp5;
import X.EF7;
import X.FMX;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SecurityIncomeCell extends RightTextCell<C253579xJ> {
    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell, android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_security");
        FMX.LJIIL("click_income_plus_verification", c188727au.LIZ);
        C38281F0r c38281F0r = new C38281F0r(i0.LJFF((String) LiveOuterService.LJJJLL().LJJIJIL().LJIIIZ("https://www.tiktok.com", "unified_wallet_domain"), "/inapp/reauth/settings"));
        c38281F0r.LIZLLL("locale", C85999Xp5.LIZIZ());
        c38281F0r.LIZ(EF7.LJIIIZ, "aid");
        c38281F0r.LIZLLL("enter_from", "account_security_settings");
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "aweme://webview");
        buildRoute.withParam("url", c38281F0r.LJ());
        buildRoute.withParam("hide_nav_bar", true);
        buildRoute.open();
    }
}
