package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.E7r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35915E7r {
    public static java.util.Map LIZ() {
        Object value = C35916E7s.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-CACHE_POOL>(...)");
        return (java.util.Map) value;
    }

    public static boolean LIZIZ(C35911E7n c35911E7n, String str) {
        List<String> list = c35911E7n.LJII;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (s.LJJJLZIJ(str, it.next(), false)) {
                    return false;
                }
            }
        }
        List<String> list2 = c35911E7n.LJI;
        if (list2 != null) {
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (s.LJJJLZIJ(str, it2.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LIZJ(InterfaceC60833Nu9 interfaceC60833Nu9, C35911E7n c35911E7n) {
        if (c35911E7n.LJ == -1 || System.currentTimeMillis() - interfaceC60833Nu9.getViewCreatedTime() < c35911E7n.LJ * 1000) {
            return true;
        }
        return false;
    }
}
