package Y;

import X.C3C5;
import X.C76800UCe;
import X.C77190URe;
import X.C77199URn;
import X.C77216USe;
import X.EnumC77147UPn;
import X.InterfaceC64672gJ;
import X.InterfaceC67352kd;
import X.URH;
import X.XJL;

/* loaded from: classes14.dex */
public class IDfS14S0300000_13 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC64672gJ
    public final Object emit(T t, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, t, interfaceC67352kd);
            case 1:
                return emit$1(this, t, interfaceC67352kd);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.IDfS14S0300000_13 r6, java.lang.Object r7, X.InterfaceC67352kd r8) {
        /*
            boolean r0 = r8 instanceof X.V1T
            if (r0 == 0) goto L5f
            r4 = r8
            X.V1T r4 = (X.V1T) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r5 = 1
            if (r0 == 0) goto L23
            if (r0 != r5) goto L65
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r0 = r6.l0
            X.V1N r0 = (X.V1N) r0
            X.Yns<T, java.lang.Object> r0 = r0.LJLILLLLZI
            java.lang.Object r2 = r0.invoke(r7)
            java.lang.Object r0 = r6.l1
            X.2mC r0 = (X.C68322mC) r0
            T r1 = r0.element
            X.3BS r0 = X.C94103mg.LIZ
            if (r1 == r0) goto L4c
            java.lang.Object r0 = r6.l0
            X.V1N r0 = (X.V1N) r0
            X.Ynr<java.lang.Object, java.lang.Object, java.lang.Boolean> r0 = r0.LJLJI
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L20
        L4c:
            java.lang.Object r0 = r6.l1
            X.2mC r0 = (X.C68322mC) r0
            r0.element = r2
            java.lang.Object r0 = r6.l2
            X.2gJ r0 = (X.InterfaceC64672gJ) r0
            r4.LJLILLLLZI = r5
            java.lang.Object r0 = r0.emit(r7, r4)
            if (r0 != r3) goto L20
            return r3
        L5f:
            X.V1T r4 = new X.V1T
            r4.<init>(r6, r8)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS14S0300000_13.emit$0(Y.IDfS14S0300000_13, java.lang.Object, X.2kd):java.lang.Object");
    }

    public static final Object emit$1(IDfS14S0300000_13 iDfS14S0300000_13, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        int i = C77199URn.LIZ[c77216USe.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i == 2 && c77216USe.LJLIL.LJLJI) {
                ((C77190URe) iDfS14S0300000_13.l1).LIZ.storeBoolean(URH.LIZ((EnumC77147UPn) iDfS14S0300000_13.l2), true);
            }
        } else if (c77216USe.LJLIL.LJLJI) {
            XJL xjl = (XJL) iDfS14S0300000_13.l0;
            Boolean bool = Boolean.TRUE;
            C3C5.m7constructorimpl(bool);
            xjl.resumeWith(bool);
        } else {
            XJL xjl2 = (XJL) iDfS14S0300000_13.l0;
            Boolean bool2 = Boolean.FALSE;
            C3C5.m7constructorimpl(bool2);
            xjl2.resumeWith(bool2);
        }
        return C76800UCe.LIZ;
    }

    public IDfS14S0300000_13(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
