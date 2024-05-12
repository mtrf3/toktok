package X;

import java.util.LinkedHashMap;

/* renamed from: X.2lC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67702lC {
    public static final java.util.Map<Integer, Integer> LIZ = C113554cx.LJJLIIIIJ(new OSZ(0, 2), new OSZ(1, 1), new OSZ(4, 3));

    public static int LIZ(int i) {
        Integer num = (Integer) ((LinkedHashMap) LIZ).get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 10000;
    }
}
