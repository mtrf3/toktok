package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9Ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235809Ng<AREA> {
    public final List<C235869Nm> LIZ = new ArrayList();

    public final void LIZ(Object entrance, C65776Prg c65776Prg) {
        o.LJIIIZ(entrance, "entrance");
        C235869Nm c235869Nm = new C235869Nm(entrance, c65776Prg);
        List<C235869Nm> list = this.LIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((C235869Nm) it.next()).LJLIL);
        }
        if (arrayList.contains(c235869Nm.LJLIL)) {
            return;
        }
        ((ArrayList) this.LIZ).add(c235869Nm);
    }
}
