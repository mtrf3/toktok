package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UZF {
    public static final UZF LIZ = new UZF();
    public static final List<String> LIZIZ = C47261Igj.LJJIJIIJI("en", "ar", "de", "es", "fr", "id", "ja", "ko", "ru", "th", "tr", "vi", "zh-Hant", "he", "it", "pt", "hi");

    public static String LIZ() {
        String appLanguage = ((ILanguageService) C58725N2z.LIZIZ(ILanguageService.class)).getAppLanguage();
        if (!LIZIZ.contains(appLanguage)) {
            appLanguage = "en";
        }
        if (o.LJ(appLanguage, "zh-Hant")) {
            return "zh_Hant";
        }
        if (!o.LJ(appLanguage, "he")) {
            return appLanguage;
        }
        return "he_IL";
    }

    public static String LIZIZ(String str) {
        String str2;
        String appLanguage = ((ILanguageService) C58725N2z.LIZIZ(ILanguageService.class)).getAppLanguage();
        String LJIILL = AccountService.LJIJ().LJIILL();
        if (LJIILL != null) {
            Locale locale = Locale.ROOT;
            str2 = C141415gn.LIZIZ(locale, "ROOT", LJIILL, locale, "this as java.lang.String).toLowerCase(locale)");
        } else {
            str2 = null;
        }
        StringBuilder LIZLLL = C06540Nm.LIZLLL("https://www.tiktok.com/in_app/redirect?region=", str2, "&language=", appLanguage, "&projectKey=");
        LIZLLL.append(str);
        return X1D.LIZIZ(LIZLLL);
    }
}
