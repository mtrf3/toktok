package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.ttmock.TTMock;
import com.bytedance.ttmock.data.LanguageMock;
import java.util.List;
import java.util.Locale;
import ujb.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class FQX {
    public static Locale LIZ(Context context) {
        String string;
        String str = "";
        String string2 = LIZIZ(context).getString("key_current_locale", "");
        if (string2 == null || string2.length() == 0) {
            string = LIZIZ(context).getString("pref_language_key", "");
            if (string == null) {
                string = "";
            }
            String string3 = LIZIZ(context).getString("key_current_region", "");
            if (string3 != null) {
                str = string3;
            }
            if (string.length() == 0) {
                return null;
            }
        } else {
            string = "zh";
            if (!o.LJJJLIIL(string2, "zh-Hans", false)) {
                if (o.LJJJLIIL(string2, "zh-Hant", false)) {
                    str = "TW";
                } else if (!o.LJJJLIIL(string2, "zh", false)) {
                    List LJLJJL = s.LJLJJL(string2, new String[]{"-"}, 0, 6);
                    if (LJLJJL.size() > 1) {
                        string = (String) ListProtector.get(LJLJJL, 0);
                        str = (String) ListProtector.get(LJLJJL, 1);
                    } else if (LJLJJL.size() == 1) {
                        string = (String) ListProtector.get(LJLJJL, 0);
                    } else {
                        return Locale.getDefault();
                    }
                }
            }
            str = "CN";
        }
        return new Locale(string, str);
    }

    public static SharedPreferences LIZIZ(Context context) {
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "key_language_sp_key");
        kotlin.jvm.internal.o.LJIIIIZZ(LIZIZ, "ctx.getSharedPreferences…EY, Context.MODE_PRIVATE)");
        return LIZIZ;
    }

    public static void LIZJ(Context base) {
        String str;
        kotlin.jvm.internal.o.LJIIIZ(base, "base");
        try {
            LanguageMock languageMock = (LanguageMock) TTMock.INSTANCE.getMockDelegate(LanguageMock.class);
            if (languageMock != null && (str = (String) languageMock.get()) != null && str.length() != 0) {
                LIZIZ(base).edit().putString("key_current_locale", str).apply();
            }
            Locale LIZ = LIZ(base);
            if (LIZ == null) {
                return;
            }
            Resources resources = base.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.setLocale(LIZ);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            FQW.LIZ(LIZ);
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateLocale error:");
            LIZ2.append(V0N.LJJIJL(th));
            X1D.LIZIZ(LIZ2);
        }
    }
}
