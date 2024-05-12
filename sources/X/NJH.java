package X;

import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class NJH implements InterfaceC39904FlM {
    public OIB LIZIZ;
    public NJ2 LIZJ;
    public NJ2 LIZLLL;
    public InterfaceC59138NIw LJI;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(NJK.LJLIL);
    public final NJ0 LJ = new NJ0();
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(NJF.LJLIL);

    @Override // X.InterfaceC39904FlM
    public void LIZ(Object response) {
        o.LJIIIZ(response, "response");
    }

    public WebResourceResponse LJII(WebView webView, WebResourceRequest webResourceRequest) {
        return null;
    }

    public void LJIIIIZZ(NJJ njj, InterfaceC59138NIw interfaceC59138NIw) {
    }

    public void LJIIIZ(NJ2 nj2) {
    }

    public final NJJ LJFF() {
        return (NJJ) this.LIZ.getValue();
    }

    public NJH() {
        List LIZJ = C38943FQd.LIZJ();
        File file = new File(C38943FQd.LIZLLL().getPath(), C38943FQd.LIZ());
        C39579Fg7.LJFF(file);
        String path = file.getPath();
        o.LJIIIIZZ(path, "offlineBundleConfig.offlineRootDir()");
        OIB oib = new OIB(path);
        OIH oih = oib.LIZ;
        if (oih != null) {
            oih.LIZIZ = true;
        }
        oib.LIZIZ(LIZJ);
        oib.LIZIZ = new NJI(this);
        this.LIZIZ = oib;
    }

    @Override // X.InterfaceC39904FlM
    public final void LIZJ(String str) {
        Object value = this.LJFF.getValue();
        InterfaceC59138NIw interfaceC59138NIw = this.LJI;
        NJ2 nj2 = this.LIZJ;
        NJ2 nj22 = this.LIZLLL;
        NJ0 nj0 = this.LJ;
        value.getClass();
        if (interfaceC59138NIw == null) {
            return;
        }
        if (nj2 != null) {
            C59137NIv.LIZ(nj2, str, interfaceC59138NIw, nj0);
        }
        if (nj22 == null) {
            return;
        }
        C59137NIv.LIZ(nj22, str, interfaceC59138NIw, nj0);
    }

    public final void LJI(InterfaceC59138NIw interfaceC59138NIw) {
        boolean z;
        IAdLandPagePreloadService LJJI;
        String str;
        IAdLandPagePreloadService LJJI2;
        NJJ LJFF = LJFF();
        if (LJFF != null) {
            LJFF.LIZJ();
        }
        NJJ intercept = LJFF();
        o.LJIIIIZZ(intercept, "intercept");
        String LIZJ = interfaceC59138NIw.LIZJ();
        boolean z2 = false;
        if (LIZJ == null || ujb.o.LJJJJJL(LIZJ)) {
            z = true;
        } else {
            z = false;
        }
        if (!z && interfaceC59138NIw.LJIIJ() == 4 && interfaceC59138NIw.LIZLLL() == 1) {
            try {
                Boolean adLandingPagePreloadEnabled = C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getAdLandingPagePreloadEnabled();
                o.LJIIIIZZ(adLandingPagePreloadEnabled, "get()\n                .g…ndingPagePreloadEnabled()");
                if (!adLandingPagePreloadEnabled.booleanValue()) {
                }
            } catch (Exception unused) {
            }
            LIZLLL(intercept, interfaceC59138NIw);
            if ((!NJA.LIZ().enableRemoveUselessInterceptor || TextUtils.equals("splash", interfaceC59138NIw.LJ())) && (LJJI2 = AdLandPagePreloadServiceImpl.LJJI()) != null && !TextUtils.isEmpty(LJJI2.LJIIL("splash"))) {
                NJ2 nj2 = new NJ2(interfaceC59138NIw.LIZJ(), "splash", null);
                intercept.LIZIZ(nj2);
                LJIIIZ(nj2);
                NJ0 resourceDetail = this.LJ;
                o.LJIIIZ(resourceDetail, "resourceDetail");
                nj2.LJFF = resourceDetail;
                this.LIZLLL = nj2;
            }
            LJ(intercept, interfaceC59138NIw);
        }
        NJJ intercept2 = LJFF();
        o.LJIIIIZZ(intercept2, "intercept");
        String LJII = interfaceC59138NIw.LJII();
        if (LJII != null && (LJJI = AdLandPagePreloadServiceImpl.LJJI()) != null) {
            String LIZLLL = LJJI.LIZLLL(Long.valueOf(interfaceC59138NIw.LJFF()));
            if (LIZLLL == null || LIZLLL.length() == 0) {
                str = null;
            } else {
                str = NON.LIZIZ(LIZLLL, LJII);
            }
            if (interfaceC59138NIw.LIZIZ() && str != null && !ujb.o.LJJJJJL(str) && C78857UxB.LJJJIL(LJJI.LJIIL("lynx_feed"))) {
                NJ2 nj22 = new NJ2(str, "lynx_feed", null);
                intercept2.LIZIZ(nj22);
                LJIIIZ(nj22);
            }
        }
        NJJ intercept3 = LJFF();
        o.LJIIIIZZ(intercept3, "intercept");
        String LIZJ2 = interfaceC59138NIw.LIZJ();
        if (LIZJ2 != null && !ujb.o.LJJJJJL(LIZJ2) && interfaceC59138NIw.LJIIJJI() == 1) {
            LIZLLL(intercept3, interfaceC59138NIw);
            LJ(intercept3, interfaceC59138NIw);
        }
        List LLJILJILJ = ORZ.LLJILJILJ(C38943FQd.LIZJ());
        if (interfaceC59138NIw.LJIILIIL()) {
            try {
                List<String> adCardPreloadCommonPrefix = C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getAdCardPreloadCommonPrefix();
                o.LJIIIIZZ(adCardPreloadCommonPrefix, "get().getAdLandingPageCo…CardPreloadCommonPrefix()");
                if (!C79004UzY.LJJIFFI(adCardPreloadCommonPrefix)) {
                    for (String str2 : adCardPreloadCommonPrefix) {
                        if (C78857UxB.LJJJIL(str2)) {
                            Pattern compile = PatternProtector.compile(str2);
                            o.LJIIIIZZ(compile, "compile(prefix)");
                            ((ArrayList) LLJILJILJ).add(compile);
                        }
                    }
                }
            } catch (C158056If e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        OIB oib = this.LIZIZ;
        if (oib != null) {
            oib.LIZIZ(LLJILJILJ);
        }
        NJJ intercept4 = LJFF();
        o.LJIIIIZZ(intercept4, "intercept");
        LJIIIIZZ(intercept4, interfaceC59138NIw);
        this.LJI = interfaceC59138NIw;
        if (interfaceC59138NIw.LJFF() != 0 && (interfaceC59138NIw.LJIIJ() == 4 || interfaceC59138NIw.LJIIJJI() == 1)) {
            z2 = true;
        }
        NJ2.LJIILJJIL = z2;
    }

    public final void LIZLLL(NJJ njj, InterfaceC59138NIw interfaceC59138NIw) {
        IAdLandPagePreloadService LJJI;
        if ((!NJA.LIZ().enableRemoveUselessInterceptor || TextUtils.equals("feed", interfaceC59138NIw.LJ())) && (LJJI = AdLandPagePreloadServiceImpl.LJJI()) != null && !TextUtils.isEmpty(LJJI.LJIIL("feed"))) {
            NJ2 nj2 = new NJ2(interfaceC59138NIw.LIZJ(), "feed", null);
            njj.LIZIZ(nj2);
            LJIIIZ(nj2);
            NJ0 resourceDetail = this.LJ;
            o.LJIIIZ(resourceDetail, "resourceDetail");
            nj2.LJFF = resourceDetail;
            this.LIZJ = nj2;
        }
    }

    public final void LJ(NJJ njj, InterfaceC59138NIw interfaceC59138NIw) {
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI == null) {
            return;
        }
        String LJIIL = LJJI.LJIIL("global");
        if (e1.LIZ(31744, "enable_preload_pixel", true, false) && !TextUtils.isEmpty(LJIIL)) {
            NJ2 nj2 = new NJ2("pixel_preload", "global", new NJG(interfaceC59138NIw.LJFF(), interfaceC59138NIw));
            njj.LIZIZ(nj2);
            LJIIIZ(nj2);
        }
    }
}
