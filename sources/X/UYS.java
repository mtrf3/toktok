package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UYS {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context) {
        o.LJI(context);
        Locale locale = context.getResources().getConfiguration().locale;
        o.LJIIIIZZ(locale, "context.resources.configuration.locale");
        String locale2 = locale.getLanguage();
        if (TextUtils.equals(locale2, "in")) {
            locale2 = "id";
        }
        if (TextUtils.equals(locale2, "pt")) {
            locale2 = "pt_BR";
        }
        if (TextUtils.equals(locale2, "zh")) {
            locale2 = "zh_Hant";
        }
        if (TextUtils.equals(locale2, "km")) {
            locale2 = "en";
        }
        o.LJIIIIZZ(locale2, "locale");
        return locale2;
    }
}
