package Y;

import X.C76800UCe;
import X.EnumC58928NAu;
import X.InterfaceC64672gJ;
import X.InterfaceC65462ha;
import X.InterfaceC67352kd;

/* loaded from: classes8.dex */
public class IDeS361S0100000_7 implements InterfaceC65462ha {
    public final int $t;
    public Object l0;

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

    public IDeS361S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object collect$0(IDeS361S0100000_7 iDeS361S0100000_7, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS361S0100000_7.l0).collect(new IDfS128S0100000_7(interfaceC64672gJ, 1), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public static final Object collect$1(IDeS361S0100000_7 iDeS361S0100000_7, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS361S0100000_7.l0).collect(new IDfS128S0100000_7(interfaceC64672gJ, 2), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public static final Object collect$2(IDeS361S0100000_7 iDeS361S0100000_7, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS361S0100000_7.l0).collect(new IDfS128S0100000_7(interfaceC64672gJ, 3), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public static final Object collect$3(IDeS361S0100000_7 iDeS361S0100000_7, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS361S0100000_7.l0).collect(new IDfS128S0100000_7(interfaceC64672gJ, 4), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }
}
