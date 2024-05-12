package X;

import Y.ACallableS113S0100000_10;
import Y.ARunnableS29S0200000_10;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.ss.android.ugc.aweme.web.settings.WebInfoReportConfigSettings;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NU6 {
    public AdLandingPageConfig LIZLLL;
    public WebInfoReportConfigSettings.WebInfoReportConfig LJ;
    public int LJI;
    public int LJII;
    public String LJIIJ;
    public String LJIIJJI;
    public C59222NMc LJIILIIL;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(NUI.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C58306MuU.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C58305MuT.LJLIL);
    public boolean LJFF = true;
    public int LJIIIIZZ = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    public String LJIIIZ = "https://ads.tiktok.com/inspect/aegis/client/page/";
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(NUB.LJLIL);

    public final boolean LIZ() {
        if (this.LIZLLL == null || this.LJIILIIL == null) {
            return false;
        }
        return LIZJ();
    }

    public final java.util.Map<String, String> LIZIZ() {
        Object value = this.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-dataMap>(...)");
        return (java.util.Map) value;
    }

    public final boolean LIZJ() {
        String str;
        AwemeRawAd awemeRawAd;
        C59222NMc c59222NMc = this.LJIILIIL;
        if (c59222NMc != null && ((awemeRawAd = c59222NMc.LIZ) == null || !awemeRawAd.isEnableWebReport())) {
            return false;
        }
        if (this.LJFF && NetworkUtils.getNetworkType(EF7.LIZIZ()) != EnumC48210Iw2.WIFI) {
            return false;
        }
        if ((this.LJII <= 0 || O0P.LIZ.get() < this.LJII) && (str = this.LJIIJ) != null && str.length() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NU6.LJI():void");
    }

    public final void LIZLLL(C59222NMc c59222NMc) {
        this.LJIILIIL = c59222NMc;
        try {
            this.LIZLLL = C2YJ.LIZIZ.LIZ.getAdLandingPageConfig();
            this.LJ = WebInfoReportConfigSettings.LIZ();
            AdLandingPageConfig adLandingPageConfig = this.LIZLLL;
            if (adLandingPageConfig != null) {
                this.LJIIIIZZ = adLandingPageConfig.getAdLandingPageReportDelay();
                String adLandingPageReportUrl = adLandingPageConfig.getAdLandingPageReportUrl();
                if (adLandingPageReportUrl != null) {
                    this.LJIIIZ = adLandingPageReportUrl;
                }
                this.LJIIJ = adLandingPageConfig.getAdLandingPageReportPacketKey();
            }
            WebInfoReportConfigSettings.WebInfoReportConfig webInfoReportConfig = this.LJ;
            if (webInfoReportConfig != null) {
                this.LJFF = webInfoReportConfig.wifiOnlyEnable;
                this.LJI = webInfoReportConfig.pageCount;
                this.LJII = webInfoReportConfig.limitTimes;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJFF(WeakReference<WebView> weakReference) {
        WebView webView = weakReference.get();
        if (webView == null) {
            return;
        }
        String url = webView.getUrl();
        if (TextUtils.isEmpty(url)) {
            C10K.LIZIZ(new ACallableS113S0100000_10(this, 5), FMX.LIZIZ(), null);
        } else {
            if (url == null) {
                return;
            }
            webView.evaluateJavascript("encodeURIComponent(document.documentElement.outerHTML)", new C59092NHc(this, url));
        }
    }

    public final void LJ(WebView webView, boolean z) {
        int i;
        String url;
        if (!LIZ()) {
            return;
        }
        if (LIZJ()) {
            i = this.LJI;
        } else {
            i = 1;
        }
        if (LIZIZ().size() >= i || webView == null || (url = webView.getUrl()) == null || ujb.o.LJJJJJL(url) || o.LJ("about:blank", webView.getUrl())) {
            return;
        }
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        if (z) {
            ((Handler) this.LIZ.getValue()).postDelayed(new ARunnableS29S0200000_10(this, weakReference, 23), this.LJIIIIZZ);
            ((Handler) this.LIZ.getValue()).postDelayed(new ARunnableS29S0200000_10(this, weakReference, 24), 200L);
        } else {
            LJFF(weakReference);
        }
    }
}
