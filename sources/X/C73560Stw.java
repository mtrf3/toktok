package X;

/* renamed from: X.Stw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73560Stw<T> extends AbstractC73555Str<T> {
    public static final long serialVersionUID = -5502432239815349361L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public T LJLILLLLZI;

    @Override // X.AbstractC73555Str, X.InterfaceC92693kP
    public void dispose() {
        set(4);
        this.LJLILLLLZI = null;
    }

    public final boolean tryDispose() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73570Su6
    public final void clear() {
        lazySet(32);
        this.LJLILLLLZI = null;
    }

    public final void complete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.LJLIL.onComplete();
    }

    @Override // X.AbstractC73555Str, X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73570Su6
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73570Su6
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t = this.LJLILLLLZI;
        this.LJLILLLLZI = null;
        lazySet(32);
        return t;
    }

    public C73560Stw(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL = interfaceC116954iR;
    }

    public final void complete(T t) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        InterfaceC116954iR<? super T> interfaceC116954iR = this.LJLIL;
        if (i == 8) {
            this.LJLILLLLZI = t;
            lazySet(16);
            interfaceC116954iR.onNext(null);
        } else {
            lazySet(2);
            interfaceC116954iR.onNext(t);
        }
        if (get() != 4) {
            interfaceC116954iR.onComplete();
        }
    }

    public final void error(Throwable th) {
        if ((get() & 54) != 0) {
            C73548Stk.LIZIZ(th);
        } else {
            lazySet(2);
            this.LJLIL.onError(th);
        }
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        if ((i & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }
}
