package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.T0d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73939T0d<T> implements InterfaceC73767SxH<T> {
    public final AtomicReference<C73940T0e<T>> LJLIL;
    public final AtomicReference<C73940T0e<T>> LJLILLLLZI;

    @Override // X.InterfaceC73570Su6
    public final boolean isEmpty() {
        if (this.LJLILLLLZI.get() == this.LJLIL.get()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73767SxH, X.InterfaceC73570Su6
    public final T poll() {
        C73940T0e c73940T0e;
        C73940T0e<T> c73940T0e2 = this.LJLILLLLZI.get();
        C73940T0e c73940T0e3 = c73940T0e2.get();
        if (c73940T0e3 != null) {
            T t = c73940T0e3.LJLIL;
            c73940T0e3.LJLIL = null;
            this.LJLILLLLZI.lazySet(c73940T0e3);
            return t;
        }
        if (c73940T0e2 == this.LJLIL.get()) {
            return null;
        }
        do {
            c73940T0e = c73940T0e2.get();
        } while (c73940T0e == null);
        T t2 = c73940T0e.LJLIL;
        c73940T0e.LJLIL = null;
        this.LJLILLLLZI.lazySet(c73940T0e);
        return t2;
    }

    public C73939T0d() {
        AtomicReference<C73940T0e<T>> atomicReference = new AtomicReference<>();
        this.LJLIL = atomicReference;
        AtomicReference<C73940T0e<T>> atomicReference2 = new AtomicReference<>();
        this.LJLILLLLZI = atomicReference2;
        C73940T0e<T> c73940T0e = new C73940T0e<>();
        atomicReference2.lazySet(c73940T0e);
        atomicReference.getAndSet(c73940T0e);
    }

    @Override // X.InterfaceC73570Su6
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // X.InterfaceC73570Su6
    public final boolean offer(T t) {
        if (t != null) {
            C73940T0e<T> c73940T0e = new C73940T0e<>(t);
            this.LJLIL.getAndSet(c73940T0e).lazySet(c73940T0e);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }
}
