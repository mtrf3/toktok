package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Pox, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65607Pox {
    public static int LIZIZ(java.util.Set<?> set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    public static boolean LIZ(java.util.Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean LIZJ(java.util.Set<?> set, Collection<?> collection) {
        collection.getClass();
        if (collection instanceof InterfaceC65672Pq0) {
            collection = ((InterfaceC65672Pq0) collection).elementSet();
        }
        boolean z = false;
        if ((collection instanceof java.util.Set) && collection.size() > set.size()) {
            Iterator<?> it = set.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            z |= set.remove(it2.next());
        }
        return z;
    }
}
