package X;

import android.os.Handler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.kids.intergration.common.KidsPolicyNoticeServiceImp;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupAction;
import kotlin.jvm.internal.o;

/* renamed from: X.FcM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39346FcM implements InterfaceC82923WgZ {
    public final /* synthetic */ KidsPolicyNoticeServiceImp LIZ;

    @Override // X.InterfaceC82923WgZ
    public final void LIZ(UniversalPopupAction universalPopupAction, java.util.Map<String, String> map) {
    }

    public C39346FcM(KidsPolicyNoticeServiceImp kidsPolicyNoticeServiceImp) {
        this.LIZ = kidsPolicyNoticeServiceImp;
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZJ(java.util.Map<String, String> extra) {
        o.LJIIIZ(extra, "extra");
        if (IWF.LJJLIIIIJ().isPlaying()) {
            IWF.LJJLIIIIJ().LJIILJJIL();
        }
    }

    @Override // X.InterfaceC82923WgZ
    public final void LJ(java.util.Map<String, String> extra) {
        o.LJIIIZ(extra, "extra");
        IWF.LJJLIIIIJ().LIZIZ();
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZIZ(String customizedAction, java.util.Map<String, String> map) {
        o.LJIIIZ(customizedAction, "customizedAction");
        if (o.LJ(customizedAction, "reload_settings")) {
            this.LIZ.getClass();
            new Handler(C16880lQ.LLJJJJ()).postDelayed(J7N.LJLIL, 500L);
        }
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZLLL(Boolean bool, String link) {
        o.LJIIIZ(link, "link");
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), link);
        if (o.LJ(bool, Boolean.TRUE) && !o.LJ(UriProtector.getQueryParameter(UriProtector.parse(link), "use_spark"), "1")) {
            buildRoute.withParam("use_webview_title", true);
        }
        buildRoute.open();
    }
}
