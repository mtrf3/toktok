package kotlin.jvm.internal;

import X.AbstractC13490fx;
import X.AbstractC65781Prl;
import X.C13570g5;
import X.C13590g7;
import X.C13640gC;
import X.C17490mP;
import X.C17540mU;
import X.C17660mg;
import X.C32501Pi;
import X.C32521Pk;
import X.C34361Wm;
import X.C40431iJ;
import X.C76800UCe;
import X.InterfaceC24520xk;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class IDqS447S0100000 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS447S0100000(C17540mU c17540mU, int i) {
        super(4);
        this.$t = i;
        this.l0 = c17540mU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS447S0100000(C32501Pi c32501Pi, int i) {
        super(4);
        this.$t = i;
        this.l0 = c32501Pi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS447S0100000(C34361Wm c34361Wm, int i) {
        super(4);
        this.$t = i;
        this.l0 = c34361Wm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS447S0100000(C40431iJ c40431iJ, int i) {
        super(4);
        this.$t = i;
        this.l0 = c40431iJ;
    }

    public static final Object invoke$0(IDqS447S0100000 iDqS447S0100000, Object $receiver, Object obj, Object obj2, Object obj3) {
        int i;
        ((Number) obj).intValue();
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj2;
        int intValue = ((Number) obj3).intValue();
        o.LJIIIZ($receiver, "$this$$receiver");
        if ((intValue & 14) == 0) {
            if (interfaceC24520xk.LJIJJ($receiver)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 651) != 130 || !interfaceC24520xk.LIZ()) {
            ((InterfaceC88473Ynt) iDqS447S0100000.l0).invoke($receiver, interfaceC24520xk, Integer.valueOf(intValue & 14));
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS447S0100000 iDqS447S0100000, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        C32521Pk interval = (C32521Pk) obj;
        int intValue = ((Number) obj2).intValue();
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj3;
        int intValue2 = ((Number) obj4).intValue();
        o.LJIIIZ(interval, "interval");
        if ((intValue2 & 14) == 0) {
            if (interfaceC24520xk.LJIJJ(interval)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            if (interfaceC24520xk.LJIIIZ(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 731) != 146 || !interfaceC24520xk.LIZ()) {
            interval.LIZJ.invoke((C32501Pi) iDqS447S0100000.l0, Integer.valueOf(intValue), interfaceC24520xk, Integer.valueOf(i & 112));
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS447S0100000 iDqS447S0100000, Object $receiver, Object obj, Object obj2, Object obj3) {
        int i;
        ((Number) obj).intValue();
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj2;
        int intValue = ((Number) obj3).intValue();
        o.LJIIIZ($receiver, "$this$$receiver");
        if ((intValue & 14) == 0) {
            if (interfaceC24520xk.LJIJJ($receiver)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 651) != 130 || !interfaceC24520xk.LIZ()) {
            ((InterfaceC88473Ynt) iDqS447S0100000.l0).invoke($receiver, interfaceC24520xk, Integer.valueOf(intValue & 14));
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS447S0100000 iDqS447S0100000, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj3;
        if ((((Number) obj4).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            C17490mP.LIZ(((C17540mU) iDqS447S0100000.l0).LJFF, null, interfaceC24520xk, 0, 2);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS447S0100000 iDqS447S0100000, Object obj, Object obj2, Object obj3, Object obj4) {
        C13640gC fontWeight = (C13640gC) obj2;
        int i = ((C13570g5) obj3).LIZ;
        int i2 = ((C13590g7) obj4).LIZ;
        o.LJIIIZ(fontWeight, "fontWeight");
        C17660mg c17660mg = new C17660mg(((C34361Wm) iDqS447S0100000.l0).LIZLLL.LIZ((AbstractC13490fx) obj, fontWeight, i, i2));
        ((ArrayList) ((C34361Wm) iDqS447S0100000.l0).LJIIIIZZ).add(c17660mg);
        Object obj5 = c17660mg.LIZIZ;
        o.LJII(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
        return obj5;
    }
}
