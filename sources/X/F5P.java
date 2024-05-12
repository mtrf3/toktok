package X;

import com.google.gson.internal.b;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F5P extends C77275UUl {
    public static final java.util.Set LJIIIZ(java.util.Set set, Iterable elements) {
        o.LJIIIZ(set, "<this>");
        o.LJIIIZ(elements, "elements");
        Collection<?> LJII = b.LJII(elements, set);
        if (LJII.isEmpty()) {
            return ORZ.LLJJ(set);
        }
        if (LJII instanceof java.util.Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!LJII.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(LJII);
        return linkedHashSet2;
    }

    public static final java.util.Set LJIIJ(java.util.Set set, Object obj) {
        o.LJIIIZ(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C51029K0z.LJJIIZ(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            if (!z && o.LJ(obj2, obj)) {
                z = true;
            } else {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static final java.util.Set LJIIJJI(java.util.Set set, Iterable elements) {
        int size;
        Integer valueOf;
        o.LJIIIZ(set, "<this>");
        o.LJIIIZ(elements, "elements");
        if ((elements instanceof Collection) && (valueOf = Integer.valueOf(((Collection) elements).size())) != null) {
            size = set.size() + valueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C51029K0z.LJJIIZ(size));
        linkedHashSet.addAll(set);
        ORS.LJJLIIIJILLIZJL(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static final java.util.Set LJIIL(java.util.Set set, Object obj) {
        o.LJIIIZ(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C51029K0z.LJJIIZ(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
