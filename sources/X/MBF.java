package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.AqS172S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MBF implements MBA, Serializable {
    public final MBA LJLIL;
    public final MBD LJLILLLLZI;

    public final int LIZLLL() {
        int i = 2;
        MBF mbf = this;
        while (true) {
            MBA mba = mbf.LJLIL;
            if (!(mba instanceof MBF) || (mbf = (MBF) mba) == null) {
                break;
            }
            i++;
        }
        return i;
    }

    public int hashCode() {
        return this.LJLILLLLZI.hashCode() + this.LJLIL.hashCode();
    }

    private final Object writeReplace() {
        int LIZLLL = LIZLLL();
        MBA[] mbaArr = new MBA[LIZLLL];
        C76732zl c76732zl = new C76732zl();
        fold(C76800UCe.LIZ, new AqS172S0200000_9(mbaArr, c76732zl, 10));
        if (c76732zl.element == LIZLLL) {
            return new MBI(mbaArr);
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        return q.LIZIZ(LIZ, (String) fold("", MBH.LJLIL), ']', LIZ);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MBF)) {
                return false;
            }
            MBF mbf = (MBF) obj;
            if (mbf.LIZLLL() != LIZLLL()) {
                return false;
            }
            MBF mbf2 = this;
            while (true) {
                MBD mbd = mbf2.LJLILLLLZI;
                if (!o.LJ(mbf.get(mbd.getKey()), mbd)) {
                    return false;
                }
                MBA mba = mbf2.LJLIL;
                if (mba instanceof MBF) {
                    mbf2 = (MBF) mba;
                } else {
                    o.LJII(mba, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    MBD mbd2 = (MBD) mba;
                    if (!o.LJ(mbf.get(mbd2.getKey()), mbd2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // X.MBA
    public <E extends MBD> E get(InterfaceC48698J9i<E> key) {
        o.LJIIIZ(key, "key");
        MBF mbf = this;
        while (true) {
            E e = (E) mbf.LJLILLLLZI.get(key);
            if (e != null) {
                return e;
            }
            MBA mba = mbf.LJLIL;
            if (mba instanceof MBF) {
                mbf = (MBF) mba;
            } else {
                return (E) mba.get(key);
            }
        }
    }

    @Override // X.MBA
    public MBA minusKey(InterfaceC48698J9i<?> key) {
        o.LJIIIZ(key, "key");
        if (this.LJLILLLLZI.get(key) != null) {
            return this.LJLIL;
        }
        MBA minusKey = this.LJLIL.minusKey(key);
        if (minusKey == this.LJLIL) {
            return this;
        }
        if (minusKey == MBB.INSTANCE) {
            return this.LJLILLLLZI;
        }
        return new MBF(minusKey, this.LJLILLLLZI);
    }

    @Override // X.MBA
    public MBA plus(MBA mba) {
        return MBE.LIZ(this, mba);
    }

    public MBF(MBA left, MBD element) {
        o.LJIIIZ(left, "left");
        o.LJIIIZ(element, "element");
        this.LJLIL = left;
        this.LJLILLLLZI = element;
    }

    @Override // X.MBA
    public <R> R fold(R r, InterfaceC88471Ynr<? super R, ? super MBD, ? extends R> operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke((Object) this.LJLIL.fold(r, operation), this.LJLILLLLZI);
    }
}
