package X;

import Y.ARunnableS45S0100000_9;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LRx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54277LRx extends AbstractC54278LRy {
    public final List<C55537Lqv> LJ;
    public int LJFF;

    @Override // X.AbstractC54278LRy
    public final void LIZJ() {
        Iterator<C55537Lqv> it = this.LJ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ();
        }
    }

    @Override // X.AbstractC54278LRy
    public final void LIZLLL() {
        for (C55537Lqv c55537Lqv : this.LJ) {
            c55537Lqv.LIZIZ();
            c55537Lqv.LJ(new ARunnableS45S0100000_9(this, 5));
            c55537Lqv.LIZLLL();
        }
    }

    public C54277LRx(List<C55537Lqv> list) {
        this.LJ = list;
    }
}
