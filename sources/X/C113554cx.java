package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.4cx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C113554cx extends C51029K0z {
    public static final C93833mF LJJJLIIL() {
        C93833mF c93833mF = C93833mF.LJLIL;
        o.LJII(c93833mF, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c93833mF;
    }

    public static final HashMap LJJJLZIJ(OSZ... oszArr) {
        HashMap hashMap = new HashMap(C51029K0z.LJJIIZ(oszArr.length));
        LJJLIIIJL(hashMap, oszArr);
        return hashMap;
    }

    public static final LinkedHashMap LJJJZ(OSZ... oszArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(oszArr.length));
        LJJLIIIJL(linkedHashMap, oszArr);
        return linkedHashMap;
    }

    public static final java.util.Map LJJL(OSZ... pairs) {
        o.LJIIIZ(pairs, "pairs");
        if (pairs.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(pairs.length));
            LJJLIIIJL(linkedHashMap, pairs);
            return linkedHashMap;
        }
        return LJJJLIIL();
    }

    public static final java.util.Map LJJLIIIIJ(OSZ... pairs) {
        o.LJIIIZ(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(pairs.length));
        LJJLIIIJL(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final java.util.Map LJJLIIIJ(java.util.Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return map;
            }
            return C51029K0z.LJJJJIZL(map);
        }
        return LJJJLIIL();
    }

    public static final java.util.Map LJJLIIIJLJLI(Iterable iterable) {
        Object next;
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(collection.size()));
                    LJJLIIIJJIZ(iterable, linkedHashMap);
                    return linkedHashMap;
                }
                if (iterable instanceof List) {
                    next = ListProtector.get((List) iterable, 0);
                } else {
                    next = iterable.iterator().next();
                }
                return C51029K0z.LJJIIZI((OSZ) next);
            }
            return LJJJLIIL();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LJJLIIIJJIZ(iterable, linkedHashMap2);
        return LJJLIIIJ(linkedHashMap2);
    }

    public static final java.util.Map LJJLIIIJLLLLLLLZ(java.util.Map map) {
        o.LJIIIZ(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return LJJLIL(map);
            }
            return C51029K0z.LJJJJIZL(map);
        }
        return LJJJLIIL();
    }

    public static final java.util.Map LJJLIL(java.util.Map map) {
        o.LJIIIZ(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Object LJJJLL(Object obj, java.util.Map map) {
        o.LJIIIZ(map, "<this>");
        if (map instanceof InterfaceC35961E9l) {
            return ((InterfaceC35961E9l) map).LJFF(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Key ");
        LIZ.append(obj);
        LIZ.append(" is missing in the map.");
        throw new NoSuchElementException(X1D.LIZIZ(LIZ));
    }

    public static final java.util.Map LJJLI(Object obj, java.util.Map map) {
        o.LJIIIZ(map, "<this>");
        java.util.Map LJJLIL = LJJLIL(map);
        LJJLIL.remove(obj);
        return LJJLIIIJ(LJJLIL);
    }

    public static final java.util.Map LJJLIIIJILLIZJL(java.util.Map map, java.util.Map map2) {
        o.LJIIIZ(map, "<this>");
        o.LJIIIZ(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final java.util.Map LJJLIIIJJI(java.util.Map map, OSZ osz) {
        if (map.isEmpty()) {
            return C51029K0z.LJJIIZI(osz);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(osz.getFirst(), osz.getSecond());
        return linkedHashMap;
    }

    public static final void LJJLIIIJJIZ(Iterable pairs, java.util.Map map) {
        o.LJIIIZ(map, "<this>");
        o.LJIIIZ(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            map.put(osz.getFirst(), osz.getSecond());
        }
    }

    public static final void LJJLIIIJL(java.util.Map map, OSZ[] pairs) {
        o.LJIIIZ(map, "<this>");
        o.LJIIIZ(pairs, "pairs");
        for (OSZ osz : pairs) {
            map.put(osz.getFirst(), osz.getSecond());
        }
    }

    public static final void LJJLIIJ(java.util.Map map, C110574Vp c110574Vp) {
        C110564Vo c110564Vo = new C110564Vo(c110574Vp);
        while (c110564Vo.hasNext()) {
            OSZ osz = (OSZ) c110564Vo.next();
            map.put(osz.getFirst(), osz.getSecond());
        }
    }
}
