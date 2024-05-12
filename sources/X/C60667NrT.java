package X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NrT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60667NrT extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C60668NrU c60668NrU;
        C60674Nra c60674Nra;
        if ((webView instanceof WebKitView) && (c60668NrU = C60695Nrv.LIZ) != null && webView != null && (c60674Nra = (C60674Nra) ((HashMap) c60668NrU.LIZLLL).get("pre_create_webview")) != null) {
            List<SoftReference<InterfaceC60761Nsz>> list = c60674Nra.LIZ;
            synchronized (c60668NrU.LIZ) {
                Iterator it = ((ArrayList) list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((SoftReference) it.next()).get() == webView) {
                        it.remove();
                        break;
                    }
                }
            }
            c60668NrU.LIZ(c60674Nra.LIZJ);
        }
        C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
        return true;
    }
}
