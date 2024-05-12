package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2;

/* renamed from: X.ANj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26131ANj implements InterfaceC252779w1 {
    public final /* synthetic */ BaseMyProfileGuideWidget LIZ;
    public final /* synthetic */ ViewOnClickListenerC252769w0 LIZIZ;

    @Override // X.InterfaceC252779w1
    public final void LIZJ() {
    }

    @Override // X.InterfaceC252779w1
    public final void LIZ() {
        this.LIZIZ.setVisibility(8);
        C26132ANk.LIZ().LIZIZ(true);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("banner_type", "coupon_fission");
        c188727au.LJIIIZ("banner_name", "tiktok_rewards");
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("click_position", "cross");
        FMX.LJIIL("banner_click", c188727au.LIZ);
    }

    @Override // X.InterfaceC252779w1
    public final void LIZIZ() {
        this.LIZIZ.setVisibility(8);
        C26132ANk.LIZ().LIZIZ(true);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("banner_type", "coupon_fission");
        c188727au.LJIIIZ("banner_name", "tiktok_rewards");
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("click_position", "join");
        FMX.LJIIL("banner_click", c188727au.LIZ);
        BaseMyProfileGuideWidget baseMyProfileGuideWidget = this.LIZ;
        baseMyProfileGuideWidget.getClass();
        SmartRoute buildRoute = SmartRouter.buildRoute(C77125UOr.LIZJ(baseMyProfileGuideWidget), "//webview");
        String str = null;
        try {
            UgAwemeActivitySetting awemeActivitySetting = C2YJ.LIZIZ.LIZ.getAwemeActivitySetting();
            if (awemeActivitySetting != null) {
                UgProfileActivityButton profileActivityButton = awemeActivitySetting.getProfileActivityButton();
                if (profileActivityButton != null) {
                    str = profileActivityButton.getH5Link();
                }
            }
        } catch (C158056If unused) {
        }
        buildRoute.withParam("url", str);
        buildRoute.withParam("hide_nav_bar", true);
        buildRoute.addFlags(268435456);
        buildRoute.open();
    }

    public C26131ANj(ViewOnClickListenerC252769w0 viewOnClickListenerC252769w0, MyProfileGuideWidgetV2 myProfileGuideWidgetV2) {
        this.LIZ = myProfileGuideWidgetV2;
        this.LIZIZ = viewOnClickListenerC252769w0;
    }
}
