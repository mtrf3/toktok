package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.regex.Pattern;

/* renamed from: X.EfJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36981EfJ {
    public static final Pattern LIZ = PatternProtector.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");
    public static final Pattern LIZIZ = PatternProtector.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    public static final Pattern LIZJ = PatternProtector.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    public static boolean LIZ(String str) {
        int i;
        int indexOf;
        int i2;
        int indexOf2;
        if (str == null) {
            return false;
        }
        try {
            if (str.length() < 7 || str.length() > 15 || str.equals("")) {
                return false;
            }
            if (!LIZ.matcher(str).matches()) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            try {
                int indexOf3 = str.indexOf(46);
                if (indexOf3 == -1 || str.charAt(0) == '-' || CastIntegerProtector.parseInt(str.substring(0, indexOf3)) > 255 || (indexOf = str.indexOf(46, (i = indexOf3 + 1))) == -1 || str.charAt(i) == '-' || CastIntegerProtector.parseInt(str.substring(i, indexOf)) > 255 || (indexOf2 = str.indexOf(46, (i2 = indexOf + 1))) == -1 || str.charAt(i2) == '-' || CastIntegerProtector.parseInt(str.substring(i2, indexOf2)) > 255) {
                    return false;
                }
                int i3 = indexOf2 + 1;
                if (str.charAt(i3) == '-' || CastIntegerProtector.parseInt(str.substring(i3, str.length())) > 255) {
                    return false;
                }
                if (str.charAt(str.length() - 1) == '.') {
                    return false;
                }
                return true;
            } catch (Exception unused2) {
                return false;
            }
        }
    }

    public static boolean LIZIZ(String str) {
        if (LIZIZ.matcher(str).matches() || LIZJ.matcher(str).matches()) {
            return true;
        }
        return false;
    }
}
