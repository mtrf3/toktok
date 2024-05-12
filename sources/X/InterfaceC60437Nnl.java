package X;

import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: X.Nnl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC60437Nnl {
    void LIZJ(WebView webView, int i);

    void LIZLLL(WebView webView, String str);

    void LJ(PermissionRequest permissionRequest);

    void LJFF(String str);

    boolean LJI(WebView webView, ValueCallback<android.net.Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams);
}
