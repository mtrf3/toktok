package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;

/* renamed from: X.XJi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC84630XJi extends XJV<C84629XJh> {
    public final C84629XJh LIZIZ;
    public C84629XJh LIZJ;

    public AbstractC84630XJi(C84629XJh c84629XJh) {
        this.LIZIZ = c84629XJh;
    }

    @Override // X.XJV
    public final void LIZLLL(C84629XJh c84629XJh, Object obj) {
        boolean z;
        C84629XJh c84629XJh2;
        if (obj == null) {
            z = true;
            c84629XJh2 = this.LIZIZ;
        } else {
            z = false;
            c84629XJh2 = this.LIZJ;
        }
        if (c84629XJh2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C84629XJh.LJLIL;
            while (!atomicReferenceFieldUpdater.compareAndSet(c84629XJh, this, c84629XJh2)) {
                if (atomicReferenceFieldUpdater.get(c84629XJh) != this) {
                    return;
                }
            }
            if (z) {
                C84629XJh c84629XJh3 = this.LIZIZ;
                C84629XJh c84629XJh4 = this.LIZJ;
                o.LJI(c84629XJh4);
                c84629XJh3.LJIILL(c84629XJh4);
            }
        }
    }
}
