package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C3L4;
import X.C3SX;
import X.C76800UCe;
import X.C81983Jq;
import X.C82253Kr;
import X.InterfaceC65784Pro;
import X.InterfaceC81953Jn;
import java.util.List;

/* loaded from: classes2.dex */
public class AqS33S0301000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS33S0301000_1 aqS33S0301000_1) {
        String str;
        boolean z = true;
        if ((C3SX.LIZ() & 32) == 0) {
            String str2 = ((InterfaceC81953Jn) aqS33S0301000_1.l0).LIZIZ().LIZ;
            C81983Jq c81983Jq = ((C82253Kr) aqS33S0301000_1.l1).LJLJJI;
            if (c81983Jq != null) {
                str = c81983Jq.LIZ;
            } else {
                str = null;
            }
            if (o.LJ(str2, str)) {
                C82253Kr c82253Kr = (C82253Kr) aqS33S0301000_1.l1;
                if (aqS33S0301000_1.i3 != 1) {
                    z = false;
                }
                c82253Kr.LJJII(z, (List) aqS33S0301000_1.l2, (InterfaceC81953Jn) aqS33S0301000_1.l0, false);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS33S0301000_1 aqS33S0301000_1) {
        String str;
        boolean z = true;
        if ((C3SX.LIZ() & 32) == 0) {
            String str2 = ((InterfaceC81953Jn) aqS33S0301000_1.l0).LIZIZ().LIZ;
            C81983Jq c81983Jq = ((C82253Kr) aqS33S0301000_1.l1).LJLJJI;
            if (c81983Jq != null) {
                str = c81983Jq.LIZ;
            } else {
                str = null;
            }
            if (o.LJ(str2, str)) {
                C82253Kr c82253Kr = (C82253Kr) aqS33S0301000_1.l1;
                if (aqS33S0301000_1.i3 != 1) {
                    z = false;
                }
                c82253Kr.LJJII(z, (List) aqS33S0301000_1.l2, (InterfaceC81953Jn) aqS33S0301000_1.l0, false);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS33S0301000_1(InterfaceC81953Jn interfaceC81953Jn, InterfaceC81953Jn interfaceC81953Jn2, C82253Kr c82253Kr, int i, List<? extends C3L4> list) {
        super(0);
        this.$t = list;
        this.l0 = interfaceC81953Jn;
        this.l1 = interfaceC81953Jn2;
        this.i3 = c82253Kr;
        this.l2 = i;
    }
}
