package X;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: X.a1O, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91858a1O extends WebChromeClient {
    public final /* synthetic */ InterfaceC35811ar<Integer> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C91858a1O(InterfaceC35811ar<Integer> interfaceC35811ar, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC35811ar;
        this.LIZIZ = interfaceC88472Yns;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        this.LIZ.setValue(Integer.valueOf(i));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        if (str == null || new OJD("^http.*").matches(str) || new OJD(".*/+.*[?]*.*").matches(str) || str == null) {
            str = C92054a4Y.LIZ("pipo_common_waiting_while_loading_short", new String[0]);
        }
        interfaceC88472Yns.invoke(str);
    }
}
