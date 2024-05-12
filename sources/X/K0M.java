package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes9.dex */
public final class K0M {
    public static final ConcurrentLinkedDeque<OSZ<Integer, InterfaceC50157JmL>> LIZ = new ConcurrentLinkedDeque<>();

    public static InterfaceC50157JmL LIZ() {
        OSZ<Integer, InterfaceC50157JmL> peekFirst = LIZ.peekFirst();
        if (peekFirst != null && peekFirst.getSecond() != null) {
            return peekFirst.getSecond();
        }
        return null;
    }

    public static InterfaceC50157JmL LIZIZ(int i) {
        ConcurrentLinkedDeque<OSZ<Integer, InterfaceC50157JmL>> concurrentLinkedDeque = LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<OSZ<Integer, InterfaceC50157JmL>> it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            OSZ<Integer, InterfaceC50157JmL> next = it.next();
            OSZ<Integer, InterfaceC50157JmL> osz = next;
            if (osz != null && i == osz.getFirst().intValue() && osz.getSecond() != null) {
                arrayList.add(next);
            }
        }
        OSZ osz2 = (OSZ) ORZ.LJLLLL(arrayList);
        if (osz2 != null) {
            return (InterfaceC50157JmL) osz2.getSecond();
        }
        return null;
    }

    public static void LIZJ(int i) {
        ConcurrentLinkedDeque<OSZ<Integer, InterfaceC50157JmL>> concurrentLinkedDeque = LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<OSZ<Integer, InterfaceC50157JmL>> it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            OSZ<Integer, InterfaceC50157JmL> next = it.next();
            OSZ<Integer, InterfaceC50157JmL> osz = next;
            if (osz != null && i == osz.getFirst().intValue() && osz.getSecond() != null) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            OSZ osz2 = (OSZ) it2.next();
            LIZ.remove(osz2);
            ((InterfaceC50157JmL) osz2.getSecond()).LJI();
        }
    }

    public static void LIZLLL(int i, C50145Jm9 c50145Jm9) {
        ConcurrentLinkedDeque<OSZ<Integer, InterfaceC50157JmL>> concurrentLinkedDeque = LIZ;
        OSZ<Integer, InterfaceC50157JmL> peekFirst = concurrentLinkedDeque.peekFirst();
        if (peekFirst != null && i == peekFirst.getFirst().intValue() && peekFirst.getSecond() != null) {
            concurrentLinkedDeque.removeFirst();
        }
        concurrentLinkedDeque.addFirst(new OSZ<>(Integer.valueOf(i), c50145Jm9));
    }
}
