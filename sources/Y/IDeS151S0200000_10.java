package Y;

import X.C76800UCe;
import X.EnumC58928NAu;
import X.InterfaceC64672gJ;
import X.InterfaceC65462ha;
import X.InterfaceC67352kd;
import X.N6F;

/* loaded from: classes11.dex */
public class IDeS151S0200000_10 implements InterfaceC65462ha {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<Object> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return collect$0(this, interfaceC64672gJ, interfaceC67352kd);
            case 1:
                return collect$1(this, interfaceC64672gJ, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDeS151S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collect$0(Y.IDeS151S0200000_10 r6, X.InterfaceC64672gJ r7, X.InterfaceC67352kd r8) {
        /*
            boolean r0 = r8 instanceof X.C63017OoH
            if (r0 == 0) goto L55
            r5 = r8
            X.OoH r5 = (X.C63017OoH) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r4 = r5.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L3a
            if (r0 != r2) goto L5b
            X.C141335gf.LIZJ(r4)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            X.C141335gf.LIZJ(r4)
            java.lang.Object r0 = r6.l0
            X.2ha r0 = (X.InterfaceC65462ha) r0
            r5.LJLJJI = r6
            r5.LJLJJL = r7
            r5.LJLILLLLZI = r1
            java.lang.Object r4 = X.V1M.LJI(r5, r0, r7)
            if (r4 != r3) goto L41
            return r3
        L3a:
            X.2gJ r7 = r5.LJLJJL
            Y.IDeS151S0200000_10 r6 = r5.LJLJJI
            X.C141335gf.LIZJ(r4)
        L41:
            if (r4 == 0) goto L23
            java.lang.Object r1 = r6.l1
            X.Ynt r1 = (X.InterfaceC88473Ynt) r1
            r0 = 0
            r5.LJLJJI = r0
            r5.LJLJJL = r0
            r5.LJLILLLLZI = r2
            java.lang.Object r0 = r1.invoke(r7, r4, r5)
            if (r0 != r3) goto L23
            return r3
        L55:
            X.OoH r5 = new X.OoH
            r5.<init>(r6, r8)
            goto L12
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDeS151S0200000_10.collect$0(Y.IDeS151S0200000_10, X.2gJ, X.2kd):java.lang.Object");
    }

    public static final Object collect$1(IDeS151S0200000_10 iDeS151S0200000_10, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS151S0200000_10.l0).collect(new IDfS25S0200000_10(interfaceC64672gJ, (N6F) iDeS151S0200000_10.l1, 8), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }
}
