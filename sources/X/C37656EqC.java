package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.EqC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37656EqC<T> extends AbstractC37657EqD<T> implements Iterator<T>, InterfaceC67352kd<C76800UCe>, InterfaceC90533gv {
    public int LJLIL;
    public T LJLILLLLZI;
    public Iterator<? extends T> LJLJI;
    public InterfaceC67352kd<? super C76800UCe> LJLJJI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Throwable LJ() {
        int i = this.LJLIL;
        if (i != 4) {
            if (i != 5) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unexpected state of the iterator: ");
                LIZ.append(this.LJLIL);
                return new IllegalStateException(X1D.LIZIZ(LIZ));
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.LJLIL;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw LJ();
                }
                Iterator<? extends T> it = this.LJLJI;
                o.LJI(it);
                if (it.hasNext()) {
                    this.LJLIL = 2;
                    return true;
                }
                this.LJLJI = null;
            }
            this.LJLIL = 5;
            InterfaceC67352kd<? super C76800UCe> interfaceC67352kd = this.LJLJJI;
            o.LJI(interfaceC67352kd);
            this.LJLJJI = null;
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            interfaceC67352kd.resumeWith(c76800UCe);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.LJLIL;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LJLIL = 0;
                    T t = this.LJLILLLLZI;
                    this.LJLILLLLZI = null;
                    return t;
                }
                throw LJ();
            }
            this.LJLIL = 1;
            Iterator<? extends T> it = this.LJLJI;
            o.LJI(it);
            return it.next();
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // X.InterfaceC67352kd
    public final MBA getContext() {
        return MBB.INSTANCE;
    }

    @Override // X.InterfaceC67352kd
    public final void resumeWith(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL = 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC37657EqD
    public final EnumC58928NAu LIZ(Object obj, InterfaceC67352kd frame) {
        this.LJLILLLLZI = obj;
        this.LJLIL = 3;
        this.LJLJJI = frame;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        o.LJIIIZ(frame, "frame");
        return enumC58928NAu;
    }

    @Override // X.AbstractC37657EqD
    public final Object LIZIZ(Iterator<? extends T> it, InterfaceC67352kd<? super C76800UCe> frame) {
        if (!it.hasNext()) {
            return C76800UCe.LIZ;
        }
        this.LJLJI = it;
        this.LJLIL = 2;
        this.LJLJJI = frame;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        o.LJIIIZ(frame, "frame");
        return enumC58928NAu;
    }
}
