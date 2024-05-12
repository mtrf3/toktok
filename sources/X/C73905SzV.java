package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SzV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73905SzV<T, R> extends AtomicReference<InterfaceC92693kP> implements InterfaceC116954iR<T> {
    public static final long serialVersionUID = -4823716997131257941L;
    public final C73902SzS<T, R> LJLIL;
    public final int LJLILLLLZI;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001a, code lost:
    
        if (r1 == r4.length) goto L13;
     */
    @Override // X.InterfaceC116954iR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onComplete() {
        /*
            r6 = this;
            X.SzS<T, R> r5 = r6.LJLIL
            int r0 = r6.LJLILLLLZI
            monitor-enter(r5)
            java.lang.Object[] r4 = r5.LJLJJI     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto Lb
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L28
            goto L27
        Lb:
            r0 = r4[r0]     // Catch: java.lang.Throwable -> L28
            r3 = 1
            if (r0 != 0) goto L12
            r2 = 1
            goto L1c
        L12:
            r2 = 0
            int r0 = r5.LJLLI     // Catch: java.lang.Throwable -> L28
            int r1 = r0 + 1
            r5.LJLLI = r1     // Catch: java.lang.Throwable -> L28
            int r0 = r4.length     // Catch: java.lang.Throwable -> L28
            if (r1 != r0) goto L1e
        L1c:
            r5.LJLJLJ = r3     // Catch: java.lang.Throwable -> L28
        L1e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L24
            r5.LIZ()
        L24:
            r5.LIZJ()
        L27:
            return
        L28:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L28
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73905SzV.onComplete():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (r2 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0026, code lost:
    
        if (r1 == r3.length) goto L16;
     */
    @Override // X.InterfaceC116954iR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(java.lang.Throwable r7) {
        /*
            r6 = this;
            X.SzS<T, R> r5 = r6.LJLIL
            int r1 = r6.LJLILLLLZI
            X.Su4 r0 = r5.LJLJLLL
            boolean r0 = r0.addThrowable(r7)
            if (r0 == 0) goto L2f
            boolean r0 = r5.LJLJJLL
            r4 = 1
            if (r0 == 0) goto L35
            monitor-enter(r5)
            java.lang.Object[] r3 = r5.LJLJJI     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2c
            goto L3b
        L18:
            r0 = r3[r1]     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L1e
            r2 = 1
            goto L28
        L1e:
            r2 = 0
            int r0 = r5.LJLLI     // Catch: java.lang.Throwable -> L2c
            int r1 = r0 + 1
            r5.LJLLI = r1     // Catch: java.lang.Throwable -> L2c
            int r0 = r3.length     // Catch: java.lang.Throwable -> L2c
            if (r1 != r0) goto L2a
        L28:
            r5.LJLJLJ = r4     // Catch: java.lang.Throwable -> L2c
        L2a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2c
            throw r0
        L2f:
            X.C73548Stk.LIZIZ(r7)
            goto L3b
        L33:
            if (r2 == 0) goto L38
        L35:
            r5.LIZ()
        L38:
            r5.LIZJ()
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73905SzV.onError(java.lang.Throwable):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        boolean z;
        C73902SzS<T, R> c73902SzS = this.LJLIL;
        int i = this.LJLILLLLZI;
        synchronized (c73902SzS) {
            Object[] objArr = c73902SzS.LJLJJI;
            if (objArr != null) {
                Object obj = objArr[i];
                int i2 = c73902SzS.LJLL;
                if (obj == null) {
                    i2++;
                    c73902SzS.LJLL = i2;
                }
                objArr[i] = t;
                if (i2 == objArr.length) {
                    c73902SzS.LJLJJL.offer(objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c73902SzS.LIZJ();
                }
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }

    public C73905SzV(C73902SzS<T, R> c73902SzS, int i) {
        this.LJLIL = c73902SzS;
        this.LJLILLLLZI = i;
    }
}
