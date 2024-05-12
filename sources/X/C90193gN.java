package X;

import android.content.Context;
import android.text.TextUtils;
import defpackage.a1;
import java.util.Locale;

/* renamed from: X.3gN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90193gN {
    public static boolean LIZ() {
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Context context) {
        if (context == null || C012403c.LIZ(context) != 1) {
            return false;
        }
        return true;
    }

    public static String LIZJ(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return a1.LJ("\u2068", str, "\u2069");
    }
}
