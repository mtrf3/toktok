package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0MC;
import X.C76800UCe;
import X.C91903a27;
import X.C92019a3z;
import X.C92145a61;
import X.InterfaceC24520xk;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import androidx.navigation.NavBackStackEntry;

/* loaded from: classes20.dex */
public class IDqS2S0301000_31 extends AbstractC65781Prl implements InterfaceC88471Ynr {
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

    public static final Object invoke$0(IDqS2S0301000_31 iDqS2S0301000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C91903a27.LIZIZ((C92145a61) iDqS2S0301000_31.l0, (InterfaceC88472Yns) iDqS2S0301000_31.l1, (InterfaceC88472Yns) iDqS2S0301000_31.l2, (InterfaceC24520xk) obj, iDqS2S0301000_31.i3 | 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS2S0301000_31 iDqS2S0301000_31, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C92019a3z.LIZ((NavBackStackEntry) iDqS2S0301000_31.l0, (C0MC) iDqS2S0301000_31.l1, (InterfaceC88471Ynr) iDqS2S0301000_31.l2, (InterfaceC24520xk) obj, iDqS2S0301000_31.i3 | 1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0301000_31(C92145a61 c92145a61, C92145a61 c92145a612, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c92145a61;
        this.l1 = c92145a612;
        this.l2 = interfaceC88472Yns;
        this.i3 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS2S0301000_31(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2, C0MC c0mc, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i) {
        super(2);
        this.$t = i;
        this.l0 = navBackStackEntry;
        this.l1 = navBackStackEntry2;
        this.l2 = c0mc;
        this.i3 = interfaceC88471Ynr;
    }
}
