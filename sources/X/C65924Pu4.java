package X;

import Y.IDComparatorS39S0000000_11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Pu4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65924Pu4 {
    public static final C65924Pu4 LIZJ = new C65924Pu4();
    public static final ConcurrentHashMap<Integer, List<InterfaceC65943PuN>> LIZ = new ConcurrentHashMap<>();
    public static final List<InterfaceC65953PuX> LIZIZ = new ArrayList();

    public static void LIZ(int i, PYQ event) {
        o.LJIIIZ(event, "event");
        List<InterfaceC65943PuN> list = LIZ.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
        }
        Iterator<InterfaceC65943PuN> it = list.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(event);
        }
    }

    public final synchronized void LIZIZ(InterfaceC65943PuN handler, boolean z) {
        o.LJIIIZ(handler, "handler");
        ConcurrentHashMap<Integer, List<InterfaceC65943PuN>> concurrentHashMap = LIZ;
        List<InterfaceC65943PuN> list = concurrentHashMap.get(Integer.valueOf(handler.LIZ()));
        if (list == null) {
            list = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (z) {
            if (list.contains(handler)) {
                return;
            } else {
                arrayList.add(handler);
            }
        } else {
            arrayList.remove(handler);
        }
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS39S0000000_11(19));
        }
        concurrentHashMap.put(Integer.valueOf(handler.LIZ()), arrayList);
    }
}
