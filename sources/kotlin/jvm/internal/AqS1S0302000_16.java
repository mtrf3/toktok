package kotlin.jvm.internal;

import X.AbstractC41873Gc1;
import X.AbstractC42983Gtv;
import X.AbstractC65781Prl;
import X.C42360Gjs;
import X.C76800UCe;
import X.C87631YaJ;
import X.InterfaceC65784Pro;

/* loaded from: classes17.dex */
public class AqS1S0302000_16 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public int i4;
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

    public static final Object invoke$0(AqS1S0302000_16 aqS1S0302000_16) {
        AbstractC41873Gc1 LJI = ((C87631YaJ) aqS1S0302000_16.l0).LJI();
        if (LJI != null) {
            LJI.LIZ(aqS1S0302000_16.l1, (AbstractC42983Gtv) aqS1S0302000_16.l2, aqS1S0302000_16.i3, aqS1S0302000_16.i4);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S0302000_16 aqS1S0302000_16) {
        AbstractC41873Gc1 LJI = ((C87631YaJ) aqS1S0302000_16.l0).LJI();
        if (LJI != null) {
            LJI.LIZJ(aqS1S0302000_16.l1, (C42360Gjs) aqS1S0302000_16.l2, aqS1S0302000_16.i3, aqS1S0302000_16.i4);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0302000_16(C87631YaJ c87631YaJ, Object obj, C42360Gjs c42360Gjs, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c87631YaJ;
        this.l1 = obj;
        this.l2 = c42360Gjs;
        this.i3 = i;
        this.i4 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0302000_16(C87631YaJ c87631YaJ, Object obj, AbstractC42983Gtv abstractC42983Gtv, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c87631YaJ;
        this.l1 = obj;
        this.l2 = abstractC42983Gtv;
        this.i3 = i;
        this.i4 = i2;
    }
}
