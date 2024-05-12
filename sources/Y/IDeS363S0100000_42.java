package Y;

import X.C76800UCe;
import X.C77413UZt;
import X.C94948apE;
import X.EnumC58928NAu;
import X.InterfaceC64672gJ;
import X.InterfaceC65462ha;
import X.InterfaceC67352kd;
import kotlin.jvm.internal.IDqS423S0100000_42;

/* loaded from: classes34.dex */
public class IDeS363S0100000_42 implements InterfaceC65462ha {
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
            case 4:
                return collect$4(this, interfaceC64672gJ, interfaceC67352kd);
            case 5:
                return collect$5(this, interfaceC64672gJ, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDeS363S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object collect$0(IDeS363S0100000_42 iDeS363S0100000_42, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS363S0100000_42.l0).collect(new IDfS134S0100000_42(interfaceC64672gJ, 3), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public static final Object collect$1(IDeS363S0100000_42 iDeS363S0100000_42, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS363S0100000_42.l0).collect(new IDfS134S0100000_42(interfaceC64672gJ, 4), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public static final Object collect$2(IDeS363S0100000_42 iDeS363S0100000_42, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS363S0100000_42.l0).collect(new IDfS134S0100000_42(interfaceC64672gJ, 5), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public static final Object collect$3(IDeS363S0100000_42 iDeS363S0100000_42, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS363S0100000_42.l0).collect(new IDfS134S0100000_42(interfaceC64672gJ, 7), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public static final Object collect$4(IDeS363S0100000_42 iDeS363S0100000_42, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        InterfaceC65462ha[] interfaceC65462haArr = (InterfaceC65462ha[]) iDeS363S0100000_42.l0;
        Object LJII = C77413UZt.LJII(interfaceC67352kd, new IDqS423S0100000_42(interfaceC65462haArr, 155), new C94948apE(null), interfaceC64672gJ, interfaceC65462haArr);
        if (LJII == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJII;
        }
        return C76800UCe.LIZ;
    }

    public static final Object collect$5(IDeS363S0100000_42 iDeS363S0100000_42, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS363S0100000_42.l0).collect(new IDfS134S0100000_42(interfaceC64672gJ, 8), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }
}
