package defpackage;

import X.X1D;
import java.util.Map;
import java.util.SortedMap;

/* loaded from: classes9.dex */
public final class u1 {
    public final w1 LIZ = new w1();

    /* loaded from: classes9.dex */
    public static final class a {
    }

    public static void LIZ(w1 w1Var, String str, SortedMap sortedMap) {
        if (w1Var.LIZIZ) {
            sortedMap.put(Integer.valueOf(w1Var.LIZJ), w1Var);
        }
        for (Map.Entry<Character, w1> entry : w1Var.LIZ.entrySet()) {
            char charValue = entry.getKey().charValue();
            w1 value = entry.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(charValue);
            LIZ(value, X1D.LIZIZ(LIZ), sortedMap);
        }
    }
}
