package Y;

import X.C76800UCe;
import X.EnumC58928NAu;
import X.InterfaceC64672gJ;
import X.InterfaceC65462ha;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;
import X.XGS;

/* loaded from: classes16.dex */
public class IDeS153S0200000_15 implements InterfaceC65462ha {
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
            default:
                return null;
        }
    }

    public IDeS153S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object collect$0(IDeS153S0200000_15 iDeS153S0200000_15, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS153S0200000_15.l0).collect(new IDfS27S0200000_15(interfaceC64672gJ, (InterfaceC88471Ynr) iDeS153S0200000_15.l1, 0), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public static final Object collect$1(IDeS153S0200000_15 iDeS153S0200000_15, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = ((InterfaceC65462ha) iDeS153S0200000_15.l0).collect(new IDfS27S0200000_15(interfaceC64672gJ, (XGS) iDeS153S0200000_15.l1, 1), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }
}
