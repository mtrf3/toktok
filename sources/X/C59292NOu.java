package X;

import Y.AgS127S0100000_10;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.landpage.AdLandPageServiceImpl;
import com.ss.android.ugc.aweme.landpage.IAdLandPageService;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.zhiliaoapp.musically.R;

/* renamed from: X.NOu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59292NOu {
    public static void LIZ(NormalSplashAdActivity normalSplashAdActivity, String str, Long l, String str2, C72545SdZ c72545SdZ) {
        boolean z;
        String str3;
        Boolean valueOf;
        int lastIndexOf;
        NW6.LIZ().LJIL(normalSplashAdActivity);
        String scheme = UriProtector.parse(str).getScheme();
        boolean z2 = false;
        if (!"sslocal".equalsIgnoreCase(scheme) && !"localsdk".equalsIgnoreCase(scheme)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C58704N2e.LJ("splash_ad", "open_url_app", String.valueOf(l), str2, CardStruct.IStatusCode.DEFAULT).LJI();
            NW6.LIZ().LIZ();
        }
        if (str.contains("__back_url__")) {
            str3 = str.replace("__back_url__", android.net.Uri.encode(NO2.LIZ));
        } else {
            str3 = str;
        }
        C38281F0r c38281F0r = new C38281F0r(str3);
        if (C38354F3m.LJ(str)) {
            valueOf = Boolean.FALSE;
        } else if (TextUtils.equals("sslocal", str)) {
            valueOf = Boolean.TRUE;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("snssdk");
            LIZ.append(EF7.LJIIIZ);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (!C38354F3m.LJ(LIZIZ) && TextUtils.equals(LIZIZ, str)) {
                z2 = true;
            }
            valueOf = Boolean.valueOf(z2);
        }
        if (valueOf.booleanValue()) {
            c38281F0r.LIZLLL("url", str);
        }
        if (str.startsWith("sslocal://user/profile/")) {
            c38281F0r.LIZLLL("enter_from", "open_screen_ad");
        }
        String host = UriProtector.parse(str).getHost();
        if (TextUtils.equals(host, "challenge")) {
            c38281F0r.LIZLLL("enter_from", "splash");
        }
        if (TextUtils.equals(host, "stickers") && (lastIndexOf = str.lastIndexOf("/") + 1) < str.length()) {
            String substring = str.substring(lastIndexOf);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "splash_ad");
            c188727au.LJIIIZ("prop_id", substring);
            FMX.LJIIL("enter_prop_detail", c188727au.LIZ);
        }
        NW6.LIZ().LJIJ(normalSplashAdActivity, c38281F0r.LJ());
        if (z) {
            C10K.LJII(5000L).LIZLLL(new AgS127S0100000_10(new C67401Qcn(l, str2), 0));
        }
    }

    public static boolean LIZIZ(NormalSplashAdActivity normalSplashAdActivity, String str, String str2, Long l, String str3, NativeSiteConfig nativeSiteConfig, String str4, String str5) {
        IAdLandPagePreloadService LJJI;
        String str6;
        C58704N2e.LJ("splash_ad", "open_url_h5", String.valueOf(l), str3, CardStruct.IStatusCode.DEFAULT).LJI();
        NW6.LIZ().LIZ();
        Intent LJIJI = NW6.LIZ().LJIJI(normalSplashAdActivity);
        LJIJI.setData(UriProtector.parse(str));
        LJIJI.setFlags(268435456);
        if (TextUtils.isEmpty(str2)) {
            LJIJI.putExtra("title", " ");
        } else {
            LJIJI.putExtra("title", str2);
        }
        LJIJI.putExtra("bundle_forbidden_jump", true);
        LJIJI.putExtra("ad_id", l);
        LJIJI.putExtra("bundle_download_app_log_extra", str3);
        LJIJI.putExtra("bundle_webview_background", AnonymousClass636.LJIIIIZZ(R.attr.dj, normalSplashAdActivity));
        LJIJI.putExtra("commerce_enter_from", "splash");
        LJIJI.putExtra("enter_from", "splash");
        IAdLandPagePreloadService LJJI2 = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI2 != null) {
            String LJIILLIIL = LJJI2.LJIILLIIL(l);
            if (!TextUtils.isEmpty(LJIILLIIL)) {
                LJIJI.putExtra("preload_channel_name", LJIILLIIL);
                LJIJI.putExtra("preload_scene", "splash");
                LJIJI.putExtra("preload_web_status", 4);
                LJIJI.putExtra("preload_is_web_url", 1);
            }
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(LJIJI);
        if (LLJJIJI != null && nativeSiteConfig != null) {
            String lynxScheme = nativeSiteConfig.getLynxScheme();
            if (!C38354F3m.LJ(lynxScheme) && lynxScheme.startsWith("aweme://lynxview")) {
                LLJJIJI.putBoolean("is_lynx_landing_page", true);
                LLJJIJI.putBoolean("hide_nav_bar", true);
                LLJJIJI.putBoolean("hide_status_bar", false);
                LLJJIJI.putBoolean("bundle_nav_bar_status_padding", true);
                LLJJIJI.putBoolean("need_bottom_out", true);
                if (nativeSiteConfig.getLynxLandingStyle() == 1) {
                    LLJJIJI.putInt("bundle_webview_background", 0);
                }
                if (nativeSiteConfig.getGeckoChannel() != null && !nativeSiteConfig.getGeckoChannel().isEmpty()) {
                    LLJJIJI.putString("lynx_channel_name", (String) ListProtector.get(nativeSiteConfig.getGeckoChannel(), 0));
                }
                LLJJIJI.putString("bundle_native_site_custom_data", str5);
                String str7 = "";
                if (nativeSiteConfig.getSecondPageGeckoChannel() != null && !nativeSiteConfig.getSecondPageGeckoChannel().isEmpty()) {
                    IAdLandPagePreloadService LJJI3 = AdLandPagePreloadServiceImpl.LJJI();
                    if (LJJI3 == null) {
                        str6 = "";
                    } else {
                        str6 = LJJI3.LIZLLL(l);
                        LJJI3.LJI();
                        NHG.LJIILLIIL(nativeSiteConfig.getSecondPageGeckoChannel());
                    }
                    LLJJIJI.putString("second_page_preload_channel_prefix", str6);
                }
                LLJJIJI.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(KL2.LJIIJJI(normalSplashAdActivity), 1073741824));
                LLJJIJI.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(KL2.LJIIIZ(normalSplashAdActivity) - C63081OpJ.LJJJJLI(normalSplashAdActivity), 1073741824));
                android.net.Uri parse = UriProtector.parse(nativeSiteConfig.getLynxScheme());
                if (parse.isHierarchical()) {
                    LLJJIJI.putString("bundle_origin_url", UriProtector.getQueryParameter(parse, "fallback_url"));
                    if (TextUtils.equals(UriProtector.getQueryParameter(parse, "async_layout"), "1")) {
                        LLJJIJI.putBoolean("preset_safe_point", true);
                        LLJJIJI.putInt("thread_strategy", 1);
                    }
                }
                Uri.Builder buildUpon = parse.buildUpon();
                m mVar = new m();
                mVar.LJJIIJ("creativeId", l);
                mVar.LJJIIZ("logExtra", str3);
                mVar.LJJIIZ("pageData", str4);
                mVar.LJJIIJ("isRTL", Integer.valueOf(C90193gN.LIZIZ(normalSplashAdActivity) ? 1 : 0));
                mVar.LJJIIJ("topSafeAreaHeight", Integer.valueOf(C63081OpJ.LJJJJLI(normalSplashAdActivity)));
                buildUpon.appendQueryParameter("lynx_landing_page_data", mVar.toString());
                buildUpon.appendQueryParameter("lynx_landing_page_title", str2);
                IAdLandPageService LIZIZ = AdLandPageServiceImpl.LIZIZ();
                if (LIZIZ != null) {
                    LIZIZ.LIZ();
                    str7 = "ad_commerce";
                }
                if (C59294NOw.LIZ()) {
                    IAdSparkUtils LJFF = AdSparkUtils.LJFF();
                    buildUpon.appendQueryParameter("use_spark", "1");
                    if (LJFF != null && (LJJI = AdLandPagePreloadServiceImpl.LJJI()) != null) {
                        LJFF.LIZLLL(normalSplashAdActivity, buildUpon.toString(), LLJJIJI, LJJI.LJIIL("lynx_feed"), C59209NLp.LIZIZ(), false);
                    }
                } else {
                    C57415Mg7.LIZIZ(normalSplashAdActivity, buildUpon.toString(), str7, LLJJIJI);
                }
                return true;
            }
        }
        try {
            C16880lQ.LIZJ(normalSplashAdActivity, LJIJI);
            return true;
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("openSplashScheme: url = ");
            LIZ.append(str);
            LIZ.append(" e = ");
            LIZ.append(e.toString());
            C36922EeM.LJ(X1D.LIZIZ(LIZ));
            C36922EeM.LJFF(e);
            return false;
        }
    }
}
