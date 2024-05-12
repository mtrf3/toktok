package X;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* renamed from: X.Nt8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC60770Nt8 {
    void LIZ(int i);

    void LIZIZ(C59222NMc c59222NMc);

    C59227NMh LIZJ(WebKitView webKitView);

    void LIZLLL(InterfaceC39904FlM interfaceC39904FlM);

    void LJ(InterfaceC59221NMb interfaceC59221NMb);

    java.util.Map<String, String> LJFF(WebView webView, String str, java.util.Map<String, String> map);

    void LJI(C59222NMc c59222NMc);

    void LJII(WebView webView);

    void LJIIIIZZ(Long l, String str);

    void LJIIIZ(String str);

    void LJIIJ(WebView webView, MotionEvent motionEvent);

    void LJIIJJI(long j, String str);

    void LJIIL(View.OnTouchListener onTouchListener);

    void LJIILIIL(String str);

    void LJIILJJIL(WebBackForwardList webBackForwardList, WebView webView, String str);

    void LJIILL(WebView webView, boolean z, boolean z2);

    void LJIILLIIL(InterfaceC59494NWo interfaceC59494NWo, NUM num);

    void LJIIZILJ(NJZ njz);

    void canGoBack();

    void canGoForward();

    NUJ getWebViewClient();

    void goBack();

    void goForward();

    void loadUrl(String str);

    void onDestroy();

    void onResume();

    void onScrollChanged(int i, int i2, int i3, int i4);
}
