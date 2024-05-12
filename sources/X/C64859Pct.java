package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Pct, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64859Pct {
    public static void LIZ() {
        C64860Pcu c64860Pcu = new C64860Pcu();
        synchronized (C64735Pat.class) {
            C64735Pat.LJIILIIL = c64860Pcu;
        }
    }

    public static List<EJ6> LIZIZ(java.util.Map<String, String> map) {
        LinkedList linkedList = new LinkedList();
        if (map != null) {
            for (String str : map.keySet()) {
                linkedList.add(new EJ6(str, map.get(str)));
            }
        }
        return linkedList;
    }
}
