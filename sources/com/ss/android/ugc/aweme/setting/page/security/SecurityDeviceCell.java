package com.ss.android.ugc.aweme.setting.page.security;

import X.C253599xL;
import X.C38281F0r;
import X.C53097Ksf;
import X.C85999Xp5;
import X.EF7;
import X.FMX;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SecurityDeviceCell extends RightTextCell<C253599xL> {
    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell, android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        FMX.onEventV3("click_your_device");
        String LIZJ = C53097Ksf.LIZIZ.LIZJ();
        if (LIZJ != null) {
            C38281F0r c38281F0r = new C38281F0r(LIZJ);
            c38281F0r.LIZLLL("locale", C85999Xp5.LIZIZ());
            c38281F0r.LIZ(EF7.LJIIIZ, "aid");
            c38281F0r.LIZLLL("enter_from", "settings_security");
            SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "aweme://webview");
            buildRoute.withParam("url", c38281F0r.LJ());
            buildRoute.withParam("hide_nav_bar", true);
            buildRoute.open();
        }
    }
}
