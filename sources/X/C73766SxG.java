package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.SxG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73766SxG<T> extends AbstractC73743Swt<T> implements InterfaceC73812Sy0<T> {
    public static final long serialVersionUID = -2514538129242366402L;
    public final InterfaceC73740Swq<? super T> LJLIL;
    public final InterfaceC73767SxH<T> LJLILLLLZI;
    public final boolean LJLJI;
    public final InterfaceC29937Boz LJLJJI;
    public InterfaceC73651SvP LJLJJL;
    public volatile boolean LJLJJLL;
    public volatile boolean LJLJL;
    public Throwable LJLJLJ;
    public final AtomicLong LJLJLLL = new AtomicLong();
    public boolean LJLL;

    @Override // X.InterfaceC73740Swq
    public final void onComplete() {
        this.LJLJL = true;
        if (this.LJLL) {
            this.LJLIL.onComplete();
        } else {
            LIZJ();
        }
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73651SvP
    public final void cancel() {
        if (!this.LJLJJLL) {
            this.LJLJJLL = true;
            this.LJLJJL.cancel();
            if (getAndIncrement() == 0) {
                this.LJLILLLLZI.clear();
            }
        }
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73570Su6
    public final void clear() {
        this.LJLILLLLZI.clear();
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73570Su6
    public final boolean isEmpty() {
        return this.LJLILLLLZI.isEmpty();
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73570Su6
    public final T poll() {
        return this.LJLILLLLZI.poll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001c, code lost:
    
        if (r2 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        if (r10 == Long.MAX_VALUE) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
    
        r12.LJLJLLL.addAndGet(-r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        r5 = addAndGet(-r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        if (r5 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r12 = this;
            int r0 = r12.getAndIncrement()
            if (r0 != 0) goto L34
            X.SxH<T> r7 = r12.LJLILLLLZI
            X.Swq<? super T> r6 = r12.LJLIL
            r5 = 1
        Lb:
            boolean r1 = r12.LJLJL
            boolean r0 = r7.isEmpty()
            boolean r0 = r12.LIZIZ(r1, r0, r6)
            if (r0 == 0) goto L3c
            return
        L18:
            if (r1 == 0) goto L35
        L1a:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L2d
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 == 0) goto L2d
            java.util.concurrent.atomic.AtomicLong r4 = r12.LJLJLLL
            long r0 = -r2
            r4.addAndGet(r0)
        L2d:
            int r0 = -r5
            int r5 = r12.addAndGet(r0)
            if (r5 != 0) goto Lb
        L34:
            return
        L35:
            r6.onNext(r4)
            r0 = 1
            long r2 = r2 + r0
            goto L46
        L3c:
            java.util.concurrent.atomic.AtomicLong r0 = r12.LJLJLLL
            long r10 = r0.get()
            r8 = 0
            r2 = 0
        L46:
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L5c
            boolean r0 = r12.LJLJL
            java.lang.Object r4 = r7.poll()
            if (r4 != 0) goto L5a
            r1 = 1
        L53:
            boolean r0 = r12.LIZIZ(r0, r1, r6)
            if (r0 == 0) goto L18
            return
        L5a:
            r1 = 0
            goto L53
        L5c:
            boolean r1 = r12.LJLJL
            boolean r0 = r7.isEmpty()
            boolean r0 = r12.LIZIZ(r1, r0, r6)
            if (r0 == 0) goto L1a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73766SxG.LIZJ():void");
    }

    @Override // X.InterfaceC73740Swq
    public final void onError(Throwable th) {
        this.LJLJLJ = th;
        this.LJLJL = true;
        if (this.LJLL) {
            this.LJLIL.onError(th);
        } else {
            LIZJ();
        }
    }

    @Override // X.InterfaceC73740Swq
    public final void onNext(T t) {
        if (!this.LJLILLLLZI.offer(t)) {
            this.LJLJJL.cancel();
            C73799Sxn c73799Sxn = new C73799Sxn("Buffer is full");
            try {
                this.LJLJJI.run();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                c73799Sxn.initCause(th);
            }
            onError(c73799Sxn);
            return;
        }
        if (this.LJLL) {
            this.LJLIL.onNext(null);
        } else {
            LIZJ();
        }
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        if (EnumC73755Sx5.validate(this.LJLJJL, interfaceC73651SvP)) {
            this.LJLJJL = interfaceC73651SvP;
            this.LJLIL.onSubscribe(this);
            interfaceC73651SvP.request(Long.MAX_VALUE);
        }
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73651SvP
    public final void request(long j) {
        if (!this.LJLL && EnumC73755Sx5.validate(j)) {
            V2B.LIZ(this.LJLJLLL, j);
            LIZJ();
        }
    }

    @Override // X.AbstractC73743Swt, X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        if ((i & 2) != 0) {
            this.LJLL = true;
            return 2;
        }
        return 0;
    }

    public final boolean LIZIZ(boolean z, boolean z2, InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        if (this.LJLJJLL) {
            this.LJLILLLLZI.clear();
            return true;
        }
        if (z) {
            if (this.LJLJI) {
                if (z2) {
                    Throwable th = this.LJLJLJ;
                    if (th != null) {
                        interfaceC73740Swq.onError(th);
                    } else {
                        interfaceC73740Swq.onComplete();
                    }
                    return true;
                }
                return false;
            }
            Throwable th2 = this.LJLJLJ;
            if (th2 != null) {
                this.LJLILLLLZI.clear();
                interfaceC73740Swq.onError(th2);
                return true;
            }
            if (z2) {
                interfaceC73740Swq.onComplete();
                return true;
            }
            return false;
        }
        return false;
    }

    public C73766SxG(InterfaceC73740Swq<? super T> interfaceC73740Swq, int i, boolean z, boolean z2, InterfaceC29937Boz interfaceC29937Boz) {
        InterfaceC73767SxH<T> c73913Szd;
        this.LJLIL = interfaceC73740Swq;
        this.LJLJJI = interfaceC29937Boz;
        this.LJLJI = z2;
        if (z) {
            c73913Szd = new C73912Szc<>(i);
        } else {
            c73913Szd = new C73913Szd<>(i);
        }
        this.LJLILLLLZI = c73913Szd;
    }
}
