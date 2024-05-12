package X;

import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class HG2 {
    public static final java.util.Map<String, String> LIZ = new LinkedHashMap();
    public static final java.util.Map<String, StringBuilder> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<String, Integer> LIZJ = new LinkedHashMap();

    public static final void LIZ(String str, String str2) {
        int i;
        if (str != null) {
            LIZ.put(str, str2);
            java.util.Map<String, Integer> map = LIZJ;
            Integer num = (Integer) ((LinkedHashMap) map).get(str);
            if (num != null) {
                i = num.intValue() + 1;
            } else {
                i = 0;
            }
            map.put(str, Integer.valueOf(i));
            java.util.Map<String, StringBuilder> map2 = LIZIZ;
            if (map2.containsKey(str)) {
                StringBuilder sb = (StringBuilder) ((LinkedHashMap) map2).get(str);
                if (sb != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("\n ");
                    LIZ2.append(str2);
                    sb.append(X1D.LIZIZ(LIZ2));
                    return;
                }
                return;
            }
            map2.put(str, new StringBuilder(str2));
        }
    }
}
