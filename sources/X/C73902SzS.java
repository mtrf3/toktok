package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SzS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73902SzS<T, R> extends AtomicInteger implements InterfaceC92693kP {
    public static final long serialVersionUID = 8567835998786448817L;
    public final InterfaceC116954iR<? super R> LJLIL;
    public final InterfaceC48038ItG<? super Object[], ? extends R> LJLILLLLZI;
    public final C73905SzV<T, R>[] LJLJI;
    public Object[] LJLJJI;
    public final C73912Szc<Object[]> LJLJJL;
    public final boolean LJLJJLL;
    public volatile boolean LJLJL;
    public volatile boolean LJLJLJ;
    public final C73568Su4 LJLJLLL = new C73568Su4();
    public int LJLL;
    public int LJLLI;

    public final void LIZ() {
        for (C73905SzV<T, R> c73905SzV : this.LJLJI) {
            c73905SzV.getClass();
            EnumC73418Sre.dispose(c73905SzV);
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJL) {
            this.LJLJL = true;
            LIZ();
            if (getAndIncrement() == 0) {
                LIZIZ(this.LJLJJL);
            }
        }
    }

    public final void LIZJ() {
        boolean z;
        if (getAndIncrement() != 0) {
            return;
        }
        C73912Szc<Object[]> c73912Szc = this.LJLJJL;
        InterfaceC116954iR<? super R> interfaceC116954iR = this.LJLIL;
        boolean z2 = this.LJLJJLL;
        int i = 1;
        while (!this.LJLJL) {
            if (!z2 && this.LJLJLLL.get() != null) {
                LIZ();
                LIZIZ(c73912Szc);
                interfaceC116954iR.onError(this.LJLJLLL.terminate());
                return;
            }
            boolean z3 = this.LJLJLJ;
            Object[] poll = c73912Szc.poll();
            if (poll == null) {
                z = true;
            } else {
                z = false;
            }
            try {
                if (z3) {
                    if (z) {
                        LIZIZ(c73912Szc);
                        Throwable terminate = this.LJLJLLL.terminate();
                        if (terminate == null) {
                            interfaceC116954iR.onComplete();
                            return;
                        } else {
                            interfaceC116954iR.onError(terminate);
                            return;
                        }
                    }
                } else if (z) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                R apply = this.LJLILLLLZI.apply(poll);
                C73320Sq4.LIZ(apply, "The combiner returned a null value");
                interfaceC116954iR.onNext(apply);
            } catch (Throwable th) {
                V0N.LJJIL(th);
                this.LJLJLLL.addThrowable(th);
                LIZ();
                LIZIZ(c73912Szc);
                interfaceC116954iR.onError(this.LJLJLLL.terminate());
                return;
            }
        }
        LIZIZ(c73912Szc);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJL;
    }

    public final void LIZIZ(C73912Szc<?> c73912Szc) {
        synchronized (this) {
            this.LJLJJI = null;
        }
        c73912Szc.clear();
    }

    public C73902SzS(int i, int i2, InterfaceC116954iR interfaceC116954iR, InterfaceC48038ItG interfaceC48038ItG, boolean z) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJJLL = z;
        this.LJLJJI = new Object[i];
        C73905SzV<T, R>[] c73905SzVArr = new C73905SzV[i];
        for (int i3 = 0; i3 < i; i3++) {
            c73905SzVArr[i3] = new C73905SzV<>(this, i3);
        }
        this.LJLJI = c73905SzVArr;
        this.LJLJJL = new C73912Szc<>(i2);
    }
}
