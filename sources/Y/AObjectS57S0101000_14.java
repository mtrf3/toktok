package Y;

import X.C82622Wbi;
import X.C83591WrL;
import X.C83621Wrp;
import X.GGS;
import X.InterfaceC65784Pro;

/* loaded from: classes15.dex */
public class AObjectS57S0101000_14 implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AObjectS57S0101000_14 aObjectS57S0101000_14) {
        switch (aObjectS57S0101000_14.i1) {
            case 0:
                return ((C83621Wrp) aObjectS57S0101000_14.l0).LLLIZZ;
            default:
                return C83591WrL.V2((C83591WrL) ((C83621Wrp) aObjectS57S0101000_14.l0));
        }
    }

    public static final Object invoke$1(AObjectS57S0101000_14 aObjectS57S0101000_14) {
        switch (aObjectS57S0101000_14.i1) {
            case 0:
                return C83621Wrp.m((C83621Wrp) aObjectS57S0101000_14.l0);
            case 1:
                return C83591WrL.E2((C82622Wbi) aObjectS57S0101000_14.l0);
            default:
                aObjectS57S0101000_14.l0.getClass();
                return GGS.LIZJ;
        }
    }

    public AObjectS57S0101000_14(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
