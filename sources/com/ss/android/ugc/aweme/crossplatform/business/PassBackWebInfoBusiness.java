package com.ss.android.ugc.aweme.crossplatform.business;

import X.C10K;
import X.C16880lQ;
import X.C221108m2;
import X.C2YJ;
import X.C59110NHu;
import X.C59273NOb;
import X.C59484NWe;
import X.C62822Ol8;
import X.EF7;
import X.EnumC48210Iw2;
import X.FMX;
import X.NUA;
import X.NUD;
import X.NUF;
import X.NUH;
import X.NZR;
import X.O0P;
import Y.ACallableS113S0100000_10;
import Y.ARunnableS29S0200000_10;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.google.gson.internal.h;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.ss.android.ugc.aweme.web.settings.WebInfoReportConfigSettings;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class PassBackWebInfoBusiness extends BusinessService.Business {
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public AdLandingPageConfig LJI;
    public WebInfoReportConfigSettings.WebInfoReportConfig LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public C59273NOb LJIILLIIL;

    public final boolean LIZ() {
        if (this.LJI == null || this.LJIILLIIL == null) {
            return false;
        }
        return LIZLLL();
    }

    public final Map<String, String> LIZIZ() {
        Object value = this.LJ.getValue();
        o.LJIIIIZZ(value, "<get-dataMap>(...)");
        return (Map) value;
    }

    public final boolean LIZLLL() {
        String str;
        C59273NOb c59273NOb = this.LJIILLIIL;
        if (c59273NOb != null && !c59273NOb.LJJIJIIJI) {
            return false;
        }
        if (this.LJIIIIZZ && NetworkUtils.getNetworkType(EF7.LIZIZ()) != EnumC48210Iw2.WIFI) {
            return false;
        }
        if ((this.LJIIJ > 0 && O0P.LIZ.get() >= this.LJIIJ) || (str = this.LJIILIIL) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness.LJIIIIZZ():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassBackWebInfoBusiness(C59484NWe crossPlatformBusiness) {
        super(crossPlatformBusiness);
        o.LJIIIZ(crossPlatformBusiness, "crossPlatformBusiness");
        this.LIZLLL = C221108m2.LIZIZ(NUH.LJLIL);
        this.LJ = C221108m2.LIZIZ(NUD.LJLIL);
        this.LJFF = C221108m2.LIZIZ(NUF.LJLIL);
        this.LJIIIIZZ = true;
        this.LJIIJJI = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        this.LJIIL = "https://ads.tiktok.com/inspect/aegis/client/page/";
        this.LJIILL = C221108m2.LIZIZ(NUA.LJLIL);
    }

    public final void LJ(C59273NOb c59273NOb) {
        this.LJIILLIIL = c59273NOb;
        try {
            this.LJI = C2YJ.LIZIZ.LIZ.getAdLandingPageConfig();
            this.LJII = WebInfoReportConfigSettings.LIZ();
            AdLandingPageConfig adLandingPageConfig = this.LJI;
            if (adLandingPageConfig != null) {
                this.LJIIJJI = adLandingPageConfig.getAdLandingPageReportDelay();
                String adLandingPageReportUrl = adLandingPageConfig.getAdLandingPageReportUrl();
                if (adLandingPageReportUrl != null) {
                    this.LJIIL = adLandingPageReportUrl;
                }
                this.LJIILIIL = adLandingPageConfig.getAdLandingPageReportPacketKey();
            }
            WebInfoReportConfigSettings.WebInfoReportConfig webInfoReportConfig = this.LJII;
            if (webInfoReportConfig != null) {
                this.LJIIIIZZ = webInfoReportConfig.wifiOnlyEnable;
                this.LJIIIZ = webInfoReportConfig.pageCount;
                this.LJIIJ = webInfoReportConfig.limitTimes;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJFF(WeakReference<NZR> weakReference) {
        NZR nzr = weakReference.get();
        if (nzr == null) {
            return;
        }
        String url = nzr.getUrl();
        if (TextUtils.isEmpty(url)) {
            C10K.LIZIZ(new ACallableS113S0100000_10(this, 27), FMX.LIZIZ(), null);
        } else {
            nzr.evaluateJavascript("encodeURIComponent(document.documentElement.outerHTML)", new C59110NHu(this, url));
        }
    }

    public final void LJII(String str) {
        if (!TextUtils.isEmpty(this.LJIILJJIL) || TextUtils.isEmpty(str)) {
            return;
        }
        this.LJIILJJIL = str;
        if (str != null && !TextUtils.equals("about:blank", str)) {
            Map<String, String> LIZIZ = LIZIZ();
            String encode = URLEncoder.encode(str, "UTF-8");
            o.LJIIIIZZ(encode, "encode(str, \"UTF-8\")");
            LIZIZ.put(encode, "");
        }
    }

    public final void LIZJ(String str, Map<String, String> map) {
        int i;
        String str2;
        if (!LIZ()) {
            return;
        }
        if (LIZLLL()) {
            i = this.LJIIIZ;
        } else {
            i = 1;
        }
        if (LIZIZ().size() >= i || ujb.o.LJJJJJL(str) || o.LJ("about:blank", str) || ujb.o.LJJJJ(str, ".js", false) || ujb.o.LJJJJ(str, ".css", false) || (str2 = map.get("Accept")) == null || !s.LJJJLZIJ(str2, "html", false)) {
            return;
        }
        Map map2 = (Map) this.LJFF.getValue();
        String LJIIIIZZ = h.LJIIIIZZ(str);
        o.LJIIIIZZ(LJIIIIZZ, "hexDigest(url)");
        map2.put(LJIIIIZZ, map);
    }

    public final void LJI(NZR nzr, boolean z) {
        int i;
        String url;
        if (!LIZ()) {
            return;
        }
        if (LIZLLL()) {
            i = this.LJIIIZ;
        } else {
            i = 1;
        }
        if (LIZIZ().size() >= i || nzr == null || (url = nzr.getUrl()) == null || ujb.o.LJJJJJL(url) || o.LJ("about:blank", nzr.getUrl())) {
            return;
        }
        WeakReference<NZR> weakReference = new WeakReference<>(nzr);
        if (z) {
            ((Handler) this.LIZLLL.getValue()).postDelayed(new ARunnableS29S0200000_10(this, weakReference, 18), this.LJIIJJI);
            ((Handler) this.LIZLLL.getValue()).postDelayed(new ARunnableS29S0200000_10(this, weakReference, 19), 200L);
        } else {
            LJFF(weakReference);
        }
    }
}
