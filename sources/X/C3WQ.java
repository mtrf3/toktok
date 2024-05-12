package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3WQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WQ implements C3WY {
    public final List<C3WR> LJLIL = new ArrayList();

    public final void LIZ() {
        Iterator<C3WR> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        ((ArrayList) this.LJLIL).remove(l);
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR l) {
        o.LJIIIZ(l, "l");
        ((ArrayList) this.LJLIL).add(l);
    }
}
