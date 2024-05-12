package X;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import kotlin.jvm.internal.o;

/* renamed from: X.VMo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79618VMo extends WebViewRenderProcessClient {
    public final /* synthetic */ VMR LIZ;
    public final /* synthetic */ WebViewRenderProcessClient LIZIZ;

    public C79618VMo(VMR vmr, WebViewRenderProcessClient webViewRenderProcessClient) {
        this.LIZ = vmr;
        this.LIZIZ = webViewRenderProcessClient;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public final void onRenderProcessResponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        o.LJIIJ(view, "view");
        WebViewRenderProcessClient webViewRenderProcessClient = this.LIZIZ;
        if (webViewRenderProcessClient != null) {
            webViewRenderProcessClient.onRenderProcessResponsive(view, webViewRenderProcess);
        }
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public final void onRenderProcessUnresponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        o.LJIIJ(view, "view");
        WebViewRenderProcessClient webViewRenderProcessClient = this.LIZIZ;
        if (webViewRenderProcessClient != null) {
            webViewRenderProcessClient.onRenderProcessUnresponsive(view, webViewRenderProcess);
        }
        VMR vmr = this.LIZ;
        if (!vmr.LIZJ) {
            InterfaceC79625VMv interfaceC79625VMv = vmr.LJIIIIZZ;
            if (interfaceC79625VMv != null) {
                interfaceC79625VMv.LIZIZ();
            }
            this.LIZ.LIZJ = true;
        }
    }
}
