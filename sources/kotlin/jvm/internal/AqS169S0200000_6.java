package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C34K;
import X.C38931FPr;
import X.C47261Igj;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import java.util.Collection;
import java.util.List;

/* loaded from: classes7.dex */
public class AqS169S0200000_6 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS169S0200000_6(C34K c34k, C34K c34k2, InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe> interfaceC88471Ynr) {
        super(2);
        this.$t = interfaceC88471Ynr;
        this.l0 = c34k;
        this.l1 = c34k2;
    }

    public static final Object invoke$0(AqS169S0200000_6 aqS169S0200000_6, Object obj, Object bridge) {
        Collection list = (Collection) obj;
        o.LJIIJ(list, "list");
        o.LJIIJ(bridge, "bridge");
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aqS169S0200000_6.l1;
        List LJJIJIL = C47261Igj.LJJIJIL((C38931FPr) aqS169S0200000_6.l0);
        LJJIJIL.addAll(list);
        interfaceC88471Ynr.invoke(LJJIJIL, bridge);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS169S0200000_6 aqS169S0200000_6, Object obj, Object errorMsg) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(errorMsg, "errorMsg");
        if (!((C34K) aqS169S0200000_6.l0).element) {
            ((InterfaceC88471Ynr) aqS169S0200000_6.l1).invoke(Integer.valueOf(intValue), errorMsg);
            ((C34K) aqS169S0200000_6.l0).element = true;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS169S0200000_6(C38931FPr c38931FPr, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        super(2);
        this.$t = i;
        this.l0 = c38931FPr;
        this.l1 = interfaceC88471Ynr;
    }
}
