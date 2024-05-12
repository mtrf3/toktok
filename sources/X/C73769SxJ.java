package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SxJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73769SxJ<T, U> extends AtomicReference<InterfaceC73651SvP> implements InterfaceC73812Sy0<U>, InterfaceC92693kP {
    public static final long serialVersionUID = -4606175640614850599L;
    public final long LJLIL;
    public final C73768SxI<T, U> LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public volatile boolean LJLJJL;
    public volatile InterfaceC73570Su6<U> LJLJJLL;
    public long LJLJL;
    public int LJLJLJ;

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        this.LJLJJL = true;
        this.LJLILLLLZI.LIZJ();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (get() == EnumC73755Sx5.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73755Sx5.cancel(this);
    }

    public final void LIZIZ(long j) {
        if (this.LJLJLJ != 1) {
            long j2 = this.LJLJL + j;
            if (j2 >= this.LJLJI) {
                this.LJLJL = 0L;
                get().request(j2);
            } else {
                this.LJLJL = j2;
            }
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        lazySet(EnumC73755Sx5.CANCELLED);
        C73768SxI<T, U> c73768SxI = this.LJLILLLLZI;
        if (c73768SxI.LJLJLJ.addThrowable(th)) {
            this.LJLJJL = true;
            if (!c73768SxI.LJLJI) {
                c73768SxI.LJLLILLLL.cancel();
                for (C73769SxJ<?, ?> c73769SxJ : c73768SxI.LJLL.getAndSet(C73768SxI.LJZI)) {
                    c73769SxJ.getClass();
                    EnumC73755Sx5.cancel(c73769SxJ);
                }
            }
            c73768SxI.LIZJ();
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[ORIG_RETURN, RETURN] */
    @Override // X.InterfaceC73740Swq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNext(U r9) {
        /*
            r8 = this;
            int r1 = r8.LJLJLJ
            r0 = 2
            if (r1 == r0) goto L91
            X.SxI<T, U> r2 = r8.LJLILLLLZI
            int r0 = r2.get()
            java.lang.String r5 = "Inner queue full?!"
            if (r0 != 0) goto L6a
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L6a
            java.util.concurrent.atomic.AtomicLong r0 = r2.LJLLI
            long r6 = r0.get()
            X.Su6<U> r1 = r8.LJLJJLL
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L4c
            if (r1 == 0) goto L2d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L5b
        L2d:
            X.Swq<? super U> r0 = r2.LJLIL
            r0.onNext(r9)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L40
            java.util.concurrent.atomic.AtomicLong r0 = r2.LJLLI
            r0.decrementAndGet()
        L40:
            r0 = 1
            r8.LIZIZ(r0)
        L45:
            int r0 = r2.decrementAndGet()
            if (r0 != 0) goto L8d
        L4b:
            return
        L4c:
            if (r1 != 0) goto L5b
            X.Su6<U> r1 = r8.LJLJJLL
            if (r1 != 0) goto L5b
            X.Szd r1 = new X.Szd
            int r0 = r2.LJLJJL
            r1.<init>(r0)
            r8.LJLJJLL = r1
        L5b:
            boolean r0 = r1.offer(r9)
            if (r0 != 0) goto L45
            X.Sxn r0 = new X.Sxn
            r0.<init>(r5)
            r2.onError(r0)
            goto L4b
        L6a:
            X.Su6<U> r1 = r8.LJLJJLL
            if (r1 != 0) goto L77
            X.Szd r1 = new X.Szd
            int r0 = r2.LJLJJL
            r1.<init>(r0)
            r8.LJLJJLL = r1
        L77:
            boolean r0 = r1.offer(r9)
            if (r0 != 0) goto L86
            X.Sxn r0 = new X.Sxn
            r0.<init>(r5)
            r2.onError(r0)
            goto L4b
        L86:
            int r0 = r2.getAndIncrement()
            if (r0 == 0) goto L8d
            goto L4b
        L8d:
            r2.LIZLLL()
            goto L4b
        L91:
            X.SxI<T, U> r0 = r8.LJLILLLLZI
            r0.LIZJ()
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73769SxJ.onNext(java.lang.Object):void");
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.setOnce(this, interfaceC73651SvP)) {
            if (interfaceC73651SvP instanceof InterfaceC73632Sv6) {
                InterfaceC73571Su7 interfaceC73571Su7 = (InterfaceC73571Su7) interfaceC73651SvP;
                int requestFusion = interfaceC73571Su7.requestFusion(7);
                if (requestFusion == 1) {
                    this.LJLJLJ = requestFusion;
                    this.LJLJJLL = interfaceC73571Su7;
                    this.LJLJJL = true;
                    this.LJLILLLLZI.LIZJ();
                    return;
                }
                if (requestFusion == 2) {
                    this.LJLJLJ = requestFusion;
                    this.LJLJJLL = interfaceC73571Su7;
                }
            }
            interfaceC73651SvP.request(this.LJLJJI);
        }
    }

    public C73769SxJ(C73768SxI<T, U> c73768SxI, long j) {
        this.LJLIL = j;
        this.LJLILLLLZI = c73768SxI;
        int i = c73768SxI.LJLJJL;
        this.LJLJJI = i;
        this.LJLJI = i >> 2;
    }
}
