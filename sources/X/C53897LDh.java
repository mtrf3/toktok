package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LDh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53897LDh {
    public static final ConcurrentHashMap<Object, CopyOnWriteArrayList<C53899LDj>> LIZ = new ConcurrentHashMap<>();

    public static C53899LDj LIZ(Class cls, Object any) {
        C53899LDj c53899LDj;
        o.LJIIIZ(any, "any");
        CopyOnWriteArrayList<C53899LDj> copyOnWriteArrayList = LIZ.get(any);
        C53899LDj c53899LDj2 = null;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (cls) {
            AqS175S0100000_9 aqS175S0100000_9 = new AqS175S0100000_9(cls, (Class<? extends C2K0>) 582);
            Iterator<C53899LDj> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C53899LDj next = it.next();
                if (((Boolean) aqS175S0100000_9.invoke(next)).booleanValue()) {
                    copyOnWriteArrayList.remove(next);
                    c53899LDj2 = next;
                    break;
                }
            }
            c53899LDj = c53899LDj2;
            if (copyOnWriteArrayList.size() == 0) {
                LIZ.remove(any);
            }
        }
        return c53899LDj;
    }
}
