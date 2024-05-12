package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;

/* renamed from: X.XJk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84632XJk extends XJU {
    public final C84629XJh LIZ;
    public final C84629XJh LIZIZ;
    public final AbstractC84633XJl LIZJ;

    @Override // X.XJU
    public final XJV<?> LIZ() {
        C84635XJn c84635XJn = this.LIZJ.LIZ;
        if (c84635XJn != null) {
            return c84635XJn;
        }
        o.LJIJI("atomicOp");
        throw null;
    }

    public final void LIZLLL() {
        this.LIZJ.LJ(this);
    }

    @Override // X.XJU
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrepareOp(op=");
        LIZ.append(LIZ());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.XJU
    public final Object LIZJ(Object obj) {
        Object obj2;
        Object obj3;
        if (obj != null) {
            C84629XJh c84629XJh = (C84629XJh) obj;
            Object LJII = this.LIZJ.LJII(this);
            if (LJII == C84639XJr.LIZ) {
                C84629XJh c84629XJh2 = this.LIZIZ;
                X9N LJJI = c84629XJh2.LJJI();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C84629XJh.LJLIL;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(c84629XJh, this, LJJI)) {
                        this.LIZJ.LJIIIIZZ(c84629XJh);
                        c84629XJh2.LJIILJJIL();
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(c84629XJh) != this) {
                        break;
                    }
                }
                return C84639XJr.LIZ;
            }
            if (LJII != null) {
                obj2 = LIZ().LJ(LJII);
            } else {
                obj2 = LIZ()._consensus;
            }
            if (obj2 == XJW.LIZ) {
                obj3 = LIZ();
            } else if (obj2 == null) {
                obj3 = this.LIZJ.LJIIJJI(this.LIZIZ);
            } else {
                obj3 = this.LIZIZ;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C84629XJh.LJLIL;
            while (!atomicReferenceFieldUpdater2.compareAndSet(c84629XJh, this, obj3) && atomicReferenceFieldUpdater2.get(c84629XJh) == this) {
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
    }

    public C84632XJk(C84629XJh c84629XJh, C84629XJh c84629XJh2, AbstractC84633XJl abstractC84633XJl) {
        this.LIZ = c84629XJh;
        this.LIZIZ = c84629XJh2;
        this.LIZJ = abstractC84633XJl;
    }
}
