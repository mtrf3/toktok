package com.ss.android.ugc.aweme.setting.page.security;

import X.C10K;
import X.C253359wx;
import X.C253379wz;
import X.C38281F0r;
import X.C85999Xp5;
import X.EF7;
import X.FMX;
import X.HG3;
import Y.AgS122S0100000_4;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.setting.page.base.RightIconCell;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SecurityAlertsCell extends RightIconCell<C253379wz> {
    @Override // com.ss.android.ugc.aweme.setting.page.base.RightIconCell, android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        SettingsManager.LIZLLL().getClass();
        String LJI = SettingsManager.LJI("security_center", "");
        o.LJIIIIZZ(LJI, "getInstance().getStringV…nterSettings::class.java)");
        FMX.onEventV3("click_security_alert");
        C38281F0r c38281F0r = new C38281F0r(LJI);
        c38281F0r.LIZLLL("lang", LocalServiceImpl.LIZIZ().LIZ(this.LJLIL));
        c38281F0r.LIZLLL("locale", C85999Xp5.LIZIZ());
        c38281F0r.LIZ(EF7.LJIIIZ, "aid");
        c38281F0r.LIZ(1, "alerts_direct");
        c38281F0r.LIZLLL("enter_from", "settings_security");
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "aweme://webview");
        buildRoute.withParam("url", c38281F0r.LJ());
        buildRoute.withParam("hide_nav_bar", true);
        buildRoute.open();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated(Object obj) {
        super.onItemViewCreated();
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.page.security.SecurityAlertsItem");
        setItem((C253359wx) obj);
        HG3.LJIIL();
        HG3.LJLJL.LJIIL().getSafeInfo().LJ(new AgS122S0100000_4(this, 5), C10K.LJIIIIZZ, null);
    }
}
