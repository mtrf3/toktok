package X;

import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Edi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36882Edi {
    public static final /* synthetic */ int LIZ = 0;

    public static C61023NxD LIZ(String url, String prefix) {
        boolean z;
        o.LJIIJ(url, "url");
        o.LJIIJ(prefix, "prefix");
        if (url.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && prefix.length() > 0) {
            Integer valueOf = Integer.valueOf(s.LJJLIIIJJIZ(url, '?', 0, false, 6));
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                url = url.substring(0, valueOf.intValue());
                o.LJFF(url, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            Integer valueOf2 = Integer.valueOf(s.LJJLIIIJJIZ(url, '#', 0, false, 6));
            if (valueOf2.intValue() != -1) {
                url = url.substring(0, valueOf2.intValue());
                o.LJFF(url, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            if (!s.LJJL(prefix, '/')) {
                prefix = C42398GkU.LIZIZ(prefix, '/');
            }
            Integer valueOf3 = Integer.valueOf(s.LJJLIIIJL(url, prefix, 0, false, 6));
            if (valueOf3.intValue() != -1) {
                String substring = url.substring(prefix.length() + valueOf3.intValue());
                o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
                Integer valueOf4 = Integer.valueOf(s.LJJLIIIJJIZ(substring, '/', 0, false, 6));
                if (valueOf4.intValue() != -1) {
                    int intValue = valueOf4.intValue();
                    String substring2 = substring.substring(0, intValue);
                    o.LJFF(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    String substring3 = substring.substring(intValue + 1);
                    o.LJFF(substring3, "(this as java.lang.String).substring(startIndex)");
                    if ((!ujb.o.LJJJJJL(substring2)) && (!ujb.o.LJJJJJL(substring3))) {
                        return new C61023NxD("", substring2, substring3);
                    }
                }
            }
        }
        return null;
    }
}
