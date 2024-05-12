package X;

import android.os.Handler;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupAction;
import kotlin.jvm.internal.o;

/* renamed from: X.FcN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39347FcN implements InterfaceC82923WgZ {
    @Override // X.InterfaceC82923WgZ
    public final void LIZ(UniversalPopupAction universalPopupAction, java.util.Map<String, String> map) {
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZJ(java.util.Map<String, String> extra) {
        o.LJIIIZ(extra, "extra");
        C62913Omb.LJ = true;
        if (IWF.LJJLIIIIJ().isPlaying()) {
            IWF.LJJLIIIIJ().LJIILJJIL();
        }
    }

    @Override // X.InterfaceC82923WgZ
    public final void LJ(java.util.Map<String, String> extra) {
        o.LJIIIZ(extra, "extra");
        IWF.LJJLIIIIJ().LIZIZ();
        PopupManager.LIZJ(C40461FuL.class);
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZIZ(String customizedAction, java.util.Map<String, String> map) {
        o.LJIIIZ(customizedAction, "customizedAction");
        if (o.LJ(customizedAction, "reload_settings")) {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(RunnableC39348FcO.LJLIL, 500L);
        }
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZLLL(Boolean bool, String link) {
        o.LJIIIZ(link, "link");
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), link);
        if (o.LJ(bool, Boolean.TRUE)) {
            buildRoute.withParam("use_webview_title", true);
        }
        buildRoute.open();
    }
}
