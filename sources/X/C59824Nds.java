package X;

import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.Nds, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59824Nds extends C59827Ndv {
    public final /* synthetic */ C59827Ndv LJLIL;

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            try {
                c59827Ndv.onGeolocationPermissionsHidePrompt();
                return;
            } catch (FCQ unused) {
            }
        }
        super.onGeolocationPermissionsHidePrompt();
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            c59827Ndv.onHideCustomView();
        }
    }

    public C59824Nds(C59827Ndv c59827Ndv) {
        this.LJLIL = c59827Ndv;
    }

    @Override // X.C59825Ndt
    public final void onPermissionRequest(InterfaceC59829Ndx interfaceC59829Ndx) {
        if (new C03880Dg(2).LIZJ(102604, "com/ss/android/ugc/aweme/bullet/module/default/DefaultWebKitDelegatesProvider$createWebChromeClientDelegate$1", "onPermissionRequest", this, new Object[]{interfaceC59829Ndx}, "void", new C65300Pk0(false, "(Lcom/bytedance/ies/bullet/service/base/web/IPermissionRequest;)V", "-1948000637564742169")).LIZ) {
            return;
        }
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            try {
                c59827Ndv.onPermissionRequest(interfaceC59829Ndx);
                return;
            } catch (FCQ unused) {
            }
        }
        super.onPermissionRequest(interfaceC59829Ndx);
    }

    @Override // X.C59825Ndt
    public final void openFileChooser(ValueCallback<android.net.Uri> uploadMsg) {
        o.LJIIIZ(uploadMsg, "uploadMsg");
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            try {
                c59827Ndv.openFileChooser(uploadMsg);
                return;
            } catch (FCQ unused) {
            }
        }
        super.openFileChooser(uploadMsg);
    }

    @Override // X.C59827Ndv
    public final void setContainerApi(NUX webKitContainerApi) {
        o.LJIIIZ(webKitContainerApi, "webKitContainerApi");
        super.setContainerApi(webKitContainerApi);
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            c59827Ndv.setContainerApi(webKitContainerApi);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (new C03880Dg(2).LIZJ(100003, "com/ss/android/ugc/aweme/bullet/module/default/DefaultWebKitDelegatesProvider$createWebChromeClientDelegate$1", "onGeolocationPermissionsShowPrompt", this, new Object[]{str, callback}, "void", new C65300Pk0(false, "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", "-1948000637564742169")).LIZ) {
            return;
        }
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            try {
                c59827Ndv.onGeolocationPermissionsShowPrompt(str, callback);
                return;
            } catch (FCQ unused) {
            }
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            try {
                c59827Ndv.onProgressChanged(webView, i);
                return;
            } catch (FCQ unused) {
            }
        }
        super.onProgressChanged(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            c59827Ndv.onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            c59827Ndv.onShowCustomView(view, customViewCallback);
        }
    }

    @Override // X.C59825Ndt
    public final void openFileChooser(ValueCallback<android.net.Uri> uploadMsg, String acceptType) {
        o.LJIIIZ(uploadMsg, "uploadMsg");
        o.LJIIIZ(acceptType, "acceptType");
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            try {
                c59827Ndv.openFileChooser(uploadMsg, acceptType);
                return;
            } catch (FCQ unused) {
            }
        }
        super.openFileChooser(uploadMsg, acceptType);
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            try {
                c59827Ndv.onConsoleMessage(str, i, str2);
                return;
            } catch (FCQ unused) {
            }
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            try {
                c59827Ndv.onShowCustomView(view, i, customViewCallback);
                return;
            } catch (FCQ unused) {
            }
        }
        super.onShowCustomView(view, i, customViewCallback);
    }

    @Override // X.C59825Ndt
    public final boolean onShowFileChooser(WebView webView, ValueCallback<android.net.Uri[]> valueCallback, InterfaceC59822Ndq interfaceC59822Ndq) {
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            try {
                return c59827Ndv.onShowFileChooser(webView, valueCallback, interfaceC59822Ndq);
            } catch (FCQ unused) {
            }
        }
        return super.onShowFileChooser(webView, valueCallback, interfaceC59822Ndq);
    }

    @Override // X.C59825Ndt
    public final void openFileChooser(ValueCallback<android.net.Uri> uploadMsg, String acceptType, String capture) {
        o.LJIIIZ(uploadMsg, "uploadMsg");
        o.LJIIIZ(acceptType, "acceptType");
        o.LJIIIZ(capture, "capture");
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            try {
                c59827Ndv.openFileChooser(uploadMsg, acceptType, capture);
                return;
            } catch (FCQ unused) {
            }
        }
        super.openFileChooser(uploadMsg, acceptType, capture);
    }

    @Override // X.C59825Ndt, android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            try {
                return c59827Ndv.onJsBeforeUnload(webView, str, str2, jsResult);
            } catch (FCQ unused) {
            }
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // X.C59825Ndt, android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            try {
                return c59827Ndv.onJsConfirm(webView, str, str2, jsResult);
            } catch (FCQ unused) {
            }
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // X.C59825Ndt, android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        C59827Ndv c59827Ndv = this.LJLIL;
        if (c59827Ndv != null) {
            try {
                return c59827Ndv.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            } catch (FCQ unused) {
            }
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }
}
