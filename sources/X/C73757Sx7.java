package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Sx7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73757Sx7<T> extends AtomicInteger implements InterfaceC73704SwG<T> {
    public static final long serialVersionUID = 4883307006032401862L;
    public final AbstractC73754Sx4<T> LJLIL;
    public final C73568Su4 LJLILLLLZI = new C73568Su4();
    public final C73912Szc LJLJI = new C73912Szc(16);
    public volatile boolean LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        boolean z;
        AbstractC73754Sx4<T> abstractC73754Sx4 = this.LJLIL;
        C73912Szc c73912Szc = this.LJLJI;
        C73568Su4 c73568Su4 = this.LJLILLLLZI;
        int i = 1;
        while (!abstractC73754Sx4.isCancelled()) {
            if (c73568Su4.get() != null) {
                c73912Szc.clear();
                abstractC73754Sx4.onError(c73568Su4.terminate());
                return;
            }
            boolean z2 = this.LJLJJI;
            Object poll = c73912Szc.poll();
            if (poll == null) {
                z = true;
            } else {
                z = false;
            }
            if (z2) {
                if (z) {
                    abstractC73754Sx4.onComplete();
                    return;
                }
            } else if (z) {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            abstractC73754Sx4.onNext(poll);
        }
        c73912Szc.clear();
    }

    @Override // X.InterfaceC215138cP
    public final void onComplete() {
        if (this.LJLIL.isCancelled() || this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
        if (getAndIncrement() != 0) {
            return;
        }
        LIZ();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.LJLIL.toString();
    }

    public C73757Sx7(AbstractC73754Sx4<T> abstractC73754Sx4) {
        this.LJLIL = abstractC73754Sx4;
    }

    @Override // X.InterfaceC215138cP
    public final void onError(Throwable th) {
        Throwable th2;
        if (!this.LJLIL.isCancelled() && !this.LJLJJI) {
            if (th == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            } else {
                th2 = th;
            }
            if (this.LJLILLLLZI.addThrowable(th2)) {
                this.LJLJJI = true;
                if (getAndIncrement() != 0) {
                    return;
                }
                LIZ();
                return;
            }
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC215138cP
    public final void onNext(T t) {
        if (this.LJLIL.isCancelled() || this.LJLJJI) {
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
            C73912Szc c73912Szc = this.LJLJI;
            synchronized (c73912Szc) {
                c73912Szc.offer(t);
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        LIZ();
    }
}
