package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.RAb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69101RAb {
    public static C86804Y4y LIZ;
    public static final List<WeakReference<InterfaceC69102RAc>> LIZIZ = new LinkedList();
    public static final List<InterfaceC69103RAd> LIZJ = new CopyOnWriteArrayList();

    public static void LIZ(C86804Y4y c86804Y4y) {
        synchronized (C69101RAb.class) {
            Iterator<WeakReference<InterfaceC69102RAc>> it = LIZIZ.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC69102RAc> next = it.next();
                if (next.get() == null) {
                    it.remove();
                } else {
                    next.get().LIZ(LIZ, c86804Y4y);
                }
            }
            LIZ = c86804Y4y;
        }
    }

    public static void LIZIZ(int i) {
        Iterator it = ((CopyOnWriteArrayList) LIZJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC69103RAd) it.next()).LJIIL(i);
        }
    }
}
