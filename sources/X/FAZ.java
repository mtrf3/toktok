package X;

import Y.IDComparatorS29S0000000_1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FAZ implements InterfaceC38529FAf {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final ConcurrentHashMap<String, C38528FAe> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C38528FAe> LIZJ = new ConcurrentHashMap<>();
    public InterfaceC38526FAc LIZLLL;

    public static List LIZ(String str, ConcurrentHashMap concurrentHashMap) {
        Collection values = concurrentHashMap.values();
        o.LJIIIIZZ(values, "values");
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        if (!it.hasNext()) {
            return ORZ.LLILLL(ORZ.LLILII(new IDComparatorS29S0000000_1(4), arrayList), 10);
        }
        it.next().getClass();
        ujb.o.LJJJLIIL(null, str, false);
        throw null;
    }
}
