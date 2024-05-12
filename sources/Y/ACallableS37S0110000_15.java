package Y;

import java.util.concurrent.Callable;

/* loaded from: classes16.dex */
public class ACallableS37S0110000_15 implements Callable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$0(Y.ACallableS37S0110000_15 r3) {
        /*
            java.lang.Object r0 = r3.l0
            X.XSb r0 = (X.C84857XSb) r0
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto L2f
            boolean r0 = r3.z1
            if (r0 == 0) goto L10
            r2 = 2131827812(0x7f111c64, float:1.9288547E38)
            goto L13
        L10:
            r2 = 2131833148(0x7f11313c, float:1.929937E38)
        L13:
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L1b
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L1b
            if (r0 != 0) goto L1e
        L1b:
            r2 = 2131833361(0x7f113211, float:1.9299802E38)
        L1e:
            X.5S1 r1 = new X.5S1
            java.lang.Object r0 = r3.l0
            X.XSb r0 = (X.C84857XSb) r0
            android.content.Context r0 = r0.LJI
            r1.<init>(r0)
            r1.LIZJ(r2)
            r1.LJ()
        L2f:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS37S0110000_15.call$0(Y.ACallableS37S0110000_15):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$1(Y.ACallableS37S0110000_15 r3) {
        /*
            java.lang.Object r0 = r3.l0
            X.XSa r0 = (X.C84856XSa) r0
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto L2f
            boolean r0 = r3.z1
            if (r0 == 0) goto L10
            r2 = 2131827812(0x7f111c64, float:1.9288547E38)
            goto L13
        L10:
            r2 = 2131833148(0x7f11313c, float:1.929937E38)
        L13:
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L1b
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L1b
            if (r0 != 0) goto L1e
        L1b:
            r2 = 2131833361(0x7f113211, float:1.9299802E38)
        L1e:
            X.5S1 r1 = new X.5S1
            java.lang.Object r0 = r3.l0
            X.XSa r0 = (X.C84856XSa) r0
            android.content.Context r0 = r0.LJI
            r1.<init>(r0)
            r1.LIZJ(r2)
            r1.LJ()
        L2f:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS37S0110000_15.call$1(Y.ACallableS37S0110000_15):java.lang.Object");
    }

    public ACallableS37S0110000_15(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
