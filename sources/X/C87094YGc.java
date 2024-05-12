package X;

import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.kids.setting.items.language.api.LanguageApi;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.YGc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87094YGc {
    public static final /* synthetic */ int LIZJ = 0;
    public final java.util.Map<String, G36> LIZ;
    public final LanguageApi LIZIZ;

    public final G36 LIZIZ() {
        java.util.Map<String, G36> map = this.LIZ;
        String str = "";
        String string = C39396FdA.LIZ(EF7.LIZIZ()).getString("key_current_locale", "");
        if (string != null) {
            str = string;
        }
        if (TextUtils.isEmpty(str)) {
            str = "en";
        }
        G36 g36 = (G36) ((LinkedHashMap) map).get(str);
        if (g36 == null) {
            return (G36) ((LinkedHashMap) this.LIZ).get("en");
        }
        return g36;
    }

    public C87094YGc() {
        LanguageApi.LIZ.getClass();
        this.LIZIZ = (LanguageApi) RetrofitFactory.LIZLLL().LIZ(AFI.LIZ).LJFF().LIZ.LIZ(LanguageApi.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = linkedHashMap;
        if (o.LJ("local_test", EF7.LJIILIIL) || o.LJ("lark_inhouse", EF7.LJIILIIL)) {
            linkedHashMap.put("dd", new C86074XqI("dd", "dd", "", "Translate To Key"));
        }
        linkedHashMap.put("en", new C86074XqI("en", "en", "", "English"));
        linkedHashMap.put("ar", new C86074XqI("ar", "ar", "", "العربية"));
        linkedHashMap.put("bg", new C86074XqI("bg", "bg", "", "Български"));
        linkedHashMap.put("de-DE", new C86074XqI("de-DE", "de", "DE", "Deutsch"));
        linkedHashMap.put("es", new C86074XqI("es", "es", "", "Español"));
        linkedHashMap.put("et", new C86074XqI("et", "et", "", "Eesti"));
        linkedHashMap.put("fr", new C86074XqI("fr", "fr", "", "Français"));
        linkedHashMap.put("fr-CA", new C86074XqI("fr-CA", "fr", "CA", "Français (Canada)"));
        linkedHashMap.put("hr", new C86074XqI("hr", "hr", "", "Hrvatski"));
        linkedHashMap.put("id-ID", new C86074XqI("id-ID", "id", "ID", "Bahasa Indonesia (Indonesia)"));
        linkedHashMap.put("ja-JP", new C86074XqI("ja-JP", "ja", "JP", "日本語（日本）"));
        linkedHashMap.put("ko-KR", new C86074XqI("ko-KR", "ko", "KR", "한국어 (대한민국)"));
        linkedHashMap.put("lt", new C86074XqI("lt", "lt", "", "LITHUANIAN"));
        linkedHashMap.put("lv", new C86074XqI("lv", "lv", "", "Latviešu"));
        linkedHashMap.put("ms-MY", new C86074XqI("ms-MY", "ms", "MY", "Bahasa Melayu (Malaysia)"));
        linkedHashMap.put("pt", new C86074XqI("pt", "pt", "", "Português"));
        linkedHashMap.put("pt-BR", new C86074XqI("pt-BR", "pt", "BR", "Português (Brasil)"));
        linkedHashMap.put("ru-RU", new C86074XqI("ru-RU", "ru", "RU", "Русский (Россия)"));
        linkedHashMap.put("sk", new C86074XqI("sk", "sk", "", "Slovenčina"));
        linkedHashMap.put("sl", new C86074XqI("sl", "sl", "", "Slovenščina"));
        linkedHashMap.put("sq", new C86074XqI("sq", "sq", "", "Shqip"));
        linkedHashMap.put("th-TH", new C86074XqI("th-TH", "th", "TH", "ไทย (ไทย)"));
        linkedHashMap.put("tr-TR", new C86074XqI("tr-TR", "tr", "TR", "Türkçe (Türkiye)"));
        linkedHashMap.put("vi-VN", new C86074XqI("vi-VN", "vi", "VN", "Tiếng Việt (Việt Nam)"));
        linkedHashMap.put("bn-IN", new C86074XqI("bn-IN", "bn", "IN", "বাঙ্গালি (ভারত)"));
        linkedHashMap.put("ca", new C86074XqI("ca", "ca", "", "Català"));
        linkedHashMap.put("ceb-PH", new C86074XqI("ceb-PH", "ceb", "PH", "Cebuano (Pilipinas)"));
        linkedHashMap.put("cs-CZ", new C86074XqI("cs-CZ", "cs", "CZ", "Čeština (Česká republika)"));
        linkedHashMap.put("da", new C86074XqI("da", "da", "", "Dansk"));
        linkedHashMap.put("el-GR", new C86074XqI("el-GR", "el", "GR", "Ελληνικά (Ελλάδα)"));
        linkedHashMap.put("fi-FI", new C86074XqI("fi-FI", "fi", "FI", "Suomi (Suomi)"));
        linkedHashMap.put("fil-PH", new C86074XqI("fil-PH", "fil", "PH", "Filipino (Pilipinas)"));
        linkedHashMap.put("ga", new C86074XqI("ga", "ga", "", "Gaeilge"));
        linkedHashMap.put("he-IL", new C86074XqI("he-IL", "he", "IL", "עברית (ישראל)"));
        linkedHashMap.put("hi-IN", new C86074XqI("hi-IN", "hi", "IN", "हिंदी"));
        linkedHashMap.put("hu-HU", new C86074XqI("hu-HU", "hu", "HU", "Magyar (Magyarország)"));
        linkedHashMap.put("is", new C86074XqI("is", "is", "", "Íslenska"));
        linkedHashMap.put("it-IT", new C86074XqI("it-IT", "it", "IT", "Italiano (Italia)"));
        linkedHashMap.put("jv-ID", new C86074XqI("jv-ID", "jv", "ID", "Basa Jawa (Indonesia)"));
        linkedHashMap.put("km-KH", new C86074XqI("km-KH", "km", "KH", "ខ្មែរ (កម្ពុជា)"));
        linkedHashMap.put("kk", new C86074XqI("kk", "kk", "", "Қазақша"));
        linkedHashMap.put("my-MM", new C86074XqI("my-MM", "my", "MM", "မြန်မာ (မြန်မာ)"));
        linkedHashMap.put("nb", new C86074XqI("nb", "nb", "", "Norsk bokmål"));
        linkedHashMap.put("nl-NL", new C86074XqI("nl-NL", "nl", "NL", "Nederlands (Nederland)"));
        linkedHashMap.put("pl-PL", new C86074XqI("pl-PL", "pl", "PL", "Polski (Polska)"));
        linkedHashMap.put("ro-RO", new C86074XqI("ro-RO", "ro", "RO", "Română (Romania)"));
        linkedHashMap.put("sv-SE", new C86074XqI("sv-SE", "sv", "SE", "Svenska (Sverige)"));
        linkedHashMap.put("uk-UA", new C86074XqI("uk-UA", "uk", "UA", "Українська (Україна)"));
        linkedHashMap.put("ur", new C86074XqI("ur", "ur", "", "اردو"));
        linkedHashMap.put("uz", new C86074XqI("uz", "uz", "", "Oʻzbekcha"));
        linkedHashMap.put("zh-Hant-TW", new C86074XqI("zh-Hant-TW", "zh", "TW", "中文（繁體）", "zh-Hant"));
        linkedHashMap.put("zh-Hans", new C86074XqI("zh-Hans", "zh", "", "中文（简体）", "zh-Hans"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (android.text.TextUtils.equals("", X.C39567Ffv.LIZIZ(r2)) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ() {
        /*
            android.content.Context r1 = X.EF7.LIZIZ()
            r0 = 0
            java.util.Locale r2 = X.C39396FdA.LIZIZ(r1, r0, r0)
            java.lang.String r1 = "zh"
            java.lang.String r0 = r2.getLanguage()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L29
            X.Ffv r0 = X.C39399FdD.LIZIZ
            r0.getClass()
            java.lang.String r1 = X.C39567Ffv.LIZIZ(r2)
            java.lang.String r0 = ""
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L29
        L26:
            java.lang.String r1 = "zh-Hans"
        L28:
            return r1
        L29:
            java.util.Locale r1 = java.util.Locale.TRADITIONAL_CHINESE
            java.lang.String r0 = "TRADITIONAL_CHINESE"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r1)
            if (r0 == 0) goto L39
            java.lang.String r1 = "zh-Hant"
            goto L28
        L39:
            java.util.Locale r1 = java.util.Locale.CHINESE
            java.lang.String r0 = "CHINESE"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r1)
            if (r0 != 0) goto L26
            java.util.Locale r1 = java.util.Locale.SIMPLIFIED_CHINESE
            java.lang.String r0 = "SIMPLIFIED_CHINESE"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r1)
            if (r0 == 0) goto L54
            goto L26
        L54:
            java.lang.String r1 = "iw"
            java.lang.String r0 = r2.getLanguage()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L63
            java.lang.String r1 = "he"
            goto L28
        L63:
            java.lang.String r1 = "in"
            java.lang.String r0 = r2.getLanguage()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L72
            java.lang.String r1 = "id"
            goto L28
        L72:
            java.lang.String r1 = r2.getLanguage()
            java.lang.String r0 = "locale.language"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87094YGc.LIZ():java.lang.String");
    }
}
