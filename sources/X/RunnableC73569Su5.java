package X;

/* renamed from: X.Su5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73569Su5<T> extends AbstractC73555Str<T> implements InterfaceC116954iR<T>, Runnable {
    public static final long serialVersionUID = 6576896619930983584L;
    public final InterfaceC116954iR<? super T> LJLIL;
    public final AbstractC73945T0j LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;
    public InterfaceC73570Su6<T> LJLJJL;
    public InterfaceC92693kP LJLJJLL;
    public Throwable LJLJL;
    public volatile boolean LJLJLJ;
    public volatile boolean LJLJLLL;
    public int LJLL;
    public boolean LJLLI;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0073, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
    
        if (r3 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r7 = this;
            boolean r0 = r7.LJLLI
            r6 = 1
            if (r0 == 0) goto L4d
            r3 = 1
        L6:
            boolean r0 = r7.LJLJLLL
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            boolean r2 = r7.LJLJLJ
            java.lang.Throwable r1 = r7.LJLJL
            boolean r0 = r7.LJLJI
            if (r0 != 0) goto L26
            if (r2 == 0) goto L26
            if (r1 == 0) goto L26
            r7.LJLJLLL = r6
            X.4iR<? super T> r1 = r7.LJLIL
            java.lang.Throwable r0 = r7.LJLJL
            r1.onError(r0)
            X.T0j r0 = r7.LJLILLLLZI
            r0.dispose()
            goto La
        L26:
            X.4iR<? super T> r1 = r7.LJLIL
            r0 = 0
            r1.onNext(r0)
            if (r2 == 0) goto L45
            r7.LJLJLLL = r6
            java.lang.Throwable r1 = r7.LJLJL
            if (r1 == 0) goto L3f
            X.4iR<? super T> r0 = r7.LJLIL
            r0.onError(r1)
        L39:
            X.T0j r0 = r7.LJLILLLLZI
            r0.dispose()
            goto La
        L3f:
            X.4iR<? super T> r0 = r7.LJLIL
            r0.onComplete()
            goto L39
        L45:
            int r0 = -r3
            int r3 = r7.addAndGet(r0)
            if (r3 != 0) goto L6
            goto La
        L4d:
            X.Su6<T> r5 = r7.LJLJJL
            X.4iR<? super T> r4 = r7.LJLIL
            r3 = 1
        L52:
            boolean r1 = r7.LJLJLJ
            boolean r0 = r5.isEmpty()
            boolean r0 = r7.LIZ(r1, r0, r4)
            if (r0 == 0) goto L5f
            goto La
        L5f:
            boolean r0 = r7.LJLJLJ
            java.lang.Object r2 = r5.poll()     // Catch: java.lang.Throwable -> L7f
            if (r2 != 0) goto L69
            r1 = 1
            goto L6a
        L69:
            r1 = 0
        L6a:
            boolean r0 = r7.LIZ(r0, r1, r4)
            if (r0 == 0) goto L71
            goto La
        L71:
            if (r1 == 0) goto L7b
            int r0 = -r3
            int r3 = r7.addAndGet(r0)
            if (r3 != 0) goto L52
            goto La
        L7b:
            r4.onNext(r2)
            goto L5f
        L7f:
            r1 = move-exception
            X.V0N.LJJIL(r1)
            r7.LJLJLLL = r6
            X.3kP r0 = r7.LJLJJLL
            r0.dispose()
            r5.clear()
            r4.onError(r1)
            X.T0j r0 = r7.LJLILLLLZI
            r0.dispose()
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC73569Su5.LIZIZ():void");
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73570Su6
    public final void clear() {
        this.LJLJJL.clear();
    }

    @Override // X.AbstractC73555Str, X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJLLL) {
            this.LJLJLLL = true;
            this.LJLJJLL.dispose();
            this.LJLILLLLZI.dispose();
            if (getAndIncrement() == 0) {
                this.LJLJJL.clear();
            }
        }
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73570Su6
    public final boolean isEmpty() {
        return this.LJLJJL.isEmpty();
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJLJ) {
            return;
        }
        this.LJLJLJ = true;
        if (getAndIncrement() == 0) {
            this.LJLILLLLZI.LIZIZ(this);
        }
    }

    @Override // X.AbstractC73555Str, X.InterfaceC73570Su6
    public final T poll() {
        return this.LJLJJL.poll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.AbstractC73555Str, X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJLJ) {
            C73548Stk.LIZIZ(th);
            return;
        }
        this.LJLJL = th;
        this.LJLJLJ = true;
        if (getAndIncrement() == 0) {
            this.LJLILLLLZI.LIZIZ(this);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLJLJ) {
            return;
        }
        if (this.LJLL != 2) {
            this.LJLJJL.offer(t);
        }
        if (getAndIncrement() == 0) {
            this.LJLILLLLZI.LIZIZ(this);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJJLL, interfaceC92693kP)) {
            this.LJLJJLL = interfaceC92693kP;
            if (interfaceC92693kP instanceof InterfaceC73558Stu) {
                InterfaceC73571Su7 interfaceC73571Su7 = (InterfaceC73571Su7) interfaceC92693kP;
                int requestFusion = interfaceC73571Su7.requestFusion(7);
                if (requestFusion == 1) {
                    this.LJLL = requestFusion;
                    this.LJLJJL = interfaceC73571Su7;
                    this.LJLJLJ = true;
                    this.LJLIL.onSubscribe(this);
                    if (getAndIncrement() == 0) {
                        this.LJLILLLLZI.LIZIZ(this);
                        return;
                    }
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

    @Override // X.AbstractC73555Str, X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        if ((i & 2) != 0) {
            this.LJLLI = true;
            return 2;
        }
        return 0;
    }

    public final boolean LIZ(boolean z, boolean z2, InterfaceC116954iR<? super T> interfaceC116954iR) {
        if (this.LJLJLLL) {
            this.LJLJJL.clear();
            return true;
        }
        if (z) {
            Throwable th = this.LJLJL;
            if (this.LJLJI) {
                if (z2) {
                    this.LJLJLLL = true;
                    if (th != null) {
                        interfaceC116954iR.onError(th);
                    } else {
                        interfaceC116954iR.onComplete();
                    }
                    this.LJLILLLLZI.dispose();
                    return true;
                }
                return false;
            }
            if (th != null) {
                this.LJLJLLL = true;
                this.LJLJJL.clear();
                interfaceC116954iR.onError(th);
                this.LJLILLLLZI.dispose();
                return true;
            }
            if (z2) {
                this.LJLJLLL = true;
                interfaceC116954iR.onComplete();
                this.LJLILLLLZI.dispose();
                return true;
            }
            return false;
        }
        return false;
    }

    public RunnableC73569Su5(InterfaceC116954iR<? super T> interfaceC116954iR, AbstractC73945T0j abstractC73945T0j, boolean z, int i) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = abstractC73945T0j;
        this.LJLJI = z;
        this.LJLJJI = i;
    }
}
