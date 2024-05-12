package X;

import Y.ARunnableS14S0400000_10;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ad.feed.CommercializeFeedServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.abtest.CommerceAdLandpageBulletConfig;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.BrowserConfig;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.ad.LandingPageNetworkOptimization;
import com.ss.android.ugc.aweme.log.AdWebLogService;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public final class NOP {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        C61291O3r.LIZIZ();
        C61291O3r.LIZ(new C2WU(str, "Jump directly to open the landing page", 0));
    }

    public static boolean LIZIZ(Context context, AwemeRawAd awemeRawAd, String url) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(context, "context");
        android.net.Uri parse = UriProtector.parse(url);
        if (o.LJ(parse.getScheme(), "market")) {
            C58972NCm.LJI(context, awemeRawAd, url, NP8.LIZ(context));
            if (NP8.LIZ(context)) {
                NP8.LIZLLL(context, parse);
            } else {
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                if (LJIJJ != null) {
                    AnonymousClass114.LIZ(LJIJJ, R.string.b95);
                }
            }
            return true;
        }
        if (NP8.LIZIZ(parse)) {
            C58972NCm.LJI(context, awemeRawAd, url, NP8.LIZ(context));
            if (!NP8.LIZ(context)) {
                return false;
            }
            NP8.LJ(context, parse);
            return true;
        }
        if (NO5.LJ(parse)) {
            C58972NCm.LJI(context, awemeRawAd, url, C58972NCm.LIZLLL(context, parse));
            if (!C58972NCm.LIZLLL(context, parse)) {
                return false;
            }
            C58972NCm.LJFF(context, parse);
            return true;
        }
        C58972NCm.LJI(context, awemeRawAd, url, C58972NCm.LJ(context, parse));
        if (C58972NCm.LJ(context, parse)) {
            C58972NCm.LJII(context, parse);
        } else {
            if (o.LJ("sslocal", parse.getScheme()) || o.LJ("localsdk", parse.getScheme())) {
                C57422MgE.LIZIZ(context, url, null, false);
            }
            Activity LJIJJ2 = C45804HyK.LJIJJ(context);
            if (LJIJJ2 != null) {
                AnonymousClass114.LIZ(LJIJJ2, R.string.b95);
            }
        }
        return true;
    }

    public static final boolean LIZJ(Context context, String str, String str2, boolean z, java.util.Map<String, String> map, boolean z2, C59272NOa c59272NOa, Integer num) {
        String str3;
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (map != null && (!map.isEmpty())) {
            C38281F0r c38281F0r = new C38281F0r(str);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c38281F0r.LIZLLL(entry.getKey(), entry.getValue());
            }
            str = c38281F0r.LJ();
        }
        Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
        intent.setData(UriProtector.parse(str));
        android.net.Uri data = intent.getData();
        Integer num2 = null;
        if (data != null) {
            str3 = UriProtector.getQueryParameter(data, "launch_mode");
        } else {
            str3 = null;
        }
        if (!TextUtils.equals(str3, "standard")) {
            intent.setFlags(268435456);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("title", str2);
        } else {
            intent.putExtra("title", " ");
            intent.putExtra("use_webview_title", true);
        }
        intent.putExtra("hide_nav_bar", z);
        intent.putExtra("bundle_forbidden_jump", true);
        intent.putExtra("use_ordinary_web", z2);
        if (c59272NOa != null) {
            if (!TextUtils.isEmpty(c59272NOa.LIZIZ)) {
                intent.putExtra("bundle_download_app_log_extra", c59272NOa.LIZIZ);
            }
            Long l = c59272NOa.LIZ;
            if (l == null || l.longValue() != 0) {
                intent.putExtra("ad_id", c59272NOa.LIZ);
                intent.putExtra("refer", NNT.LIZ(num));
                intent.putExtra("ad_type", c59272NOa.LJFF);
                intent.putExtra("ad_system_origin", c59272NOa.LJI);
                intent.putExtra("aweme_creative_id", String.valueOf(c59272NOa.LIZ));
            }
            String LIZ2 = SharePrefCache.inst().getJsActlogUrl().LIZ();
            if (!TextUtils.isEmpty(LIZ2)) {
                intent.putExtra("ad_js_url", LIZ2);
            }
            if (!TextUtils.isEmpty(c59272NOa.LIZJ)) {
                intent.putExtra("bundle_download_url", c59272NOa.LIZJ);
                intent.putExtra("aweme_package_name", c59272NOa.LIZLLL);
                intent.putExtra("bundle_download_app_name", c59272NOa.LJ);
                intent.putExtra("bundle_app_ad_from", c59272NOa.LJII);
                intent.putExtra("bundle_is_from_app_ad", true);
                if (map != null) {
                    String str4 = map.get("aweme_package_name");
                    String str5 = map.get("bundle_app_ad_from");
                    if (str5 != null) {
                        num2 = Integer.valueOf(CastIntegerProtector.parseInt(str5));
                    }
                    intent.putExtra("bundle_app_ad_from", num2);
                    intent.putExtra("aweme_package_name", str4);
                    if (num2 != null && num2.intValue() == 6) {
                        intent.putExtra("bundle_is_from_comment_app_ad", true);
                    }
                }
            }
        }
        LIZ(str);
        return NO5.LJIL(context, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LIZLLL(Context context, Aweme aweme, String str, String str2, boolean z, int i, Boolean bool, Integer num) {
        int i2;
        boolean z2;
        int i3;
        Integer num2;
        String str3;
        AwemeSplashInfo awemeSplashInfo;
        boolean z3;
        String str4;
        BrowserConfig browserConfig;
        String str5;
        AwemeRawAd awemeRawAd;
        String str6;
        String str7;
        String str8;
        List<String> secondPageGeckoChannel;
        String str9;
        List<String> geckoChannel;
        UrlModel originCover;
        List<String> urlList;
        int i4;
        String LIZ2;
        String str10;
        String str11;
        String str12;
        Integer num3;
        Integer num4;
        C59218NLy c59218NLy;
        NMS nms;
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        NMS nms2;
        Long groupId;
        int i5;
        String appName;
        C59257NNl LIZLLL;
        String str13 = str2;
        String str14 = str;
        if (context == null || aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (str14 == null) {
            o.LJI(awemeRawAd2);
            str14 = awemeRawAd2.getWebUrl();
            i2 = 1;
            if (str14 == null) {
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 != null && (LIZLLL = C59252NNg.LIZLLL(awemeRawAd3)) != null) {
                    String str15 = LIZLLL.clickThrough;
                    if (str15 == null || str15.length() == 0) {
                        java.util.Set<String> set = LIZLLL.clickTracking;
                        if (set != null && !set.isEmpty()) {
                            java.util.Set<String> set2 = LIZLLL.clickTracking;
                            o.LJIIIIZZ(set2, "click.clickTracking");
                            str14 = (String) OJ4.LJJJJJ(OJ4.LJJJJIZL(ORZ.LJLIIIL(set2)));
                        }
                    } else {
                        str14 = LIZLLL.clickThrough;
                    }
                }
                return false;
            }
        } else {
            i2 = 0;
        }
        if (str14 != null) {
            UriProtector.parse(str14);
            if ((C59252NNg.LJII(awemeRawAd2) || C59252NNg.LJFF(awemeRawAd2)) && LIZIZ(context, awemeRawAd2, str14)) {
                return true;
            }
            if (str13 == null) {
                o.LJI(awemeRawAd2);
                str13 = awemeRawAd2.getWebTitle();
            }
            o.LJI(awemeRawAd2);
            Long creativeId = awemeRawAd2.getCreativeId();
            Long groupId2 = awemeRawAd2.getGroupId();
            String logExtra = awemeRawAd2.getLogExtra();
            String downloadUrl = awemeRawAd2.getDownloadUrl();
            JSONObject LJIIIZ = NN1.LJIIIZ(context, aweme);
            String packageName = awemeRawAd2.getPackageName();
            String quickAppUrl = awemeRawAd2.getQuickAppUrl();
            if (TextUtils.isEmpty(str14)) {
                return false;
            }
            String LIZ3 = AnonymousClass629.LIZ("randomUUID().toString()");
            Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
            intent.setData(UriProtector.parse(str14));
            if (TextUtils.isEmpty(str13)) {
                str13 = " ";
            }
            if (!TextUtils.isEmpty(str13)) {
                intent.putExtra("title", str13);
            } else {
                intent.putExtra("title", " ");
                intent.putExtra("use_webview_title", true);
            }
            intent.putExtra("show_report", awemeRawAd2.isReportEnable());
            intent.putExtra("web_apply_camera", awemeRawAd2.getWebApplyCamera());
            AutofillModel autofillModel = awemeRawAd2.getAutofillModel();
            if (autofillModel != null) {
                z2 = autofillModel.getEnable();
            } else {
                z2 = false;
            }
            intent.putExtra("autofill_enable", z2);
            LandingPageNetworkOptimization landingPageNetworkOptimization = awemeRawAd2.getLandingPageNetworkOptimization();
            if (landingPageNetworkOptimization != null) {
                i3 = landingPageNetworkOptimization.getNetworkOptimization();
            } else {
                i3 = 0;
            }
            intent.putExtra("network_optimization_type", i3);
            if (!TextUtils.isEmpty(logExtra)) {
                intent.putExtra("bundle_download_app_log_extra", logExtra);
            }
            intent.putExtra("bundle_app_ad_from", i);
            if (C63081OpJ.LLIIII(aweme)) {
                intent.putExtra("enter_from", "topview");
            }
            if (creativeId == null || creativeId.longValue() != 0) {
                o.LJIIIIZZ(creativeId, "creativeId");
                intent.putExtra("ad_id", creativeId.longValue());
                intent.putExtra("refer", NNT.LIZ(num));
                intent.putExtra("ad_type", awemeRawAd2.getType());
                intent.putExtra("ad_system_origin", awemeRawAd2.getSystemOrigin());
                intent.putExtra("bundle_download_app_extra", String.valueOf(creativeId));
                intent.putExtra("landing_page_info", awemeRawAd2.getLandingPageInfo());
                intent.putExtra("enable_web_google_login", awemeRawAd2.isEnableWebGoogleLogin());
            }
            String LIZ4 = SharePrefCache.inst().getJsActlogUrl().LIZ();
            if (!TextUtils.isEmpty(LIZ4)) {
                intent.putExtra("ad_js_url", LIZ4);
            }
            intent.putExtra("bundle_disable_download_dialog", awemeRawAd2.isDisableDownloadDialog());
            String str16 = "result_ad";
            if (!TextUtils.isEmpty(downloadUrl)) {
                intent.putExtra("bundle_is_from_app_ad", true);
                intent.putExtra("bundle_download_url", downloadUrl);
                intent.putExtra("aweme_package_name", packageName);
                intent.putExtra("bundle_ad_quick_app_url", quickAppUrl);
                boolean isEmpty = TextUtils.isEmpty(awemeRawAd2.getAppName());
                if (isEmpty) {
                    appName = awemeRawAd2.getWebTitle();
                } else if (!isEmpty) {
                    appName = awemeRawAd2.getAppName();
                } else {
                    throw new C162476Zf();
                }
                intent.putExtra("bundle_download_app_name", appName);
                intent.putExtra("bundle_download_mode", awemeRawAd2.getDownloadMode());
                intent.putExtra("bundle_link_mode", awemeRawAd2.getLinkMode());
                intent.putExtra("bundle_support_multiple_download", awemeRawAd2.isSupportMultiple());
                intent.putExtra("bundle_web_url", awemeRawAd2.getWebUrl());
                intent.putExtra("bundle_web_title", awemeRawAd2.getWebTitle());
                String openUrl = awemeRawAd2.getOpenUrl();
                if (openUrl != null && s.LJJJLZIJ(openUrl, "__back_url__", false)) {
                    Uri.Builder buildUpon = UriProtector.parse(NO2.LIZ).buildUpon();
                    if (i == 5) {
                        buildUpon.appendQueryParameter("tag", "result_ad");
                    }
                    o.LJIIIIZZ(openUrl, "openUrl");
                    String builder = buildUpon.toString();
                    o.LJIIIIZZ(builder, "backUrlBuilder.toString()");
                    openUrl = ujb.o.LJJJJZ(openUrl, "__back_url__", builder, false);
                }
                intent.putExtra("bundle_open_url", openUrl);
            }
            String jSONObject = LJIIIZ.toString();
            String str17 = "";
            if (jSONObject == null) {
                jSONObject = "";
            }
            intent.putExtra("aweme_json_extra", jSONObject);
            if (groupId2 != null && groupId2.longValue() != 0) {
                intent.putExtra("aweme_group_id", String.valueOf(groupId2));
            }
            if (creativeId.longValue() != 0) {
                intent.putExtra("aweme_creative_id", String.valueOf(creativeId));
            }
            if (!TextUtils.isEmpty(packageName)) {
                intent.putExtra("aweme_package_name", packageName);
            }
            if (awemeRawAd2.isUseDefaultColor()) {
                Integer LJI = C79045V0n.LJI(R.attr.cl, context);
                if (LJI != null) {
                    i5 = LJI.intValue();
                } else {
                    i5 = -1;
                }
                intent.putExtra("bundle_webview_background", i5);
            } else {
                intent.putExtra("bundle_webview_background", -1);
            }
            intent.putExtra("aweme_id", aweme.getAid());
            intent.putExtra("owner_id", aweme.getAuthorUid());
            intent.putExtra("bundle_forbidden_jump", true);
            intent.putExtra("use_ordinary_web", z);
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null) {
                num2 = Integer.valueOf(awemeRawAd4.getChargeType());
            } else {
                num2 = null;
            }
            intent.putExtra("charge_type", num2);
            intent.addFlags(268435456);
            AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
            if (awemeRawAd5 == null || (str3 = awemeRawAd5.getChannelName()) == null) {
                str3 = "";
            }
            intent.putExtra("preload_channel_name", str3);
            AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
            if (awemeRawAd6 != null) {
                awemeSplashInfo = awemeRawAd6.getSplashInfo();
            } else {
                awemeSplashInfo = null;
            }
            if (awemeSplashInfo != null) {
                intent.putExtra("preload_scene", "splash");
            } else {
                intent.putExtra("preload_scene", "feed");
            }
            intent.putExtra("preload_web_status", awemeRawAd2.getPreloadWeb());
            intent.putExtra("preload_web_status_new", awemeRawAd2.getPreloadWebNew());
            intent.putExtra("preload_is_web_url", i2);
            intent.putExtra("web_type", awemeRawAd2.getWebType());
            intent.putExtra("enable_web_report", awemeRawAd2.isEnableWebReport());
            if (awemeRawAd2.getWebviewProgressBar() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            intent.putExtra("webview_progress_bar", z3);
            LandingPageSurveyModel landingPageSurvey = awemeRawAd2.getLandingPageSurvey();
            if (landingPageSurvey != null) {
                intent.putExtra("ad_landing_enable_landing_page_survey", landingPageSurvey.getEnableLandingPageSurvey());
                intent.putExtra("ad_landing_show_survey_time_interval", landingPageSurvey.getShowSurveyTimeInterval());
                intent.putExtra("ad_landing_page_dwell_time", landingPageSurvey.getPageDwellTime());
                intent.putExtra("ad_landing_page_schema_url", landingPageSurvey.getSchemaUrl());
            }
            intent.putExtra("req_id", aweme.getRequestId());
            Long adId = awemeRawAd2.getAdId();
            o.LJIIIIZZ(adId, "awemeRawAd.adId");
            intent.putExtra("raw_ad_data_ad_id", adId.longValue());
            intent.putExtra("session_id", LIZ3);
            intent.putExtra("preload_h5_type", awemeRawAd2.getPreloadH5Type());
            if (o.LJ(bool, Boolean.TRUE)) {
                intent.putExtra("commerce_enter_from", "splash");
            } else {
                intent.putExtra("commerce_enter_from", "feedad");
            }
            C59082NGs.LIZ = awemeRawAd2;
            LIZ(str14);
            Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
            AwemeRawAd awemeRawAd7 = aweme.getAwemeRawAd();
            if (awemeRawAd7 == null || awemeRawAd7.getNonNativeClick() != 0 || !NOX.LIZJ(awemeRawAd7)) {
                CommerceAdLandpageBulletConfig LIZ5 = C59287NOp.LIZ();
                if (LIZ5 == null || !LIZ5.getTotalEnable() || !LIZ5.getAdLandpageRealEnable()) {
                    JHI LIZ6 = JHI.LIZ();
                    if (num != null) {
                        i4 = num.intValue();
                    } else {
                        i4 = -1;
                    }
                    LIZ6.LJIIIIZZ = i4;
                    if (!TextUtils.isEmpty(awemeRawAd2.getWebUrl()) && o.LJ(str14, awemeRawAd2.getWebUrl()) && (C34084DZg.LIZ || CommerceWebCrossToSparkExt.LIZ())) {
                        C224488rU.LIZIZ(context, "click_ad_web");
                        return true;
                    }
                    if (CommerceWebCrossToSparkExt.LIZ()) {
                        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                        if (LJIIIIZZ == null) {
                            return false;
                        }
                        View findViewById = C16880lQ.LLLLIILL(LJIIIIZZ.getLayoutInflater(), R.layout.g7, (ViewGroup) LJIIIIZZ.findViewById(android.R.id.content), true).findViewById(R.id.uu);
                        o.LJIIIIZZ(findViewById, "activity.layoutInflater.…id.ad_web_page_container)");
                        FrameLayout frameLayout = (FrameLayout) findViewById;
                        C59222NMc c59222NMc = new C59222NMc(0);
                        c59222NMc.LIZ = awemeRawAd2;
                        c59222NMc.LJFF = aweme.getAid();
                        c59222NMc.LIZIZ = str13;
                        c59222NMc.LIZJ = str14;
                        c59222NMc.LJJIFFI = true;
                        c59222NMc.LJIIIZ = aweme.getRequestId();
                        try {
                            android.net.Uri parse = UriProtector.parse(c59222NMc.LIZJ);
                            c59222NMc.LJIJJLI = parse.getBooleanQueryParameter("hide_nav_bar", false);
                            c59222NMc.LJIL = parse.getBooleanQueryParameter("hide_title_bar", false);
                            String queryParameter = UriProtector.getQueryParameter(parse, "has_adinfojson");
                            if (queryParameter == null) {
                                queryParameter = "";
                            }
                            c59222NMc.LJIJ = queryParameter;
                            String queryParameter2 = UriProtector.getQueryParameter(parse, "adinfojson");
                            if (queryParameter2 != null) {
                                str17 = queryParameter2;
                            }
                            c59222NMc.LJIJI = str17;
                        } catch (Exception e) {
                            C78983UzD.LJIIZILJ(e);
                        }
                        int i6 = JHI.LIZ().LJIIIIZZ;
                        if (TextUtils.isEmpty(NNT.LIZ(Integer.valueOf(i6)))) {
                            LIZ2 = JHI.LIZ().LJIIIZ;
                        } else {
                            LIZ2 = NNT.LIZ(Integer.valueOf(i6));
                        }
                        c59222NMc.LJ = LIZ2;
                        c59222NMc.LJI = aweme.getAuthorUid();
                        c59222NMc.LJII = true;
                        c59222NMc.LJIIIIZZ = 1;
                        c59222NMc.LJIIJ = LIZ3;
                        if (o.LJ(bool, Boolean.TRUE)) {
                            c59222NMc.LIZLLL = "splash";
                        } else {
                            c59222NMc.LIZLLL = "feedad";
                        }
                        NPF npf = new NPF(LJIIIIZZ);
                        C59421NTt c59421NTt = new C59421NTt(EnumC59053NFp.ONLY_RENDER, "", 0, false, null, new C59452NUy(str14, new Bundle(), c59222NMc, C59055NFr.LIZ("landing_page_3p"), new NMZ()), false, 188);
                        IAdHybridContainerManager LIZLLL2 = AdHybridContainerManager.LIZLLL();
                        EnumC59241NMv enumC59241NMv = EnumC59241NMv.WEB;
                        AwemeRawAd awemeRawAd8 = c59222NMc.LIZ;
                        if (awemeRawAd8 != null) {
                            str10 = awemeRawAd8.getCreativeIdStr();
                        } else {
                            str10 = null;
                        }
                        AwemeRawAd awemeRawAd9 = c59222NMc.LIZ;
                        if (awemeRawAd9 != null) {
                            str11 = awemeRawAd9.getLogExtra();
                        } else {
                            str11 = null;
                        }
                        AwemeRawAd awemeRawAd10 = c59222NMc.LIZ;
                        if (awemeRawAd10 != null && (groupId = awemeRawAd10.getGroupId()) != null) {
                            str12 = String.valueOf(groupId);
                        } else {
                            str12 = null;
                        }
                        AwemeRawAd awemeRawAd11 = c59222NMc.LIZ;
                        if (awemeRawAd11 != null) {
                            num3 = Integer.valueOf(awemeRawAd11.getChargeType());
                        } else {
                            num3 = null;
                        }
                        AwemeRawAd awemeRawAd12 = c59222NMc.LIZ;
                        if (awemeRawAd12 != null) {
                            num4 = Integer.valueOf(awemeRawAd12.getSystemOrigin());
                        } else {
                            num4 = null;
                        }
                        AbstractC59064NGa LIZJ = LIZLLL2.LIZJ(new C59066NGc("landing_page_1p", enumC59241NMv, LJIIIIZZ, new NGY(str10, str11, str12, num3, num4, 32)), c59421NTt);
                        LIZJ.LJIILLIIL(npf);
                        LIZJ.LJIILIIL(npf);
                        C68322mC c68322mC = new C68322mC();
                        NMS LJI2 = LIZJ.LJI(c59421NTt, false);
                        boolean z4 = LJI2 instanceof Fragment;
                        T t = LJI2;
                        if (!z4) {
                            t = 0;
                        }
                        c68322mC.element = t;
                        ICommercializeFeedService LIZLLL3 = CommercializeFeedServiceImpl.LIZLLL();
                        if (LIZLLL3 != null) {
                            c59218NLy = LIZLLL3.LIZIZ(LJIIIIZZ, new NMU(frameLayout, c68322mC));
                        } else {
                            c59218NLy = null;
                        }
                        T t2 = c68322mC.element;
                        if ((t2 instanceof NMS) && (nms2 = (NMS) t2) != null) {
                            nms2.LLLJIL(new ARunnableS14S0400000_10(frameLayout, c59218NLy, LJIIIIZZ, c68322mC, 0));
                        }
                        Fragment fragment = (Fragment) c68322mC.element;
                        if (fragment != null && (LJIIIIZZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
                            C1B3 c1b3 = new C1B3(supportFragmentManager);
                            c1b3.LJIIJJI(R.anim.fv, R.anim.g2, 0, 0);
                            c1b3.LJIIIIZZ(frameLayout.getId(), 1, fragment, null);
                            c1b3.LJIILL(true);
                        }
                        T t3 = c68322mC.element;
                        if ((t3 instanceof NMS) && (nms = (NMS) t3) != null) {
                            nms.onShow();
                        }
                        IWF.LJJLIIIIJ().LJIILJJIL();
                        if (c59218NLy != null) {
                            c59218NLy.enable(true);
                        }
                        frameLayout.setVisibility(0);
                        return true;
                    }
                    return NO5.LJIL(context, intent);
                }
                C57415Mg7.LIZIZ(context, str14, "ad_commerce", C16880lQ.LLJJIJI(intent));
                return true;
            }
            NativeSiteConfig nativeSiteConfig = awemeRawAd7.getNativeSiteConfig();
            if (nativeSiteConfig == null || (str4 = nativeSiteConfig.getLynxScheme()) == null) {
                str4 = "";
            }
            if (LLJJIJI == null) {
                LLJJIJI = new Bundle();
            }
            LLJJIJI.putBoolean("is_lynx_landing_page", true);
            LLJJIJI.putBoolean("hide_nav_bar", true);
            LLJJIJI.putBoolean("hide_status_bar", false);
            LLJJIJI.putBoolean("need_bottom_out", true);
            Gson LIZIZ = C75792yF.LIZIZ();
            AwemeRawAd awemeRawAd13 = aweme.getAwemeRawAd();
            if (awemeRawAd13 != null) {
                browserConfig = awemeRawAd13.getBrowserConfig();
            } else {
                browserConfig = null;
            }
            LLJJIJI.putString("browser_config", GsonProtectorUtils.toJson(LIZIZ, browserConfig));
            NativeSiteConfig nativeSiteConfig2 = awemeRawAd7.getNativeSiteConfig();
            if (nativeSiteConfig2 != null && nativeSiteConfig2.getLynxLandingStyle() == 1) {
                Video video = aweme.getVideo();
                if (video != null && (originCover = video.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null && (!urlList.isEmpty())) {
                    LLJJIJI.putString("bundle_full_screen_bg_image", (String) ListProtector.get(urlList, 0));
                }
                LLJJIJI.putInt("bundle_webview_background", 0);
            }
            NativeSiteConfig nativeSiteConfig3 = awemeRawAd7.getNativeSiteConfig();
            if (nativeSiteConfig3 == null || (geckoChannel = nativeSiteConfig3.getGeckoChannel()) == null || geckoChannel.isEmpty()) {
                str5 = "";
            } else {
                str5 = (String) ListProtector.get(geckoChannel, 0);
            }
            LLJJIJI.putString("lynx_channel_name", str5);
            LLJJIJI.putString("bundle_native_site_custom_data", awemeRawAd7.getNativeSiteCustomData());
            LLJJIJI.putString("page_id", awemeRawAd7.getPageId());
            NativeSiteConfig nativeSiteConfig4 = awemeRawAd7.getNativeSiteConfig();
            if (nativeSiteConfig4 != null && (secondPageGeckoChannel = nativeSiteConfig4.getSecondPageGeckoChannel()) != null && !secondPageGeckoChannel.isEmpty()) {
                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI == null || (str9 = LJJI.LIZLLL(awemeRawAd7.getAdId())) == null) {
                    str9 = "";
                }
                LLJJIJI.putString("second_page_preload_channel_prefix", str9);
                NHG.LJIILLIIL(secondPageGeckoChannel);
            }
            int preloadWebSecondPage = awemeRawAd7.getPreloadWebSecondPage();
            String channelName = awemeRawAd7.getChannelName();
            if (preloadWebSecondPage == 1 && channelName != null && channelName.length() != 0) {
                LLJJIJI.putInt("preload_web_second_page", preloadWebSecondPage);
                if (channelName != null) {
                    IAdLandPagePreloadService LJJI2 = AdLandPagePreloadServiceImpl.LJJI();
                    if (LJJI2 != null) {
                        str8 = LJJI2.LJIIL("feed");
                    } else {
                        str8 = null;
                    }
                    NHG.LIZJ(channelName, str8);
                }
            }
            LLJJIJI.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(KL2.LJIIJJI(context), 1073741824));
            LLJJIJI.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(KL2.LJIIIZ(context) - C63081OpJ.LJJJJLI(context), 1073741824));
            android.net.Uri parse2 = UriProtector.parse(str4);
            if (parse2.isHierarchical()) {
                LLJJIJI.putString("bundle_origin_url", UriProtector.getQueryParameter(parse2, "fallback_url"));
                if (TextUtils.equals(UriProtector.getQueryParameter(parse2, "async_layout"), "1")) {
                    LLJJIJI.putBoolean("preset_safe_point", true);
                    LLJJIJI.putInt("thread_strategy", EnumC59959Ng3.PART_ON_LAYOUT.id());
                }
            }
            Uri.Builder buildUpon2 = parse2.buildUpon();
            buildUpon2.appendQueryParameter("lynx_landing_page_data", NOX.LIZ(awemeRawAd7, context, Boolean.FALSE));
            buildUpon2.appendQueryParameter("lynx_landing_page_title", awemeRawAd7.getWebTitle());
            IECommerceService createIECommerceServicebyMonsterPlugin = ECommerceService.createIECommerceServicebyMonsterPlugin(false);
            if (createIECommerceServicebyMonsterPlugin.isECADVideo(aweme)) {
                createIECommerceServicebyMonsterPlugin.appendAdTrackParam(aweme, buildUpon2);
            }
            if (C59294NOw.LIZ()) {
                buildUpon2.appendQueryParameter("use_spark", "1");
                IAdSparkUtils LJFF = AdSparkUtils.LJFF();
                if (LJFF != null) {
                    String builder2 = buildUpon2.toString();
                    o.LJIIIIZZ(builder2, "urlBuilder.toString()");
                    IAdLandPagePreloadService LJJI3 = AdLandPagePreloadServiceImpl.LJJI();
                    if (LJJI3 != null) {
                        str7 = LJJI3.LJIIL("lynx_feed");
                    } else {
                        str7 = null;
                    }
                    LJFF.LIZLLL(context, builder2, LLJJIJI, str7, C59209NLp.LIZIZ(), false);
                }
            } else {
                String builder3 = buildUpon2.toString();
                o.LJIIIIZZ(builder3, "urlBuilder.toString()");
                C57415Mg7.LIZIZ(context, builder3, "ad_commerce", LLJJIJI);
            }
            if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || !NOX.LIZJ(aweme.getAwemeRawAd())) {
                return true;
            }
            if (i != 5) {
                if (i != 8) {
                    NN1.LJJIJIL(context, aweme);
                    str6 = NNT.LIZ(num);
                    str16 = "draw_ad";
                } else {
                    str16 = "result_ad_bg";
                    str6 = "bg_more_button";
                }
            } else {
                str6 = "button";
            }
            AdWebLogService.LJFF().LIZIZ(awemeRawAd.getCreativeIdStr(), awemeRawAd.getLogExtra(), str16, LIZ3, str6);
            return true;
        }
        return false;
    }
}
