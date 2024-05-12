package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C08370Un;
import X.C0MC;
import X.C76800UCe;
import X.C91877a1h;
import X.C92019a3z;
import X.C92020a40;
import X.C92054a4Y;
import X.C92094a5C;
import X.C92265a7x;
import X.C92286a8I;
import X.C92657aEH;
import X.InterfaceC07790Sh;
import X.InterfaceC24520xk;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import androidx.navigation.NavBackStackEntry;
import java.util.Collection;
import java.util.List;

/* loaded from: classes20.dex */
public class IDqS3S0201000_31 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS3S0201000_31 iDqS3S0201000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            String LIZ = C92054a4Y.LIZ("pipo_payin_add_a_pmid", new String[0]);
            C08370Un c08370Un = (C08370Un) iDqS3S0201000_31.l0;
            C92657aEH c92657aEH = C92657aEH.LJLIL;
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDqS3S0201000_31.l1;
            int i = iDqS3S0201000_31.i2;
            C91877a1h.LIZ(LIZ, null, c08370Un, null, false, c92657aEH, true, false, false, interfaceC65784Pro, interfaceC24520xk, ((i >> 9) & 896) | 1794048 | ((i << 18) & 1879048192), 394);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS3S0201000_31 iDqS3S0201000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C92265a7x) iDqS3S0201000_31.l0).LIZ((InterfaceC07790Sh) iDqS3S0201000_31.l1, (InterfaceC24520xk) obj, iDqS3S0201000_31.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS3S0201000_31 iDqS3S0201000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            C92019a3z.LIZIZ((C0MC) iDqS3S0201000_31.l0, (InterfaceC88471Ynr) iDqS3S0201000_31.l1, interfaceC24520xk, ((iDqS3S0201000_31.i2 >> 3) & 112) | 8);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS3S0201000_31 iDqS3S0201000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C92019a3z.LIZIZ((C0MC) iDqS3S0201000_31.l0, (InterfaceC88471Ynr) iDqS3S0201000_31.l1, (InterfaceC24520xk) obj, iDqS3S0201000_31.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS3S0201000_31 iDqS3S0201000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C92020a40.LIZ((List) iDqS3S0201000_31.l0, (Collection) iDqS3S0201000_31.l1, (InterfaceC24520xk) obj, iDqS3S0201000_31.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS3S0201000_31 iDqS3S0201000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C92286a8I) iDqS3S0201000_31.l0).LIZ((InterfaceC07790Sh) iDqS3S0201000_31.l1, (InterfaceC24520xk) obj, iDqS3S0201000_31.i2 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS3S0201000_31 iDqS3S0201000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C92094a5C.LIZJ((List) iDqS3S0201000_31.l0, (Collection) iDqS3S0201000_31.l1, (InterfaceC24520xk) obj, iDqS3S0201000_31.i2 | 1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS3S0201000_31(C0MC c0mc, C0MC c0mc2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0mc;
        this.l1 = c0mc2;
        this.i2 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS3S0201000_31(C08370Un c08370Un, C08370Un c08370Un2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i) {
        super(2);
        this.$t = i;
        this.l0 = c08370Un;
        this.l1 = c08370Un2;
        this.i2 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS3S0201000_31(C92265a7x c92265a7x, InterfaceC07790Sh interfaceC07790Sh, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c92265a7x;
        this.l1 = interfaceC07790Sh;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS3S0201000_31(C92286a8I c92286a8I, InterfaceC07790Sh interfaceC07790Sh, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c92286a8I;
        this.l1 = interfaceC07790Sh;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS3S0201000_31(List list, List<NavBackStackEntry> list2, Collection<NavBackStackEntry> collection, int i) {
        super(2);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.i2 = collection;
    }
}
