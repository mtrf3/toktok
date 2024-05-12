package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes11.dex */
public final class NVC implements InterfaceC60473NoL {
    public boolean LIZ;
    public final /* synthetic */ NVB LIZIZ;

    @Override // X.InterfaceC60473NoL
    public final void LIZ() {
        this.LIZIZ.LJI(7);
    }

    @Override // X.InterfaceC60473NoL
    public final void LIZIZ() {
        PreRenderWebViewBusiness LIZ;
        Aweme aweme;
        Aweme aweme2;
        NUT nut;
        this.LIZIZ.LJI(3);
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        this.LIZIZ.LLD = System.currentTimeMillis();
        NVF nvf = this.LIZIZ.LJZ;
        if (nvf != null) {
            Rect rect = new Rect();
            ((View) nvf.LIZIZ.getValue()).getWindowVisibleDisplayFrame(rect);
            int height = rect.height();
            nvf.LIZLLL = height;
            nvf.LIZJ = height;
            ((View) nvf.LIZIZ.getValue()).getViewTreeObserver().addOnGlobalLayoutListener(nvf.LJ);
        }
        NVB nvb = this.LIZIZ;
        if (nvb.LJLJLLL) {
            nvb.getMBulletWebView().setVisibility(0);
            this.LIZIZ.getMWebView().setVisibility(8);
            C59614NaU webView = this.LIZIZ.getMBulletWebView().getWebView();
            if (webView != null) {
                webView.loadUrl("javascript:window.dialogPopUp()");
            }
            C59451NUx rootContainer = this.LIZIZ.getMBulletWebView().getRootContainer();
            if (rootContainer != null && (nut = rootContainer.LJLILLLLZI) != null) {
                NVB nvb2 = this.LIZIZ;
                com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness LIZ2 = NUW.LIZ(nut);
                if (LIZ2 != null) {
                    LIZ2.LIZ(nvb2.LLFII);
                }
            }
        } else {
            ((NXI) nvb.getMWebView().LJI(NXI.class)).LIZ().loadUrl("javascript:window.dialogPopUp()");
            CommercializeWebViewHelper commercializeWebViewHelper = this.LIZIZ.LJZL;
            if (commercializeWebViewHelper != null && (LIZ = NV9.LIZ(commercializeWebViewHelper)) != null) {
                LIZ.LIZIZ(this.LIZIZ.LLFII);
            }
        }
        NU4 nu4 = this.LIZIZ.LJLLJ;
        if (nu4 == null || nu4.LIZLLL) {
            C59127NIl LIZ3 = C59128NIm.LIZ();
            LIZ3.LIZ = "light_ad";
            LIZ3.LIZIZ = "detail_show";
            NU4 params = this.LIZIZ.getParams();
            AwemeRawAd awemeRawAd = null;
            if (params != null) {
                aweme = params.LIZJ;
            } else {
                aweme = null;
            }
            LIZ3.LJ(aweme);
            LIZ3.LJIIIZ(null);
            NU4 params2 = this.LIZIZ.getParams();
            if (params2 != null && (aweme2 = params2.LIZJ) != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            }
            C58704N2e.LIZLLL("light_ad", "detail_show", awemeRawAd).LJII();
        }
        NVJ callback = this.LIZIZ.getCallback();
        if (callback != null) {
            callback.onShow();
        }
        NVE nve = this.LIZIZ.LJZI;
        if (nve != null) {
            nve.enable(true);
        }
    }

    @Override // X.InterfaceC60473NoL
    public final void LIZJ() {
        if (this.LIZIZ.getMBottomSheet().getHideable()) {
            NVB nvb = this.LIZIZ;
            if (nvb.LLF) {
                nvb.LLF = false;
                C9UE.LIZIZ(nvb.getContext());
            }
        }
        this.LIZIZ.LJI(1);
    }

    @Override // X.InterfaceC60473NoL
    public final void LIZLLL() {
        PreRenderWebViewBusiness LIZ;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        Aweme aweme2;
        String l;
        Long l2;
        String str;
        Aweme aweme3;
        AwemeRawAd awemeRawAd2;
        Aweme aweme4;
        AwemeRawAd awemeRawAd3;
        Aweme aweme5;
        NUT nut;
        com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness LIZ2;
        if (!this.LIZ) {
            return;
        }
        this.LIZ = false;
        NVF nvf = this.LIZIZ.LJZ;
        if (nvf != null) {
            ((View) nvf.LIZIZ.getValue()).getViewTreeObserver().removeOnGlobalLayoutListener(nvf.LJ);
        }
        NVB nvb = this.LIZIZ;
        if (nvb.LJLJLLL) {
            C59451NUx rootContainer = nvb.getMBulletWebView().getRootContainer();
            if (rootContainer != null && (nut = rootContainer.LJLILLLLZI) != null && (LIZ2 = NUW.LIZ(nut)) != null) {
                LIZ2.LIZIZ = 0;
                InterfaceC59229NMj interfaceC59229NMj = LIZ2.LIZ.LIZLLL;
                if (interfaceC59229NMj != null) {
                    interfaceC59229NMj.LIZ("webViewDidHide", null);
                }
            }
        } else {
            CommercializeWebViewHelper commercializeWebViewHelper = nvb.LJZL;
            if (commercializeWebViewHelper != null && (LIZ = NV9.LIZ(commercializeWebViewHelper)) != null) {
                LIZ.LJ = 0;
                C38049EwX c38049EwX = LIZ.LIZLLL;
                if (c38049EwX != null) {
                    c38049EwX.LJIIIIZZ("webViewDidHide", null);
                }
            }
        }
        NU4 nu4 = this.LIZIZ.LJLLJ;
        if (nu4 == null || nu4.LIZLLL) {
            C59127NIl LIZ3 = C59128NIm.LIZ();
            LIZ3.LIZ = "light_ad";
            LIZ3.LIZIZ = "landing_page";
            String str2 = this.LIZIZ.LL;
            String str3 = "slide";
            if (str2 == null) {
                str2 = "slide";
            }
            LIZ3.LJIIIIZZ(str2);
            NU4 params = this.LIZIZ.getParams();
            if (params != null) {
                aweme = params.LIZJ;
            } else {
                aweme = null;
            }
            LIZ3.LJ(aweme);
            LIZ3.LJIIIZ(null);
            NU4 params2 = this.LIZIZ.getParams();
            if (params2 != null && (aweme5 = params2.LIZJ) != null) {
                awemeRawAd = aweme5.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("light_ad", "landing_page", awemeRawAd);
            String str4 = this.LIZIZ.LL;
            if (str4 != null) {
                str3 = str4;
            }
            LIZLLL.LIZJ(str3, "refer");
            LIZLLL.LJII();
            C59127NIl LIZ4 = C59128NIm.LIZ();
            LIZ4.LIZ = "ad_wap_stat";
            LIZ4.LIZIZ = "stay_page";
            NU4 params3 = this.LIZIZ.getParams();
            if (params3 != null) {
                aweme2 = params3.LIZJ;
            } else {
                aweme2 = null;
            }
            LIZ4.LJ(aweme2);
            Long valueOf = Long.valueOf(System.currentTimeMillis() - this.LIZIZ.LLD);
            if (valueOf == null) {
                l = null;
            } else {
                l = valueOf.toString();
            }
            LIZ4.LIZLLL = l;
            LIZ4.LIZ(C113554cx.LJJLIIIIJ(new OSZ("light_page", 1)));
            LIZ4.LJIIIZ(null);
            NU4 params4 = this.LIZIZ.getParams();
            if (params4 != null && (aweme4 = params4.LIZJ) != null && (awemeRawAd3 = aweme4.getAwemeRawAd()) != null) {
                l2 = awemeRawAd3.getCreativeId();
            } else {
                l2 = null;
            }
            String valueOf2 = String.valueOf(l2);
            NU4 params5 = this.LIZIZ.getParams();
            if (params5 != null && (aweme3 = params5.LIZJ) != null && (awemeRawAd2 = aweme3.getAwemeRawAd()) != null) {
                str = awemeRawAd2.getLogExtra();
            } else {
                str = null;
            }
            C58655N0h LJ = C58704N2e.LJ("ad_wap_stat", "stay_page", valueOf2, str, String.valueOf(System.currentTimeMillis() - this.LIZIZ.LLD));
            LJ.LIZIZ(1, "light_page");
            LJ.LJII();
        }
        NVB nvb2 = this.LIZIZ;
        nvb2.LL = null;
        NVJ callback = nvb2.getCallback();
        if (callback != null) {
            callback.onHide();
        }
        NVE nve = this.LIZIZ.LJZI;
        if (nve != null) {
            nve.enable(false);
        }
        this.LIZIZ.LJI(4);
    }

    public NVC(NVB nvb) {
        this.LIZIZ = nvb;
    }
}
