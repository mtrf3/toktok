package X;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Fd7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39393Fd7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, Locale locale) {
        Context LLLLL;
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        o.LJIIIIZZ(configuration, "configuration");
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration, null);
        if (!(context instanceof Application) && (LLLLL = C16880lQ.LLLLL(context)) != null) {
            Resources resources2 = LLLLL.getResources();
            Configuration configuration2 = resources2.getConfiguration();
            o.LJIIIIZZ(configuration2, "configuration");
            configuration2.setLocale(locale);
            resources2.updateConfiguration(configuration2, null);
        }
        C39399FdD.LIZIZ.getClass();
        String LIZIZ = C39567Ffv.LIZIZ(locale);
        if (TextUtils.isEmpty(LIZIZ)) {
            Locale locale2 = Resources.getSystem().getConfiguration().locale;
            o.LJIIIIZZ(locale2, "getSystem().configuration.locale");
            LIZIZ = C39567Ffv.LIZIZ(locale2);
        }
        C39396FdA.LIZ(context).edit().putString("key_current_region", LIZIZ).apply();
        C39396FdA.LIZ(context).edit().putString("pref_language_key", locale.getLanguage()).apply();
    }
}
