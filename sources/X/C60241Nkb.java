package X;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.i0;
import java.io.File;
import java.io.FileInputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.Nkb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60241Nkb extends C59458NVe {
    public boolean LIZIZ;
    public final /* synthetic */ C60238NkY LIZJ;
    public final /* synthetic */ C60213Nk9 LIZLLL;
    public final /* synthetic */ InterfaceC37901Eu9 LJ;

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        C38049EwX c38049EwX;
        super.onLoadResource(webView, str);
        C38182Eyg c38182Eyg = this.LIZJ.LLILII;
        if (c38182Eyg != null && (c38049EwX = c38182Eyg.LJIIJJI) != null) {
            c38049EwX.LIZIZ(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        long j;
        Long l;
        android.net.Uri parse;
        String str2;
        super.onPageFinished(webView, str);
        C39973FmT.LIZIZ(this.LIZJ, i0.LJFF("onPageFinished on url:", str), null, null, 6);
        this.LIZJ.LJIJI();
        if (webView != null && (str2 = this.LIZJ.LLD.LJLIL) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("javascript:(function () {    window.reactId = '");
            LIZ.append(str2);
            LIZ.append("';");
            LIZ.append("})();");
            C16880lQ.LLZZ(webView, X1D.LIZIZ(LIZ));
        }
        if (!this.LIZIZ) {
            if (str != null && (parse = UriProtector.parse(str)) != null) {
                this.LIZLLL.LIZJ(parse);
            }
            C60203Njz c60203Njz = (C60203Njz) this.LIZJ.LLF.LIZJ(C60203Njz.class);
            if (c60203Njz != null && (l = c60203Njz.LIZIZ) != null) {
                l.longValue();
                j = System.currentTimeMillis() - l.longValue();
            } else {
                j = 0;
            }
            C10K.LIZJ(new CallableC60242Nkc(this, str, j, System.currentTimeMillis() - this.LIZJ.LLILZLL));
        }
        this.LIZIZ = false;
    }

    @Override // X.NVZ, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C39973FmT.LIZIZ(this.LIZJ, "onRenderProcessGone, detail:" + renderProcessGoneDetail, null, null, 6);
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
        return true;
    }

    @Override // X.NVZ, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C60238NkY c60238NkY = this.LIZJ;
            c60238NkY.getClass();
            IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) C60299NlX.LIZ(c60238NkY, IResourceLoaderService.class);
            if (iResourceLoaderService != null) {
                O1L o1l = new O1L(0);
                C51587KMl c51587KMl = (C51587KMl) this.LIZJ.LLF.LIZJ(C51587KMl.class);
                if (c51587KMl == null) {
                    c51587KMl = new C51587KMl(false);
                }
                c51587KMl.LIZ = C47261Igj.LJJIJIL(EnumC60489Nob.GECKO, EnumC60489Nob.BUILTIN);
                o1l.LIZ = c51587KMl;
                C60238NkY c60238NkY2 = this.LIZJ;
                o1l.LJIIJ = c60238NkY2;
                o1l.LJIIJJI = "web";
                o1l.LJIIL = c60238NkY2.LJLLLLLL;
                O1I loadSync = iResourceLoaderService.loadSync(str, o1l);
                if (loadSync != null) {
                    String str2 = loadSync.LJI;
                    if (str2 == null || str2.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(!z2)) {
                        loadSync = null;
                    }
                    if (loadSync != null) {
                        WebResourceResponse webResourceResponse = loadSync.LIZIZ;
                        if (webResourceResponse == null) {
                            F3S f3s = loadSync.LJII;
                            if (f3s != null) {
                                int i = F3R.LIZIZ[f3s.ordinal()];
                                if (i != 1) {
                                    if (i == 2) {
                                        AssetManager assetManager = (AssetManager) this.LIZJ.LLIIIJ.getValue();
                                        String str3 = loadSync.LJI;
                                        if (assetManager != null) {
                                            if (str3 == null || str3.length() == 0) {
                                                z3 = true;
                                            }
                                            if (!z3) {
                                                webResourceResponse = O46.LIZIZ(assetManager.open(str3), O46.LIZ(str3));
                                            }
                                        }
                                    }
                                } else {
                                    String str4 = loadSync.LJI;
                                    if (str4 != null) {
                                        try {
                                            File file = new File(str4);
                                            if (file.exists() && !file.isDirectory()) {
                                                z3 = true;
                                            }
                                            if (!z3) {
                                                file = null;
                                            }
                                            if (file != null) {
                                                webResourceResponse = O46.LIZIZ(new FileInputStream(file), O46.LIZ(str4));
                                            }
                                        } catch (Throwable th) {
                                            C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                        }
                                    }
                                    C3C5.m7constructorimpl(null);
                                }
                            }
                            webResourceResponse = null;
                        }
                        if (webResourceResponse != null) {
                            C39973FmT.LIZIZ(this.LIZJ, i0.LJFF("shouldInterceptRequest loader cache hits on:", str), null, null, 6);
                            return webResourceResponse;
                        }
                    }
                }
            }
        }
        C39973FmT.LIZIZ(this.LIZJ, i0.LJFF("shouldInterceptRequest no cache on:", str), null, null, 6);
        super.shouldInterceptRequest(webView, str);
        throw null;
    }

    @Override // X.NVZ, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C38049EwX c38049EwX;
        C38182Eyg c38182Eyg = this.LIZJ.LLILII;
        if (c38182Eyg != null && (c38049EwX = c38182Eyg.LJIIJJI) != null) {
            Boolean valueOf = Boolean.valueOf(c38049EwX.LIZJ(str));
            if (valueOf.booleanValue()) {
                return valueOf.booleanValue();
            }
        }
        super.shouldOverrideUrlLoading(webView, str);
        throw null;
    }

    @Override // X.NVZ, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public C60241Nkb(C60238NkY c60238NkY, C60213Nk9 c60213Nk9, InterfaceC37958Ev4 interfaceC37958Ev4) {
        this.LIZJ = c60238NkY;
        this.LIZLLL = c60213Nk9;
        this.LJ = interfaceC37958Ev4;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        InterfaceC37901Eu9 interfaceC37901Eu9;
        super.onPageStarted(webView, str, bitmap);
        C59614NaU c59614NaU = this.LIZJ.LLILIL;
        if (c59614NaU != null) {
            c59614NaU.setPageStartUrl(str);
            if (str != null && (interfaceC37901Eu9 = this.LJ) != null) {
                interfaceC37901Eu9.LIZLLL(str);
            }
        }
    }

    @Override // X.NVZ, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Boolean bool;
        CharSequence charSequence;
        android.net.Uri url;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            this.LIZIZ = true;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C60238NkY c60238NkY = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceivedError, request:");
        LIZ.append(webResourceRequest);
        LIZ.append(", isForMainFrame:");
        String str = null;
        if (webResourceRequest != null) {
            bool = Boolean.valueOf(webResourceRequest.isForMainFrame());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        LIZ.append(" error:");
        LIZ.append(webResourceError);
        C39973FmT.LIZIZ(c60238NkY, X1D.LIZIZ(LIZ), null, null, 6);
        android.net.Uri uri = this.LIZJ.LLIL;
        if (uri != null) {
            int i = 0;
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                C60213Nk9 c60213Nk9 = this.LIZLLL;
                if (webResourceError != null) {
                    i = webResourceError.getErrorCode();
                    charSequence = webResourceError.getDescription();
                } else {
                    charSequence = null;
                }
                if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                    str = url.toString();
                }
                c60213Nk9.LIZ(uri, new C48431Izb(i, charSequence, str));
            }
        }
    }

    @Override // X.NVZ, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            this.LIZIZ = true;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C60238NkY c60238NkY = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceivedHttpError, request:");
        LIZ.append(webResourceRequest);
        LIZ.append(", errorResponse:");
        LIZ.append(webResourceResponse);
        C39973FmT.LIZIZ(c60238NkY, X1D.LIZIZ(LIZ), null, null, 6);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String url;
        this.LIZIZ = true;
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C60238NkY c60238NkY = this.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceivedSslError, error:");
        LIZ.append(sslError);
        String str = null;
        C39973FmT.LIZIZ(c60238NkY, X1D.LIZIZ(LIZ), null, null, 6);
        if (webView != null && (url = webView.getUrl()) != null) {
            C60213Nk9 c60213Nk9 = this.LIZLLL;
            android.net.Uri parse = UriProtector.parse(url);
            o.LJFF(parse, "Uri.parse(it)");
            if (sslError != null) {
                str = sslError.toString();
            }
            c60213Nk9.LIZ(parse, new C48431Izb(-100, str, url));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        android.net.Uri uri;
        this.LIZIZ = true;
        super.onReceivedError(webView, i, str, str2);
        C39973FmT.LIZIZ(this.LIZJ, C012403c.LIZLLL("onReceivedError, errorCode:", i, ", description:", str), null, null, 6);
        if (Build.VERSION.SDK_INT < 23 && (uri = this.LIZJ.LLIL) != null) {
            this.LIZLLL.LIZ(uri, new C48431Izb(i, str, str2));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        C39973FmT.LIZIZ(this.LIZJ, C0ON.LIZJ("onReceivedHttpAuthRequest, host:", str, ", realm:", str2), null, null, 6);
    }
}
