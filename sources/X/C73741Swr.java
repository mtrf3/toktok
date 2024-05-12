package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Swr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73741Swr<T> extends AtomicInteger implements InterfaceC73632Sv6<T> {
    public static final long serialVersionUID = -3830916580126663321L;
    public final T LJLIL;
    public final InterfaceC73740Swq<? super T> LJLILLLLZI;

    @Override // X.InterfaceC73651SvP
    public void cancel() {
        lazySet(2);
    }

    @Override // X.InterfaceC73570Su6
    public void clear() {
        lazySet(1);
    }

    @Override // X.InterfaceC73571Su7
    public int requestFusion(int i) {
        return i & 1;
    }

    public boolean isCancelled() {
        if (get() == 2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73570Su6
    public boolean isEmpty() {
        if (get() != 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73570Su6
    public T poll() {
        if (get() == 0) {
            lazySet(1);
            return this.LJLIL;
        }
        return null;
    }

    @Override // X.InterfaceC73570Su6
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // X.InterfaceC73651SvP
    public void request(long j) {
        if (EnumC73755Sx5.validate(j) && compareAndSet(0, 1)) {
            InterfaceC73740Swq<? super T> interfaceC73740Swq = this.LJLILLLLZI;
            interfaceC73740Swq.onNext(this.LJLIL);
            if (get() != 2) {
                interfaceC73740Swq.onComplete();
            }
        }
    }

    public C73741Swr(InterfaceC73740Swq<? super T> interfaceC73740Swq, T t) {
        this.LJLILLLLZI = interfaceC73740Swq;
        this.LJLIL = t;
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
