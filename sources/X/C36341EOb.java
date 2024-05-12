package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.EOb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36341EOb {
    public long LIZ;
    public long LIZIZ;
    public final HashMap<String, Long> LIZJ = new HashMap<>();
    public final HashMap<String, Long> LIZLLL = new HashMap<>();
    public final HashMap<String, Long> LJ = new HashMap<>();
    public final HashMap<String, Long> LJFF = new HashMap<>();
    public final HashMap<String, Long> LJI = new HashMap<>();

    public static long LIZ(long j, Long l) {
        if (l != null) {
            l.longValue();
            return l.longValue() + j;
        }
        return j;
    }

    public static void LIZIZ(HashMap plus, HashMap hashMap) {
        o.LJIIIZ(plus, "$this$plus");
        for (Map.Entry entry : hashMap.entrySet()) {
            plus.put(entry.getKey(), Long.valueOf(LIZ(((Number) entry.getValue()).longValue(), (Long) plus.get(entry.getKey()))));
        }
    }
}
