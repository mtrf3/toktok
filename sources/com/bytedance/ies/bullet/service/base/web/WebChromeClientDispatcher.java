package com.bytedance.ies.bullet.service.base.web;

import X.C03880Dg;
import X.C59825Ndt;
import X.C65300Pk0;
import X.FCQ;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class WebChromeClientDispatcher extends WebChromeClient {
    public final CopyOnWriteArrayList<C59825Ndt> LIZ = new CopyOnWriteArrayList<>();

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                return it.next().getDefaultVideoPoster();
            } catch (FCQ unused) {
            }
        }
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                return it.next().getVideoLoadingProgressView();
            } catch (FCQ unused) {
            }
        }
        return super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        super.onGeolocationPermissionsHidePrompt();
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onGeolocationPermissionsHidePrompt();
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        super.onHideCustomView();
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHideCustomView();
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (new C03880Dg(2).LIZJ(102604, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDispatcher", "onPermissionRequest", this, new Object[]{permissionRequest}, "void", new C65300Pk0(false, "(Landroid/webkit/PermissionRequest;)V", "1406107316390678948")).LIZ) {
            return;
        }
        super.onPermissionRequest(permissionRequest);
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onPermissionRequest(permissionRequest);
            } catch (FCQ unused) {
            }
        }
    }

    public final void openFileChooser(ValueCallback<Uri> uploadMsg) {
        o.LJIIJ(uploadMsg, "uploadMsg");
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().openFileChooser(uploadMsg);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (new C03880Dg(2).LIZJ(100003, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDispatcher", "onGeolocationPermissionsShowPrompt", this, new Object[]{str, callback}, "void", new C65300Pk0(false, "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", "1406107316390678948")).LIZ) {
            return;
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onGeolocationPermissionsShowPrompt(str, callback);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onProgressChanged(webView, i);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedTitle(webView, str);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onShowCustomView(view, customViewCallback);
            } catch (FCQ unused) {
            }
        }
    }

    public final void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType) {
        o.LJIIJ(uploadMsg, "uploadMsg");
        o.LJIIJ(acceptType, "acceptType");
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().openFileChooser(uploadMsg, acceptType);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        super.onConsoleMessage(str, i, str2);
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onConsoleMessage(str, i, str2);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, i, customViewCallback);
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onShowCustomView(view, i, customViewCallback);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onShowFileChooser(webView, valueCallback, fileChooserParams);
            } catch (FCQ unused) {
            }
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public final void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
        o.LJIIJ(uploadMsg, "uploadMsg");
        o.LJIIJ(acceptType, "acceptType");
        o.LJIIJ(capture, "capture");
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().openFileChooser(uploadMsg, acceptType, capture);
            } catch (FCQ unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsAlert(webView, str, str2, jsResult);
            } catch (FCQ unused) {
            }
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsBeforeUnload(webView, str, str2, jsResult);
            } catch (FCQ unused) {
            }
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsConfirm(webView, str, str2, jsResult);
            } catch (FCQ unused) {
            }
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Iterator<C59825Ndt> it = this.LIZ.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsPrompt(webView, str, str2, str3, jsPromptResult);
            } catch (FCQ unused) {
            }
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }
}
