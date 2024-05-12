package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Fla, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39918Fla {
    public static final C39918Fla LIZIZ = new C39918Fla();
    public static final ConcurrentHashMap<String, Pattern> LIZ = new ConcurrentHashMap<>();

    public static String LIZ(String str) {
        o.LJIIJ(str, "str");
        if (str.length() > 0 && s.LJJLIIJ(str, "/", 6) == str.length() - 1) {
            String substring = str.substring(0, str.length() - 1);
            o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }
}
