package Y;

import X.C76800UCe;
import X.C78966Uyw;
import X.InterfaceC64672gJ;
import X.InterfaceC67352kd;
import java.util.List;

/* loaded from: classes8.dex */
public class IDfS128S0100000_7 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC64672gJ
    public final Object emit(List<? extends String> list, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, list, interfaceC67352kd);
            case 1:
                return emit$1(this, list, interfaceC67352kd);
            case 2:
                return emit$2(this, list, interfaceC67352kd);
            case 3:
                return emit$3(this, list, interfaceC67352kd);
            case 4:
                return emit$4(this, list, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS128S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(IDfS128S0100000_7 iDfS128S0100000_7, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C78966Uyw.LJJL(obj, (InterfaceC67352kd) iDfS128S0100000_7.l0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.IDfS128S0100000_7 r8, java.lang.Object r9, X.InterfaceC67352kd r10) {
        /*
            boolean r0 = r10 instanceof X.GYY
            if (r0 == 0) goto L44
            r7 = r10
            X.GYY r7 = (X.GYY) r7
            int r2 = r7.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r7.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r7.LJLIL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r5 = 1
            if (r0 == 0) goto L23
            if (r0 != r5) goto L4a
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r4 = r8.l0
            X.2gJ r4 = (X.InterfaceC64672gJ) r4
            X.GYh r9 = (X.C41703GYh) r9
            X.GYE r3 = new X.GYE
            java.util.List<java.lang.String> r0 = r9.LJ
            java.lang.Object r2 = X.ORZ.LJLLJ(r0)
            java.lang.String r2 = (java.lang.String) r2
            r1 = 0
            r0 = 6
            r3.<init>(r2, r1, r0)
            r7.LJLILLLLZI = r5
            java.lang.Object r0 = r4.emit(r3, r7)
            if (r0 != r6) goto L20
            return r6
        L44:
            X.GYY r7 = new X.GYY
            r7.<init>(r8, r10)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS128S0100000_7.emit$1(Y.IDfS128S0100000_7, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.IDfS128S0100000_7 r6, java.lang.Object r7, X.InterfaceC67352kd r8) {
        /*
            boolean r0 = r8 instanceof X.GYG
            if (r0 == 0) goto L39
            r5 = r8
            X.GYG r5 = (X.GYG) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3f
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r2 = r6.l0
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.OSZ r1 = new X.OSZ
            r0 = 0
            r1.<init>(r7, r0)
            r5.LJLILLLLZI = r3
            java.lang.Object r0 = r2.emit(r1, r5)
            if (r0 != r4) goto L20
            return r4
        L39:
            X.GYG r5 = new X.GYG
            r5.<init>(r6, r8)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS128S0100000_7.emit$2(Y.IDfS128S0100000_7, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.IDfS128S0100000_7 r7, java.lang.Object r8, X.InterfaceC67352kd r9) {
        /*
            boolean r0 = r9 instanceof X.GYZ
            if (r0 == 0) goto L3c
            r6 = r9
            X.GYZ r6 = (X.GYZ) r6
            int r2 = r6.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r6.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L42
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r3 = r7.l0
            X.2gJ r3 = (X.InterfaceC64672gJ) r3
            java.lang.String r8 = (java.lang.String) r8
            X.GYE r2 = new X.GYE
            r1 = 0
            r0 = 6
            r2.<init>(r8, r1, r0)
            r6.LJLILLLLZI = r4
            java.lang.Object r0 = r3.emit(r2, r6)
            if (r0 != r5) goto L20
            return r5
        L3c:
            X.GYZ r6 = new X.GYZ
            r6.<init>(r7, r9)
            goto L12
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS128S0100000_7.emit$3(Y.IDfS128S0100000_7, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$4(Y.IDfS128S0100000_7 r8, java.lang.Object r9, X.InterfaceC67352kd r10) {
        /*
            boolean r0 = r10 instanceof X.C41696GYa
            if (r0 == 0) goto L44
            r7 = r10
            X.GYa r7 = (X.C41696GYa) r7
            int r2 = r7.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r7.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r7.LJLIL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            r5 = 1
            if (r0 == 0) goto L23
            if (r0 != r5) goto L4a
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r4 = r8.l0
            X.2gJ r4 = (X.InterfaceC64672gJ) r4
            X.GYh r9 = (X.C41703GYh) r9
            X.GYE r3 = new X.GYE
            java.util.List<java.lang.String> r0 = r9.LJ
            java.lang.Object r2 = X.ORZ.LJLLJ(r0)
            java.lang.String r2 = (java.lang.String) r2
            r1 = 0
            r0 = 6
            r3.<init>(r2, r1, r0)
            r7.LJLILLLLZI = r5
            java.lang.Object r0 = r4.emit(r3, r7)
            if (r0 != r6) goto L20
            return r6
        L44:
            X.GYa r7 = new X.GYa
            r7.<init>(r8, r10)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS128S0100000_7.emit$4(Y.IDfS128S0100000_7, java.lang.Object, X.2kd):java.lang.Object");
    }
}
