package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xyg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86594Xyg {
    public static java.util.Map LIZ(C86593Xyf data) {
        o.LJIIJ(data, "data");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = data.LIZ;
        if (str != null) {
            linkedHashMap.put("url", str);
        }
        String str2 = data.LIZIZ;
        if (str2 != null) {
            linkedHashMap.put("uri", str2);
        }
        java.util.Map<String, ? extends Object> map = data.LIZJ;
        if (map != null) {
            linkedHashMap.put("response", map);
        }
        Integer num = data.LIZLLL;
        if (num != null) {
            C61845OOz.LIZLLL(num, linkedHashMap, "clientCode");
        }
        return linkedHashMap;
    }
}
