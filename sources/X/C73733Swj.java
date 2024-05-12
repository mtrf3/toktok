package X;

/* renamed from: X.Swj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73733Swj<T> extends AbstractC73743Swt<T> {
    public static final long serialVersionUID = -2151279923272604993L;
    public final InterfaceC73740Swq<? super T> LJLIL;
    public T LJLILLLLZI;

    @Override // X.AbstractC73743Swt, X.InterfaceC73651SvP
    public void cancel() {
        set(4);
        this.LJLILLLLZI = null;
    }

    public final boolean tryCancel() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73570Su6
    public final void clear() {
        lazySet(32);
        this.LJLILLLLZI = null;
    }

    public final boolean isCancelled() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73570Su6
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73570Su6
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.LJLILLLLZI;
        this.LJLILLLLZI = null;
        return t;
    }

    public C73733Swj(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        this.LJLIL = interfaceC73740Swq;
    }

    public final void complete(T t) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLIL;
                interfaceC73740Swq.onNext(t);
                if (get() != 4) {
                    interfaceC73740Swq.onComplete();
                    return;
                }
                return;
            }
            this.LJLILLLLZI = t;
            if (compareAndSet(0, 1)) {
                return;
            }
            i = get();
            if (i == 4) {
                this.LJLILLLLZI = null;
                return;
            }
        }
        this.LJLILLLLZI = t;
        lazySet(16);
        InterfaceC73740Swq<? super T> interfaceC73740Swq2 = this.LJLIL;
        interfaceC73740Swq2.onNext(t);
        if (get() != 4) {
            interfaceC73740Swq2.onComplete();
        }
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73651SvP
    public final void request(long j) {
        T t;
        if (!EnumC73755Sx5.validate(j)) {
            return;
        }
        do {
            int i = get();
            if ((i & (-2)) != 0) {
                return;
            }
            if (i == 1) {
                if (compareAndSet(1, 3) && (t = this.LJLILLLLZI) != null) {
                    this.LJLILLLLZI = null;
                    InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLIL;
                    interfaceC73740Swq.onNext(t);
                    if (get() != 4) {
                        interfaceC73740Swq.onComplete();
                        return;
                    }
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        if ((i & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }
}
