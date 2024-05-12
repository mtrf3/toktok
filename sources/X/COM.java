package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveEnableWebviewGlobalpropsSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class COM extends COT {
    public final java.util.Map<String, Boolean> LJLJI = new HashMap();
    public final /* synthetic */ TTLiveBrowserFragment LJLJJI;

    public COM(TTLiveBrowserFragment tTLiveBrowserFragment) {
        this.LJLJJI = tTLiveBrowserFragment;
    }

    @Override // X.C59589Na5, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (C0NB.LIZJ() && !C31947CgJ.LIZLLL(str)) {
            C279017q.LJ("onLoadResource ", str, "LiveBrowserFragment");
        }
        super.onLoadResource(webView, str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.core.widget.BaseDialogFragment, X.COE] */
    @Override // X.COT, X.C59586Na2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        FrameLayout frameLayout;
        O5Z o5z;
        TTLiveBrowserFragment tTLiveBrowserFragment;
        O5Z o5z2;
        this.LJLJJI.LLILIL = System.currentTimeMillis();
        if (C0NB.LIZJ()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("onPageFinished ", str, ", time ");
            LIZIZ.append(this.LJLJJI.LLILIL);
            C0NB.LJIIJJI("LiveBrowserFragment", X1D.LIZIZ(LIZIZ));
        }
        ?? r0 = this.LJLJJI.LJLILLLLZI;
        if (r0 != 0) {
            r0.mi();
        }
        if (this.LJLJJI.LJLLILLLL) {
            webView.clearHistory();
            this.LJLJJI.LJLLILLLL = false;
        }
        super.onPageFinished(webView, str);
        if (TextUtils.isEmpty(this.LJLJJI.LJLL) && (o5z2 = (tTLiveBrowserFragment = this.LJLJJI).LJZI) != null) {
            tTLiveBrowserFragment.LJLL = o5z2.getTitle();
            TTLiveBrowserFragment tTLiveBrowserFragment2 = this.LJLJJI;
            tTLiveBrowserFragment2.LJLLLL.setText(tTLiveBrowserFragment2.LJLL);
        }
        TTLiveBrowserFragment tTLiveBrowserFragment3 = this.LJLJJI;
        if (tTLiveBrowserFragment3.LLJ && (o5z = tTLiveBrowserFragment3.LJZI) != null) {
            C16880lQ.LLZZ(o5z, "about:blank");
        }
        TTLiveBrowserFragment tTLiveBrowserFragment4 = this.LJLJJI;
        if (!tTLiveBrowserFragment4.LLIFFJFJJ && (frameLayout = tTLiveBrowserFragment4.LJZL) != null) {
            frameLayout.setVisibility(8);
        }
        ((HashMap) this.LJLJI).clear();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        String path;
        C78894Uxm.LJLJJLL = System.currentTimeMillis();
        if (!TextUtils.isEmpty(str)) {
            WebResourceResponse LIZJ = COY.LIZIZ().LIZJ(webView, str);
            if (LIZJ != null) {
                if (TextUtils.equals("text/html", LIZJ.getMimeType())) {
                    this.LJLJJI.LLJILLL = System.currentTimeMillis();
                    TTLiveBrowserFragment tTLiveBrowserFragment = this.LJLJJI;
                    ((HashMap) tTLiveBrowserFragment.LLJJI).put("intercept_delay", Long.valueOf((tTLiveBrowserFragment.LLJILLL - tTLiveBrowserFragment.LLJILJILJ) / 1000));
                }
                this.LJLJJI.getClass();
                if (TTLiveBrowserFragment.vl(str)) {
                    C78894Uxm.LJFF(0, this.LJLJJI.LJLJLLL, str);
                }
                ((HashMap) this.LJLJI).put(str, Boolean.TRUE);
                COR.LIZ(webView, str, true);
                this.LJLJJI.getClass();
                android.net.Uri parse = UriProtector.parse(str);
                if (parse.getPath() == null) {
                    path = "";
                } else {
                    path = parse.getPath();
                }
                if (path.endsWith("jpg") || path.endsWith("jpeg") || path.endsWith("png") || path.endsWith("gif") || path.endsWith("ico")) {
                    this.LJLJJI.getClass();
                    android.net.Uri parse2 = UriProtector.parse(str);
                    W6J LIZ = W5I.LIZ();
                    if (!LIZ.LJII(parse2)) {
                        LIZ.LJIIIZ(parse2).LJ(new CXG(), AsyncTask.THREAD_POOL_EXECUTOR);
                    }
                }
                return LIZJ;
            }
            this.LJLJJI.getClass();
            if (TTLiveBrowserFragment.vl(str)) {
                C78894Uxm.LJFF(1, this.LJLJJI.LJLJLLL, str);
            }
            ((HashMap) this.LJLJI).put(str, Boolean.FALSE);
            COR.LIZ(webView, str, true);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // X.C59589Na5, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        android.net.Uri parse;
        String lowerCase;
        if (C0NB.LIZJ()) {
            C279017q.LJ("shouldOverrideUrlLoading ", str, "LiveBrowserFragment");
        }
        if (C30882CAc.LIZJ().LJI(webView, str) || super.shouldOverrideUrlLoading(webView, str)) {
            return true;
        }
        try {
            parse = UriProtector.parse(str);
            lowerCase = parse.getScheme().toLowerCase();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("view url ");
            LIZ.append(str);
            LIZ.append(" exception: ");
            LIZ.append(e);
            C0NB.LJIIL("TAG", X1D.LIZIZ(LIZ));
        }
        if (TextUtils.isEmpty(lowerCase) || "about".equals(lowerCase)) {
            return false;
        }
        if ("intent".equals(lowerCase) && ((IHostAction) CN1.LIZ(IHostAction.class)).handleIntentSchema(webView, str)) {
            return true;
        }
        if (!"http".equals(lowerCase) && !"https".equals(lowerCase)) {
            return ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLJJI.getContext(), parse);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        if (C0NB.LIZJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("doUpdateVisitedHistory ");
            LIZ.append(webView.getUrl());
            LIZ.append(" ");
            LIZ.append(str);
            LIZ.append(" ");
            LIZ.append(z);
            C0NB.LJIIJJI("LiveBrowserFragment", X1D.LIZIZ(LIZ));
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.android.live.core.widget.BaseDialogFragment, X.COE] */
    @Override // X.COT, X.C59586Na2, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2;
        super.onPageStarted(webView, str, bitmap);
        this.LJLJJI.LLJILJIL = System.currentTimeMillis();
        if (webView != null && LiveEnableWebviewGlobalpropsSetting.INSTANCE.getValue()) {
            this.LJLJJI.getClass();
            if (C31947CgJ.LJ(str)) {
                boolean equals = Boolean.TRUE.equals(((HashMap) this.LJLJI).get(str));
                Context context = webView.getContext();
                if (TextUtils.isEmpty(this.LJLJJI.LLIZLLLIL)) {
                    str2 = str;
                } else {
                    str2 = this.LJLJJI.LLIZLLLIL;
                }
                webView.evaluateJavascript(C16880lQ.LLLZ("(function(){var __globalProps=%s;window.__globalProps=__globalProps;})();", new Object[]{C29264Be8.LIZ(context, str2, this.LJLJJI.LJLJJI, equals)}), null);
            }
        }
        this.LJLJJI.LLJ = false;
        if (C0NB.LIZJ()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("onPageStarted ", str, ", time ");
            LIZIZ.append(this.LJLJJI.LLJILJIL);
            C0NB.LJIIJJI("LiveBrowserFragment", X1D.LIZIZ(LIZIZ));
        }
        TTLiveBrowserFragment tTLiveBrowserFragment = this.LJLJJI;
        ((HashMap) tTLiveBrowserFragment.LLJJI).put("constrution_duration", Long.valueOf((tTLiveBrowserFragment.LLJILJIL - tTLiveBrowserFragment.LLJIJIL) / 1000));
        ?? r0 = this.LJLJJI.LJLILLLLZI;
        if (r0 != 0) {
            r0.ib();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.core.widget.BaseDialogFragment, X.COE] */
    @Override // X.COT, X.C59586Na2, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.LJLJJI.LLILIL = System.currentTimeMillis();
        if (C0NB.LIZJ()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("onReceivedError ", str2, ", time ");
            LIZIZ.append(this.LJLJJI.LLILIL);
            C0NB.LJIIJJI("LiveBrowserFragment", X1D.LIZIZ(LIZIZ));
        }
        FrameLayout frameLayout = this.LJLJJI.LJZL;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        TTLiveBrowserFragment tTLiveBrowserFragment = this.LJLJJI;
        tTLiveBrowserFragment.LLJ = true;
        ?? r0 = tTLiveBrowserFragment.LJLILLLLZI;
        if (r0 != 0) {
            r0.H3();
        }
        CO0 co0 = this.LJLJJI.LLJI;
        if (co0 != null) {
            co0.LIZ(2, i, str);
        }
        TTLiveBrowserFragment tTLiveBrowserFragment2 = this.LJLJJI;
        if (!TextUtils.isEmpty(tTLiveBrowserFragment2.LLJJ)) {
            C0K2.LJII(1, tTLiveBrowserFragment2.LLJJ, tTLiveBrowserFragment2.LLJJI);
            tTLiveBrowserFragment2.LLJJ = null;
            tTLiveBrowserFragment2.LLJJI = null;
        }
    }
}
