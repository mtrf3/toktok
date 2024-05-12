package X;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.Fd0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39386Fd0 {
    public static Context LIZ(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            Locale LIZJ = C85999Xp5.LIZJ(context, null, null);
            Configuration configuration = new Configuration();
            configuration.setLocale(LIZJ);
            configuration.setLocales(new LocaleList(LIZJ));
            try {
                if (SettingServiceImpl.LIZ().isArabicLang(context)) {
                    configuration.screenLayout = (configuration.screenLayout & (-193)) | 128;
                }
            } catch (Throwable unused) {
            }
            return context.createConfigurationContext(configuration);
        }
        return context;
    }

    public static Locale LIZIZ(Context context) {
        return context.getResources().getConfiguration().locale;
    }

    public static void LIZLLL(Context context, Locale locale, boolean z) {
        Context LLLLL;
        if (z) {
            FQW.LIZ(locale);
        }
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration, null);
        if (!(context instanceof Application) && (LLLLL = C16880lQ.LLLLL(context)) != null) {
            Resources resources2 = LLLLL.getResources();
            Configuration configuration2 = resources2.getConfiguration();
            configuration2.setLocale(locale);
            resources2.updateConfiguration(configuration2, null);
        }
        C39399FdD.LIZIZ.getClass();
        String LIZIZ = C39567Ffv.LIZIZ(locale);
        if (TextUtils.isEmpty(LIZIZ)) {
            LIZIZ = C39399FdD.LIZ(Resources.getSystem().getConfiguration().locale);
        }
        C39392Fd6.LIZ(context).edit().putString("key_current_region", LIZIZ).apply();
        C39392Fd6.LIZ(context).edit().putString("pref_language_key", locale.getLanguage()).apply();
        if (z && FKR.LIZ()) {
            boolean LIZLLL = C39406FdK.LIZLLL(locale);
            String LIZJ = C39406FdK.LIZJ(locale);
            C39388Fd2 c39388Fd2 = C40908G3s.LIZJ;
            if (c39388Fd2 != null) {
                c39388Fd2.LIZ = C40905G3p.LIZIZ();
                c39388Fd2.LIZIZ = locale;
            }
            C40905G3p.LIZLLL(context, LIZJ, locale, LIZLLL);
            FQU fqu = C40905G3p.LJI;
            if (fqu != null) {
                fqu.LIZ = C40905G3p.LIZLLL;
            }
            C39406FdK.LIZ(context, locale);
            C39388Fd2 c39388Fd22 = C40908G3s.LIZJ;
            if (c39388Fd22 == null) {
                return;
            }
            JSONObject jSONObject = C40908G3s.LIZLLL;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C38458F7m c38458F7m = new C38458F7m();
            c38458F7m.LIZ = "switch_locale_event";
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("old_locale", c39388Fd22.LIZ);
            jSONObject2.put("new_locale", c39388Fd22.LIZIZ);
            c38458F7m.LIZIZ = jSONObject2;
            c38458F7m.LIZLLL = jSONObject;
            C09900aA.LJII(new C38459F7n(c38458F7m));
            C40908G3s.LIZJ = new C39388Fd2();
        }
    }

    public static void LIZJ(Context context, Locale locale, boolean z, C39575Fg3 c39575Fg3) {
        boolean z2;
        if (locale.equals(context.getResources().getConfiguration().locale)) {
            if (c39575Fg3 != null) {
                c39575Fg3.LIZ();
                return;
            }
            return;
        }
        if (z) {
            IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
            if (LIZLLL != null) {
                LIZLLL.enableInstall();
                z2 = true;
            } else {
                z2 = false;
            }
            if (EF7.LJIIIIZZ && z2) {
                IPluginService LIZLLL2 = AabPluginServiceImpl.LIZLLL();
                if (LIZLLL2 != null) {
                    C37132Ehk c37132Ehk = new C37132Ehk();
                    c37132Ehk.LJFF = new Locale(locale.getLanguage());
                    c37132Ehk.LIZLLL = new C39387Fd1(context, locale, c39575Fg3);
                    LIZLLL2.LIZ(new C37131Ehj(c37132Ehk));
                    return;
                }
                return;
            }
        }
        LIZLLL(context, locale, z);
        if (c39575Fg3 != null) {
            c39575Fg3.LIZ();
        }
    }
}
