package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FJ7 {
    public static FJ6 LIZ(String type) {
        o.LJIIJ(type, "type");
        try {
            Locale locale = Locale.US;
            o.LJFF(locale, "Locale.US");
            String upperCase = type.toUpperCase(locale);
            o.LJFF(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return FJ6.valueOf(upperCase);
        } catch (IllegalArgumentException unused) {
            return FJ6.UNSUPPORTED;
        }
    }
}
