package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.OFl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61597OFl {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(java.util.Map map, String host) {
        o.LJIIJ(host, "host");
        StringBuilder sb = new StringBuilder(host);
        if (!map.isEmpty()) {
            sb.append("?");
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!C107244Iu.LIZIZ(str) && !C107244Iu.LIZIZ(str2)) {
                    if (i == 0) {
                        C1DI.LIZIZ(sb, str, "=", str2);
                    } else {
                        YE1.LIZLLL(sb, "&", str, "=", str2);
                    }
                }
                i++;
            }
        }
        String sb2 = sb.toString();
        o.LJFF(sb2, "urlBuilder.toString()");
        return sb2;
    }
}
