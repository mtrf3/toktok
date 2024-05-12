package X;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.NeW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59864NeW extends C59827Ndv {
    public final /* synthetic */ C60238NkY LJLIL;

    @Override // X.C59825Ndt, android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        if (o.LJ(this.LJLIL.LJIL().LJJJJLI.getValue(), Boolean.TRUE)) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        super.onHideCustomView();
        InterfaceC59865NeX interfaceC59865NeX = (InterfaceC59865NeX) this.LJLIL.LLILLIZIL.getValue();
        if (interfaceC59865NeX != null) {
            interfaceC59865NeX.LLLLLIL();
        }
    }

    public C59864NeW(C60238NkY c60238NkY) {
        this.LJLIL = c60238NkY;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        if ((!o.LJ(this.LJLIL.LJIL().LJJJJIZL.getValue(), Boolean.FALSE)) && str != null) {
            C60238NkY c60238NkY = this.LJLIL;
            StringBuilder LIZIZ = C25620zW.LIZIZ("onReceivedTitle [", str, "] useWebTitle ");
            LIZIZ.append(this.LJLIL.LJIL().LJJJJIZL.getValue());
            C39973FmT.LIZIZ(c60238NkY, X1D.LIZIZ(LIZIZ), null, null, 6);
            InterfaceC59899Nf5 interfaceC59899Nf5 = (InterfaceC59899Nf5) this.LJLIL.LLF.LIZJ(InterfaceC59899Nf5.class);
            if (interfaceC59899Nf5 != null) {
                interfaceC59899Nf5.setDefaultTitle(str);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        InterfaceC59865NeX interfaceC59865NeX;
        super.onShowCustomView(view, customViewCallback);
        if (view != null && (interfaceC59865NeX = (InterfaceC59865NeX) this.LJLIL.LLILLIZIL.getValue()) != null) {
            interfaceC59865NeX.enterFullScreen(view);
        }
    }
}
