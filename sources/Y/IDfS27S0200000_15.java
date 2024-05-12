package Y;

import X.InterfaceC64672gJ;
import X.InterfaceC67352kd;

/* loaded from: classes16.dex */
public class IDfS27S0200000_15 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64672gJ
    public final Object emit(Object obj, InterfaceC67352kd interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC67352kd);
            case 1:
                return emit$1(this, obj, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS27S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.IDfS27S0200000_15 r7, java.lang.Object r8, X.InterfaceC67352kd r9) {
        /*
            boolean r0 = r9 instanceof X.XMC
            if (r0 == 0) goto L53
            r6 = r9
            X.XMC r6 = (X.XMC) r6
            int r2 = r6.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r6.LJLILLLLZI = r2
        L12:
            java.lang.Object r5 = r6.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 == r2) goto L3e
            if (r0 != r3) goto L59
            X.C141335gf.LIZJ(r5)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            X.C141335gf.LIZJ(r5)
            java.lang.Object r1 = r7.l0
            X.2gJ r1 = (X.InterfaceC64672gJ) r1
            java.lang.Object r0 = r7.l1
            X.Ynr r0 = (X.InterfaceC88471Ynr) r0
            r6.LJLJJI = r8
            r6.LJLJJL = r1
            r6.LJLILLLLZI = r2
            java.lang.Object r0 = r0.invoke(r8, r6)
            if (r0 != r4) goto L45
            return r4
        L3e:
            X.2gJ r1 = r6.LJLJJL
            java.lang.Object r8 = r6.LJLJJI
            X.C141335gf.LIZJ(r5)
        L45:
            r0 = 0
            r6.LJLJJI = r0
            r6.LJLJJL = r0
            r6.LJLILLLLZI = r3
            java.lang.Object r0 = r1.emit(r8, r6)
            if (r0 != r4) goto L23
            return r4
        L53:
            X.XMC r6 = new X.XMC
            r6.<init>(r7, r9)
            goto L12
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS27S0200000_15.emit$0(Y.IDfS27S0200000_15, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.IDfS27S0200000_15 r6, java.lang.Object r7, X.InterfaceC67352kd r8) {
        /*
            boolean r0 = r8 instanceof X.C84546XGc
            if (r0 == 0) goto L43
            r5 = r8
            X.XGc r5 = (X.C84546XGc) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L49
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r2 = r6.l0
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            java.lang.Object r0 = r6.l1
            X.XGS r0 = (X.XGS) r0
            X.XH8 r1 = r0.LJLILLLLZI
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.XGe r0 = X.XH2.LIZIZ
            r1.LIZ(r0)
            r5.LJLILLLLZI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L20
            return r4
        L43:
            X.XGc r5 = new X.XGc
            r5.<init>(r6, r8)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS27S0200000_15.emit$1(Y.IDfS27S0200000_15, java.lang.Object, X.2kd):java.lang.Object");
    }
}
