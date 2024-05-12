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

/* renamed from: X.NnC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC60402NnC extends AbstractC60536NpM<C60401NnB> {
    public Bitmap getDefaultVideoPoster() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "getDefaultVideoPoster");
        if (LIZ instanceof AbstractC60402NnC) {
            return ((AbstractC60402NnC) LIZ).getDefaultVideoPoster();
        }
        return getExtendable().LIZIZ();
    }

    public View getVideoLoadingProgressView() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "getVideoLoadingProgressView");
        if (LIZ instanceof AbstractC60402NnC) {
            return ((AbstractC60402NnC) LIZ).getVideoLoadingProgressView();
        }
        return getExtendable().LIZJ();
    }

    public void onGeolocationPermissionsHidePrompt() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onGeolocationPermissionsHidePrompt");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onGeolocationPermissionsHidePrompt();
        } else {
            getExtendable().LJIIJ();
        }
    }

    public void onHideCustomView() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onHideCustomView");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onHideCustomView();
        } else {
            getExtendable().LJIIL();
        }
    }

    public boolean onJsTimeout() {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onJsTimeout");
        if (LIZ instanceof AbstractC60402NnC) {
            return ((AbstractC60402NnC) LIZ).onJsTimeout();
        }
        return getExtendable().LJIIZILJ();
    }

    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "getVisitedHistory");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).getVisitedHistory(valueCallback);
        } else {
            getExtendable().LJ(valueCallback);
        }
    }

    public void onCloseWindow(WebView webView) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onCloseWindow");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onCloseWindow(webView);
        } else {
            getExtendable().LJFF(webView);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onConsoleMessage");
        if (LIZ instanceof AbstractC60402NnC) {
            return ((AbstractC60402NnC) LIZ).onConsoleMessage(consoleMessage);
        }
        return getExtendable().LJII(consoleMessage);
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onPermissionRequest");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onPermissionRequest(permissionRequest);
        } else {
            getExtendable().LJIJ(permissionRequest);
        }
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onPermissionRequestCanceled");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onPermissionRequestCanceled(permissionRequest);
        } else {
            getExtendable().LJIJI(permissionRequest);
        }
    }

    public void onRequestFocus(WebView webView) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onRequestFocus");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onRequestFocus(webView);
        } else {
            getExtendable().LJJI(webView);
        }
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onGeolocationPermissionsShowPrompt");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onGeolocationPermissionsShowPrompt(str, callback);
        } else {
            getExtendable().LJIIJJI(str, callback);
        }
    }

    public void onProgressChanged(WebView webView, int i) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onProgressChanged");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onProgressChanged(webView, i);
        } else {
            getExtendable().LJIJJ(webView, i);
        }
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onReceivedIcon");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onReceivedIcon(webView, bitmap);
        } else {
            getExtendable().LJIJJLI(webView, bitmap);
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onReceivedTitle");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onReceivedTitle(webView, str);
        } else {
            getExtendable().LJIL(webView, str);
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onShowCustomView");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onShowCustomView(view, customViewCallback);
        } else {
            getExtendable().LJJII(view, customViewCallback);
        }
    }

    public void onConsoleMessage(String str, int i, String str2) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onConsoleMessage");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onConsoleMessage(str, i, str2);
        } else {
            getExtendable().LJI(i, str, str2);
        }
    }

    public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onReachedMaxAppCacheSize");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onReachedMaxAppCacheSize(j, j2, quotaUpdater);
        } else {
            getExtendable().LIZ(j, j2, quotaUpdater);
        }
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onReceivedTouchIconUrl");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onReceivedTouchIconUrl(webView, str, z);
        } else {
            getExtendable().LJJ(webView, str, z);
        }
    }

    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onShowCustomView");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onShowCustomView(view, i, customViewCallback);
        } else {
            getExtendable().LJJIFFI(view, i, customViewCallback);
        }
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<android.net.Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onShowFileChooser");
        if (LIZ instanceof AbstractC60402NnC) {
            return ((AbstractC60402NnC) LIZ).onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        return getExtendable().LJJIII(webView, valueCallback, fileChooserParams);
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onCreateWindow");
        if (LIZ instanceof AbstractC60402NnC) {
            return ((AbstractC60402NnC) LIZ).onCreateWindow(webView, z, z2, message);
        }
        return getExtendable().LJIIIIZZ(webView, z, z2, message);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onJsAlert");
        if (LIZ instanceof AbstractC60402NnC) {
            return ((AbstractC60402NnC) LIZ).onJsAlert(webView, str, str2, jsResult);
        }
        return getExtendable().LJIILIIL(webView, str, str2, jsResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onJsBeforeUnload");
        if (LIZ instanceof AbstractC60402NnC) {
            return ((AbstractC60402NnC) LIZ).onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return getExtendable().LJIILJJIL(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onJsConfirm");
        if (LIZ instanceof AbstractC60402NnC) {
            return ((AbstractC60402NnC) LIZ).onJsConfirm(webView, str, str2, jsResult);
        }
        return getExtendable().LJIILL(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onJsPrompt");
        if (LIZ instanceof AbstractC60402NnC) {
            return ((AbstractC60402NnC) LIZ).onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return getExtendable().LJIILLIIL(webView, str, str2, str3, jsPromptResult);
    }

    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        AbstractC60536NpM LIZ = C60627Nqp.LIZ(getExtendableContext(), this, "onExceededDatabaseQuota");
        if (LIZ instanceof AbstractC60402NnC) {
            ((AbstractC60402NnC) LIZ).onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        } else {
            getExtendable().LJIIIZ(str, str2, j, j2, j3, quotaUpdater);
        }
    }
}
