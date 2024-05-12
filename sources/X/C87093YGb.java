package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.net.CommonApi;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: X.YGb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87093YGb {
    public static final String LIZJ;
    public final java.util.Map<String, G36> LIZ;
    public CommonApi LIZIZ;

    public final G36 LIZIZ() {
        G36 g36 = (G36) ((LinkedHashMap) this.LIZ).get(C85999Xp5.LIZIZ());
        if (g36 != null) {
            return g36;
        }
        return (G36) ((LinkedHashMap) this.LIZ).get("en");
    }

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZJ = JBR.LJFF(LIZ, com.ss.android.ugc.aweme.app.api.Api.LIZ, "/aweme/v1/device/update/", LIZ);
    }

    public C87093YGb() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = linkedHashMap;
        if ("local_test".equals(EF7.LJIILIIL) || "lark_inhouse".equals(EF7.LJIILIIL)) {
            linkedHashMap.put("dd", new ABX("dd", "dd", "", "Translate To Key"));
        }
        linkedHashMap.put("en", new ABX("en", "en", "", "English"));
        linkedHashMap.put("ar", new ABX("ar", "ar", "", "العربية"));
        linkedHashMap.put("bg", new ABX("bg", "bg", "", "Български"));
        linkedHashMap.put("de-DE", new ABX("de-DE", "de", "DE", "Deutsch"));
        linkedHashMap.put("es", new ABX("es", "es", "", "Español"));
        linkedHashMap.put("et", new ABX("et", "et", "", "Eesti"));
        linkedHashMap.put("fr", new ABX("fr", "fr", "", "Français"));
        linkedHashMap.put("fr-CA", new ABX("fr-CA", "fr", "CA", "Français (Canada)"));
        linkedHashMap.put("hr", new ABX("hr", "hr", "", "Hrvatski"));
        linkedHashMap.put("id-ID", new ABX("id-ID", "id", "ID", "Bahasa Indonesia (Indonesia)"));
        linkedHashMap.put("ja-JP", new ABX("ja-JP", "ja", "JP", "日本語（日本）"));
        linkedHashMap.put("ko-KR", new ABX("ko-KR", "ko", "KR", "한국어 (대한민국)"));
        linkedHashMap.put("lt", new ABX("lt", "lt", "", "Lietuvių"));
        linkedHashMap.put("lv", new ABX("lv", "lv", "", "Latviešu"));
        linkedHashMap.put("ms-MY", new ABX("ms-MY", "ms", "MY", "Bahasa Melayu (Malaysia)"));
        linkedHashMap.put("pt", new ABX("pt", "pt", "", "Português"));
        linkedHashMap.put("pt-BR", new ABX("pt-BR", "pt", "BR", "Português (Brasil)"));
        linkedHashMap.put("ru-RU", new ABX("ru-RU", "ru", "RU", "Русский (Россия)"));
        linkedHashMap.put("sk", new ABX("sk", "sk", "", "Slovenčina"));
        linkedHashMap.put("sl", new ABX("sl", "sl", "", "Slovenščina"));
        linkedHashMap.put("sq", new ABX("sq", "sq", "", "Shqip"));
        linkedHashMap.put("th-TH", new ABX("th-TH", "th", "TH", "ไทย (ไทย)"));
        linkedHashMap.put("tr-TR", new ABX("tr-TR", "tr", "TR", "Türkçe (Türkiye)"));
        linkedHashMap.put("vi-VN", new ABX("vi-VN", "vi", "VN", "Tiếng Việt (Việt Nam)"));
        linkedHashMap.put("bn-IN", new ABX("bn-IN", "bn", "IN", "বাঙ্গালি (ভারত)"));
        linkedHashMap.put("ca", new ABX("ca", "ca", "", "Català"));
        linkedHashMap.put("ceb-PH", new ABX("ceb-PH", "ceb", "PH", "Cebuano (Pilipinas)"));
        linkedHashMap.put("cs-CZ", new ABX("cs-CZ", "cs", "CZ", "Čeština (Česká republika)"));
        linkedHashMap.put("da", new ABX("da", "da", "", "Dansk"));
        linkedHashMap.put("el-GR", new ABX("el-GR", "el", "GR", "Ελληνικά (Ελλάδα)"));
        linkedHashMap.put("fi-FI", new ABX("fi-FI", "fi", "FI", "Suomi (Suomi)"));
        linkedHashMap.put("fil-PH", new ABX("fil-PH", "fil", "PH", "Filipino (Pilipinas)"));
        linkedHashMap.put("ga", new ABX("ga", "ga", "", "Gaeilge"));
        linkedHashMap.put("he-IL", new ABX("he-IL", "he", "IL", "עברית (ישראל)"));
        linkedHashMap.put("hi-IN", new ABX("hi-IN", "hi", "IN", "हिंदी"));
        linkedHashMap.put("hu-HU", new ABX("hu-HU", "hu", "HU", "Magyar (Magyarország)"));
        linkedHashMap.put("is", new ABX("is", "is", "", "Íslenska"));
        linkedHashMap.put("it-IT", new ABX("it-IT", "it", "IT", "Italiano (Italia)"));
        linkedHashMap.put("jv-ID", new ABX("jv-ID", "jv", "ID", "Basa Jawa (Indonesia)"));
        linkedHashMap.put("km-KH", new ABX("km-KH", "km", "KH", "ខ្មែរ (កម្ពុជា)"));
        linkedHashMap.put("kk", new ABX("kk", "kk", "", "Қазақша"));
        linkedHashMap.put("my-MM", new ABX("my-MM", "my", "MM", "မြန်မာ (မြန်မာ)"));
        linkedHashMap.put("nb", new ABX("nb", "nb", "", "Norsk bokmål"));
        linkedHashMap.put("nl-NL", new ABX("nl-NL", "nl", "NL", "Nederlands (Nederland)"));
        linkedHashMap.put("pl-PL", new ABX("pl-PL", "pl", "PL", "Polski (Polska)"));
        linkedHashMap.put("ro-RO", new ABX("ro-RO", "ro", "RO", "Română (Romania)"));
        linkedHashMap.put("sv-SE", new ABX("sv-SE", "sv", "SE", "Svenska (Sverige)"));
        linkedHashMap.put("uk-UA", new ABX("uk-UA", "uk", "UA", "Українська (Україна)"));
        linkedHashMap.put("ur", new ABX("ur", "ur", "", "اردو"));
        linkedHashMap.put("uz", new ABX("uz", "uz", "", "Oʻzbekcha"));
        linkedHashMap.put("zh-Hant-TW", new ABX("zh-Hant-TW", "zh", "TW", "中文（繁體）", "zh-Hant"));
        linkedHashMap.put("zh-Hans", new ABX("zh-Hans", "zh", "", "中文（简体）", "zh-Hans"));
    }

    public static String LIZ() {
        return LIZJ(C85999Xp5.LIZJ(EF7.LIZIZ(), null, null));
    }

    public static String LIZJ(Locale locale) {
        if (TextUtils.equals("zh", locale.getLanguage())) {
            C39399FdD.LIZIZ.getClass();
            if (TextUtils.equals("", C39567Ffv.LIZIZ(locale))) {
                return "zh-Hans";
            }
        }
        if (locale.equals(Locale.TRADITIONAL_CHINESE)) {
            return "zh-Hant";
        }
        if (locale.equals(Locale.CHINESE) || locale.equals(Locale.SIMPLIFIED_CHINESE)) {
            return "zh-Hans";
        }
        if ("iw".equals(locale.getLanguage())) {
            return "he";
        }
        if ("in".equals(locale.getLanguage())) {
            return "id";
        }
        return locale.getLanguage();
    }

    public static void LIZLLL(Context context) {
        if (EF7.LJII == 5) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://main");
            buildRoute.addFlags(268468224);
            buildRoute.open();
        } else {
            Intent intent = new Intent();
            intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(268468224);
            C16880lQ.LIZJ(context, intent);
        }
    }

    public final void LJ(String str, String str2, Context context, C25813ABd c25813ABd) {
        Context context2 = context;
        C39575Fg3 c39575Fg3 = new C39575Fg3(this, context2, str2, str, c25813ABd);
        if (context2 == null) {
            context2 = EF7.LIZIZ();
        }
        C39386Fd0.LIZJ(context2, C85999Xp5.LIZJ(context2, str, str2), true, c39575Fg3);
    }
}
