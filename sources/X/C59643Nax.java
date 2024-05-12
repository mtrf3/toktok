package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.Nax, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59643Nax {
    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o.LJI(str);
        if (!ujb.o.LJJJLIIL(str, "http", false) && !ujb.o.LJJJLIIL(str, "https", false)) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(String str) {
        if (LIZ(str)) {
            return false;
        }
        if (!TextUtils.equals("about:blank", str)) {
            if (str == null || str.length() <= 9) {
                return false;
            }
            String substring = str.substring(0, 10);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (!ujb.o.LJJJJIZL(substring, "javascript", true)) {
                return false;
            }
        }
        return true;
    }
}
