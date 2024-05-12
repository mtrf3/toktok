package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class NVY extends C59458NVe {
    public final /* synthetic */ C59458NVe LIZIZ;

    @Override // X.NVZ
    public final void LIZJ() {
    }

    public NVY(C59458NVe c59458NVe) {
        this.LIZIZ = c59458NVe;
    }

    @Override // X.C59458NVe
    public final void LJFF(NUX webKitContainerApi) {
        o.LJIIIZ(webKitContainerApi, "webKitContainerApi");
        this.LIZ = webKitContainerApi;
        C59458NVe c59458NVe = this.LIZIZ;
        if (c59458NVe != null) {
            c59458NVe.LJFF(webKitContainerApi);
        }
    }

    @Override // X.NVZ
    public final WebResourceResponse LIZLLL(WebView webView, C59151NJj c59151NJj) {
        C59458NVe c59458NVe = this.LIZIZ;
        if (c59458NVe != null) {
            try {
                return c59458NVe.LIZLLL(webView, c59151NJj);
            } catch (FCQ unused) {
            }
        }
        super.LIZLLL(webView, c59151NJj);
        throw null;
    }

    @Override // X.NVZ
    public final boolean LJ(WebView webView, C59151NJj c59151NJj) {
        C59458NVe c59458NVe = this.LIZIZ;
        if (c59458NVe != null) {
            try {
                return c59458NVe.LJ(webView, c59151NJj);
            } catch (FCQ unused) {
            }
        }
        super.LJ(webView, c59151NJj);
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        FX8.LIZIZ(str);
        C59458NVe c59458NVe = this.LIZIZ;
        if (c59458NVe != null) {
            c59458NVe.onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C59458NVe c59458NVe = this.LIZIZ;
        if (c59458NVe != null) {
            c59458NVe.onPageFinished(webView, str);
        }
    }

    @Override // X.NVZ, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C59458NVe c59458NVe = this.LIZIZ;
        if (c59458NVe != null) {
            try {
                return c59458NVe.shouldInterceptRequest(webView, str);
            } catch (FCQ unused) {
            }
        }
        super.shouldInterceptRequest(webView, str);
        throw null;
    }

    @Override // X.NVZ, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        String str3;
        Context context;
        WebView view;
        String str4;
        Context context2;
        WebView view2;
        WebView view3;
        C38182Eyg c0;
        C59458NVe c59458NVe = this.LIZIZ;
        if (c59458NVe != null) {
            try {
                return c59458NVe.shouldOverrideUrlLoading(webView, str);
            } catch (FCQ unused) {
            }
        }
        Context context3 = null;
        if (str != null) {
            String scheme = UriProtector.parse(str).getScheme();
            if (scheme != null) {
                str2 = AnonymousClass028.LIZJ("getDefault()", scheme, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            if (!o.LJ("http", str2) && !o.LJ("https", str2)) {
                NUX nux = this.LIZ;
                FX8.LIZIZ(str);
                if (nux != null && (c0 = nux.c0()) != null && c0.LIZIZ(str)) {
                    return true;
                }
                if (o.LJ("sslocal", str2) || o.LJ("localsdk", str2)) {
                    str = FX2.LIZLLL(str);
                    o.LJIIIIZZ(str, "tryConvertScheme(rawUrl)");
                }
                try {
                    android.net.Uri parse = UriProtector.parse(str);
                    String queryParameter = UriProtector.getQueryParameter(parse, "url");
                    if (queryParameter != null) {
                        str4 = C38956FQq.LIZ(queryParameter);
                    } else {
                        str4 = null;
                    }
                    String valueOf = String.valueOf(C38956FQq.LJFF(parse, str4));
                    NUX nux2 = this.LIZ;
                    if (nux2 != null && (view3 = nux2.getView()) != null) {
                        context2 = view3.getContext();
                    } else {
                        context2 = null;
                    }
                    if (!FX2.LIZIZ(context2, valueOf, null) && o.LJ("intent", str2)) {
                        NUX nux3 = this.LIZ;
                        if (nux3 != null && (view2 = nux3.getView()) != null) {
                            context3 = view2.getContext();
                        }
                        FX2.LIZJ(context3, valueOf);
                    }
                } catch (Exception unused2) {
                }
                return true;
            }
            String host = UriProtector.parse(str).getHost();
            if (host != null) {
                str3 = host.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(str3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            } else {
                str3 = null;
            }
            List LJLJJL = s.LJLJJL("m.tngdigital.com.my", new String[]{","}, 0, 6);
            if ((o.LJ("http", str2) || o.LJ("https", str2)) && ORZ.LJLJJI(str3, LJLJJL)) {
                NUX nux4 = this.LIZ;
                if (nux4 != null && (view = nux4.getView()) != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
                if (FX2.LIZJ(context, str)) {
                    return true;
                }
            }
        }
        super.shouldOverrideUrlLoading(webView, str);
        throw null;
    }

    @Override // X.NVZ
    public final void LIZ(WebView webView, C59151NJj c59151NJj, NUZ nuz) {
        C59458NVe c59458NVe = this.LIZIZ;
        if (c59458NVe != null) {
            c59458NVe.LIZ(webView, c59151NJj, nuz);
        }
    }

    @Override // X.NVZ
    public final void LIZIZ(WebView webView, C59151NJj c59151NJj, WebResourceResponse webResourceResponse) {
        C59458NVe c59458NVe = this.LIZIZ;
        if (c59458NVe != null) {
            c59458NVe.LIZIZ(webView, c59151NJj, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C59458NVe c59458NVe = this.LIZIZ;
        if (c59458NVe != null) {
            c59458NVe.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C59458NVe c59458NVe = this.LIZIZ;
        if (c59458NVe != null) {
            c59458NVe.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C59458NVe c59458NVe = this.LIZIZ;
        if (c59458NVe != null) {
            c59458NVe.onReceivedError(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        C59458NVe c59458NVe = this.LIZIZ;
        if (c59458NVe != null) {
            c59458NVe.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }
}
