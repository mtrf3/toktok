package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class CCJ {
    public static boolean LIZ(Context context) {
        if (context == null) {
            return false;
        }
        if (!context.getResources().getConfiguration().locale.getLanguage().equals("ar") && C012403c.LIZ(context) != 1) {
            return false;
        }
        return true;
    }
}
