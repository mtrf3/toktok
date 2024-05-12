package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.PpL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65631PpL {
    public static void LIZIZ(Iterator<?> it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> boolean LIZ(Collection<T> collection, Iterator<? extends T> it) {
        collection.getClass();
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }
}
