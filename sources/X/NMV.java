package X;

import Y.ARunnableS46S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.landpage.survey.AdLandPageSurveyServiceImpl;
import com.ss.android.ugc.aweme.web.ui.AdWebBarEventLogger;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NMV implements InterfaceC59494NWo {
    public NMY LIZ;
    public Runnable LIZIZ;
    public C59222NMc LIZJ;
    public WebView LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final C62822Ol8 LJI;

    @Override // X.InterfaceC59494NWo
    public final void LIZ() {
        if (!this.LJ) {
            this.LJFF = true;
            LJ();
        }
        NMY nmy = this.LIZ;
        if (nmy != null) {
            nmy.LIZIZ();
        }
    }

    @Override // X.InterfaceC59494NWo
    public final void LIZIZ() {
        AwemeRawAd awemeRawAd;
        if (!this.LJ) {
            AdWebBarEventLogger adWebBarEventLogger = new AdWebBarEventLogger(this.LIZJ);
            C58685N1l.LIZ.getClass();
            C58653N0f c58653N0f = C58685N1l.LJJIIZ;
            C59222NMc c59222NMc = this.LIZJ;
            if (c59222NMc != null) {
                awemeRawAd = c59222NMc.LIZ;
            } else {
                awemeRawAd = null;
            }
            adWebBarEventLogger.LJIIIZ(c58653N0f, awemeRawAd, NMQ.LJLIL);
        }
        NMY nmy = this.LIZ;
        if (nmy != null) {
            nmy.LIZ();
        }
    }

    @Override // X.InterfaceC59494NWo
    public final void LJ() {
        Runnable runnable;
        ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(this, 90);
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if ((LJIIIIZZ == null || !AdLandPageSurveyServiceImpl.LJI().LIZLLL(LJIIIIZZ, new AqS157S0200000_10(aRunnableS46S0100000_10, this, 21))) && (runnable = this.LIZIZ) != null) {
            runnable.run();
        }
    }

    @Override // X.InterfaceC59494NWo
    public final boolean LIZLLL() {
        return this.LJFF;
    }

    public NMV(Context context) {
        o.LJIIIZ(context, "context");
        this.LJI = C221108m2.LIZIZ(NMW.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
    
        if (r0 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(boolean r16) {
        /*
            r15 = this;
            X.NMc r1 = r15.LIZJ
            r8 = 0
            if (r1 == 0) goto L9
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.LIZ
            if (r0 != 0) goto La
        L9:
            return
        La:
            if (r1 == 0) goto L75
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.LIZ
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel r2 = r0.getLandingPageSurvey()
            if (r2 == 0) goto L75
            if (r16 == 0) goto L7a
            X.NMc r0 = r15.LIZJ
            java.lang.String r1 = ""
            if (r0 == 0) goto L22
            java.lang.String r4 = r0.LIZLLL
            if (r4 != 0) goto L23
        L22:
            r4 = r1
        L23:
            X.Ol8 r0 = r15.LJI
            java.lang.Object r3 = r0.getValue()
            com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService r3 = (com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService) r3
            X.NMc r0 = r15.LIZJ
            if (r0 == 0) goto L78
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.LIZ
            if (r0 == 0) goto L78
            java.lang.Long r0 = r0.getAdId()
            if (r0 == 0) goto L78
            java.lang.String r5 = java.lang.String.valueOf(r0)
        L3d:
            X.NMc r0 = r15.LIZJ
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.LIZ
            if (r0 == 0) goto L76
            java.lang.Long r0 = r0.getCreativeId()
            if (r0 == 0) goto L76
            java.lang.String r6 = java.lang.String.valueOf(r0)
        L4f:
            X.NMc r0 = r15.LIZJ
            if (r0 == 0) goto L57
            java.lang.String r7 = r0.LJIIIZ
            if (r7 != 0) goto L5a
        L57:
            r7 = r1
            if (r0 == 0) goto L62
        L5a:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.LIZ
            if (r0 == 0) goto L62
            java.lang.String r8 = r0.getLogExtra()
        L62:
            boolean r10 = r2.getEnableLandingPageSurvey()
            long r11 = r2.getShowSurveyTimeInterval()
            long r13 = r2.getPageDwellTime()
            java.lang.String r9 = r2.getSchemaUrl()
            r3.LJ(r4, r5, r6, r7, r8, r9, r10, r11, r13)
        L75:
            return
        L76:
            r6 = r1
            goto L4f
        L78:
            r5 = r1
            goto L3d
        L7a:
            X.Ol8 r0 = r15.LJI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService r0 = (com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService) r0
            r0.LIZ()
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NMV.LJFF(boolean):void");
    }

    @QD3
    public final void onEvent(C40261Fr7 c40261Fr7) {
        WebView webView;
        if (c40261Fr7 == null || c40261Fr7.LJLIL == 0 || (webView = this.LIZLLL) == null || this.LIZIZ == null || webView.hashCode() != c40261Fr7.LJLIL) {
            return;
        }
        this.LJFF = true;
        LJ();
    }

    @Override // X.InterfaceC59494NWo
    public final void LIZJ(C59222NMc c59222NMc, NWR nwr, WebKitView webKitView, boolean z) {
        if (c59222NMc == null) {
            return;
        }
        this.LIZJ = c59222NMc;
        this.LIZ = this.LIZ;
        this.LIZLLL = webKitView;
        this.LJ = z;
        if (nwr != null) {
            this.LIZ = nwr;
        }
        LJFF(true);
    }
}
