package X;

import X.XLT;

/* loaded from: classes16.dex */
public abstract class XLN<S extends XLT<?>> {
    public S[] LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public XLM LJLJJI;

    public final C33R LIZJ() {
        XLM xlm;
        synchronized (this) {
            xlm = this.LJLJJI;
            if (xlm == null) {
                xlm = V8H.LIZ(Integer.valueOf(this.LJLILLLLZI));
                this.LJLJJI = xlm;
            }
        }
        return xlm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        r1 = r2.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r2.compareAndSet(r1, java.lang.Integer.valueOf(((java.lang.Number) r1).intValue() + 1)) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final S LIZLLL() {
        /*
            r4 = this;
            monitor-enter(r4)
            S extends X.XLT<?>[] r1 = r4.LJLIL     // Catch: java.lang.Throwable -> L63
            if (r1 != 0) goto L2e
            X.XLT[] r1 = r4.LJFF()     // Catch: java.lang.Throwable -> L63
            r4.LJLIL = r1     // Catch: java.lang.Throwable -> L63
        Lb:
            int r2 = r4.LJLJI     // Catch: java.lang.Throwable -> L63
        Ld:
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L17
            X.XLT r3 = r4.LJ()     // Catch: java.lang.Throwable -> L63
            r1[r2] = r3     // Catch: java.lang.Throwable -> L63
        L17:
            int r2 = r2 + 1
            int r0 = r1.length     // Catch: java.lang.Throwable -> L63
            if (r2 < r0) goto L1d
            r2 = 0
        L1d:
            boolean r0 = r3.LIZ(r4)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto Ld
            r4.LJLJI = r2     // Catch: java.lang.Throwable -> L63
            int r0 = r4.LJLILLLLZI     // Catch: java.lang.Throwable -> L63
            int r0 = r0 + 1
            r4.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L63
            X.XLM r2 = r4.LJLJJI     // Catch: java.lang.Throwable -> L63
            goto L47
        L2e:
            int r2 = r4.LJLILLLLZI     // Catch: java.lang.Throwable -> L63
            int r0 = r1.length     // Catch: java.lang.Throwable -> L63
            if (r2 < r0) goto Lb
            int r0 = r1.length     // Catch: java.lang.Throwable -> L63
            int r0 = r0 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "java.util.Arrays.copyOf(this, newSize)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L63
            r0 = r1
            X.XLT[] r0 = (X.XLT[]) r0     // Catch: java.lang.Throwable -> L63
            r4.LJLIL = r0     // Catch: java.lang.Throwable -> L63
            X.XLT[] r1 = (X.XLT[]) r1     // Catch: java.lang.Throwable -> L63
            goto Lb
        L47:
            monitor-exit(r4)
            if (r2 != 0) goto L4b
        L4a:
            return r3
        L4b:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L4b
            goto L4a
        L63:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XLN.LIZLLL():X.XLT");
    }

    public abstract S LJ();

    public abstract XLT[] LJFF();

    public final void LJI(S s) {
        XLM xlm;
        int i;
        InterfaceC67352kd[] LIZIZ;
        synchronized (this) {
            int i2 = this.LJLILLLLZI - 1;
            this.LJLILLLLZI = i2;
            xlm = this.LJLJJI;
            i = 0;
            if (i2 == 0) {
                this.LJLJI = 0;
            }
            LIZIZ = s.LIZIZ(this);
        }
        int length = LIZIZ.length;
        while (i < length) {
            InterfaceC67352kd interfaceC67352kd = LIZIZ[i];
            i++;
            if (interfaceC67352kd != null) {
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                interfaceC67352kd.resumeWith(c76800UCe);
            }
        }
        if (xlm == null) {
            return;
        }
        do {
        } while (!xlm.compareAndSet(xlm.getValue(), Integer.valueOf(((Number) r1).intValue() - 1)));
    }
}
