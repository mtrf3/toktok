package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.R1q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68882R1q {
    public static final CopyOnWriteArraySet<InterfaceC68884R1s> LIZ = new CopyOnWriteArraySet<>();
    public static final java.util.Map<String, InterfaceC68884R1s> LIZIZ = new ConcurrentHashMap();

    public static void LIZ(C68878R1m c68878R1m) {
        if (c68878R1m == null) {
            return;
        }
        CopyOnWriteArraySet<InterfaceC68884R1s> copyOnWriteArraySet = LIZ;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        Iterator<InterfaceC68884R1s> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            it.next().LIZ(c68878R1m);
        }
    }
}
