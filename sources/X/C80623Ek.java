package X;

import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3Ek, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80623Ek {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, String str2) {
        if (str != null && str.length() != 0) {
            Locale locale = Locale.getDefault();
            o.LJIIIIZZ(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (s.LJJJLZIJ(lowerCase, str2, false)) {
                return true;
            }
        }
        return false;
    }
}
