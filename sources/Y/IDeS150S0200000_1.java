package Y;

import X.C34K;
import X.C64462fy;
import X.C64472fz;
import X.C70332pR;
import X.C73122tw;
import X.C76800UCe;
import X.C77413UZt;
import X.EnumC58928NAu;
import X.InterfaceC64672gJ;
import X.InterfaceC65462ha;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;

/* loaded from: classes2.dex */
public class IDeS150S0200000_1 implements InterfaceC65462ha {
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

    public IDeS150S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object collect$0(IDeS150S0200000_1 iDeS150S0200000_1, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS150S0200000_1.l0).collect(new IDfS21S0200000_1(interfaceC64672gJ, (C73122tw) iDeS150S0200000_1.l1, 2), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public static final Object collect$1(IDeS150S0200000_1 iDeS150S0200000_1, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object LJII = C77413UZt.LJII(interfaceC67352kd, C70332pR.LJLIL, new C64462fy(null, (InterfaceC88474Ynu) iDeS150S0200000_1.l1), interfaceC64672gJ, (InterfaceC65462ha[]) iDeS150S0200000_1.l0);
        if (LJII == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJII;
        }
        return C76800UCe.LIZ;
    }

    public static final Object collect$2(IDeS150S0200000_1 iDeS150S0200000_1, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object LJII = C77413UZt.LJII(interfaceC67352kd, C70332pR.LJLIL, new C64472fz(null, (InterfaceC88475Ynv) iDeS150S0200000_1.l1), interfaceC64672gJ, (InterfaceC65462ha[]) iDeS150S0200000_1.l0);
        if (LJII == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJII;
        }
        return C76800UCe.LIZ;
    }

    public static final Object collect$3(IDeS150S0200000_1 iDeS150S0200000_1, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS150S0200000_1.l0).collect(new IDfS12S0300000_1((InterfaceC88471Ynr) iDeS150S0200000_1.l1, new C34K(), interfaceC64672gJ, 1), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }
}
