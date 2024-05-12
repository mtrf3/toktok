package X;

import java.util.Iterator;

/* loaded from: classes12.dex */
public final class PZ9 extends PZ1<Iterable<Object>> {
    public final /* synthetic */ PZ1 LIZ;

    public PZ9(PZ1 pz1) {
        this.LIZ = pz1;
    }

    @Override // X.PZ1
    public final void LIZ(C64638PYk c64638PYk, Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.LIZ.LIZ(c64638PYk, it.next());
        }
    }
}
