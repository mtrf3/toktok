package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Su0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73564Su0<T> extends AtomicInteger implements InterfaceC73558Stu<T>, Runnable {
    public static final long serialVersionUID = 3880992722410194083L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final T LJLILLLLZI;

    @Override // X.InterfaceC73570Su6
    public void clear() {
        lazySet(3);
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        set(3);
    }

    @Override // java.lang.Runnable
    public void run() {
        io_reactivex_internal_operators_observable_ObservableScalarXMap$ScalarDisposable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public void io_reactivex_internal_operators_observable_ObservableScalarXMap$ScalarDisposable__run$___twin___() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.LJLIL.onNext(this.LJLILLLLZI);
            if (get() == 2) {
                lazySet(3);
                this.LJLIL.onComplete();
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        if (get() == 3) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73570Su6
    public boolean isEmpty() {
        if (get() != 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73570Su6
    public T poll() {
        if (get() == 1) {
            lazySet(3);
            return this.LJLILLLLZI;
        }
        return null;
    }

    public static void io_reactivex_internal_operators_observable_ObservableScalarXMap$ScalarDisposable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC73564Su0 runnableC73564Su0) {
        boolean LIZ;
        try {
            runnableC73564Su0.io_reactivex_internal_operators_observable_ObservableScalarXMap$ScalarDisposable__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC73570Su6
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // X.InterfaceC73571Su7
    public int requestFusion(int i) {
        if ((i & 1) != 0) {
            lazySet(1);
            return 1;
        }
        return 0;
    }

    public RunnableC73564Su0(InterfaceC116954iR<? super T> interfaceC116954iR, T t) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = t;
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
