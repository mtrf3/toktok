package com.ss.android.ugc.aweme.bullet.business;

import X.C10K;
import X.C221108m2;
import X.C59109NHt;
import X.C59472NVs;
import X.C62822Ol8;
import X.EF7;
import X.EnumC48210Iw2;
import X.N5S;
import X.NP1;
import X.NU8;
import X.NUC;
import X.NUE;
import X.NUG;
import X.O0P;
import Y.ACallableS87S0200000_10;
import Y.ARunnableS29S0200000_10;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.internal.h;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class PassBackWebInfoBusiness extends BulletBusinessService.Business {
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public final C62822Ol8 LJIIJJI;

    public final boolean LIZ() {
        NP1 np1;
        String str;
        C59472NVs c59472NVs = this.LIZ.LIZIZ;
        if (c59472NVs instanceof NP1) {
            np1 = (NP1) c59472NVs;
        } else {
            np1 = null;
        }
        if (np1 == null || !o.LJ(np1.LJLJI.getValue(), Boolean.TRUE)) {
            return false;
        }
        if (this.LJ && NetworkUtils.getNetworkType(EF7.LIZIZ()) != EnumC48210Iw2.WIFI) {
            return false;
        }
        if ((this.LJI > 0 && O0P.LIZ.get() >= this.LJI) || (str = this.LJIIIZ) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public final Map<String, String> LIZIZ() {
        Object value = this.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-dataMap>(...)");
        return (Map) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassBackWebInfoBusiness(N5S bulletBusiness) {
        super(bulletBusiness);
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        this.LIZIZ = C221108m2.LIZIZ(NUG.LJLIL);
        this.LIZJ = C221108m2.LIZIZ(NUC.LJLIL);
        this.LIZLLL = C221108m2.LIZIZ(NUE.LJLIL);
        this.LJ = true;
        this.LJII = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        this.LJIIIIZZ = "https://ads.tiktok.com/inspect/aegis/client/page/";
        this.LJIIJJI = C221108m2.LIZIZ(NU8.LJLIL);
    }

    public final void LIZLLL(Uri uri) {
        if (!LIZ()) {
            return;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "url");
        String queryParameter2 = UriProtector.getQueryParameter(uri, "html");
        if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2) && queryParameter != null && queryParameter2 != null) {
            String encode = URLEncoder.encode(queryParameter, "UTF-8");
            o.LJIIIIZZ(encode, "encode(str, \"UTF-8\")");
            if (TextUtils.equals("about:blank", encode)) {
                return;
            }
            LIZIZ().put(encode, s.LJLI(queryParameter2));
        }
    }

    public final void LJ(WeakReference<WebView> weakReference) {
        NP1 np1;
        WebView webView = weakReference.get();
        if (webView == null) {
            return;
        }
        String url = webView.getUrl();
        if (url == null) {
            url = "";
        }
        if (TextUtils.isEmpty(url)) {
            C59472NVs c59472NVs = this.LIZ.LIZIZ;
            if (!(c59472NVs instanceof NP1) || (np1 = (NP1) c59472NVs) == null) {
                return;
            }
            C10K.LIZIZ(new ACallableS87S0200000_10(this, np1, 9), C10K.LJI, null);
            return;
        }
        webView.evaluateJavascript("encodeURIComponent(document.documentElement.outerHTML)", new C59109NHt(this, url));
    }

    public final void LJI(String str) {
        if (!TextUtils.isEmpty(this.LJIIJ) || TextUtils.isEmpty(str)) {
            return;
        }
        this.LJIIJ = str;
        if (str != null && !TextUtils.equals("about:blank", str)) {
            Map<String, String> LIZIZ = LIZIZ();
            String encode = URLEncoder.encode(str, "UTF-8");
            o.LJIIIIZZ(encode, "encode(str, \"UTF-8\")");
            LIZIZ.put(encode, "");
        }
    }

    public final void LIZJ(String str, Map<String, String> headers) {
        String str2;
        o.LJIIIZ(headers, "headers");
        if (!LIZ() || LIZIZ().size() >= this.LJFF || ujb.o.LJJJJJL(str) || o.LJ("about:blank", str) || ujb.o.LJJJJ(str, ".js", false) || ujb.o.LJJJJ(str, ".css", false) || (str2 = headers.get("Accept")) == null || !s.LJJJLZIJ(str2, "html", false)) {
            return;
        }
        Map map = (Map) this.LIZLLL.getValue();
        String LJIIIIZZ = h.LJIIIIZZ(str);
        o.LJIIIIZZ(LJIIIIZZ, "hexDigest(url)");
        map.put(LJIIIIZZ, headers);
    }

    public final void LJFF(WebView webView, boolean z) {
        String url;
        if (!LIZ() || LIZIZ().size() >= this.LJFF || webView == null || (url = webView.getUrl()) == null || ujb.o.LJJJJJL(url) || o.LJ("about:blank", webView.getUrl())) {
            return;
        }
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        if (z) {
            ((Handler) this.LIZIZ.getValue()).postDelayed(new ARunnableS29S0200000_10(this, weakReference, 12), this.LJII);
            ((Handler) this.LIZIZ.getValue()).postDelayed(new ARunnableS29S0200000_10(this, weakReference, 13), 200L);
        } else {
            LJ(weakReference);
        }
    }
}
