package X;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.Ndt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59825Ndt extends WebChromeClient {
    public void onPermissionRequest(InterfaceC59829Ndx interfaceC59829Ndx) {
        new C03880Dg(2).LIZJ(102604, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDelegate", "onPermissionRequest", this, new Object[]{interfaceC59829Ndx}, "void", new C65300Pk0(false, "(Lcom/bytedance/ies/bullet/service/base/web/IPermissionRequest;)V", "-8079784756846088254"));
    }

    public void openFileChooser(ValueCallback<android.net.Uri> uploadMsg) {
        o.LJIIJ(uploadMsg, "uploadMsg");
    }

    public void openFileChooser(ValueCallback<android.net.Uri> uploadMsg, String acceptType) {
        o.LJIIJ(uploadMsg, "uploadMsg");
        o.LJIIJ(acceptType, "acceptType");
    }

    public void openFileChooser(ValueCallback<android.net.Uri> uploadMsg, String acceptType, String capture) {
        o.LJIIJ(uploadMsg, "uploadMsg");
        o.LJIIJ(acceptType, "acceptType");
        o.LJIIJ(capture, "capture");
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        throw new FCQ("An operation is not implemented");
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        throw new FCQ("An operation is not implemented");
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        C79043V0l c79043V0l;
        if (new C03880Dg(2).LIZJ(102604, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDelegate", "onPermissionRequest", this, new Object[]{permissionRequest}, "void", new C65300Pk0(false, "(Landroid/webkit/PermissionRequest;)V", "-8079784756846088254")).LIZ) {
            return;
        }
        if (permissionRequest != null) {
            c79043V0l = new C79043V0l();
        } else {
            c79043V0l = null;
        }
        onPermissionRequest(c79043V0l);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<android.net.Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        C59828Ndw c59828Ndw;
        if (fileChooserParams != null) {
            c59828Ndw = new C59828Ndw(fileChooserParams);
        } else {
            c59828Ndw = null;
        }
        return onShowFileChooser(webView, valueCallback, c59828Ndw);
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<android.net.Uri[]> valueCallback, InterfaceC59822Ndq interfaceC59822Ndq) {
        throw new FCQ("An operation is not implemented");
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        throw new FCQ("An operation is not implemented");
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        throw new FCQ("An operation is not implemented");
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        throw new FCQ("An operation is not implemented");
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        throw new FCQ("An operation is not implemented");
    }
}
