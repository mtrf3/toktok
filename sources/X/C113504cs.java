package X;

import java.util.LinkedHashMap;

/* renamed from: X.4cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113504cs {
    public static final LinkedHashMap<Integer, C59284NOm> LIZ = new LinkedHashMap<>();

    public static C59284NOm LIZ() {
        LinkedHashMap<Integer, C59284NOm> linkedHashMap = LIZ;
        if (!linkedHashMap.isEmpty()) {
            return linkedHashMap.values().iterator().next();
        }
        return null;
    }
}
