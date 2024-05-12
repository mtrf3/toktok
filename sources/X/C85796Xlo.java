package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;

/* renamed from: X.Xlo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85796Xlo implements InterfaceC53832LAu {
    public final /* synthetic */ I18nSettingNewVersionFragment LJLIL;

    @Override // X.InterfaceC53832LAu
    public final void onSuccess() {
        this.LJLIL.dismissLoadingDialog();
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL.mo49getActivity(), "aweme://contentpreference");
        buildRoute.withParam("enter_from", "settings_page");
        buildRoute.open();
    }

    public C85796Xlo(I18nSettingNewVersionFragment i18nSettingNewVersionFragment) {
        this.LJLIL = i18nSettingNewVersionFragment;
    }

    @Override // X.InterfaceC53832LAu
    public final void onFailed(Exception exc) {
        this.LJLIL.dismissLoadingDialog();
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL.mo49getActivity(), "aweme://contentpreference");
        buildRoute.withParam("enter_from", "settings_page");
        buildRoute.open();
    }
}
