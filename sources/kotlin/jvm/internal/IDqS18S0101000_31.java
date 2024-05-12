package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;
import X.InterfaceC88473Ynt;

/* loaded from: classes20.dex */
public class IDqS18S0101000_31 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS18S0101000_31(int i, InterfaceC88471Ynr interfaceC88471Ynr, int i2) {
        super(3);
        this.$t = i2;
        this.l0 = interfaceC88471Ynr;
        this.i1 = i;
    }

    public static final Object invoke$0(IDqS18S0101000_31 iDqS18S0101000_31, Object ModalBottomSheetLayout, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
        if (((intValue & 81) ^ 16) != 0 || !interfaceC24520xk.LIZ()) {
            ((InterfaceC88471Ynr) iDqS18S0101000_31.l0).invoke(interfaceC24520xk, Integer.valueOf((iDqS18S0101000_31.i1 >> 18) & 14));
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS18S0101000_31 iDqS18S0101000_31, Object AnimatedVisibility, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        o.LJIIIZ(AnimatedVisibility, "$this$AnimatedVisibility");
        ((InterfaceC88471Ynr) iDqS18S0101000_31.l0).invoke(obj, Integer.valueOf((iDqS18S0101000_31.i1 >> 12) & 14));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS18S0101000_31 iDqS18S0101000_31, Object AnimatedVisibility, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        o.LJIIIZ(AnimatedVisibility, "$this$AnimatedVisibility");
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) iDqS18S0101000_31.l0;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(obj, Integer.valueOf((iDqS18S0101000_31.i1 >> 6) & 14));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS18S0101000_31 iDqS18S0101000_31, Object AnimatedVisibility, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        o.LJIIIZ(AnimatedVisibility, "$this$AnimatedVisibility");
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) iDqS18S0101000_31.l0;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(obj, Integer.valueOf((iDqS18S0101000_31.i1 >> 12) & 14));
        }
        return C76800UCe.LIZ;
    }
}
