package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;

/* renamed from: X.XJj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84631XJj<T> extends AbstractC84633XJl {
    public static final /* synthetic */ AtomicReferenceFieldUpdater LIZJ = AtomicReferenceFieldUpdater.newUpdater(C84631XJj.class, Object.class, "_affectedNode");
    public static final /* synthetic */ AtomicReferenceFieldUpdater LIZLLL = AtomicReferenceFieldUpdater.newUpdater(C84631XJj.class, Object.class, "_originalNext");
    public final C84629XJh LIZIZ;
    public volatile /* synthetic */ Object _affectedNode;
    public volatile /* synthetic */ Object _originalNext;

    @Override // X.AbstractC84633XJl
    public final C84629XJh LJFF() {
        return (C84629XJh) this._affectedNode;
    }

    @Override // X.AbstractC84633XJl
    public final C84629XJh LJI() {
        return (C84629XJh) this._originalNext;
    }

    public final C84629XJh LJIIL() {
        C84629XJh c84629XJh = (C84629XJh) this._affectedNode;
        o.LJI(c84629XJh);
        return c84629XJh;
    }

    public C84631XJj(XJT xjt) {
        this.LIZIZ = xjt;
    }

    @Override // X.AbstractC84633XJl
    public Object LIZJ(C84629XJh c84629XJh) {
        if (c84629XJh == this.LIZIZ) {
            return C84638XJq.LIZIZ;
        }
        return null;
    }

    @Override // X.AbstractC84633XJl
    public final void LIZLLL(C84629XJh c84629XJh) {
        c84629XJh.LJIILJJIL();
    }

    @Override // X.AbstractC84633XJl
    public final void LJ(C84632XJk c84632XJk) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZJ;
        C84629XJh c84629XJh = c84632XJk.LIZ;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c84629XJh) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LIZLLL;
        C84629XJh c84629XJh2 = c84632XJk.LIZIZ;
        while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, c84629XJh2) && atomicReferenceFieldUpdater2.get(this) == null) {
        }
    }

    @Override // X.AbstractC84633XJl
    public final boolean LJIIIZ(Object obj) {
        if (!(obj instanceof X9N)) {
            return false;
        }
        ((X9N) obj).LIZ.LJIJI();
        return true;
    }

    @Override // X.AbstractC84633XJl
    public final C84629XJh LJIIJ(XJU xju) {
        C84629XJh c84629XJh = this.LIZIZ;
        while (true) {
            Object obj = c84629XJh._next;
            if (obj instanceof XJU) {
                XJU xju2 = (XJU) obj;
                if (xju.LIZIZ(xju2)) {
                    return null;
                }
                xju2.LIZJ(this.LIZIZ);
            } else {
                return (C84629XJh) obj;
            }
        }
    }

    @Override // X.AbstractC84633XJl
    public final X9N LJIIJJI(C84629XJh c84629XJh) {
        return c84629XJh.LJJI();
    }
}
