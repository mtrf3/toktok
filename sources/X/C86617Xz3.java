package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xz3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86617Xz3 {
    public static java.util.Map LIZ(C86616Xz2 data) {
        o.LJIIJ(data, "data");
        Integer num = data.LIZ;
        if (num != null) {
            num.intValue();
            if (data.LIZLLL != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Integer num2 = data.LIZ;
                if (num2 != null) {
                    linkedHashMap.put("httpCode", num2);
                    Object obj = data.LIZLLL;
                    if (obj != null) {
                        linkedHashMap.put("response", obj);
                        Integer num3 = data.LIZIZ;
                        if (num3 != null) {
                            C61845OOz.LIZLLL(num3, linkedHashMap, "clientCode");
                        }
                        java.util.Map<String, ? extends Object> map = data.LIZJ;
                        if (map != null) {
                            linkedHashMap.put("header", map);
                        }
                        String str = data.LJ;
                        if (str != null) {
                            linkedHashMap.put("rawResponse", str);
                        }
                        String str2 = data.LJFF;
                        if (str2 != null) {
                            linkedHashMap.put("responseType", str2);
                        }
                        return linkedHashMap;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                o.LJIIZILJ();
                throw null;
            }
        }
        return null;
    }
}
