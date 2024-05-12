package X;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;

/* renamed from: X.NnB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60401NnB extends C59861NeT {
    public final Bitmap LIZIZ() {
        return super.getDefaultVideoPoster();
    }

    public final View LIZJ() {
        return super.getVideoLoadingProgressView();
    }

    public final boolean LJIIZILJ() {
        return super.onJsTimeout();
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "getDefaultVideoPoster");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            Bitmap defaultVideoPoster = ((AbstractC60402NnC) LIZIZ).getDefaultVideoPoster();
            c60335Nm7.get().LIZ();
            return defaultVideoPoster;
        }
        return super.getDefaultVideoPoster();
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "getVideoLoadingProgressView");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            View videoLoadingProgressView = ((AbstractC60402NnC) LIZIZ).getVideoLoadingProgressView();
            c60335Nm7.get().LIZ();
            return videoLoadingProgressView;
        }
        return super.getVideoLoadingProgressView();
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onGeolocationPermissionsHidePrompt");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onGeolocationPermissionsHidePrompt();
            c60335Nm7.get().LIZ();
            return;
        }
        super.onGeolocationPermissionsHidePrompt();
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onHideCustomView() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onHideCustomView");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onHideCustomView();
            c60335Nm7.get().LIZ();
            return;
        }
        super.onHideCustomView();
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final boolean onJsTimeout() {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onJsTimeout");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean onJsTimeout = ((AbstractC60402NnC) LIZIZ).onJsTimeout();
            c60335Nm7.get().LIZ();
            return onJsTimeout;
        }
        return super.onJsTimeout();
    }

    public final void LJIIJ() {
        super.onGeolocationPermissionsHidePrompt();
    }

    public final void LJIIL() {
        super.onHideCustomView();
    }

    public final void LJ(ValueCallback<String[]> valueCallback) {
        super.getVisitedHistory(valueCallback);
    }

    public final void LJFF(WebView webView) {
        super.onCloseWindow(webView);
    }

    public final boolean LJII(ConsoleMessage consoleMessage) {
        return super.onConsoleMessage(consoleMessage);
    }

    public final void LJIJ(PermissionRequest permissionRequest) {
        super.onPermissionRequest(permissionRequest);
    }

    public final void LJIJI(PermissionRequest permissionRequest) {
        super.onPermissionRequestCanceled(permissionRequest);
    }

    public final void LJJI(WebView webView) {
        super.onRequestFocus(webView);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "getVisitedHistory");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).getVisitedHistory(valueCallback);
            c60335Nm7.get().LIZ();
            return;
        }
        super.getVisitedHistory(valueCallback);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onCloseWindow");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onCloseWindow(webView);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onCloseWindow(webView);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onConsoleMessage");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean onConsoleMessage = ((AbstractC60402NnC) LIZIZ).onConsoleMessage(consoleMessage);
            c60335Nm7.get().LIZ();
            return onConsoleMessage;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (new C03880Dg(2).LIZJ(102604, "com/bytedance/hybrid/web/extension/core/webview/client/WebChromeContainerClient", "onPermissionRequest", this, new Object[]{permissionRequest}, "void", new C65300Pk0(false, "(Landroid/webkit/PermissionRequest;)V", "3294868419383029800")).LIZ) {
            return;
        }
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onPermissionRequest");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onPermissionRequest(permissionRequest);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onPermissionRequest(permissionRequest);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onPermissionRequestCanceled");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onPermissionRequestCanceled(permissionRequest);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onPermissionRequestCanceled(permissionRequest);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onRequestFocus");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onRequestFocus(webView);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onRequestFocus(webView);
    }

    public final void LJIIJJI(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public final void LJIJJ(WebView webView, int i) {
        super.onProgressChanged(webView, i);
    }

    public final void LJIJJLI(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
    }

    public final void LJIL(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
    }

    public final void LJJII(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (new C03880Dg(2).LIZJ(100003, "com/bytedance/hybrid/web/extension/core/webview/client/WebChromeContainerClient", "onGeolocationPermissionsShowPrompt", this, new Object[]{str, callback}, "void", new C65300Pk0(false, "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", "3294868419383029800")).LIZ) {
            return;
        }
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onGeolocationPermissionsShowPrompt");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onGeolocationPermissionsShowPrompt(str, callback);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onProgressChanged");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onProgressChanged(webView, i);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onProgressChanged(webView, i);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onReceivedIcon");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onReceivedIcon(webView, bitmap);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onReceivedTitle");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onReceivedTitle(webView, str);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onShowCustomView");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onShowCustomView(view, customViewCallback);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onShowCustomView(view, customViewCallback);
    }

    public final void LJI(int i, String str, String str2) {
        super.onConsoleMessage(str, i, str2);
    }

    public final void LJJ(WebView webView, String str, boolean z) {
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    public final void LJJIFFI(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, i, customViewCallback);
    }

    public final boolean LJJIII(WebView webView, ValueCallback<android.net.Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onConsoleMessage");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onConsoleMessage(str, i, str2);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onReceivedTouchIconUrl");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onReceivedTouchIconUrl(webView, str, z);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onShowCustomView");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onShowCustomView(view, i, customViewCallback);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onShowCustomView(view, i, customViewCallback);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<android.net.Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onShowFileChooser");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean onShowFileChooser = ((AbstractC60402NnC) LIZIZ).onShowFileChooser(webView, valueCallback, fileChooserParams);
            c60335Nm7.get().LIZ();
            return onShowFileChooser;
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public final boolean LJIIIIZZ(WebView webView, boolean z, boolean z2, Message message) {
        return super.onCreateWindow(webView, z, z2, message);
    }

    public final boolean LJIILIIL(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public final boolean LJIILJJIL(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public final boolean LJIILL(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onCreateWindow");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean onCreateWindow = ((AbstractC60402NnC) LIZIZ).onCreateWindow(webView, z, z2, message);
            c60335Nm7.get().LIZ();
            return onCreateWindow;
        }
        return super.onCreateWindow(webView, z, z2, message);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onJsAlert");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean onJsAlert = ((AbstractC60402NnC) LIZIZ).onJsAlert(webView, str, str2, jsResult);
            c60335Nm7.get().LIZ();
            return onJsAlert;
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onJsBeforeUnload");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean onJsBeforeUnload = ((AbstractC60402NnC) LIZIZ).onJsBeforeUnload(webView, str, str2, jsResult);
            c60335Nm7.get().LIZ();
            return onJsBeforeUnload;
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onJsConfirm");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean onJsConfirm = ((AbstractC60402NnC) LIZIZ).onJsConfirm(webView, str, str2, jsResult);
            c60335Nm7.get().LIZ();
            return onJsConfirm;
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    public final boolean LJIILLIIL(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onJsPrompt");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            boolean onJsPrompt = ((AbstractC60402NnC) LIZIZ).onJsPrompt(webView, str, str2, str3, jsPromptResult);
            c60335Nm7.get().LIZ();
            return onJsPrompt;
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public final void LJIIIZ(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }

    @Override // X.C59861NeT, android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        AbstractC60536NpM LIZIZ = C60627Nqp.LIZIZ(getExtendableContext(), "onExceededDatabaseQuota");
        if (LIZIZ instanceof AbstractC60402NnC) {
            C60335Nm7 c60335Nm7 = C60327Nlz.LIZIZ;
            c60335Nm7.get().LIZIZ();
            ((AbstractC60402NnC) LIZIZ).onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
            c60335Nm7.get().LIZ();
            return;
        }
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }
}
