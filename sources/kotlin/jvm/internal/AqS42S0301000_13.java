package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C09300Yc;
import X.C0YY;
import X.C1DJ;
import X.C21350sd;
import X.C21430sl;
import X.C23360vs;
import X.C76800UCe;
import X.C79171V5j;
import X.InterfaceC09420Yo;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;

/* loaded from: classes14.dex */
public class AqS42S0301000_13 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS42S0301000_13 aqS42S0301000_13, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            C09300Yc.LIZ(null, null, true, C1DJ.LJ(interfaceC24520xk, 32064168, new C79171V5j((InterfaceC88472Yns) aqS42S0301000_13.l0, (InterfaceC09420Yo) aqS42S0301000_13.l1, (InterfaceC88473Ynt) aqS42S0301000_13.l2, aqS42S0301000_13.i3)), interfaceC24520xk, 3456, 3);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS42S0301000_13 aqS42S0301000_13, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            C21430sl.LIZ(C21350sd.LIZJ(interfaceC24520xk).LJIIJ, C1DJ.LJ(interfaceC24520xk, -993251118, new AqS42S0301000_13((InterfaceC88472Yns) aqS42S0301000_13.l0, (InterfaceC09420Yo) aqS42S0301000_13.l1, (InterfaceC88473Ynt) aqS42S0301000_13.l2, aqS42S0301000_13.i3, 0)), interfaceC24520xk, 48);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS42S0301000_13(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super C23360vs, C76800UCe> interfaceC88472Yns2, InterfaceC09420Yo interfaceC09420Yo, InterfaceC88473Ynt<? super C0YY, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88473Ynt, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
        this.l2 = interfaceC09420Yo;
        this.i3 = interfaceC88473Ynt;
    }
}
