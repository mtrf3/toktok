package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Su8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73572Su8<T> extends AtomicInteger implements InterfaceC73573Su9<T> {
    public static final long serialVersionUID = 4883307006032401862L;
    public final InterfaceC73573Su9<T> LJLIL;
    public final C73568Su4 LJLILLLLZI = new C73568Su4();
    public final C73912Szc<T> LJLJI = new C73912Szc<>(16);
    public volatile boolean LJLJJI;

    public final void LIZIZ() {
        boolean z;
        InterfaceC73573Su9<T> interfaceC73573Su9 = this.LJLIL;
        C73912Szc<T> c73912Szc = this.LJLJI;
        C73568Su4 c73568Su4 = this.LJLILLLLZI;
        int i = 1;
        while (!interfaceC73573Su9.isDisposed()) {
            if (c73568Su4.get() != null) {
                c73912Szc.clear();
                interfaceC73573Su9.onError(c73568Su4.terminate());
                return;
            }
            boolean z2 = this.LJLJJI;
            T poll = c73912Szc.poll();
            if (poll == null) {
                z = true;
            } else {
                z = false;
            }
            if (z2) {
                if (z) {
                    interfaceC73573Su9.onComplete();
                    return;
                }
            } else if (z) {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            interfaceC73573Su9.onNext(poll);
        }
        c73912Szc.clear();
    }

    @Override // X.InterfaceC73573Su9, X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLIL.isDisposed();
    }

    @Override // X.InterfaceC215138cP
    public final void onComplete() {
        if (this.LJLIL.isDisposed() || this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
        LIZ();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.LJLIL.toString();
    }

    public final void LIZ() {
        if (getAndIncrement() == 0) {
            LIZIZ();
        }
    }

    public C73572Su8(InterfaceC73573Su9<T> interfaceC73573Su9) {
        this.LJLIL = interfaceC73573Su9;
    }

    @Override // X.InterfaceC215138cP
    public final void onError(Throwable th) {
        if (!tryOnError(th)) {
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC215138cP
    public final void onNext(T t) {
        if (this.LJLIL.isDisposed() || this.LJLJJI) {
            return;
        }
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            this.LJLIL.onNext(t);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            C73912Szc<T> c73912Szc = this.LJLJI;
            synchronized (c73912Szc) {
                c73912Szc.offer(t);
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        LIZIZ();
    }

    @Override // X.InterfaceC73573Su9
    public final void setCancellable(InterfaceC73436Srw interfaceC73436Srw) {
        this.LJLIL.setCancellable(interfaceC73436Srw);
    }

    @Override // X.InterfaceC73573Su9
    public final void setDisposable(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL.setDisposable(interfaceC92693kP);
    }

    @Override // X.InterfaceC73573Su9
    public final boolean tryOnError(Throwable th) {
        if (this.LJLIL.isDisposed() || this.LJLJJI) {
            return false;
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (!this.LJLILLLLZI.addThrowable(th)) {
            return false;
        }
        this.LJLJJI = true;
        LIZ();
        return true;
    }
}
