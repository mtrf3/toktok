package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NZV {
    public final List<InterfaceC59569NZl> LIZ = new ArrayList();

    public final void LIZ(NZZ status) {
        o.LJIIIZ(status, "status");
        int i = C59558NZa.LIZ[status.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            Iterator<InterfaceC59569NZl> it = this.LIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
            return;
        }
        Iterator<InterfaceC59569NZl> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ();
        }
    }
}
