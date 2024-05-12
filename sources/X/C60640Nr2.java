package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStructure;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;

/* renamed from: X.Nr2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60640Nr2 extends WebView implements InterfaceC60638Nr0, InterfaceC60409NnJ, InterfaceC37737ErV {
    public C60625Nqn LJLIL;
    public final V8Q LJLILLLLZI;
    public C60422NnW LJLJI;
    public C60401NnB LJLJJI;

    @Override // X.InterfaceC60638Nr0
    public C60624Nqm getExtendableContext() {
        V8Q v8q = this.LJLILLLLZI;
        if (v8q == null) {
            return null;
        }
        return (C60624Nqm) v8q.LJLIL;
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        if (this.LJLIL == null) {
            return super.getWebChromeClient();
        }
        return this.LJLJJI;
    }

    public WebChromeClient getWebChromeClientCompat() {
        return this.LJLJJI.LJLJI;
    }

    @Override // android.webkit.WebView
    public WebViewClient getWebViewClient() {
        if (this.LJLIL == null) {
            return super.getWebViewClient();
        }
        return this.LJLJI;
    }

    public WebViewClient getWebViewClientCompat() {
        return this.LJLJI.LJLJI;
    }

    @Override // android.webkit.WebView
    public WebMessagePort[] createWebMessageChannel() {
        return super.createWebMessageChannel();
    }

    @Override // android.webkit.WebView
    public WebViewRenderProcess getWebViewRenderProcess() {
        return super.getWebViewRenderProcess();
    }

    @Override // android.webkit.WebView
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        return super.getWebViewRenderProcessClient();
    }

    public C60401NnB getExtendableWebChromeClient() {
        return this.LJLJJI;
    }

    public C60422NnW getExtendableWebViewClient() {
        return this.LJLJI;
    }

    public C60640Nr2(Context context) {
        super(context);
        this.LJLILLLLZI = new V8Q();
    }

    @Override // X.InterfaceC60638Nr0
    public final void LIZLLL(C60625Nqn c60625Nqn) {
        C60625Nqn.LIZJ();
        this.LJLIL = c60625Nqn;
        this.LJLILLLLZI.LJLIL = new C60624Nqm(this.LJLIL, this);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onProvideVirtualStructure(ViewStructure viewStructure) {
        super.onProvideVirtualStructure(viewStructure);
    }

    public void setExtendableWebViewClient(C60401NnB c60401NnB) {
        this.LJLJJI = c60401NnB;
        super.setWebChromeClient(c60401NnB);
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (this.LJLIL == null) {
            super.setWebChromeClient(webChromeClient);
        } else {
            this.LJLJJI.LJLJI = webChromeClient;
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        if (this.LJLIL == null) {
            super.setWebViewClient(webViewClient);
        } else {
            this.LJLJI.LJLJI = webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(webViewRenderProcessClient);
    }

    @Override // android.webkit.WebView
    public void zoomBy(float f) {
        super.zoomBy(f);
    }

    public void setExtendableWebViewClient(C60422NnW c60422NnW) {
        this.LJLJI = c60422NnW;
        super.setWebViewClient(c60422NnW);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
    }

    @Override // android.webkit.WebView
    public void postWebMessage(WebMessage webMessage, android.net.Uri uri) {
        super.postWebMessage(webMessage, uri);
    }

    @Override // android.webkit.WebView
    public void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        super.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
    }

    public C60640Nr2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLILLLLZI = new V8Q();
    }
}
