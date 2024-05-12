package X;

import defpackage.a1;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EWX {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (str.length() == 8) {
            String substring = str.substring(6, 8);
            o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Locale locale = Locale.ROOT;
            o.LJFF(locale, "Locale.ROOT");
            String upperCase = substring.toUpperCase(locale);
            o.LJFF(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            String substring2 = str.substring(0, 6);
            o.LJFF(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String upperCase2 = substring2.toUpperCase(locale);
            o.LJFF(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            return upperCase.concat(upperCase2);
        }
        return str;
    }

    public static String LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (s.LJLJL(str, '#')) {
            if (length == 7) {
                Locale locale = Locale.ROOT;
                o.LJFF(locale, "Locale.ROOT");
                String upperCase = str.toUpperCase(locale);
                o.LJFF(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                return upperCase;
            }
            if (length == 9) {
                String substring = str.substring(1);
                o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
                String LIZ2 = LIZ(substring);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(String.valueOf('#'));
                LIZ3.append(LIZ2);
                return X1D.LIZIZ(LIZ3);
            }
        }
        if (length == 6) {
            Locale locale2 = Locale.ROOT;
            o.LJFF(locale2, "Locale.ROOT");
            String upperCase2 = str.toUpperCase(locale2);
            o.LJFF(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(String.valueOf('#'));
            LIZ4.append(upperCase2);
            return X1D.LIZIZ(LIZ4);
        }
        if (length == 8) {
            String LIZ5 = LIZ(str);
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append(String.valueOf('#'));
            LIZ6.append(LIZ5);
            return X1D.LIZIZ(LIZ6);
        }
        throw new EGQ(a1.LJ("color:", str, " is illegal，please use supported formats: #RRGGBB,#RRGGBBAA,RRGGBB,RRGGBBAA"));
    }
}
