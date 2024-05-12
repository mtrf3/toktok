package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SuG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73580SuG<T, R> extends AtomicInteger implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final long serialVersionUID = 8600231336733376951L;
    public final InterfaceC116954iR<? super R> LJLIL;
    public final boolean LJLILLLLZI;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC73471SsV<? extends R>> LJLJJLL;
    public InterfaceC92693kP LJLJLJ;
    public volatile boolean LJLJLLL;
    public final C73318Sq2 LJLJI = new C73318Sq2();
    public final C73568Su4 LJLJJL = new C73568Su4();
    public final AtomicInteger LJLJJI = new AtomicInteger(1);
    public final AtomicReference<C73912Szc<R>> LJLJL = new AtomicReference<>();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJLLL = true;
        this.LJLJLJ.dispose();
        this.LJLJI.dispose();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r0 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r7 = this;
            X.4iR<? super R> r3 = r7.LJLIL
            java.util.concurrent.atomic.AtomicInteger r6 = r7.LJLJJI
            java.util.concurrent.atomic.AtomicReference<X.Szc<R>> r5 = r7.LJLJL
            r4 = 1
        L7:
            boolean r0 = r7.LJLJLLL
            if (r0 == 0) goto L19
            java.util.concurrent.atomic.AtomicReference<X.Szc<R>> r0 = r7.LJLJL
            java.lang.Object r0 = r0.get()
            X.Szc r0 = (X.C73912Szc) r0
            if (r0 == 0) goto L18
            r0.clear()
        L18:
            return
        L19:
            boolean r0 = r7.LJLILLLLZI
            if (r0 != 0) goto L3c
            X.Su4 r0 = r7.LJLJJL
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L3c
            X.Su4 r0 = r7.LJLJJL
            java.lang.Throwable r1 = r0.terminate()
            java.util.concurrent.atomic.AtomicReference<X.Szc<R>> r0 = r7.LJLJL
            java.lang.Object r0 = r0.get()
            X.Szc r0 = (X.C73912Szc) r0
            if (r0 == 0) goto L38
            r0.clear()
        L38:
            r3.onError(r1)
            return
        L3c:
            int r0 = r6.get()
            r2 = 0
            if (r0 != 0) goto L69
            r1 = 1
        L44:
            java.lang.Object r0 = r5.get()
            X.Szc r0 = (X.C73912Szc) r0
            if (r0 == 0) goto L67
            java.lang.Object r0 = r0.poll()
            if (r0 != 0) goto L53
        L52:
            r2 = 1
        L53:
            if (r1 == 0) goto L6b
            if (r2 == 0) goto L75
            X.Su4 r0 = r7.LJLJJL
            java.lang.Throwable r0 = r0.terminate()
            if (r0 == 0) goto L63
            r3.onError(r0)
        L62:
            return
        L63:
            r3.onComplete()
            goto L62
        L67:
            r0 = 0
            goto L52
        L69:
            r1 = 0
            goto L44
        L6b:
            if (r2 == 0) goto L75
            int r0 = -r4
            int r4 = r7.addAndGet(r0)
            if (r4 != 0) goto L7
            return
        L75:
            r3.onNext(r0)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73580SuG.LIZ():void");
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLJJI.decrementAndGet();
        if (getAndIncrement() == 0) {
            LIZ();
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        this.LJLJJI.decrementAndGet();
        if (this.LJLJJL.addThrowable(th)) {
            if (!this.LJLILLLLZI) {
                this.LJLJI.dispose();
            }
            if (getAndIncrement() == 0) {
                LIZ();
                return;
            }
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        try {
            InterfaceC73471SsV<? extends R> apply = this.LJLJJLL.apply(t);
            C73320Sq4.LIZ(apply, "The mapper returned a null SingleSource");
            InterfaceC73471SsV<? extends R> interfaceC73471SsV = apply;
            this.LJLJJI.getAndIncrement();
            C73581SuH c73581SuH = new C73581SuH(this);
            if (!this.LJLJLLL && this.LJLJI.LIZ(c73581SuH)) {
                interfaceC73471SsV.LIZ(c73581SuH);
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLJLJ.dispose();
            onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJLJ, interfaceC92693kP)) {
            this.LJLJLJ = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73580SuG(InterfaceC116954iR<? super R> interfaceC116954iR, InterfaceC48038ItG<? super T, ? extends InterfaceC73471SsV<? extends R>> interfaceC48038ItG, boolean z) {
        this.LJLIL = interfaceC116954iR;
        this.LJLJJLL = interfaceC48038ItG;
        this.LJLILLLLZI = z;
    }
}
