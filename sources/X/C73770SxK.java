package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SxK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73770SxK<T, U> extends AtomicInteger implements InterfaceC92693kP, InterfaceC116954iR<T> {
    public static final C73772SxM<?, ?>[] LJLZ = new C73772SxM[0];
    public static final C73772SxM<?, ?>[] LJZ = new C73772SxM[0];
    public static final long serialVersionUID = -2117620485640801370L;
    public final InterfaceC116954iR<? super U> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends U>> LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public volatile InterfaceC73767SxH<U> LJLJJLL;
    public volatile boolean LJLJL;
    public final C73568Su4 LJLJLJ = new C73568Su4();
    public volatile boolean LJLJLLL;
    public final AtomicReference<C73772SxM<?, ?>[]> LJLL;
    public InterfaceC92693kP LJLLI;
    public long LJLLILLLL;
    public long LJLLJ;
    public int LJLLL;
    public final Queue<InterfaceC115714gR<? extends U>> LJLLLL;
    public int LJLLLLLL;

    public final boolean LIZ() {
        if (this.LJLJLLL) {
            return true;
        }
        Throwable th = this.LJLJLJ.get();
        if (!this.LJLJI && th != null) {
            LIZIZ();
            Throwable terminate = this.LJLJLJ.terminate();
            if (terminate != C73864Syq.LIZ) {
                this.LJLIL.onError(terminate);
            }
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        C73772SxM<?, ?>[] andSet;
        this.LJLLI.dispose();
        C73772SxM<?, ?>[] c73772SxMArr = this.LJLL.get();
        C73772SxM<?, ?>[] c73772SxMArr2 = LJZ;
        if (c73772SxMArr == c73772SxMArr2 || (andSet = this.LJLL.getAndSet(c73772SxMArr2)) == c73772SxMArr2) {
            return false;
        }
        for (C73772SxM<?, ?> c73772SxM : andSet) {
            c73772SxM.getClass();
            EnumC73418Sre.dispose(c73772SxM);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        r1 = r5.LJLJI;
        r0 = r5.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if (r1 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        if (r0.isEmpty() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        LJ(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        if (LIZ() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        X.V0N.LJJIL(r1);
        X.EnumC73418Sre.dispose(r5);
        r13.LJLJLJ.addThrowable(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d7, code lost:
    
        if (LIZ() != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
    
        LJ(r5);
        r10 = r10 + 1;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e1, code lost:
    
        if (r7 == r8) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e3, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
    
        if (r4 >= r8) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        r13.LJLLL = r7;
        r13.LJLLJ = r9[r7].LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
    
        if (r10 == 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
    
        if (r13.LJLJJI == Integer.MAX_VALUE) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        r1 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0103, code lost:
    
        if (r10 == 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0105, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0106, code lost:
    
        r0 = (X.InterfaceC115714gR) ((java.util.ArrayDeque) r13.LJLLLL).poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0110, code lost:
    
        if (r0 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0112, code lost:
    
        r13.LJLLLLLL--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0117, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011d, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0119, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011a, code lost:
    
        LJFF(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00b0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00c2, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00c4, code lost:
    
        if (r7 != r8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00bb, code lost:
    
        r0 = r1.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0097, code lost:
    
        if (r0 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00b1, code lost:
    
        r2.onNext(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00b8, code lost:
    
        if (LIZ() == false) goto L138;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73770SxK.LIZLLL():void");
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        Throwable terminate;
        if (!this.LJLJLLL) {
            this.LJLJLLL = true;
            if (LIZIZ() && (terminate = this.LJLJLJ.terminate()) != null && terminate != C73864Syq.LIZ) {
                C73548Stk.LIZIZ(terminate);
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        LIZJ();
    }

    public final void LIZJ() {
        if (getAndIncrement() == 0) {
            LIZLLL();
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(C73772SxM<T, U> c73772SxM) {
        C73772SxM<?, ?>[] c73772SxMArr;
        while (true) {
            C73772SxM<?, ?>[] c73772SxMArr2 = this.LJLL.get();
            int length = c73772SxMArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (c73772SxMArr2[i] != c73772SxM) {
                i++;
                if (i >= length) {
                    return;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c73772SxMArr = LJLZ;
            } else {
                c73772SxMArr = new C73772SxM[length - 1];
                System.arraycopy(c73772SxMArr2, 0, c73772SxMArr, 0, i);
                System.arraycopy(c73772SxMArr2, i + 1, c73772SxMArr, i, (length - i) - 1);
            }
            AtomicReference<C73772SxM<?, ?>[]> atomicReference = this.LJLL;
            while (!atomicReference.compareAndSet(c73772SxMArr2, c73772SxMArr)) {
                if (atomicReference.get() != c73772SxMArr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (decrementAndGet() == 0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.Su6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.InterfaceC115714gR<? extends U> r9) {
        /*
            r8 = this;
        L0:
            boolean r0 = r9 instanceof java.util.concurrent.Callable
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L1f
            java.util.concurrent.Callable r9 = (java.util.concurrent.Callable) r9
            r4 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Object r5 = r9.call()     // Catch: java.lang.Throwable -> L12
            if (r5 != 0) goto L63
            goto L7a
        L12:
            r1 = move-exception
            X.V0N.LJJIL(r1)
            X.Su4 r0 = r8.LJLJLJ
            r0.addThrowable(r1)
            r8.LIZJ()
            goto L7a
        L1f:
            X.SxM r5 = new X.SxM
            long r0 = r8.LJLLILLLL
            r6 = 1
            long r6 = r6 + r0
            r8.LJLLILLLL = r6
            r5.<init>(r8, r0)
        L2b:
            java.util.concurrent.atomic.AtomicReference<X.SxM<?, ?>[]> r0 = r8.LJLL
            java.lang.Object r4 = r0.get()
            X.SxM[] r4 = (X.C73772SxM[]) r4
            X.SxM<?, ?>[] r0 = X.C73770SxK.LJZ
            if (r4 != r0) goto L3b
            X.EnumC73418Sre.dispose(r5)
            goto L5e
        L3b:
            int r1 = r4.length
            int r0 = r1 + 1
            X.SxM[] r2 = new X.C73772SxM[r0]
            java.lang.System.arraycopy(r4, r3, r2, r3, r1)
            r2[r1] = r5
            java.util.concurrent.atomic.AtomicReference<X.SxM<?, ?>[]> r1 = r8.LJLL
        L47:
            boolean r0 = r1.compareAndSet(r4, r2)
            if (r0 == 0) goto L51
            r9.LIZ(r5)
            goto L5e
        L51:
            java.lang.Object r0 = r1.get()
            if (r0 == r4) goto L47
            goto L2b
        L58:
            int r0 = r8.getAndIncrement()
            if (r0 == 0) goto L5f
        L5e:
            return
        L5f:
            r8.LIZLLL()
            goto L7a
        L63:
            int r0 = r8.get()
            if (r0 != 0) goto L80
            boolean r0 = r8.compareAndSet(r3, r2)
            if (r0 == 0) goto L80
            X.4iR<? super U> r0 = r8.LJLIL
            r0.onNext(r5)
            int r0 = r8.decrementAndGet()
            if (r0 != 0) goto L5f
        L7a:
            int r0 = r8.LJLJJI
            if (r0 == r4) goto L5e
            monitor-enter(r8)
            goto Laa
        L80:
            X.SxH<U> r1 = r8.LJLJJLL
            if (r1 != 0) goto L91
            int r0 = r8.LJLJJI
            if (r0 != r4) goto La2
            X.Szc r1 = new X.Szc
            int r0 = r8.LJLJJL
            r1.<init>(r0)
        L8f:
            r8.LJLJJLL = r1
        L91:
            boolean r0 = r1.offer(r5)
            if (r0 != 0) goto L58
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Scalar queue full?!"
            r1.<init>(r0)
            r8.onError(r1)
            goto L7a
        La2:
            X.Szd r1 = new X.Szd
            int r0 = r8.LJLJJI
            r1.<init>(r0)
            goto L8f
        Laa:
            java.util.Queue<X.4gR<? extends U>> r0 = r8.LJLLLL     // Catch: java.lang.Throwable -> Lc3
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r9 = r0.poll()     // Catch: java.lang.Throwable -> Lc3
            X.4gR r9 = (X.InterfaceC115714gR) r9     // Catch: java.lang.Throwable -> Lc3
            if (r9 != 0) goto Lbc
            int r0 = r8.LJLLLLLL     // Catch: java.lang.Throwable -> Lc3
            int r0 = r0 - r2
            r8.LJLLLLLL = r0     // Catch: java.lang.Throwable -> Lc3
            r3 = 1
        Lbc:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc3
            if (r3 == 0) goto L0
            r8.LIZJ()
            goto L5e
        Lc3:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73770SxK.LJFF(X.4gR):void");
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJL) {
            C73548Stk.LIZIZ(th);
        } else if (this.LJLJLJ.addThrowable(th)) {
            this.LJLJL = true;
            LIZJ();
        } else {
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJL) {
            return;
        }
        try {
            InterfaceC115714gR<? extends U> apply = this.LJLILLLLZI.apply(t);
            C73320Sq4.LIZ(apply, "The mapper returned a null ObservableSource");
            InterfaceC115714gR<? extends U> interfaceC115714gR = apply;
            if (this.LJLJJI != Integer.MAX_VALUE) {
                synchronized (this) {
                    int i = this.LJLLLLLL;
                    if (i == this.LJLJJI) {
                        ((ArrayDeque) this.LJLLLL).offer(interfaceC115714gR);
                        return;
                    }
                    this.LJLLLLLL = i + 1;
                }
            }
            LJFF(interfaceC115714gR);
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLLI.dispose();
            onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLLI, interfaceC92693kP)) {
            this.LJLLI = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73770SxK(int i, int i2, InterfaceC116954iR interfaceC116954iR, InterfaceC48038ItG interfaceC48038ItG, boolean z) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        if (i != Integer.MAX_VALUE) {
            this.LJLLLL = new ArrayDeque(i);
        }
        this.LJLL = new AtomicReference<>(LJLZ);
    }
}
