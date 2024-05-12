package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.setting.DeeplinkPersonalizationConfig;
import com.ss.android.ugc.aweme.setting.PersonalizationModel;
import java.util.HashMap;
import java.util.Random;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class M5K {
    public static boolean LIZJ() {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).isAppHot();
    }

    public static boolean LJI() {
        IExternalService LIZ = AVExternalServiceImpl.LIZ();
        if (LIZ.configService().shortVideoConfig().isRecording() || LIZ.publishService().inPublishPage() || LIZ.publishService().isPublishing()) {
            return true;
        }
        return false;
    }

    public static String LIZ(String originalUrl) {
        o.LJIIIZ(originalUrl, "originalUrl");
        if (TextUtils.isEmpty(originalUrl)) {
            return "";
        }
        android.net.Uri parse = UriProtector.parse(originalUrl);
        if (parse.isOpaque()) {
            return originalUrl;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(parse.getScheme());
        LIZ.append("://");
        LIZ.append(parse.getEncodedAuthority());
        LIZ.append(parse.getEncodedPath());
        return X1D.LIZIZ(LIZ);
    }

    public static boolean LIZLLL(Intent intent) {
        o.LJIIIZ(intent, "intent");
        if (intent.getBooleanExtra("is_async_render_fact", false)) {
            return true;
        }
        if (!LJ(intent.getData()) || !((Boolean) C52983Kqp.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean LJ(android.net.Uri uri) {
        String str;
        String str2;
        String str3 = null;
        if (uri != null) {
            str = uri.getHost();
            str2 = uri.getPath();
        } else {
            str = null;
            str2 = null;
        }
        if (LJIIIIZZ(str, str2)) {
            if (uri != null) {
                str3 = UriProtector.getQueryParameter(uri, "k");
            }
            if (o.LJ(str3, "1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJFF(Intent intent) {
        o.LJIIIZ(intent, "intent");
        if (intent.getBooleanExtra("is_async_render_link", false)) {
            return true;
        }
        return LJ(intent.getData());
    }

    public static boolean LJIIIZ(android.net.Uri uri) {
        Z9N z9n = Z9N.LIZIZ;
        if (!z9n.LJJIIJZLJL()) {
            return false;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "search_keyword");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (queryParameter.length() == 0) {
            return false;
        }
        if (a.LJIIIZ().LIZJ()) {
            z9n.LJJJZ(uri);
            return false;
        }
        HG3.LJIIL();
        if (!HG3.LJLJL.LJFF().isLogin()) {
            C85990Xow.LIZ.getClass();
            if (C85990Xow.LJIIIIZZ()) {
                z9n.LJJZZI(uri);
                return false;
            }
        }
        return true;
    }

    public static boolean LJIIJ(android.net.Uri uri) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(uri.getHost());
        LIZ.append(uri.getPath());
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (!TextUtils.isEmpty(LIZIZ)) {
            DeeplinkPersonalizationConfig[] deeplinkPersonalizationConfigArr = null;
            try {
                if (((DeeplinkPersonalizationConfig[]) SettingsManager.LIZLLL().LJIIIIZZ("linker_platform_config", DeeplinkPersonalizationConfig[].class, null)) != null) {
                    java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                    if (queryParameterNames != null && queryParameterNames.contains("sharer_biz")) {
                        str = UriProtector.getQueryParameter(uri, "sharer_biz");
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        return false;
                    }
                    try {
                        DeeplinkPersonalizationConfig[] deeplinkPersonalizationConfigArr2 = (DeeplinkPersonalizationConfig[]) SettingsManager.LIZLLL().LJIIIIZZ("linker_platform_config", DeeplinkPersonalizationConfig[].class, null);
                        if (deeplinkPersonalizationConfigArr2 != null) {
                            deeplinkPersonalizationConfigArr = deeplinkPersonalizationConfigArr2;
                        }
                    } catch (Throwable unused) {
                    }
                    o.LJI(deeplinkPersonalizationConfigArr);
                    for (DeeplinkPersonalizationConfig deeplinkPersonalizationConfig : deeplinkPersonalizationConfigArr) {
                        if (PatternProtector.compile(deeplinkPersonalizationConfig.urlRegex).matcher(LIZIZ).matches()) {
                            for (PersonalizationModel personalizationModel : deeplinkPersonalizationConfig.urlConfig) {
                                if (TextUtils.equals(str, personalizationModel.getBizName())) {
                                    if (personalizationModel.getNeedPersonalization()) {
                                        C56235M5f.LJIILIIL = true;
                                    }
                                    return personalizationModel.getNeedPersonalization();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    public static void LIZIZ(android.net.Uri uri, HashMap hashMap) {
        hashMap.put("video_from", "from_search_video_detail_applink");
        String queryParameter = UriProtector.getQueryParameter(uri, "search_keyword");
        String str = "";
        if (queryParameter == null) {
            queryParameter = "";
        }
        hashMap.put("search_keyword", queryParameter);
        hashMap.put("key_search_type", "video");
        String queryParameter2 = UriProtector.getQueryParameter(uri, "enter_from_sub");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        hashMap.put("enter_from_sub", queryParameter2);
        String queryParameter3 = UriProtector.getQueryParameter(uri, "enter_from");
        if (queryParameter3 == null) {
            queryParameter3 = "";
        }
        hashMap.put("enter_from", queryParameter3);
        String queryParameter4 = UriProtector.getQueryParameter(uri, "enter_method");
        if (queryParameter4 == null) {
            queryParameter4 = "";
        }
        hashMap.put("enter_method", queryParameter4);
        String queryParameter5 = UriProtector.getQueryParameter(uri, "preClickImprId");
        if (queryParameter5 != null) {
            str = queryParameter5;
        }
        hashMap.put("preClickImprId", str);
    }

    public static boolean LJII(String str, String str2) {
        if (str2 != null && ujb.o.LJJJLIIL(str2, "/t/", false)) {
            return false;
        }
        for (String str3 : M5L.LIZ()) {
            if (o.LJ(str3, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIIIZZ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str3 : C37209Eiz.LIZ) {
            if (TextUtils.equals(str, str3)) {
                return true;
            }
        }
        if (str == null || str2 == null || ((!ujb.o.LJJJJ(str, ".tiktok.com", false) && !str.equals("www.tiktok.in")) || !ujb.o.LJJJLIIL(str2, "/t/", false))) {
            return false;
        }
        return true;
    }

    public static void LJIIJJI(Activity activity, Intent intent) {
        Class<? extends Activity> deepLinkHandlerActivityClass;
        String str;
        o.LJIIIZ(activity, "activity");
        if (intent != null && intent.getData() != null) {
            if (o.LJ("from_deep_link", "from_app_link")) {
                deepLinkHandlerActivityClass = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAppLinkHandlerActivityClass(true);
            } else {
                deepLinkHandlerActivityClass = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getDeepLinkHandlerActivityClass(true);
            }
            if (deepLinkHandlerActivityClass == null) {
                return;
            }
            Intent intent2 = new Intent(activity, deepLinkHandlerActivityClass);
            android.net.Uri data = intent.getData();
            if (data != null) {
                str = data.toString();
            } else {
                str = null;
            }
            C38281F0r c38281F0r = new C38281F0r(str);
            c38281F0r.LIZLLL("random", new Random(1000L).toString());
            intent2.setData(UriProtector.parse(c38281F0r.LJ()));
            intent2.putExtras(intent);
            intent2.putExtra("inner_from", "require_login");
            C16880lQ.LIZIZ(activity, intent2);
        }
    }
}
