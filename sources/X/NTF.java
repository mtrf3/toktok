package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer;
import com.ss.android.ugc.aweme.commercialize.business.DownloadBusiness;
import com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AqS16S2000000_10;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public final class NTF implements InterfaceC59440NUm {
    public static final String LJ() {
        return String.valueOf(C38544FAu.LIZ);
    }

    public static final String LJI() {
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        return API_URL_PREFIX_SI;
    }

    public final void LJJIIZ() {
        C2U8.LIZ(new NTI());
    }

    public static final int LJFF() {
        return HG3.LJIILL().getCurUser().getAccountType();
    }

    @Override // X.InterfaceC59440NUm
    public final List<Pattern> LIZ() {
        return ORZ.LLJILJILJ(C38943FQd.LIZJ());
    }

    public static final boolean LJIIL(Activity activity) {
        return CrossPlatformLegacyServiceImpl.LJIJ().LJII(activity);
    }

    public static final List<InterfaceC38186Eyk> LJIIZILJ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        ArrayList arrayList = new ArrayList();
        C38049EwX c38049EwX = (C38049EwX) providerFactory.LIZJ(C38049EwX.class);
        Object LIZJ = providerFactory.LIZJ(Context.class);
        if (c38049EwX != null && LIZJ != null) {
            C40496Fuu c40496Fuu = new C40496Fuu(new WeakReference(LIZJ));
            c38049EwX.LIZ.hashCode();
            arrayList.add(C40225FqX.LIZIZ(providerFactory, "download_click", c40496Fuu));
        }
        return arrayList;
    }

    public static final List<InterfaceC38186Eyk> LJIJ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        ArrayList arrayList = new ArrayList();
        C38049EwX c38049EwX = (C38049EwX) providerFactory.LIZJ(C38049EwX.class);
        if (c38049EwX != null) {
            C40289FrZ c40289FrZ = new C40289FrZ(c38049EwX);
            arrayList.add(C40225FqX.LIZIZ(providerFactory, "openLightLandingPage", c40289FrZ));
            arrayList.add(C40225FqX.LIZIZ(providerFactory, "closeLightLandingPage", c40289FrZ));
        }
        return arrayList;
    }

    public static final List<InterfaceC38186Eyk> LJIJI(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return new ArrayList();
    }

    public static final void LJJII(InterfaceC59237NMr interfaceC59237NMr) {
        if (interfaceC59237NMr instanceof C59451NUx) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIIJ(((BaseCommonBizRootContainer) interfaceC59237NMr).LJLILLLLZI);
        } else {
            if (!(interfaceC59237NMr instanceof NVO)) {
                return;
            }
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIIJ(((NVO) interfaceC59237NMr).LJLIL);
        }
    }

    public static final void LJJIIZI(InterfaceC59237NMr interfaceC59237NMr) {
        DownloadBusiness downloadBusiness;
        if (interfaceC59237NMr instanceof C59451NUx) {
            DownloadBusiness downloadBusiness2 = (DownloadBusiness) ((BaseCommonBizRootContainer) interfaceC59237NMr).LJLILLLLZI.LIZ(DownloadBusiness.class);
            if (downloadBusiness2 != null) {
                downloadBusiness2.LIZIZ();
                return;
            }
            return;
        }
        if (!(interfaceC59237NMr instanceof NVO) || (downloadBusiness = (DownloadBusiness) ((NVO) interfaceC59237NMr).LJLIL.LIZ(DownloadBusiness.class)) == null) {
            return;
        }
        downloadBusiness.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.Map LIZLLL(C59451NUx c59451NUx) {
        if (c59451NUx instanceof C59451NUx) {
            ShareH5Service.LIZ.getClass();
            return C58149Mrx.LIZ().LJIILIIL(c59451NUx.LJLILLLLZI);
        }
        if (c59451NUx instanceof NVO) {
            ShareH5Service.LIZ.getClass();
            return C58149Mrx.LIZ().LJIILIIL(((NVO) c59451NUx).LJLIL);
        }
        return C113554cx.LJJJLIIL();
    }

    public final String LJIIIIZZ(String str) {
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI == null) {
            return "";
        }
        return LJII(str, LJJI.LJIIZILJ());
    }

    public final void LJIILIIL(AwemeRawAd awemeRawAd) {
        o.LJIIIZ(awemeRawAd, "awemeRawAd");
        AM3 am3 = new AM3();
        am3.LIZ = "landing_ad";
        new AM2(am3.LIZ, System.currentTimeMillis() - 5000, awemeRawAd);
    }

    public final void LJIJJLI(Activity activity) {
        activity.getWindow().setStatusBarColor(0);
        C27740Aue.LJII(activity);
    }

    public static final String LJII(String str, String str2) {
        IAdLandPagePreloadService LJJI;
        if (TextUtils.isEmpty(str) || (LJJI = AdLandPagePreloadServiceImpl.LJJI()) == null) {
            return "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return O3U.LIZJ(LJJI.LJIIL(str2), str);
    }

    public static final void LJIILJJIL(Object obj, String str) {
        if (obj instanceof C59451NUx) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJ(((BaseCommonBizRootContainer) obj).LJLILLLLZI, str);
            return;
        }
        if (obj instanceof NVO) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJ(((NVO) obj).LJLIL, str);
        } else if (obj instanceof NUQ) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJ(((NUQ) obj).LIZIZ, str);
        } else {
            if (!(obj instanceof NUR)) {
                return;
            }
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJ(((NUR) obj).LJLJI, str);
        }
    }

    public static final boolean LJIILL(Context context, String url) {
        o.LJIIIZ(url, "url");
        return C58972NCm.LJFF(context, UriProtector.parse(url));
    }

    public static final boolean LJIILLIIL(Activity activity, String str) {
        return CrossPlatformLegacyServiceImpl.LJIJ().LJIILIIL(activity, str);
    }

    public static final void LJIJJ(Activity activity, String str) {
        Aweme o6 = AwemeService.LIZ().o6(str);
        o.LJI(o6);
        a.LJIILLIIL().LJI(C26042AJy.LIZIZ(o6));
        a.LJIILLIIL().LIZJ(activity, C26042AJy.LIZJ("landing_page", o6));
    }

    public static final void LJJ(InterfaceC59237NMr interfaceC59237NMr, boolean z) {
        if (interfaceC59237NMr instanceof C59451NUx) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJJI(((BaseCommonBizRootContainer) interfaceC59237NMr).LJLILLLLZI, z);
        } else {
            if (!(interfaceC59237NMr instanceof NVO)) {
                return;
            }
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJJI(((NVO) interfaceC59237NMr).LJLIL, z);
        }
    }

    public static final String LJJIIJZLJL(String str, String str2) {
        if (o.LJ("sslocal", str) || o.LJ("localsdk", str)) {
            return FX2.LIZLLL(str2);
        }
        return str2;
    }

    public static final void LJJIJ(InterfaceC59237NMr interfaceC59237NMr, String str) {
        if (interfaceC59237NMr instanceof C59451NUx) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LIZLLL(((BaseCommonBizRootContainer) interfaceC59237NMr).LJLILLLLZI, str);
        } else {
            if (!(interfaceC59237NMr instanceof NVO)) {
                return;
            }
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LIZLLL(((NVO) interfaceC59237NMr).LJLIL, str);
        }
    }

    @Override // X.InterfaceC59440NUm
    public final void LIZIZ(String str, String str2) {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(NJL.LJLIL);
        NJJ njj = (NJJ) LIZIZ.getValue();
        if (njj != null) {
            njj.LIZJ();
        }
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI != null) {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(LJJI.LJIIL("feed"))) {
                    ((NJJ) LIZIZ.getValue()).LIZIZ(new NJ2(str, "feed", null));
                }
                if (!TextUtils.isEmpty(LJJI.LJIIL("splash"))) {
                    ((NJJ) LIZIZ.getValue()).LIZIZ(new NJ2(str, "splash", null));
                }
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(LJJI.LJIIL("lynx_feed"))) {
                ((NJJ) LIZIZ.getValue()).LIZIZ(new NJ2(str2, "lynx_feed", null));
            }
        }
    }

    public final void LIZJ(InterfaceC59237NMr interfaceC59237NMr, OM1 om1) {
        DownloadBusiness downloadBusiness;
        if ((interfaceC59237NMr instanceof C59451NUx) && (om1 instanceof C59614NaU)) {
            DownloadBusiness downloadBusiness2 = (DownloadBusiness) ((BaseCommonBizRootContainer) interfaceC59237NMr).LJLILLLLZI.LIZ(DownloadBusiness.class);
            if (downloadBusiness2 != null) {
                downloadBusiness2.LIZ(om1);
                return;
            }
            return;
        }
        if (!(interfaceC59237NMr instanceof NVO) || !(om1 instanceof WebKitView) || (downloadBusiness = (DownloadBusiness) ((NVO) interfaceC59237NMr).LJLIL.LIZ(DownloadBusiness.class)) == null) {
            return;
        }
        downloadBusiness.LIZ(om1);
    }

    public final void LJIIIZ(InterfaceC59237NMr interfaceC59237NMr, OM1 om1) {
        if ((interfaceC59237NMr instanceof C59451NUx) && (om1 instanceof C59614NaU)) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIILL(((BaseCommonBizRootContainer) interfaceC59237NMr).LJLILLLLZI, om1);
        } else {
            if (!(interfaceC59237NMr instanceof NVO) || !(om1 instanceof WebKitView)) {
                return;
            }
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIILL(((NVO) interfaceC59237NMr).LJLIL, om1);
        }
    }

    public final void LJIL(InterfaceC59237NMr interfaceC59237NMr, OM1 om1) {
        if ((interfaceC59237NMr instanceof C59451NUx) && (om1 instanceof C59614NaU)) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIIIZ(((BaseCommonBizRootContainer) interfaceC59237NMr).LJLILLLLZI, om1);
        } else {
            if (!(interfaceC59237NMr instanceof NVO) || !(om1 instanceof WebKitView)) {
                return;
            }
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIIIZ(((NVO) interfaceC59237NMr).LJLIL, om1);
        }
    }

    public final boolean LJJIII(Context context, String str) {
        return FX2.LIZIZ(context, str, null);
    }

    public static final boolean LJIIJ(Context context, String str, boolean z) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        C59284NOm LIZ = C113504cs.LIZ();
        String str2 = null;
        if (LIZ != null) {
            aweme = LIZ.LJIIL;
        } else {
            aweme = null;
        }
        if (!z && (NO5.LJIIIZ(context, aweme) || C55447LpT.LIZ(context, aweme))) {
            return true;
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            str2 = awemeRawAd.getClickId();
        }
        return NOE.LJJIIZ(context, str, str2);
    }

    public static final void LJJIFFI(Context context, View view, C107794Kx c107794Kx) {
        IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(context, view, c107794Kx);
    }

    public static final void LJJIIJ(String str, List<String> list, Long l, String str2, String str3, String str4) {
        new AqS16S2000000_10(str4, str3, 1);
        O8Z.LIZIZ(str, list, l, str2, null);
    }

    public final boolean LJIIJJI(Context context, android.net.Uri uri, Aweme aweme, N1V n1v, String str, String str2, boolean z, boolean z2) {
        if (context == null) {
            return false;
        }
        if (o.LJ(uri.getScheme(), "market")) {
            if (str2 == null) {
                str2 = "";
            }
            NPI.LIZ(n1v, str2, z2, NP8.LIZ(context));
            if (NP8.LIZ(context)) {
                NP8.LIZLLL(context, uri);
            }
            return true;
        }
        if (NP8.LIZIZ(uri)) {
            if (str2 == null) {
                str2 = "";
            }
            NPI.LIZ(n1v, str2, z2, NP8.LIZ(context));
            if (!NP8.LIZ(context)) {
                return false;
            }
            NP8.LJ(context, uri);
            return true;
        }
        if (NO5.LJ(uri)) {
            if (!C59252NNg.LJI(aweme) && !C59252NNg.LJ(aweme)) {
                return false;
            }
            if (!z) {
                if (n1v != null) {
                    n1v.LJIIL(str2);
                }
                return false;
            }
            if (str2 == null) {
                str2 = "";
            }
            NPI.LIZ(n1v, str2, z2, C58972NCm.LIZLLL(context, uri));
            if (!C58972NCm.LIZLLL(context, uri)) {
                return false;
            }
            C58972NCm.LJFF(context, uri);
            return true;
        }
        if (!C59252NNg.LJI(aweme) && !C59252NNg.LJ(aweme)) {
            return false;
        }
        if (!z) {
            if (n1v != null) {
                n1v.LJIIL(str2);
            }
            return false;
        }
        if (str2 == null) {
            str2 = "";
        }
        NPI.LIZ(n1v, str2, z2, C58972NCm.LJ(context, uri));
        if (C58972NCm.LJ(context, uri)) {
            C58972NCm.LJII(context, uri);
            return true;
        }
        if (o.LJ("sslocal", str) || o.LJ("localsdk", str)) {
            return false;
        }
        return true;
    }

    public final void LJJI(ActivityC45651qj activityC45651qj, String url, String title, boolean z, String str, int i, String str2, boolean z2) {
        String str3;
        String str4;
        AwemeRawAd awemeRawAd;
        String str5;
        View findViewById;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(title, "title");
        java.util.Map<Integer, AdPopUpWebPageHelper> map = AdPopUpWebPageHelper.LJLL;
        AdPopUpWebPageHelper adPopUpWebPageHelper = (AdPopUpWebPageHelper) ((LinkedHashMap) map).get(Integer.valueOf(activityC45651qj.hashCode()));
        if (adPopUpWebPageHelper == null || (C35172DrE.LIZ() && !TextUtils.equals(adPopUpWebPageHelper.LJLIL, url))) {
            adPopUpWebPageHelper = new AdPopUpWebPageHelper(activityC45651qj);
            map.put(Integer.valueOf(activityC45651qj.hashCode()), adPopUpWebPageHelper);
        }
        ActivityC45651qj LIZIZ = adPopUpWebPageHelper.LIZIZ();
        if (LIZIZ == null) {
            return;
        }
        ActivityC45651qj LIZIZ2 = adPopUpWebPageHelper.LIZIZ();
        if (LIZIZ2 != null) {
            Aweme LIZ = adPopUpWebPageHelper.LIZ();
            AwemeRawAd awemeRawAd5 = null;
            if (LIZ != null && (awemeRawAd4 = LIZ.getAwemeRawAd()) != null) {
                str3 = awemeRawAd4.getSource();
            } else {
                str3 = null;
            }
            String str6 = "";
            if (!TextUtils.isEmpty(str3)) {
                Aweme LIZ2 = adPopUpWebPageHelper.LIZ();
                if (LIZ2 != null && (awemeRawAd3 = LIZ2.getAwemeRawAd()) != null) {
                    str4 = awemeRawAd3.getSource();
                } else {
                    str4 = null;
                }
            } else {
                Aweme LIZ3 = adPopUpWebPageHelper.LIZ();
                if (LIZ3 == null || (awemeRawAd = LIZ3.getAwemeRawAd()) == null || (str4 = awemeRawAd.getWebTitle()) == null) {
                    str4 = "";
                }
            }
            NTH nth = new NTH();
            Aweme LIZ4 = adPopUpWebPageHelper.LIZ();
            if (LIZ4 == null || (awemeRawAd2 = LIZ4.getAwemeRawAd()) == null || (str5 = awemeRawAd2.getWebUrl()) == null) {
                str5 = "";
            }
            nth.LIZ = str5;
            nth.LJFF = LIZIZ2;
            int LJJJJLI = C63081OpJ.LJJJJLI(LIZIZ2);
            if (C42391GkN.LIZIZ(LIZIZ2).getId() != R.id.qn ? (LIZIZ2 instanceof SparkActivity) : !((findViewById = LIZIZ2.findViewById(R.id.b12)) == null || findViewById.getPaddingTop() <= 0)) {
                LJJJJLI = 0;
            }
            nth.LIZIZ = LJJJJLI;
            if (str4 != null) {
                str6 = str4;
            }
            nth.LIZJ = str6;
            Bundle bundle = new Bundle();
            Aweme LIZ5 = adPopUpWebPageHelper.LIZ();
            if (LIZ5 != null && LIZ5.getAwemeRawAd() != null) {
                C17J.LJIIJJI(LIZIZ2, bundle, adPopUpWebPageHelper.LIZ());
                C17J.LJIIL(LIZIZ2, bundle, adPopUpWebPageHelper.LIZ());
                C17J.LJIILJJIL(LIZIZ2, bundle, adPopUpWebPageHelper.LIZ());
                adPopUpWebPageHelper.LIZ();
                C17J.LJIILIIL(LIZIZ2, bundle);
            }
            nth.LIZLLL = bundle;
            Aweme LIZ6 = adPopUpWebPageHelper.LIZ();
            if (LIZ6 != null) {
                awemeRawAd5 = LIZ6.getAwemeRawAd();
            }
            nth.LJ = awemeRawAd5;
            nth.LJI = true;
            NWW LIZ7 = nth.LIZ();
            NTB ntb = adPopUpWebPageHelper.LJLJL;
            NTD ntd = adPopUpWebPageHelper.LJLJLJ;
            NWF LIZ8 = C42391GkN.LIZ(LIZIZ2);
            if (LIZ8 == null) {
                LIZ8 = new NWF(LIZIZ2);
                LIZ8.setId(R.id.tl);
                LIZ8.setParams(LIZ7);
                LIZ8.setMBehaviorCallback(ntb);
                LIZ8.setKeyDownCallBack(ntd);
                C42391GkN.LIZIZ(LIZIZ2).addView(LIZ8);
            }
            adPopUpWebPageHelper.LJLJJL = LIZ8;
            LIZ8.setTitleBarCallback(adPopUpWebPageHelper.LJLJLLL);
        }
        NWF nwf = adPopUpWebPageHelper.LJLJJL;
        if (nwf == null) {
            return;
        }
        adPopUpWebPageHelper.LJLIL = url;
        nwf.LJIIIIZZ(new NOK(nwf, LIZIZ, adPopUpWebPageHelper, url, title, str2, z, str, i, z2));
    }
}
