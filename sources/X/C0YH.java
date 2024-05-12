package X;

import android.content.Context;

/* renamed from: X.0YH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YH {
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
