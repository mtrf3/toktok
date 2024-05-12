package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EkK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37292EkK {
    public static long LIZ() {
        List<InterfaceC37286EkE> LJIIJ = P8H.LJIIJ();
        if (LJIIJ != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJIIJ, 10));
            Iterator it = ((ArrayList) LJIIJ).iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((InterfaceC37286EkE) it.next()).LIZIZ()));
            }
            return ORZ.LLILLJJLI(arrayList);
        }
        return 0L;
    }
}
