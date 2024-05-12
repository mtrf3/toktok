package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EkF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37287EkF<T, R> implements InterfaceC48038ItG {
    public static final C37287EkF<T, R> LJLIL = new C37287EkF<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        String str;
        o.LJIIIZ(it, "it");
        List<InterfaceC37286EkE> LJIIJ = P8H.LJIIJ();
        if (LJIIJ != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) LJIIJ).iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                InterfaceC37286EkE interfaceC37286EkE = (InterfaceC37286EkE) next;
                if (interfaceC37286EkE != null) {
                    str = interfaceC37286EkE.LJ();
                } else {
                    str = null;
                }
                if (o.LJ("CACHE", str)) {
                    arrayList.add(next);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((InterfaceC37286EkE) it3.next()).LIZJ();
            }
            return "";
        }
        return "";
    }
}
