package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.EJb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36211EJb {
    public static C232649Bc LJIIIIZZ;
    public static final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final HashMap<String, C2322399n> LIZJ = new HashMap<>();
    public static final HashMap<String, C94Z> LIZLLL = new HashMap<>();
    public static final HashMap<String, HashSet<String>> LJ = new HashMap<>();
    public static final ConcurrentHashMap<Integer, FT6> LJFF = new ConcurrentHashMap<>();
    public static final HashMap<String, FT6> LJI = new HashMap<>();
    public static final HashMap<Integer, HashSet<Integer>> LJII = new HashMap<>();
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public static final C2322799r LJIIJ = new Object() { // from class: X.99r
    };

    public static void LIZ(String blood) {
        o.LJIIIZ(blood, "blood");
        if (!LJIIIZ.get()) {
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = LIZIZ;
        if (!concurrentHashMap.containsKey(blood)) {
            String name = C16880lQ.LLLLIIIILLL().getName();
            o.LJIIIIZZ(name, "currentThread().name");
            concurrentHashMap.put(blood, name);
        }
        HashSet<String> hashSet = LJ.get(blood);
        if (hashSet != null && hashSet.contains(C16880lQ.LLLLIIIILLL().getName())) {
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap2 = LIZ;
        String name2 = C16880lQ.LLLLIIIILLL().getName();
        o.LJIIIIZZ(name2, "currentThread().name");
        concurrentHashMap2.put(name2, blood);
    }
}
