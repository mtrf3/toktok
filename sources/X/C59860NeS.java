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
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.NeS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59860NeS extends WebChromeClient implements Cloneable {
    public static final AtomicInteger LJLJJI = new AtomicInteger(0);
    public static final List<C59860NeS>[] LJLJJL = new List[10];
    public static final WeakHashMap<WebChromeClient, java.util.Map<Integer, WeakReference<C59860NeS>>> LJLJJLL = new WeakHashMap<>();
    public static final WebChromeClient LJLJL = new WebChromeClient();
    public WebChromeClient LJLJI = LJLJL;
    public int LJLILLLLZI = LJLJJI.getAndIncrement();
    public final int LJLIL = -1;

    public final Object clone() {
        try {
            C59860NeS c59860NeS = (C59860NeS) super.clone();
            c59860NeS.LJLILLLLZI = this.LJLILLLLZI;
            return c59860NeS;
        } catch (Exception unused) {
            throw new RuntimeException("WebChromeClientExt clone error");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.getDefaultVideoPoster();
        }
        return this.LJLJI.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.getVideoLoadingProgressView();
        }
        return this.LJLJI.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onGeolocationPermissionsHidePrompt();
        } else {
            this.LJLJI.onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onHideCustomView();
        } else {
            this.LJLJI.onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsTimeout() {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.onJsTimeout();
        }
        return this.LJLJI.onJsTimeout();
    }

    public static C59860NeS LIZIZ(C59860NeS c59860NeS) {
        boolean z;
        int i = c59860NeS.LJLIL;
        if (i < 0) {
            i = 2;
            z = true;
        } else {
            z = false;
        }
        while (true) {
            List<C59860NeS>[] listArr = LJLJJL;
            if (i < listArr.length) {
                List<C59860NeS> list = listArr[i];
                if (list != null) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C59860NeS c59860NeS2 = (C59860NeS) ListProtector.get(list, i2);
                        if (c59860NeS2 != null) {
                            if (z) {
                                return LIZ(c59860NeS2, c59860NeS);
                            }
                            if (c59860NeS2.LJLILLLLZI != c59860NeS.LJLILLLLZI) {
                                continue;
                            } else {
                                int i3 = i2 + 1;
                                if (i3 < list.size()) {
                                    C59860NeS c59860NeS3 = (C59860NeS) ListProtector.get(list, i3);
                                    if (c59860NeS3 != null) {
                                        return LIZ(c59860NeS3, c59860NeS);
                                    }
                                } else {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                i++;
            } else {
                return null;
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.getVisitedHistory(valueCallback);
        } else {
            this.LJLJI.getVisitedHistory(valueCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onCloseWindow(webView);
        } else {
            this.LJLJI.onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.onConsoleMessage(consoleMessage);
        }
        return this.LJLJI.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (new C03880Dg(2).LIZJ(102604, "com/bytedance/lynx/hybrid/webkit/WebChromeClientExt", "onPermissionRequest", this, new Object[]{permissionRequest}, "void", new C65300Pk0(false, "(Landroid/webkit/PermissionRequest;)V", "1151480298672666632")).LIZ) {
            return;
        }
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onPermissionRequest(permissionRequest);
        } else {
            this.LJLJI.onPermissionRequest(permissionRequest);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onPermissionRequestCanceled(permissionRequest);
        } else {
            this.LJLJI.onPermissionRequestCanceled(permissionRequest);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onRequestFocus(webView);
        } else {
            this.LJLJI.onRequestFocus(webView);
        }
    }

    public static C59860NeS LIZ(C59860NeS c59860NeS, C59860NeS c59860NeS2) {
        C59860NeS c59860NeS3;
        WeakHashMap<WebChromeClient, java.util.Map<Integer, WeakReference<C59860NeS>>> weakHashMap = LJLJJLL;
        java.util.Map<Integer, WeakReference<C59860NeS>> map = weakHashMap.get(c59860NeS2.LJLJI);
        if (map == null) {
            map = new HashMap<>();
            weakHashMap.put(c59860NeS2.LJLJI, map);
        }
        WeakReference<C59860NeS> weakReference = map.get(Integer.valueOf(c59860NeS.LJLILLLLZI));
        if (weakReference == null || (c59860NeS3 = weakReference.get()) == null) {
            try {
                c59860NeS3 = (C59860NeS) super.clone();
                c59860NeS3.LJLILLLLZI = c59860NeS.LJLILLLLZI;
                WebChromeClient webChromeClient = c59860NeS2.LJLJI;
                if (webChromeClient == null) {
                    c59860NeS3.LJLJI = LJLJL;
                } else {
                    c59860NeS3.LJLJI = webChromeClient;
                }
                map.put(Integer.valueOf(c59860NeS.LJLILLLLZI), new WeakReference<>(c59860NeS3));
            } catch (Exception unused) {
                throw new RuntimeException("WebChromeClientExt clone error");
            }
        }
        return c59860NeS3;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (new C03880Dg(2).LIZJ(100003, "com/bytedance/lynx/hybrid/webkit/WebChromeClientExt", "onGeolocationPermissionsShowPrompt", this, new Object[]{str, callback}, "void", new C65300Pk0(false, "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", "1151480298672666632")).LIZ) {
            return;
        }
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onGeolocationPermissionsShowPrompt(str, callback);
        } else {
            this.LJLJI.onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onProgressChanged(webView, i);
        } else {
            this.LJLJI.onProgressChanged(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onReceivedIcon(webView, bitmap);
        } else {
            this.LJLJI.onReceivedIcon(webView, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onReceivedTitle(webView, str);
        } else {
            this.LJLJI.onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onShowCustomView(view, customViewCallback);
        } else {
            this.LJLJI.onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onConsoleMessage(str, i, str2);
        } else {
            this.LJLJI.onConsoleMessage(str, i, str2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onReceivedTouchIconUrl(webView, str, z);
        } else {
            this.LJLJI.onReceivedTouchIconUrl(webView, str, z);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onShowCustomView(view, i, customViewCallback);
        } else {
            this.LJLJI.onShowCustomView(view, i, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<android.net.Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        return this.LJLJI.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.onCreateWindow(webView, z, z2, message);
        }
        return this.LJLJI.onCreateWindow(webView, z, z2, message);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.onJsAlert(webView, str, str2, jsResult);
        }
        return this.LJLJI.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return this.LJLJI.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.onJsConfirm(webView, str, str2, jsResult);
        }
        return this.LJLJI.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            return LIZIZ.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return this.LJLJI.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        C59860NeS LIZIZ = LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        } else {
            this.LJLJI.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        }
    }
}
