package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SwN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73711SwN<T, U> extends AtomicInteger implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final long serialVersionUID = 8828587559905699186L;
    public final InterfaceC116954iR<? super U> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends U>> LJLILLLLZI;
    public final C73712SwO<U> LJLJI;
    public final int LJLJJI;
    public InterfaceC73570Su6<T> LJLJJL;
    public InterfaceC92693kP LJLJJLL;
    public volatile boolean LJLJL;
    public volatile boolean LJLJLJ;
    public volatile boolean LJLJLLL;
    public int LJLL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJLJ = true;
        C73712SwO<U> c73712SwO = this.LJLJI;
        c73712SwO.getClass();
        EnumC73418Sre.dispose(c73712SwO);
        this.LJLJJLL.dispose();
        if (getAndIncrement() == 0) {
            this.LJLJJL.clear();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJLLL) {
            return;
        }
        this.LJLJLLL = true;
        LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x002f, code lost:
    
        if (r0 == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r4 = this;
            int r0 = r4.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r4.LJLJLJ
            if (r0 == 0) goto L11
            X.Su6<T> r0 = r4.LJLJJL
            r0.clear()
            return
        L11:
            boolean r0 = r4.LJLJL
            if (r0 != 0) goto L45
            boolean r3 = r4.LJLJLLL
            X.Su6<T> r0 = r4.LJLJJL     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r1 = r0.poll()     // Catch: java.lang.Throwable -> L5e
            r2 = 1
            if (r1 != 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            if (r3 == 0) goto L2f
            if (r0 == 0) goto L31
            r4.LJLJLJ = r2
            X.4iR<? super U> r0 = r4.LJLIL
            r0.onComplete()
            return
        L2f:
            if (r0 != 0) goto L45
        L31:
            X.ItG<? super T, ? extends X.4gR<? extends U>> r0 = r4.LJLILLLLZI     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r0.apply(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "The mapper returned a null ObservableSource"
            X.C73320Sq4.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L4c
            X.4gR r1 = (X.InterfaceC115714gR) r1     // Catch: java.lang.Throwable -> L4c
            r4.LJLJL = r2
            X.SwO<U> r0 = r4.LJLJI
            r1.LIZ(r0)
        L45:
            int r0 = r4.decrementAndGet()
            if (r0 != 0) goto L7
            return
        L4c:
            r1 = move-exception
            X.V0N.LJJIL(r1)
            r4.dispose()
            X.Su6<T> r0 = r4.LJLJJL
            r0.clear()
            X.4iR<? super U> r0 = r4.LJLIL
            r0.onError(r1)
            return
        L5e:
            r1 = move-exception
            X.V0N.LJJIL(r1)
            r4.dispose()
            X.Su6<T> r0 = r4.LJLJJL
            r0.clear()
            X.4iR<? super U> r0 = r4.LJLIL
            r0.onError(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73711SwN.LIZ():void");
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJLLL) {
            C73548Stk.LIZIZ(th);
            return;
        }
        this.LJLJLLL = true;
        dispose();
        this.LJLIL.onError(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJLLL) {
            return;
        }
        if (this.LJLL == 0) {
            this.LJLJJL.offer(t);
        }
        LIZ();
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJJLL, interfaceC92693kP)) {
            this.LJLJJLL = interfaceC92693kP;
            if (interfaceC92693kP instanceof InterfaceC73558Stu) {
                InterfaceC73571Su7 interfaceC73571Su7 = (InterfaceC73571Su7) interfaceC92693kP;
                int requestFusion = interfaceC73571Su7.requestFusion(3);
                if (requestFusion == 1) {
                    this.LJLL = requestFusion;
                    this.LJLJJL = interfaceC73571Su7;
                    this.LJLJLLL = true;
                    this.LJLIL.onSubscribe(this);
                    LIZ();
                    return;
                }
                if (requestFusion == 2) {
                    this.LJLL = requestFusion;
                    this.LJLJJL = interfaceC73571Su7;
                    this.LJLIL.onSubscribe(this);
                    return;
                }
            }
            this.LJLJJL = new C73912Szc(this.LJLJJI);
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73711SwN(C73844SyW c73844SyW, InterfaceC48038ItG interfaceC48038ItG, int i) {
        this.LJLIL = c73844SyW;
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJJI = i;
        this.LJLJI = new C73712SwO<>(c73844SyW, this);
    }
}
