package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.FdA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39396FdA {
    public static final /* synthetic */ int LIZ = 0;

    public static SharedPreferences LIZ(Context context) {
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "key_language_sp_key");
        o.LJIIIIZZ(LIZIZ, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return LIZIZ;
    }

    public static void LIZJ(String str, String str2) {
        LIZ(EF7.LIZIZ()).edit().putString(str, str2).apply();
    }

    public static Locale LIZIZ(Context context, String language, String str) {
        Locale locale;
        Locale defaultLocale = Locale.getDefault();
        String str2 = "";
        if (str == null && (str = LIZ(context).getString("pref_language_key", "")) == null) {
            str = "";
        }
        if (language == null) {
            o.LJIIIIZZ(defaultLocale, "defaultLocale");
            language = LIZ(EF7.LIZIZ()).getString("key_current_locale", "");
            if (language == null) {
                language = "";
            }
            if (TextUtils.isEmpty(language)) {
                C39399FdD.LIZIZ.getClass();
                String LIZIZ = C39567Ffv.LIZIZ(defaultLocale);
                language = defaultLocale.getLanguage();
                if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, language)) {
                    if (TextUtils.equals(str, "zh-Hant") || TextUtils.equals(str, "zh")) {
                        LIZJ("key_current_locale", "zh-Hant-TW");
                        language = "zh-Hant-TW";
                        break;
                    }
                    if (TextUtils.equals(str, "in")) {
                        LIZJ("key_current_locale", "id-ID");
                        language = "id-ID";
                    } else if (TextUtils.equals(str, "iw")) {
                        LIZJ("key_current_locale", "he-IL");
                        language = "he-IL";
                    } else {
                        language = str;
                    }
                } else {
                    str2 = LIZIZ;
                }
                Locale SIMPLIFIED_CHINESE = Locale.SIMPLIFIED_CHINESE;
                o.LJIIIIZZ(SIMPLIFIED_CHINESE, "SIMPLIFIED_CHINESE");
                if (!o.LJ(defaultLocale, SIMPLIFIED_CHINESE)) {
                    if (TextUtils.equals("in", language)) {
                        LIZJ("key_current_locale", "id-ID");
                        language = "id-ID";
                    } else if (TextUtils.equals("iw", language)) {
                        LIZJ("key_current_locale", "he-IL");
                        language = "he-IL";
                    } else {
                        for (G36 g36 : ((LinkedHashMap) ABY.LIZ.LIZ).values()) {
                            C39567Ffv c39567Ffv = C39399FdD.LIZIZ;
                            Locale locale2 = g36.getLocale();
                            o.LJIIIIZZ(locale2, "item.locale");
                            c39567Ffv.getClass();
                            if (TextUtils.isEmpty(C39567Ffv.LIZIZ(locale2))) {
                                if (TextUtils.equals(language, g36.getLocale().getLanguage())) {
                                    LIZJ("key_current_locale", language);
                                    o.LJIIIIZZ(language, "language");
                                    break;
                                }
                            } else {
                                if (TextUtils.equals("zh-Hant", language) || TextUtils.equals("zh", language) || TextUtils.equals("zh_TW", language)) {
                                    LIZJ("key_current_locale", "zh-Hant-TW");
                                    language = "zh-Hant-TW";
                                    break;
                                }
                                if (TextUtils.equals(language, g36.getLocale().getLanguage())) {
                                    Locale locale3 = g36.getLocale();
                                    o.LJIIIIZZ(locale3, "item.locale");
                                    if (TextUtils.equals(str2, C39567Ffv.LIZIZ(locale3))) {
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append(language);
                                        LIZ2.append('-');
                                        LIZ2.append(str2);
                                        LIZJ("key_current_locale", X1D.LIZIZ(LIZ2));
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append(language);
                                        LIZ3.append('-');
                                        LIZ3.append(str2);
                                        language = X1D.LIZIZ(LIZ3);
                                        break;
                                    }
                                }
                                if (TextUtils.equals(language, g36.getLocale().getLanguage())) {
                                    LIZJ("key_current_locale", g36.LIZ());
                                    language = g36.LIZ();
                                    o.LJIIIIZZ(language, "item.localeStr");
                                    break;
                                }
                            }
                        }
                        LIZJ("key_current_locale", "en");
                    }
                }
                language = "en";
            }
        }
        try {
            G36 g362 = (G36) ((LinkedHashMap) ABY.LIZ.LIZ).get(language);
            if (g362 != null) {
                locale = g362.getLocale();
            } else {
                locale = null;
            }
            if (locale != null) {
                return locale;
            }
        } catch (Throwable unused) {
        }
        o.LJIIIIZZ(defaultLocale, "defaultLocale");
        return defaultLocale;
    }
}
