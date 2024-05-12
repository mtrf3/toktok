package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LRw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54276LRw extends AbstractC54278LRy {
    public final AbstractC54272LRs LJ;

    @Override // X.AbstractC54278LRy
    public void LIZJ() {
        AbstractC54278LRy abstractC54278LRy;
        AbstractC54272LRs observable = this.LJ;
        o.LJIIIZ(observable, "observable");
        if ((observable instanceof AbstractC54278LRy) && (abstractC54278LRy = (AbstractC54278LRy) observable) != null && abstractC54278LRy.LIZLLL.compareAndSet(false, true)) {
            abstractC54278LRy.LIZIZ = null;
            abstractC54278LRy.LIZJ();
        }
    }

    public AbstractC54276LRw(C54277LRx c54277LRx) {
        this.LJ = c54277LRx;
    }
}
