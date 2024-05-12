package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.bullet.business.ReportBusiness;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageContainer;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public final class NWC implements InterfaceC59495NWp {
    public final /* synthetic */ NWF LIZ;
    public final /* synthetic */ Context LIZIZ;

    @Override // X.InterfaceC59495NWp
    public final void LIZ() {
        NWF nwf = this.LIZ;
        if (nwf.LJLJJL) {
            if (nwf.LJLJJLL) {
                WebKitView webKitView = ((C59232NMm) nwf.LIZ(R.id.hxj)).LJLJJL;
                if (webKitView != null && webKitView.canGoBack()) {
                    webKitView.goBack();
                }
            } else {
                C59614NaU c59614NaU = ((NWH) nwf.LIZ(R.id.hxi)).LLI;
                if (c59614NaU != null && c59614NaU.LJLLLL()) {
                    c59614NaU.goBack();
                }
            }
        } else {
            ((NZQ) nwf.LIZ(R.id.hxh)).goBack();
        }
        NWE titleBarCallback = this.LIZ.getTitleBarCallback();
        if (titleBarCallback != null) {
            titleBarCallback.LIZIZ();
        }
    }

    @Override // X.InterfaceC59495NWp
    public final void LIZIZ() {
        if (this.LIZ.LIZIZ(true)) {
            return;
        }
        this.LIZ.getClass();
        this.LIZ.LIZLLL(false);
        NWE titleBarCallback = this.LIZ.getTitleBarCallback();
        if (titleBarCallback != null) {
            titleBarCallback.LIZ();
        }
    }

    @Override // X.InterfaceC59495NWp
    public final void LIZJ() {
        C59308NPk c59308NPk;
        BusinessService.Business LIZ;
        C59304NPg c59304NPg;
        NUT nut;
        C59304NPg c59304NPg2;
        NUT nut2;
        Activity LJIJJ = C45804HyK.LJIJJ(this.LIZIZ);
        if (LJIJJ == null) {
            return;
        }
        NWF nwf = this.LIZ;
        if (nwf.LJLJJL) {
            C59472NVs c59472NVs = null;
            if (nwf.LJLJJLL) {
                NVO rootContainer = ((C59232NMm) nwf.LIZ(R.id.hxj)).getRootContainer();
                if (rootContainer != null && (nut2 = rootContainer.LJLIL) != null) {
                    c59472NVs = nut2.getParams();
                }
                if ((c59472NVs instanceof NP1) && (c59304NPg2 = (C59304NPg) c59472NVs) != null) {
                    String LIZLLL = c59304NPg2.LIZLLL();
                    NVO rootContainer2 = ((C59232NMm) this.LIZ.LIZ(R.id.hxj)).getRootContainer();
                    if (rootContainer2 != null && rootContainer2.LJLIL.LIZ(ReportBusiness.class) != null) {
                        ReportBusiness.LIZ(LJIJJ, LIZLLL);
                    }
                } else {
                    return;
                }
            } else {
                C59451NUx rootContainer3 = ((NWH) nwf.LIZ(R.id.hxi)).getRootContainer();
                if (rootContainer3 != null && (nut = rootContainer3.LJLILLLLZI) != null) {
                    c59472NVs = nut.getParams();
                }
                if ((c59472NVs instanceof NP1) && (c59304NPg = (C59304NPg) c59472NVs) != null) {
                    String LIZLLL2 = c59304NPg.LIZLLL();
                    C59451NUx rootContainer4 = ((NWH) this.LIZ.LIZ(R.id.hxi)).getRootContainer();
                    if (rootContainer4 != null && rootContainer4.LJLILLLLZI.LIZ(ReportBusiness.class) != null) {
                        ReportBusiness.LIZ(LJIJJ, LIZLLL2);
                    }
                } else {
                    return;
                }
            }
        } else {
            C59314NPq crossPlatformParams = ((NZQ) nwf.LIZ(R.id.hxh)).getCrossPlatformParams();
            if (crossPlatformParams == null || (c59308NPk = crossPlatformParams.LIZ) == null || c59308NPk.LJIIIZ == null) {
                return;
            }
            NTL crossPlatformBusiness = ((NZQ) this.LIZ.LIZ(R.id.hxh)).getCrossPlatformBusiness();
            if (crossPlatformBusiness != null && (LIZ = ((C59484NWe) crossPlatformBusiness).LIZ(com.ss.android.ugc.aweme.commercialize.business.ReportBusiness.class)) != null) {
                Aweme o6 = AwemeService.LIZ().o6(LIZ.LIZIZ.LIZ.LJIIIZ);
                a.LJIILLIIL().LJI(C26042AJy.LIZIZ(o6));
                a.LJIILLIIL().LIZJ(LJIJJ, C26042AJy.LIZJ("landing_page", o6));
            }
        }
        NWE titleBarCallback = this.LIZ.getTitleBarCallback();
        if (titleBarCallback != null) {
            titleBarCallback.LIZJ();
        }
    }

    @Override // X.InterfaceC59495NWp
    public final void LIZLLL() {
        String str;
        String str2;
        C59273NOb c59273NOb;
        C59273NOb c59273NOb2;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        String str3;
        String str4;
        EnumC60794NtW enumC60794NtW;
        AbstractC37353ElJ abstractC37353ElJ;
        AbstractC37353ElJ abstractC37353ElJ2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        if (this.LIZ.LJIIJ()) {
            int i = 1;
            String str5 = null;
            if (CommerceWebCrossToSparkExt.LIZIZ()) {
                NOJ noj = this.LIZ.LJLLL;
                if (noj != null && (awemeRawAd4 = noj.LIZIZ) != null) {
                    str3 = awemeRawAd4.getCreativeIdStr();
                } else {
                    str3 = null;
                }
                NOJ noj2 = this.LIZ.LJLLL;
                if (noj2 != null && (awemeRawAd3 = noj2.LIZIZ) != null) {
                    str4 = awemeRawAd3.getLogExtra();
                } else {
                    str4 = null;
                }
                C59222NMc adWebModel = ((NWI) this.LIZ.LIZ(R.id.uv)).getAdWebModel();
                if (adWebModel != null) {
                    str5 = adWebModel.LJIILL;
                }
                C59222NMc adWebModel2 = ((NWI) this.LIZ.LIZ(R.id.uv)).getAdWebModel();
                if (adWebModel2 != null) {
                    i = adWebModel2.LJIILLIIL;
                }
                NWB.LIZ(i, str3, str4, str5);
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView = ((NWI) this.LIZ.LIZ(R.id.uv)).getSparkView();
                if (sparkView == null || (enumC60794NtW = sparkView.LJZI) == null) {
                    enumC60794NtW = EnumC60794NtW.INIT;
                }
                if (enumC60794NtW.ordinal() >= EnumC60794NtW.SUCCESS.ordinal()) {
                    AdSparkContext sparkContext = ((NWI) this.LIZ.LIZ(R.id.uv)).getSparkContext();
                    if (sparkContext != null && (abstractC37353ElJ2 = (AbstractC37353ElJ) sparkContext.LIZIZ(AbstractC37353ElJ.class)) != null) {
                        NWF nwf = this.LIZ;
                        ShareH5Service.LIZ.getClass();
                        C58149Mrx.LIZ().LIZ(abstractC37353ElJ2, ((NWI) nwf.LIZ(R.id.uv)).getWebView());
                        return;
                    }
                    return;
                }
                AdSparkContext sparkContext2 = ((NWI) this.LIZ.LIZ(R.id.uv)).getSparkContext();
                if (sparkContext2 == null || (abstractC37353ElJ = (AbstractC37353ElJ) sparkContext2.LIZIZ(AbstractC37353ElJ.class)) == null) {
                    return;
                }
                ShareH5Service.LIZ.getClass();
                C58149Mrx.LIZ().LJIIIIZZ(abstractC37353ElJ);
                return;
            }
            NOJ noj3 = this.LIZ.LJLLL;
            if (noj3 != null && (awemeRawAd2 = noj3.LIZIZ) != null) {
                str = awemeRawAd2.getCreativeIdStr();
            } else {
                str = null;
            }
            NOJ noj4 = this.LIZ.LJLLL;
            if (noj4 != null && (awemeRawAd = noj4.LIZIZ) != null) {
                str2 = awemeRawAd.getLogExtra();
            } else {
                str2 = null;
            }
            AdPopUpWebPageContainer adPopUpWebPageContainer = this.LIZ.LJLILLLLZI;
            if (adPopUpWebPageContainer != null) {
                C59314NPq c59314NPq = adPopUpWebPageContainer.LJLJJI;
                if (c59314NPq != null && (c59273NOb2 = c59314NPq.LIZIZ) != null) {
                    str5 = c59273NOb2.LJJJLZIJ;
                }
                C59314NPq c59314NPq2 = adPopUpWebPageContainer.LJLJJI;
                if (c59314NPq2 != null && (c59273NOb = c59314NPq2.LIZIZ) != null) {
                    i = c59273NOb.LJJJZ;
                }
            }
            NWB.LIZ(i, str, str2, str5);
            if (this.LIZ.LJLJLJ) {
                ShareH5Service.LIZ.getClass();
                ShareH5Service LIZ = C58149Mrx.LIZ();
                NTL crossPlatformBusiness = ((NZQ) this.LIZ.LIZ(R.id.hxh)).getCrossPlatformBusiness();
                NZR LIZ2 = ((NXI) ((NZQ) this.LIZ.LIZ(R.id.hxh)).LJI(NXI.class)).LIZ();
                o.LJIIIIZZ(LIZ2, "pop_up_web_page_webview.…Wrap::class.java).webView");
                LIZ.LJIIJJI(crossPlatformBusiness, LIZ2, 2);
                return;
            }
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIJJ(((NZQ) this.LIZ.LIZ(R.id.hxh)).getCrossPlatformBusiness(), 2);
        }
    }

    public NWC(Context context, NWF nwf) {
        this.LIZ = nwf;
        this.LIZIZ = context;
    }
}
