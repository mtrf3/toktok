package Y;

import X.C76800UCe;
import X.EnumC58928NAu;
import X.InterfaceC64672gJ;
import X.InterfaceC65462ha;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;

/* loaded from: classes14.dex */
public class IDeS152S0200000_13 implements InterfaceC65462ha {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return collect$0(this, interfaceC64672gJ, interfaceC67352kd);
            case 1:
                return collect$1(this, interfaceC64672gJ, interfaceC67352kd);
            case 2:
                return collect$2(this, interfaceC64672gJ, interfaceC67352kd);
            case 3:
                return collect$3(this, interfaceC64672gJ, interfaceC67352kd);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDeS152S0200000_13(X.InterfaceC88471Ynr r2, X.InterfaceC65462ha r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDeS152S0200000_13.<init>(X.Ynr, X.2ha, int):void");
    }

    public static final Object collect$0(IDeS152S0200000_13 iDeS152S0200000_13, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS152S0200000_13.l0).collect(new IDfS26S0200000_13(interfaceC64672gJ, (InterfaceC88471Ynr) iDeS152S0200000_13.l1, 1), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collect$1(Y.IDeS152S0200000_13 r8, X.InterfaceC64672gJ r9, X.InterfaceC67352kd r10) {
        /*
            boolean r0 = r10 instanceof X.C77423Ua3
            if (r0 == 0) goto L29
            r6 = r10
            X.Ua3 r6 = (X.C77423Ua3) r6
            int r2 = r6.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r6.LJLILLLLZI = r2
        L12:
            java.lang.Object r7 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r2 = 3
            r4 = 2
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L49
            if (r0 == r1) goto L3d
            if (r0 == r4) goto L9b
            if (r0 != r2) goto L35
            java.lang.Object r1 = r6.LJLJJI
            fjb.a r1 = (fjb.a) r1
            goto L2f
        L29:
            X.Ua3 r6 = new X.Ua3
            r6.<init>(r8, r10)
            goto L12
        L2f:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Throwable -> L33
            goto L77
        L33:
            r0 = move-exception
            goto L7f
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3d:
            X.2gJ r9 = r6.LJLJJL
            java.lang.Object r8 = r6.LJLJJI
            Y.IDeS152S0200000_13 r8 = (Y.IDeS152S0200000_13) r8
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Throwable -> L47
            goto L5d
        L47:
            r0 = move-exception
            goto L85
        L49:
            X.C141335gf.LIZJ(r7)
            java.lang.Object r0 = r8.l0     // Catch: java.lang.Throwable -> L84
            X.2ha r0 = (X.InterfaceC65462ha) r0     // Catch: java.lang.Throwable -> L84
            r6.LJLJJI = r8     // Catch: java.lang.Throwable -> L84
            r6.LJLJJL = r9     // Catch: java.lang.Throwable -> L84
            r6.LJLILLLLZI = r1     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r0.collect(r9, r6)     // Catch: java.lang.Throwable -> L84
            if (r0 != r5) goto L5d
            goto L83
        L5d:
            X.Ua7 r1 = new X.Ua7
            X.MBA r0 = r6.getContext()
            r1.<init>(r9, r0)
            java.lang.Object r0 = r8.l1     // Catch: java.lang.Throwable -> L7e
            X.Ynt r0 = (X.InterfaceC88473Ynt) r0     // Catch: java.lang.Throwable -> L7e
            r6.LJLJJI = r1     // Catch: java.lang.Throwable -> L7e
            r6.LJLJJL = r3     // Catch: java.lang.Throwable -> L7e
            r6.LJLILLLLZI = r2     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r0.invoke(r1, r3, r6)     // Catch: java.lang.Throwable -> L7e
            if (r0 != r5) goto L77
            goto L7d
        L77:
            r1.releaseIntercepted()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L7d:
            return r5
        L7e:
            r0 = move-exception
        L7f:
            r1.releaseIntercepted()
            throw r0
        L83:
            return r5
        L84:
            r0 = move-exception
        L85:
            X.3Bv r2 = new X.3Bv
            r2.<init>(r0)
            java.lang.Object r1 = r8.l1
            X.Ynt r1 = (X.InterfaceC88473Ynt) r1
            r6.LJLJJI = r0
            r6.LJLJJL = r3
            r6.LJLILLLLZI = r4
            java.lang.Object r1 = X.C78540Us4.LJIIL(r2, r1, r0, r6)
            if (r1 != r5) goto La2
            return r5
        L9b:
            java.lang.Object r0 = r6.LJLJJI
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.C141335gf.LIZJ(r7)
        La2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDeS152S0200000_13.collect$1(Y.IDeS152S0200000_13, X.2gJ, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collect$2(Y.IDeS152S0200000_13 r7, X.InterfaceC64672gJ r8, X.InterfaceC67352kd r9) {
        /*
            boolean r0 = r9 instanceof X.C77422Ua2
            if (r0 == 0) goto L66
            r6 = r9
            X.Ua2 r6 = (X.C77422Ua2) r6
            int r2 = r6.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r6.LJLILLLLZI = r2
        L12:
            java.lang.Object r5 = r6.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 == r2) goto L26
            if (r0 != r3) goto L6c
            X.C141335gf.LIZJ(r5)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            X.Ua7 r1 = r6.LJLJJLL
            X.2gJ r8 = r6.LJLJJL
            Y.IDeS152S0200000_13 r7 = r6.LJLJJI
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Throwable -> L74
            goto L4f
        L30:
            X.C141335gf.LIZJ(r5)
            X.Ua7 r1 = new X.Ua7
            X.MBA r0 = r6.getContext()
            r1.<init>(r8, r0)
            java.lang.Object r0 = r7.l0     // Catch: java.lang.Throwable -> L77
            X.Ynr r0 = (X.InterfaceC88471Ynr) r0     // Catch: java.lang.Throwable -> L77
            r6.LJLJJI = r7     // Catch: java.lang.Throwable -> L77
            r6.LJLJJL = r8     // Catch: java.lang.Throwable -> L77
            r6.LJLJJLL = r1     // Catch: java.lang.Throwable -> L77
            r6.LJLILLLLZI = r2     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = r0.invoke(r1, r6)     // Catch: java.lang.Throwable -> L77
            if (r0 != r4) goto L4f
            goto L76
        L4f:
            r1.releaseIntercepted()
            java.lang.Object r1 = r7.l1
            X.2ha r1 = (X.InterfaceC65462ha) r1
            r0 = 0
            r6.LJLJJI = r0
            r6.LJLJJL = r0
            r6.LJLJJLL = r0
            r6.LJLILLLLZI = r3
            java.lang.Object r0 = r1.collect(r8, r6)
            if (r0 != r4) goto L23
            return r4
        L66:
            X.Ua2 r6 = new X.Ua2
            r6.<init>(r7, r9)
            goto L12
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L74:
            r0 = move-exception
            goto L78
        L76:
            return r4
        L77:
            r0 = move-exception
        L78:
            r1.releaseIntercepted()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDeS152S0200000_13.collect$2(Y.IDeS152S0200000_13, X.2gJ, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0073 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collect$3(Y.IDeS152S0200000_13 r9, X.InterfaceC64672gJ r10, X.InterfaceC67352kd r11) {
        /*
            boolean r0 = r11 instanceof X.UW3
            if (r0 == 0) goto L7c
            r7 = r11
            X.UW3 r7 = (X.UW3) r7
            int r2 = r7.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r7.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r7.LJLIL
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L76
            if (r0 == r5) goto L4e
            if (r0 != r6) goto L83
            long r2 = r7.LJLJL
            java.lang.Object r4 = r7.LJLJJLL
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            X.2gJ r10 = r7.LJLJJL
            Y.IDeS152S0200000_13 r9 = r7.LJLJJI
            X.C141335gf.LIZJ(r1)
        L2d:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L82
            r0 = 1
            long r2 = r2 + r0
        L38:
            java.lang.Object r1 = r9.l0
            X.2ha r1 = (X.InterfaceC65462ha) r1
            r7.LJLJJI = r9
            r7.LJLJJL = r10
            r0 = 0
            r7.LJLJJLL = r0
            r7.LJLJL = r2
            r7.LJLILLLLZI = r5
            java.lang.Object r1 = X.V1M.LJI(r7, r1, r10)
            if (r1 != r8) goto L57
            return r8
        L4e:
            long r2 = r7.LJLJL
            X.2gJ r10 = r7.LJLJJL
            Y.IDeS152S0200000_13 r9 = r7.LJLJJI
            X.C141335gf.LIZJ(r1)
        L57:
            r4 = r1
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L8b
            java.lang.Object r1 = r9.l1
            X.Ynu r1 = (X.InterfaceC88474Ynu) r1
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r2)
            r7.LJLJJI = r9
            r7.LJLJJL = r10
            r7.LJLJJLL = r4
            r7.LJLJL = r2
            r7.LJLILLLLZI = r6
            java.lang.Object r1 = r1.invoke(r10, r4, r0, r7)
            if (r1 != r8) goto L2d
            return r8
        L76:
            X.C141335gf.LIZJ(r1)
            r2 = 0
            goto L38
        L7c:
            X.UW3 r7 = new X.UW3
            r7.<init>(r9, r11)
            goto L12
        L82:
            throw r4
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDeS152S0200000_13.collect$3(Y.IDeS152S0200000_13, X.2gJ, X.2kd):java.lang.Object");
    }

    public IDeS152S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
