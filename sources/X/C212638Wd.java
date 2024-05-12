package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8Wd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212638Wd {
    public static final C212638Wd LIZ = new C212638Wd();
    public static final HashMap<String, Integer> LIZIZ = new HashMap<>();
    public static final HashMap<String, String> LIZJ = new HashMap<>();

    public static boolean LIZIZ(C212638Wd c212638Wd, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        c212638Wd.getClass();
        if (currentTimeMillis - C212648We.LIZIZ().getLong(C212648We.LIZ(str, "effect_%s_click_last_time"), 0L) >= 86400000) {
            if (currentTimeMillis - C212648We.LIZIZ().getLong("transform_first_time", 0L) > 86400000) {
                C212648We.LIZIZ().storeLong("transform_first_time", currentTimeMillis);
                C212648We.LIZIZ().storeLong("transform_total_count", 0L);
            }
            if (currentTimeMillis - C212648We.LIZIZ().getLong(C212648We.LIZ(str, "effect_%s_transform_first_time"), 0L) > 86400000) {
                C212648We.LIZIZ().storeLong(C212648We.LIZ(str, "effect_%s_transform_first_time"), currentTimeMillis);
                C212648We.LIZIZ().storeLong(C212648We.LIZ(str, "effect_%s_transform_count"), 0L);
            }
            if (C212648We.LIZIZ().getLong("transform_total_count", 0L) < ((Number) C212698Wj.LIZJ.getValue()).intValue()) {
                if (C212648We.LIZIZ().getLong(C212648We.LIZ(str, "effect_%s_transform_count"), 0L) < ((Number) C212698Wj.LIZLLL.getValue()).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LIZ(int i, String str, String eventType) {
        int abs;
        o.LJIIIZ(eventType, "eventType");
        if (!LIZIZ(this, str)) {
            return false;
        }
        Integer num = LIZIZ.get(eventType);
        if (C212698Wj.LIZJ() && num != null && (abs = Math.abs(num.intValue() - i)) != 0 && abs < ((Number) C212698Wj.LJ.getValue()).intValue()) {
            return false;
        }
        return true;
    }
}
