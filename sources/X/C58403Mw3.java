package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Mw3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58403Mw3 {
    public static final ConcurrentHashMap<String, C58402Mw2> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C79238V7y> LIZIZ = new ConcurrentHashMap<>();

    public static Object LIZ(String src, String str) {
        java.util.Map<String, Object> map;
        o.LJIIIZ(src, "src");
        C58402Mw2 c58402Mw2 = LIZ.get(src);
        if (c58402Mw2 != null && (map = c58402Mw2.LIZ) != null) {
            return map.get(str);
        }
        return null;
    }

    public static void LIZIZ(String src, java.util.Map map) {
        C58402Mw2 c58402Mw2;
        java.util.Map<String, Object> map2;
        o.LJIIIZ(src, "src");
        ConcurrentHashMap<String, C58402Mw2> concurrentHashMap = LIZ;
        concurrentHashMap.putIfAbsent(src, new C58402Mw2(src));
        if (map != null && (c58402Mw2 = concurrentHashMap.get(src)) != null && (map2 = c58402Mw2.LIZ) != null) {
            map2.putAll(map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(String src, OSZ osz) {
        java.util.Map<String, Object> map;
        o.LJIIIZ(src, "src");
        ConcurrentHashMap<String, C58402Mw2> concurrentHashMap = LIZ;
        concurrentHashMap.putIfAbsent(src, new C58402Mw2(src));
        C58402Mw2 c58402Mw2 = concurrentHashMap.get(src);
        if (c58402Mw2 != null && (map = c58402Mw2.LIZ) != 0) {
            map.put(osz.getFirst(), osz.getSecond());
        }
    }
}
