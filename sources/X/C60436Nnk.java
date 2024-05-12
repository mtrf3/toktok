package X;

import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.Nnk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60436Nnk extends AbstractC60402NnC {
    public final /* synthetic */ C60438Nnm LJLIL;
    public final /* synthetic */ InterfaceC60437Nnl LJLILLLLZI;

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr<?> getExtension() {
        return this.LJLIL;
    }

    @Override // X.AbstractC60402NnC
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        InterfaceC60437Nnl interfaceC60437Nnl = this.LJLILLLLZI;
        if (interfaceC60437Nnl != null) {
            interfaceC60437Nnl.LJ(permissionRequest);
        }
    }

    public C60436Nnk(C60438Nnm c60438Nnm, InterfaceC60437Nnl interfaceC60437Nnl) {
        this.LJLIL = c60438Nnm;
        this.LJLILLLLZI = interfaceC60437Nnl;
    }

    @Override // X.AbstractC60402NnC
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        InterfaceC60437Nnl interfaceC60437Nnl = this.LJLILLLLZI;
        if (interfaceC60437Nnl != null) {
            interfaceC60437Nnl.LIZJ(webView, i);
        }
    }

    @Override // X.AbstractC60402NnC
    public final void onReceivedTitle(WebView webView, String str) {
        InterfaceC60437Nnl interfaceC60437Nnl = this.LJLILLLLZI;
        if (interfaceC60437Nnl != null) {
            interfaceC60437Nnl.LIZLLL(webView, str);
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // X.AbstractC60402NnC
    public final void onConsoleMessage(String str, int i, String str2) {
        super.onConsoleMessage(str, i, str2);
        InterfaceC60437Nnl interfaceC60437Nnl = this.LJLILLLLZI;
        if (interfaceC60437Nnl != null) {
            interfaceC60437Nnl.LJFF(str);
        }
    }

    @Override // X.AbstractC60402NnC
    public final boolean onShowFileChooser(WebView webView, ValueCallback<android.net.Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Boolean bool;
        InterfaceC60437Nnl interfaceC60437Nnl = this.LJLILLLLZI;
        if (interfaceC60437Nnl != null) {
            bool = Boolean.valueOf(interfaceC60437Nnl.LJI(webView, valueCallback, fileChooserParams));
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            return true;
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }
}
