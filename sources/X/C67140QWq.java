package X;

import android.net.Uri;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* renamed from: X.QWq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67140QWq implements InterfaceC67148QWy {
    public static void LIZ() {
        SmartRouter.buildRoute(EF7.LIZIZ(), new Uri.Builder().scheme("aweme://webview/").appendQueryParameter("url", "https://inapp.tiktokv.com/ucenter_web/account_hacked_checkpoint").appendQueryParameter("append_common_params", "1").appendQueryParameter("use_spark", "1").appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("disable_back_press", "1").appendQueryParameter("enter_from", "after_launch").build().toString()).open();
    }

    @Override // X.InterfaceC67148QWy
    public final void LJIJJLI(WsChannelMsg msg) {
        o.LJIIIZ(msg, "msg");
        LIZ();
    }

    @QD3
    public final void onReceivedMsgEvent(C67139QWp event) {
        o.LJIIIZ(event, "event");
        QWW qww = event.LJLIL;
        if (qww.LJ == 3001 && qww.LIZLLL == 2) {
            LIZ();
        }
    }
}
