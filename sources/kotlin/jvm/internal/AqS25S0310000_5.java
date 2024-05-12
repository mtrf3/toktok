package kotlin.jvm.internal;

import X.AbstractC31467CWp;
import X.AbstractC31476CWy;
import X.AbstractC65781Prl;
import X.C31472CWu;
import X.C31580CaO;
import X.C76800UCe;
import X.CX2;
import X.CX3;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;

/* loaded from: classes6.dex */
public class AqS25S0310000_5 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AqS25S0310000_5 aqS25S0310000_5, Object obj, Object obj2) {
        AbstractC31476CWy<? extends AbstractC31467CWp> pendingBadgeHolder = (AbstractC31476CWy) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(pendingBadgeHolder, "pendingBadgeHolder");
        C31472CWu c31472CWu = (C31472CWu) aqS25S0310000_5.l0;
        if (c31472CWu.LJIIJJI) {
            CX2 cx2 = (CX2) aqS25S0310000_5.l1;
            if (cx2 != null && !cx2.LJLIL) {
                c31472CWu.LJIILIIL(pendingBadgeHolder, (InterfaceC65784Pro) aqS25S0310000_5.l2, aqS25S0310000_5.z3, booleanValue);
            }
        } else {
            c31472CWu.LJIILIIL(pendingBadgeHolder, (InterfaceC65784Pro) aqS25S0310000_5.l2, aqS25S0310000_5.z3, booleanValue);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS25S0310000_5 aqS25S0310000_5, Object obj, Object obj2) {
        AbstractC31476CWy<? extends AbstractC31467CWp> pendingBadgeHolder = (AbstractC31476CWy) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(pendingBadgeHolder, "pendingBadgeHolder");
        ((C31580CaO) pendingBadgeHolder.LIZIZ()).LJJLIIIJ = new CX3((InterfaceC65784Pro) aqS25S0310000_5.l2);
        ((C31472CWu) aqS25S0310000_5.l0).LJIILIIL(pendingBadgeHolder, (InterfaceC65784Pro) aqS25S0310000_5.l1, aqS25S0310000_5.z3, booleanValue);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS25S0310000_5(C31472CWu c31472CWu, C31472CWu c31472CWu2, CX2 cx2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z) {
        super(2);
        this.$t = z ? 1 : 0;
        this.l0 = c31472CWu;
        this.l1 = c31472CWu2;
        this.l2 = cx2;
        this.z3 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS25S0310000_5(C31472CWu c31472CWu, C31472CWu c31472CWu2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(2);
        this.$t = interfaceC65784Pro2;
        this.l0 = c31472CWu;
        this.l1 = c31472CWu2;
        this.z3 = interfaceC65784Pro;
        this.l2 = z;
    }
}
