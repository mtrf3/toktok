package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pwi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66088Pwi implements InterfaceC66039Pvv {
    @Override // X.InterfaceC66039Pvv
    public final int LIZ() {
        return 5;
    }

    @Override // X.InterfaceC66039Pvv
    public final void LIZIZ(C66120PxE event) {
        o.LJIIIZ(event, "event");
        if (!o.LJ(event.LJLZ, "SensitiveApiException")) {
            return;
        }
        List<C65955PuZ> list = C65986Pv4.LIZLLL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<C65955PuZ> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().LIZ));
        }
        if (arrayList.contains(Integer.valueOf(event.LJLJI))) {
            C66080Pwa.LIZJ(event);
        }
        C66089Pwj.LIZIZ.LIZ(event, false);
    }
}
