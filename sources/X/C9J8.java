package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9J8, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9J8<AREA> {
    public final List LIZ = new ArrayList();

    public final void LIZ(C9JT entrance, C65776Prg c65776Prg) {
        o.LJIIIZ(entrance, "entrance");
        C9J9 c9j9 = new C9J9(entrance, c65776Prg);
        List list = this.LIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((C9J9) it.next()).LJLIL);
        }
        if (arrayList.contains(c9j9.LJLIL)) {
            return;
        }
        ((ArrayList) this.LIZ).add(c9j9);
    }
}
