package X;

import Y.ARunnableS0S1110000_3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7OG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7OG {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C7OH.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C7OI.LJLIL);

    public static void LIZ(C7PV tag, C7OJ listener) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(listener, "listener");
        C62822Ol8 c62822Ol8 = LIZIZ;
        List list = (List) ((java.util.Map) c62822Ol8.getValue()).get(Integer.valueOf(tag.getValue()));
        if (list == null) {
            ((java.util.Map) c62822Ol8.getValue()).put(Integer.valueOf(tag.getValue()), C47261Igj.LJJIJIL(listener));
        } else {
            list.add(listener);
        }
    }

    public static Boolean LIZIZ(C7PV tag, String id) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(id, "id");
        java.util.Map map = (java.util.Map) ((java.util.Map) LIZ.getValue()).get(Integer.valueOf(tag.getValue()));
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (Boolean) map.get(id);
    }

    public static void LIZJ(C7PV tag, C7OJ c7oj) {
        List list;
        o.LJIIIZ(tag, "tag");
        if (c7oj == null || (list = (List) ((java.util.Map) LIZIZ.getValue()).get(Integer.valueOf(tag.getValue()))) == null) {
            return;
        }
        list.remove(c7oj);
    }

    public static void LIZLLL(C7PV tag, String id, boolean z) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(id, "id");
        C62822Ol8 c62822Ol8 = LIZ;
        java.util.Map map = (java.util.Map) ((java.util.Map) c62822Ol8.getValue()).get(Integer.valueOf(tag.getValue()));
        if (map == null) {
            map = new LinkedHashMap();
            ((java.util.Map) c62822Ol8.getValue()).put(Integer.valueOf(tag.getValue()), map);
        }
        map.put(id, Boolean.valueOf(z));
        List list = (List) ((java.util.Map) LIZIZ.getValue()).get(Integer.valueOf(tag.getValue()));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1DH.LJJIJIIJI(new ARunnableS0S1110000_3((C7OJ) it.next(), id, z, 1));
            }
        }
    }
}
