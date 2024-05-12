package X;

import java.util.HashMap;

/* renamed from: X.2LC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2LC {
    public static final HashMap<String, Integer> LIZ;

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        LIZ = hashMap;
        hashMap.put("xx", 12334);
    }

    public static Integer LIZ(String str) {
        return LIZ.get(str);
    }
}
