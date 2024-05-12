package X;

import Y.ARunnableS0S0510000_10;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.CommercializeFeedServiceImpl;
import com.ss.android.ugc.aweme.ad.prefetch.IAdWebViewPrefetchManager;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.autofill.AdAutofillService;
import com.ss.android.ugc.aweme.commercialize.feed.preload.PreloadData;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.model.AdWebUrlDataFromJsb;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import com.ss.android.ugc.aweme.commercialize.prefetch.AdWebViewPrefetchManager;
import com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.LandingPageNetworkOptimization;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import ujb.o;

/* loaded from: classes11.dex */
public class NOO extends NNJ {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.NNJ
    public final boolean LIZIZ() {
        boolean z;
        AwemeRawAd awemeRawAd;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        AwemeRawAd awemeRawAd2;
        int i2;
        String str;
        int i3;
        String str2;
        Aweme LJI;
        AwemeRawAd awemeRawAd3;
        AutofillModel autofillModel;
        String str3;
        String str4;
        AwemeRawAd awemeRawAd4;
        String str5;
        String str6;
        boolean z5;
        String str7;
        String str8;
        String str9;
        Integer num;
        Integer num2;
        OnBackPressedDispatcher onBackPressedDispatcher;
        C59218NLy c59218NLy;
        int i4;
        NMS nms;
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        NMS nms2;
        Long groupId;
        Aweme LJI2;
        AwemeRawAd awemeRawAd5;
        String str10;
        String str11;
        String str12;
        long j;
        Long creativeId;
        LandingPageSurveyModel landingPageSurvey;
        AwemeRawAd awemeRawAd6;
        boolean z6;
        AwemeRawAd awemeRawAd7;
        LandingPageNetworkOptimization landingPageNetworkOptimization;
        Aweme aweme;
        AwemeRawAd awemeRawAd8;
        AutofillModel autofillModel2;
        Aweme aweme2;
        AwemeRawAd awemeRawAd9;
        if (C59083NGt.LIZ) {
            String.valueOf(LIZLLL().LIZ.LIZJ);
        }
        if (C52285KfZ.LIZ() && o.LJJJLIIL(LIZLLL().LIZIZ.LIZ, "aweme://lynxview", false)) {
            JHI.LIZ().LJIIIZ = LIZLLL().LJ.LIZIZ;
            JHI.LIZ().LJIIIIZZ = -1;
            FeedAdServiceImpl.LJJIJLIJ().LJJIIZ(NOQ.LIZ(LIZLLL(), LIZJ(), LJI()));
            C224488rU.LIZIZ(LIZJ(), "click_ad_jsb");
            LIZLLL().LJ.LJFF = false;
            return true;
        }
        if (C40680Fxs.LIZIZ(LJII()) && C52471KiZ.LIZ() && LIZLLL().LIZIZ.LJIJJLI == 1 && LIZLLL().LIZIZ.LJIJ == 1) {
            z = true;
        } else {
            z = false;
        }
        AwemeRawAd awemeRawAd10 = null;
        if (z || (C40680Fxs.LIZIZ(LJII()) && ((C34084DZg.LIZ || CommerceWebCrossToSparkExt.LIZ()) && LIZLLL().LIZIZ.LJIJJLI == 1 && LIZLLL().LIZIZ.LJIJ != 1))) {
            Aweme LJI3 = LJI();
            if (LJI3 != null && (awemeRawAd = LJI3.getAwemeRawAd()) != null) {
                awemeRawAd.setAdWebUrlDataFromJsb(new AdWebUrlDataFromJsb(LJII(), LIZLLL().LIZIZ.LIZIZ, LIZLLL().LIZIZ.LJIILLIIL, LIZLLL().LIZIZ.LJJIIZI, LIZLLL().LJ.LIZIZ, LIZLLL().LIZIZ.LJIIL));
            }
            JHI.LIZ().LJIIIZ = LIZLLL().LJ.LIZIZ;
            JHI.LIZ().LJIIIIZZ = -1;
            C224488rU.LIZIZ(LIZJ(), "click_ad_web_jsb");
            LIZLLL().LJ.LJFF = false;
            return true;
        }
        Intent intent = new Intent(LIZJ(), (Class<?>) CrossPlatformActivity.class);
        android.net.Uri parse = UriProtector.parse(LJII());
        if (!LIZLLL().LIZIZ.LIZLLL.isEmpty()) {
            Uri.Builder buildUpon = UriProtector.parse(LJII()).buildUpon();
            for (Map.Entry<String, String> entry : LIZLLL().LIZIZ.LIZLLL.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            parse = buildUpon.build();
        }
        intent.setData(parse);
        if (!TextUtils.equals(UriProtector.getQueryParameter(parse, "launch_mode"), "standard")) {
            intent.addFlags(268435456);
        }
        if (LIZLLL().LIZIZ.LIZIZ.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            intent.putExtra("title", LIZLLL().LIZIZ.LIZIZ);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("show_report", LIZLLL().LIZIZ.LJFF);
        C59284NOm LIZ = C113504cs.LIZ();
        if (LIZ != null && (aweme2 = LIZ.LJIIL) != null && (awemeRawAd9 = aweme2.getAwemeRawAd()) != null) {
            z3 = awemeRawAd9.getWebApplyCamera();
        } else {
            z3 = false;
        }
        intent.putExtra("web_apply_camera", z3);
        C59284NOm LIZ2 = C113504cs.LIZ();
        if (LIZ2 != null && (aweme = LIZ2.LJIIL) != null && (awemeRawAd8 = aweme.getAwemeRawAd()) != null && (autofillModel2 = awemeRawAd8.getAutofillModel()) != null) {
            z4 = autofillModel2.getEnable();
        } else {
            z4 = false;
        }
        intent.putExtra("autofill_enable", z4);
        Aweme LJI4 = LJI();
        if (LJI4 != null && (awemeRawAd7 = LJI4.getAwemeRawAd()) != null && (landingPageNetworkOptimization = awemeRawAd7.getLandingPageNetworkOptimization()) != null) {
            i = landingPageNetworkOptimization.getNetworkOptimization();
        } else {
            i = 0;
        }
        intent.putExtra("network_optimization_type", i);
        intent.putExtra("bundle_app_ad_from", LIZLLL().LIZIZ.LJIILJJIL);
        if (LIZLLL().LIZ.LIZJ != 0) {
            intent.putExtra("ad_id", LIZLLL().LIZ.LIZJ);
            intent.putExtra("aweme_creative_id", String.valueOf(LIZLLL().LIZ.LIZJ));
            LJIIIIZZ(intent, "ad_type", LIZLLL().LIZ.LJFF);
            intent.putExtra("ad_system_origin", LIZLLL().LIZ.LJI);
            intent.putExtra("charge_type", LIZLLL().LIZ.LJII);
            LJIIIIZZ(intent, "bundle_download_app_log_extra", LIZLLL().LIZ.LIZLLL);
            intent.putExtra("landing_page_info", LIZLLL().LIZIZ.LJIJI);
            if (LIZLLL().LIZIZ.LJIJJ == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            intent.putExtra("need_bottom_out", z6);
        }
        String LIZ3 = SharePrefCache.inst().getJsActlogUrl().LIZ();
        if (LIZ3 != null && LIZ3.length() > 0) {
            intent.putExtra("ad_js_url", LIZ3);
        }
        intent.putExtra("bundle_disable_download_dialog", LIZLLL().LJFF.LIZLLL);
        if (LIZLLL().LJFF.LIZ.length() > 0) {
            intent.putExtra("bundle_download_url", LIZLLL().LJFF.LIZ);
            LJIIIIZZ(intent, "aweme_package_name", LIZLLL().LJFF.LIZIZ);
            intent.putExtra("bundle_is_from_app_ad", LIZLLL().LJFF.LJ);
            LJIIIIZZ(intent, "bundle_ad_quick_app_url", LIZLLL().LJFF.LIZJ);
            intent.putExtra("bundle_download_app_name", LIZLLL().LJFF.LJFF);
            intent.putExtra("bundle_download_mode", LIZLLL().LJFF.LJI);
            intent.putExtra("bundle_link_mode", LIZLLL().LJFF.LJII);
            intent.putExtra("bundle_support_multiple_download", LIZLLL().LJFF.LJIIIIZZ);
            intent.putExtra("bundle_web_url", LIZLLL().LJFF.LJIIIZ);
            intent.putExtra("bundle_web_title", LIZLLL().LJFF.LJIIJ);
            intent.putExtra("bundle_open_url", LIZLLL().LJFF.LJIIJJI);
        }
        Context LIZJ = LIZJ();
        Aweme LJI5 = LJI();
        if (LJI5 != null) {
            awemeRawAd2 = LJI5.getAwemeRawAd();
        } else {
            awemeRawAd2 = null;
        }
        String jSONObject = NN1.LJIILIIL(LIZJ, awemeRawAd2, false, null).toString();
        String str13 = "";
        if (jSONObject == null) {
            jSONObject = "";
        }
        intent.putExtra("aweme_json_extra", jSONObject);
        Long valueOf = Long.valueOf(LIZLLL().LIZ.LJ);
        if (valueOf.longValue() > 0) {
            intent.putExtra("group_id", valueOf.longValue());
        }
        Integer num3 = LIZLLL().LIZIZ.LJI;
        if (num3 != null) {
            intent.putExtra("bundle_webview_background", num3.intValue());
        }
        intent.putExtra("aweme_id", LIZLLL().LIZ.LJIIIIZZ);
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.o.LJIIIIZZ(uuid, "randomUUID().toString()");
        intent.putExtra("session_id", uuid);
        Aweme LJI6 = LJI();
        if (LJI6 != null && (awemeRawAd6 = LJI6.getAwemeRawAd()) != null) {
            i2 = awemeRawAd6.getPreloadH5Type();
        } else {
            i2 = 0;
        }
        intent.putExtra("preload_h5_type", i2);
        intent.putExtra("owner_id", LIZLLL().LIZ.LJIIIZ);
        intent.putExtra("bundle_forbidden_jump", LIZLLL().LIZIZ.LJII);
        intent.putExtra("use_ordinary_web", LIZLLL().LIZIZ.LJ);
        intent.putExtra("preload_channel_name", LIZLLL().LIZIZ.LJIIJJI);
        intent.putExtra("preload_scene", "feed");
        intent.putExtra("preload_web_status", LIZLLL().LIZIZ.LJIIIZ);
        intent.putExtra("preload_web_status_new", LIZLLL().LIZIZ.LJIIJ);
        intent.putExtra("preload_is_web_url", LIZLLL().LIZIZ.LJIIL);
        intent.putExtra("web_type", LIZLLL().LIZIZ.LJIILIIL);
        intent.putExtra("user_click_time", LIZLLL().LIZIZ.LJIILL);
        intent.putExtra("is_from_lynx_land_page", LIZLLL().LIZIZ.LJIILLIIL);
        intent.putExtra("is_from_jsb", LIZLLL().LIZIZ.LJJIIZI);
        intent.putExtra("preload_web_second_page", LIZLLL().LIZIZ.LJJIJ);
        intent.putExtra("second_page_preload_channel_name", LIZLLL().LIZIZ.LJIIZILJ);
        intent.putExtra("refer", LIZLLL().LJ.LIZIZ);
        Aweme LJI7 = LJI();
        if (LJI7 != null) {
            awemeRawAd10 = LJI7.getAwemeRawAd();
        }
        C59082NGs.LIZ = awemeRawAd10;
        Aweme LJI8 = LJI();
        if (LJI8 != null) {
            intent.putExtra("req_id", LJI8.getRequestId());
            AwemeRawAd awemeRawAd11 = LJI8.getAwemeRawAd();
            if (awemeRawAd11 != null && (landingPageSurvey = awemeRawAd11.getLandingPageSurvey()) != null) {
                intent.putExtra("ad_landing_enable_landing_page_survey", landingPageSurvey.getEnableLandingPageSurvey());
                intent.putExtra("ad_landing_show_survey_time_interval", landingPageSurvey.getShowSurveyTimeInterval());
                intent.putExtra("ad_landing_page_dwell_time", landingPageSurvey.getPageDwellTime());
                intent.putExtra("ad_landing_page_schema_url", landingPageSurvey.getSchemaUrl());
            }
        }
        if (C59083NGt.LIZ) {
            String.valueOf(LIZLLL().LIZ.LIZJ);
        }
        Context LIZJ2 = LIZJ();
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (!o.LJJJLIIL(LJII(), "aweme://lynxview", false)) {
            if (NJA.LIZ().enablePrefetchResource && (LJI2 = LJI()) != null && LJI2.getAwemeRawAd() != null) {
                Aweme LJI9 = LJI();
                if (LJI9 != null) {
                    awemeRawAd5 = LJI9.getAwemeRawAd();
                } else {
                    awemeRawAd5 = null;
                }
                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI != null) {
                    str10 = LJJI.LJIIL("feed");
                } else {
                    str10 = null;
                }
                IAdWebViewPrefetchManager LIZIZ = AdWebViewPrefetchManager.LIZIZ();
                if (awemeRawAd5 != null) {
                    str11 = awemeRawAd5.getChannelName();
                } else {
                    str11 = null;
                }
                if (awemeRawAd5 != null) {
                    str12 = awemeRawAd5.getWebUrl();
                } else {
                    str12 = null;
                }
                if (awemeRawAd5 == null || (creativeId = awemeRawAd5.getCreativeId()) == null) {
                    j = 0;
                } else {
                    j = creativeId.longValue();
                }
                LIZIZ.LIZ(j, str10, str11, str12);
            }
            LIZLLL().LJ.LIZLLL = true;
            C59230NMk c59230NMk = LIZLLL().LJ;
            c59230NMk.getClass();
            c59230NMk.LJ = uuid;
            LIZLLL().LJ.LJFF = true;
            if (CommerceWebCrossToSparkExt.LIZ()) {
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ == null) {
                    return false;
                }
                View findViewById = C16880lQ.LLLLIILL(LJIIIIZZ.getLayoutInflater(), R.layout.g7, (ViewGroup) LJIIIIZZ.findViewById(android.R.id.content), true).findViewById(R.id.uu);
                kotlin.jvm.internal.o.LJIIIIZZ(findViewById, "activity.layoutInflater.…id.ad_web_page_container)");
                FrameLayout frameLayout = (FrameLayout) findViewById;
                C59222NMc c59222NMc = new C59222NMc(0);
                Aweme LJI10 = LJI();
                if (LJI10 != null) {
                    awemeRawAd4 = LJI10.getAwemeRawAd();
                } else {
                    awemeRawAd4 = null;
                }
                c59222NMc.LIZ = awemeRawAd4;
                Aweme LJI11 = LJI();
                if (LJI11 != null) {
                    str5 = LJI11.getAid();
                } else {
                    str5 = null;
                }
                c59222NMc.LJFF = str5;
                c59222NMc.LIZIZ = LIZLLL().LIZIZ.LIZIZ;
                c59222NMc.LIZJ = LIZLLL().LIZIZ.LIZ;
                Aweme LJI12 = LJI();
                if (LJI12 != null) {
                    str6 = LJI12.getRequestId();
                } else {
                    str6 = null;
                }
                c59222NMc.LJIIIZ = str6;
                try {
                    android.net.Uri parse2 = UriProtector.parse(c59222NMc.LIZJ);
                    c59222NMc.LJIJJLI = parse2.getBooleanQueryParameter("hide_nav_bar", false);
                    c59222NMc.LJIL = parse2.getBooleanQueryParameter("hide_title_bar", false);
                    String queryParameter = UriProtector.getQueryParameter(parse2, "has_adinfojson");
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    c59222NMc.LJIJ = queryParameter;
                    String queryParameter2 = UriProtector.getQueryParameter(parse2, "adinfojson");
                    if (queryParameter2 != null) {
                        str13 = queryParameter2;
                    }
                    c59222NMc.LJIJI = str13;
                } catch (Exception e) {
                    C78983UzD.LJIIZILJ(e);
                }
                c59222NMc.LJ = LIZLLL().LJ.LIZIZ;
                c59222NMc.LJFF = LIZLLL().LIZ.LJIIIIZZ;
                c59222NMc.LJI = LIZLLL().LIZ.LJIIIZ;
                c59222NMc.LJII = true;
                c59222NMc.LJIIIIZZ = LIZLLL().LIZIZ.LJIIL;
                c59222NMc.LJIIL = LIZLLL().LIZIZ.LJJIIZI;
                c59222NMc.LJIIJ = AnonymousClass629.LIZ("randomUUID().toString()");
                if (LIZLLL().LIZIZ.LJJIIZI && kotlin.jvm.internal.o.LJ(LIZLLL().LJ.LIZIZ, "landing_page")) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                NPF npf = new NPF(LJIIIIZZ);
                C59421NTt c59421NTt = new C59421NTt(EnumC59053NFp.ONLY_RENDER, "", 0, false, null, new C59452NUy(LJII(), new Bundle(), c59222NMc, C59055NFr.LIZ("landing_page_3p"), new NMZ()), false, 188);
                IAdHybridContainerManager LIZLLL = AdHybridContainerManager.LIZLLL();
                EnumC59241NMv enumC59241NMv = EnumC59241NMv.WEB;
                AwemeRawAd awemeRawAd12 = c59222NMc.LIZ;
                if (awemeRawAd12 != null) {
                    str7 = awemeRawAd12.getCreativeIdStr();
                } else {
                    str7 = null;
                }
                AwemeRawAd awemeRawAd13 = c59222NMc.LIZ;
                if (awemeRawAd13 != null) {
                    str8 = awemeRawAd13.getLogExtra();
                } else {
                    str8 = null;
                }
                AwemeRawAd awemeRawAd14 = c59222NMc.LIZ;
                if (awemeRawAd14 != null && (groupId = awemeRawAd14.getGroupId()) != null) {
                    str9 = String.valueOf(groupId);
                } else {
                    str9 = null;
                }
                AwemeRawAd awemeRawAd15 = c59222NMc.LIZ;
                if (awemeRawAd15 != null) {
                    num = Integer.valueOf(awemeRawAd15.getChargeType());
                } else {
                    num = null;
                }
                AwemeRawAd awemeRawAd16 = c59222NMc.LIZ;
                if (awemeRawAd16 != null) {
                    num2 = Integer.valueOf(awemeRawAd16.getSystemOrigin());
                } else {
                    num2 = null;
                }
                AbstractC59064NGa LIZJ3 = LIZLLL.LIZJ(new C59066NGc("landing_page_1p", enumC59241NMv, LJIIIIZZ, new NGY(str7, str8, str9, num, num2, 32)), c59421NTt);
                LIZJ3.LJIILLIIL(npf);
                LIZJ3.LJIILIIL(npf);
                C68322mC c68322mC = new C68322mC();
                NMS LJI13 = LIZJ3.LJI(c59421NTt, false);
                boolean z7 = LJI13 instanceof Fragment;
                T t = LJI13;
                if (!z7) {
                    t = 0;
                }
                c68322mC.element = t;
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(LIZJ());
                if (LJJIFFI != null) {
                    onBackPressedDispatcher = LJJIFFI.getOnBackPressedDispatcher();
                } else {
                    onBackPressedDispatcher = null;
                }
                NMR nmr = new NMR(frameLayout, this, c68322mC, z5, LJIIIIZZ);
                ICommercializeFeedService LIZLLL2 = CommercializeFeedServiceImpl.LIZLLL();
                if (LIZLLL2 != null) {
                    c59218NLy = LIZLLL2.LIZIZ(LJIIIIZZ, new NMT(frameLayout, c68322mC));
                } else {
                    c59218NLy = null;
                }
                T t2 = c68322mC.element;
                if ((t2 instanceof NMS) && (nms2 = (NMS) t2) != null) {
                    nms2.LLLJIL(new ARunnableS0S0510000_10(this, frameLayout, c68322mC, c59218NLy, z5, LJIIIIZZ, 1));
                }
                Fragment fragment = (Fragment) c68322mC.element;
                if (fragment != null && (LJIIIIZZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
                    C1B3 c1b3 = new C1B3(supportFragmentManager);
                    i4 = 0;
                    c1b3.LJIIJJI(R.anim.fv, R.anim.g2, 0, 0);
                    c1b3.LJIIIIZZ(frameLayout.getId(), 1, fragment, null);
                    c1b3.LJIILL(true);
                } else {
                    i4 = 0;
                }
                frameLayout.setVisibility(i4);
                T t3 = c68322mC.element;
                if ((t3 instanceof NMS) && (nms = (NMS) t3) != null) {
                    nms.onShow();
                }
                if (!z5) {
                    IWF.LJJLIIIIJ().LJIILJJIL();
                }
                if (c59218NLy != null) {
                    c59218NLy.enable(true);
                }
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.LIZIZ(nmr);
                }
                return true;
            }
            return NNJ.LJFF(LIZJ(), intent);
        }
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        LLJJIJI.putBoolean("is_lynx_landing_page", true);
        LLJJIJI.putBoolean("hide_nav_bar", true);
        LLJJIJI.putBoolean("hide_status_bar", false);
        LLJJIJI.putBoolean("need_bottom_out", true);
        if (LIZLLL().LIZIZ.LJJIIJZLJL == 1) {
            if (!TextUtils.isEmpty(LIZLLL().LIZIZ.LJJ)) {
                LLJJIJI.putString("bundle_full_screen_bg_image", LIZLLL().LIZIZ.LJJ);
            }
            LLJJIJI.putInt("bundle_webview_background", 0);
        }
        LLJJIJI.putString("lynx_channel_name", LIZLLL().LIZIZ.LJJI);
        LLJJIJI.putString("bundle_native_site_custom_data", LIZLLL().LIZIZ.LJJIFFI);
        List<String> list = LIZLLL().LIZIZ.LJJIIJ;
        if (list != null && !list.isEmpty()) {
            IAdLandPagePreloadService LJJI2 = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI2 == null || (str4 = LJJI2.LIZLLL(Long.valueOf(LIZLLL().LIZ.LIZIZ))) == null) {
                str4 = "";
            }
            LLJJIJI.putString("second_page_preload_channel_prefix", str4);
            LJJI2.LJI();
            NHG.LJIILLIIL(LIZLLL().LIZIZ.LJJIIJ);
        }
        int i5 = LIZLLL().LIZIZ.LJJIJ;
        String str14 = LIZLLL().LIZIZ.LJIIJJI;
        if (i5 == 1 && str14.length() > 0) {
            LLJJIJI.putInt("preload_web_second_page", i5);
            IAdLandPagePreloadService LJJI3 = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI3 != null) {
                str3 = LJJI3.LJIIL("feed");
            } else {
                str3 = null;
            }
            NHG.LIZJ(str14, str3);
            new PthreadTimer("WebUrlHandler").schedule(new C59285NOn(str14), 2000L, 2000L);
        }
        LLJJIJI.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(KL2.LJIIJJI(LIZJ2), 1073741824));
        LLJJIJI.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(KL2.LJIIIZ(LIZJ2) - C63081OpJ.LJJJJLI(LIZJ2), 1073741824));
        android.net.Uri parse3 = UriProtector.parse(LJII());
        if (parse3.isHierarchical()) {
            LLJJIJI.putString("bundle_origin_url", UriProtector.getQueryParameter(parse3, "fallback_url"));
            if (TextUtils.equals(UriProtector.getQueryParameter(parse3, "async_layout"), "1")) {
                LLJJIJI.putBoolean("preset_safe_point", true);
                LLJJIJI.putInt("thread_strategy", 2);
            }
        }
        Uri.Builder buildUpon2 = parse3.buildUpon();
        JSONObject jSONObject2 = new JSONObject();
        PreloadData preloadData = LIZLLL().LIZIZ.LJIIIIZZ;
        if (preloadData == null || (str = preloadData.getSiteId()) == null) {
            str = "";
        }
        jSONObject2.put("siteId", str);
        jSONObject2.put("adId", String.valueOf(LIZLLL().LIZ.LIZIZ));
        jSONObject2.put("creativeId", String.valueOf(LIZLLL().LIZ.LIZJ));
        jSONObject2.put("logExtra", LIZLLL().LIZ.LIZLLL);
        jSONObject2.put("groupId", String.valueOf(LIZLLL().LIZ.LJ));
        jSONObject2.put("webUrl", LJII());
        jSONObject2.put("pageData", LIZLLL().LIZIZ.LJJII);
        jSONObject2.put("appData", LIZLLL().LIZIZ.LJJIII);
        jSONObject2.put("isRTL", C90193gN.LIZIZ(LIZJ()) ? 1 : 0);
        jSONObject2.put("topSafeAreaHeight", C63081OpJ.LJJJJLI(LIZJ()));
        if (C53201KuL.LIZ() && (LJI = LJI()) != null && (awemeRawAd3 = LJI.getAwemeRawAd()) != null && (autofillModel = awemeRawAd3.getAutofillModel()) != null && autofillModel.getEnable()) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        jSONObject2.put("isAutoFillEnable", i3);
        jSONObject2.put("autoFillInfo", AdAutofillService.LJIIIIZZ().LIZIZ());
        String jSONObject3 = jSONObject2.toString();
        kotlin.jvm.internal.o.LJIIIIZZ(jSONObject3, "dataObj.toString()");
        buildUpon2.appendQueryParameter("lynx_landing_page_data", jSONObject3);
        buildUpon2.appendQueryParameter("lynx_landing_page_title", LIZLLL().LIZIZ.LIZIZ);
        if (C59294NOw.LIZ()) {
            buildUpon2.appendQueryParameter("use_spark", "1");
            IAdSparkUtils LJFF = AdSparkUtils.LJFF();
            if (LJFF != null) {
                String builder = buildUpon2.toString();
                kotlin.jvm.internal.o.LJIIIIZZ(builder, "urlBuilder.toString()");
                IAdLandPagePreloadService LJJI4 = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI4 != null) {
                    str2 = LJJI4.LJIIL("lynx_feed");
                } else {
                    str2 = null;
                }
                LJFF.LIZLLL(LIZJ2, builder, LLJJIJI, str2, C59209NLp.LIZIZ(), false);
            }
        } else {
            String builder2 = buildUpon2.toString();
            kotlin.jvm.internal.o.LJIIIIZZ(builder2, "urlBuilder.toString()");
            C57415Mg7.LIZIZ(LIZJ2, builder2, "ad_commerce", LLJJIJI);
        }
        LIZLLL().LJ.LIZLLL = false;
        LIZLLL().LJ.LJFF = true;
        return true;
    }

    public static final Aweme LJI() {
        C59284NOm LIZ = C113504cs.LIZ();
        if (LIZ != null) {
            return LIZ.LJIIL;
        }
        return null;
    }

    @Override // X.NNJ
    public final boolean LIZ() {
        if (LJII().length() == 0) {
            return false;
        }
        if (C40680Fxs.LIZIZ(LJII())) {
            return true;
        }
        String LJII = LJII();
        if (!TextUtils.isEmpty(LJII)) {
            String lowerCase = LJII.toLowerCase();
            kotlin.jvm.internal.o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            if (o.LJJJLIIL(lowerCase, "aweme://lynxview", false)) {
                return true;
            }
        }
        return false;
    }

    public final String LJII() {
        return LIZLLL().LIZIZ.LIZ;
    }

    public static void LJIIIIZZ(Intent intent, String str, String str2) {
        if (str2 != null && str2.length() > 0) {
            intent.putExtra(str, str2);
        }
    }
}
