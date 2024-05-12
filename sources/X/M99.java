package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;

/* loaded from: classes10.dex */
public final class M99 implements InterfaceC58734N3i {
    @Override // X.InterfaceC58734N3i
    public final String LIZ() {
        return "web";
    }

    @Override // X.InterfaceC58734N3i
    public final boolean LIZIZ(int i, String str) {
        QrCodeScanService LJIIJ = QrCodeScanImpl.LJIIJ();
        Context LIZIZ = EF7.LIZIZ();
        if (!TextUtils.isEmpty(str) && (str.startsWith("aweme://webview/") || str.startsWith("aweme://reactnative/"))) {
            SmartRoute buildRoute = SmartRouter.buildRoute(LIZIZ, str);
            buildRoute.withParam("sec_link_scene", "qrcode");
            buildRoute.withParam("need_sec_link", true);
            buildRoute.open();
            return true;
        }
        if (TextUtils.isEmpty(str) || (!str.startsWith("snssdk1180") && !str.startsWith("snssdk1233"))) {
            return false;
        }
        LJIIJ.LJII(LIZIZ, str);
        return true;
    }
}
