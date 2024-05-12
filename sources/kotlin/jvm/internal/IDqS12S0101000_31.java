package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C91730ZzK;
import X.C91877a1h;
import X.C92017a3x;
import X.C92038a4I;
import X.C92099a5H;
import X.C92270a82;
import X.InterfaceC24520xk;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC91781a09;
import com.bytedance.pipo.checkout.api.network.model.response.StoredMethods;

/* loaded from: classes20.dex */
public class IDqS12S0101000_31 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS12S0101000_31(int i, InterfaceC65784Pro interfaceC65784Pro, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC65784Pro;
        this.i1 = i;
    }

    public static final Object invoke$0(IDqS12S0101000_31 iDqS12S0101000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            ((InterfaceC88471Ynr) iDqS12S0101000_31.l0).invoke(interfaceC24520xk, Integer.valueOf((iDqS12S0101000_31.i1 >> 12) & 14));
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS12S0101000_31 iDqS12S0101000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C91730ZzK.LIZJ((StoredMethods) iDqS12S0101000_31.l0, (InterfaceC24520xk) obj, iDqS12S0101000_31.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS12S0101000_31 iDqS12S0101000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            C91877a1h.LIZ(null, null, null, null, false, null, false, false, false, (InterfaceC65784Pro) iDqS12S0101000_31.l0, interfaceC24520xk, (iDqS12S0101000_31.i1 << 24) & 1879048192, 511);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS12S0101000_31 iDqS12S0101000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) iDqS12S0101000_31.l0;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(interfaceC24520xk, Integer.valueOf((iDqS12S0101000_31.i1 >> 24) & 14));
            }
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS12S0101000_31 iDqS12S0101000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C92017a3x.LIZ((C92270a82) iDqS12S0101000_31.l0, (InterfaceC24520xk) obj, iDqS12S0101000_31.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS12S0101000_31 iDqS12S0101000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C92038a4I.LIZ(iDqS12S0101000_31.l0, (InterfaceC24520xk) obj, iDqS12S0101000_31.i1 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS12S0101000_31 iDqS12S0101000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) iDqS12S0101000_31.l0;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(interfaceC24520xk, Integer.valueOf((iDqS12S0101000_31.i1 >> 21) & 14));
            }
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS12S0101000_31 iDqS12S0101000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C92099a5H.LIZ((InterfaceC91781a09) iDqS12S0101000_31.l0, (InterfaceC24520xk) obj, iDqS12S0101000_31.i1 | 1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS12S0101000_31(int i, InterfaceC88471Ynr interfaceC88471Ynr, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC88471Ynr;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS12S0101000_31(int i, Object obj, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS12S0101000_31(InterfaceC91781a09 interfaceC91781a09, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC91781a09;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS12S0101000_31(C92270a82 c92270a82, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c92270a82;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS12S0101000_31(StoredMethods storedMethods, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = storedMethods;
        this.i1 = i;
    }
}
