package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveEnableWebviewGlobalpropsSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CON extends COT {
    public final C31240CNw LJLJI;
    public final java.util.Map<String, Object> LJLJJI;
    public final java.util.Map<String, Boolean> LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public boolean LJLJLJ;
    public final String LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;

    public CON(C31240CNw liveWebComponent) {
        o.LJIIIZ(liveWebComponent, "liveWebComponent");
        this.LJLJI = liveWebComponent;
        this.LJLJJI = new LinkedHashMap();
        this.LJLJJL = new LinkedHashMap();
        this.LJLJLLL = "";
        this.LJLL = true;
        this.LJLLI = true;
    }

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String path = new java.net.URL(str).getPath();
            o.LJIIIIZZ(path, "path");
            if (!ujb.o.LJJJJ(path, ".htm", false) && !ujb.o.LJJJJ(path, ".html", false) && !ujb.o.LJJJJ(path, ".css", false)) {
                if (!ujb.o.LJJJJ(path, ".js", false)) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // X.C59589Na5, android.webkit.WebViewClient
    public final void onLoadResource(WebView view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        if (C0NB.LIZJ() && !C31947CgJ.LIZLLL(url)) {
            C279017q.LJ("onLoadResource ", url, "MyWebViewClient");
        }
        super.onLoadResource(view, url);
    }

    @Override // X.COT, X.C59586Na2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        O5Z o5z;
        if (!this.LJLJLJ) {
            COQ.LIZIZ.LIZLLL(webView, this.LJLJI.LJLILLLLZI.getOriginUri(), str, this.LJLLI);
        }
        this.LJLLI = false;
        this.LJLJJLL = System.currentTimeMillis();
        if (C0NB.LIZJ()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("onPageFinished ", str, ", time ");
            LIZIZ.append(this.LJLJJLL);
            C0NB.LJIIJJI("MyWebViewClient", X1D.LIZIZ(LIZIZ));
        }
        COW cow = this.LJLJI.LJLJJI;
        if (cow != null) {
            cow.LJLLI();
        }
        if (this.LJLL) {
            o.LJI(webView);
            webView.clearHistory();
            this.LJLL = false;
        }
        super.onPageFinished(webView, str);
        if (this.LJLJLJ && (o5z = this.LJLJI.LJLJL) != null) {
            C16880lQ.LLZZ(o5z, "about:blank");
        }
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        String path;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        C78894Uxm.LJLJJLL = System.currentTimeMillis();
        if (!TextUtils.isEmpty(url)) {
            WebResourceResponse LIZJ = COY.LIZIZ().LIZJ(view, url);
            if (LIZJ != null) {
                if (TextUtils.equals("text/html", LIZJ.getMimeType())) {
                    this.LJLJJI.put("intercept_delay", Long.valueOf((System.currentTimeMillis() - 0) / 1000));
                }
                if (LIZ(url)) {
                    C78894Uxm.LJFF(0, this.LJLJLLL, url);
                }
                this.LJLJJL.put(url, Boolean.TRUE);
                COR.LIZ(view, url, true);
                android.net.Uri parse = UriProtector.parse(url);
                if (parse.getPath() == null) {
                    path = "";
                } else {
                    path = parse.getPath();
                    o.LJI(path);
                }
                if (ujb.o.LJJJJ(path, "jpg", false) || ujb.o.LJJJJ(path, "jpeg", false) || ujb.o.LJJJJ(path, "png", false) || ujb.o.LJJJJ(path, "gif", false) || ujb.o.LJJJJ(path, "ico", false)) {
                    android.net.Uri parse2 = UriProtector.parse(url);
                    W6J LIZ = W5I.LIZ();
                    if (!LIZ.LJII(parse2)) {
                        LIZ.LJIIIZ(parse2).LJ(new CXH(), AsyncTask.THREAD_POOL_EXECUTOR);
                    }
                }
                return LIZJ;
            }
            if (LIZ(url)) {
                C78894Uxm.LJFF(1, this.LJLJLLL, url);
            }
            this.LJLJJL.put(url, Boolean.FALSE);
            COR.LIZ(view, url, true);
        }
        return super.shouldInterceptRequest(view, url);
    }

    @Override // X.C59589Na5, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        if (C0NB.LIZJ()) {
            C279017q.LJ("shouldOverrideUrlLoading ", url, "MyWebViewClient");
        }
        if (C30882CAc.LIZJ().LJI(view, url) || super.shouldOverrideUrlLoading(view, url)) {
            return true;
        }
        try {
            android.net.Uri parse = UriProtector.parse(url);
            String scheme = parse.getScheme();
            o.LJI(scheme);
            String lowerCase = scheme.toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            if (!TextUtils.isEmpty(lowerCase) && !o.LJ("about", lowerCase) && !o.LJ("http", lowerCase) && !o.LJ("https", lowerCase)) {
                return ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLJI.LJLIL, parse);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("view url ");
            LIZ.append(url);
            LIZ.append(" exception: ");
            LIZ.append(e);
            C0NB.LJIIL("TAG", X1D.LIZIZ(LIZ));
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView view, String url, boolean z) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        if (C0NB.LIZJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("doUpdateVisitedHistory ");
            LIZ.append(view.getUrl());
            LIZ.append(' ');
            LIZ.append(url);
            LIZ.append(' ');
            LIZ.append(z);
            C0NB.LJIIJJI("MyWebViewClient", X1D.LIZIZ(LIZ));
        }
        super.doUpdateVisitedHistory(view, url, z);
    }

    @Override // X.COT, X.C59586Na2, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String originUri;
        super.onPageStarted(webView, str, bitmap);
        if (str == null || str.length() == 0) {
            COQ coq = COQ.LIZIZ;
            coq.LIZ(webView, "gblhb_schema_error", COP.LIZIZ(coq, coq.LIZ, this.LJLJI.LJLILLLLZI.getOriginUri(), -201, null, null, 24));
        } else {
            COQ coq2 = COQ.LIZIZ;
            coq2.LIZ(webView, "gblhb_container_start_load", COP.LIZIZ(coq2, coq2.LIZ, this.LJLJI.LJLILLLLZI.getOriginUri(), 0, null, str, 12));
        }
        this.LJLJL = System.currentTimeMillis();
        if (webView != null && LiveEnableWebviewGlobalpropsSetting.INSTANCE.getValue() && C31947CgJ.LJ(str)) {
            boolean LJ = o.LJ(Boolean.TRUE, ((LinkedHashMap) this.LJLJJL).get(str));
            Context context = webView.getContext();
            if (TextUtils.isEmpty(this.LJLJI.LJLILLLLZI.getOriginUri())) {
                originUri = str;
            } else {
                originUri = this.LJLJI.LJLILLLLZI.getOriginUri();
            }
            String LLLZ = C16880lQ.LLLZ("(function(){var __globalProps=%s;window.__globalProps=__globalProps;})();", Arrays.copyOf(new Object[]{C29264Be8.LIZ(context, originUri, this.LJLJI.LJLJI, LJ)}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            webView.evaluateJavascript(LLLZ, null);
        }
        this.LJLJLJ = false;
        if (C0NB.LIZJ()) {
            StringBuilder LIZIZ = C07780Sg.LIZIZ("onPageStarted ", str, ", time ");
            LIZIZ.append(this.LJLJL);
            C0NB.LJIIJJI("MyWebViewClient", LIZIZ.toString());
        }
        this.LJLJJI.put("constrution_duration", Long.valueOf((this.LJLJL - 0) / 1000));
        COW cow = this.LJLJI.LJLJJI;
        if (cow != null) {
            cow.LLLLLLL(str);
        }
    }

    @Override // X.COT, X.C59586Na2, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.LJLJJLL = System.currentTimeMillis();
        if (C0NB.LIZJ()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("onReceivedError ", str2, ", time ");
            LIZIZ.append(this.LJLJJLL);
            C0NB.LJIIJJI("MyWebViewClient", X1D.LIZIZ(LIZIZ));
        }
        this.LJLJLJ = true;
        COW cow = this.LJLJI.LJLJJI;
        if (cow != null) {
            cow.LJIL();
        }
        COQ.LIZIZ.LIZJ(i, webView, this.LJLJI.LJLILLLLZI.getOriginUri(), str);
        this.LJLLI = false;
        if (!TextUtils.isEmpty(null)) {
            C0K2.LJII(1, null, this.LJLJJI);
            ((LinkedHashMap) this.LJLJJI).clear();
        }
    }
}
