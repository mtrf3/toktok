package kotlin.jvm.internal;

import X.AbstractC41872Gc0;
import X.AbstractC41873Gc1;
import X.AbstractC65781Prl;
import X.C41875Gc3;
import X.C76800UCe;
import X.C87631YaJ;
import X.InterfaceC65784Pro;

/* loaded from: classes17.dex */
public class AqS76S0400000_16 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AqS76S0400000_16 aqS76S0400000_16) {
        AbstractC41873Gc1 LJI = ((C87631YaJ) aqS76S0400000_16.l0).LJI();
        if (LJI != null) {
            LJI.LIZLLL(aqS76S0400000_16.l1, (C41875Gc3) aqS76S0400000_16.l2, (AbstractC41872Gc0) aqS76S0400000_16.l3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS76S0400000_16 aqS76S0400000_16) {
        AbstractC41873Gc1 LJI = ((C87631YaJ) aqS76S0400000_16.l0).LJI();
        if (LJI != null) {
            LJI.LIZIZ((C41875Gc3) aqS76S0400000_16.l2, aqS76S0400000_16.l1, aqS76S0400000_16.l3);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS76S0400000_16(C87631YaJ c87631YaJ, Object obj, C41875Gc3 c41875Gc3, AbstractC41872Gc0 abstractC41872Gc0, int i) {
        super(0);
        this.$t = i;
        this.l0 = c87631YaJ;
        this.l1 = obj;
        this.l2 = c41875Gc3;
        this.l3 = abstractC41872Gc0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS76S0400000_16(C87631YaJ c87631YaJ, Object obj, C41875Gc3 c41875Gc3, Object obj2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c87631YaJ;
        this.l1 = obj;
        this.l2 = c41875Gc3;
        this.l3 = obj2;
    }
}
