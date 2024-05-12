package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.R1V;
import X.R1W;
import X.X1D;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public class AqS46S0001000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS46S0001000_11 aqS46S0001000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("filterAllowNetworkId: true id: ");
        LIZ.append(aqS46S0001000_11.i0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$1(AqS46S0001000_11 aqS46S0001000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("filterAllowNetworkId: true id: ");
        LIZ.append(aqS46S0001000_11.i0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$2(AqS46S0001000_11 aqS46S0001000_11) {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = R1W.LJIIJJI;
        copyOnWriteArrayList.add(Integer.valueOf(aqS46S0001000_11.i0));
        R1W.LIZIZ().storeString("extra_info", copyOnWriteArrayList.toString());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS46S0001000_11 aqS46S0001000_11) {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = R1V.LJIIJJI;
        copyOnWriteArrayList.add(Integer.valueOf(aqS46S0001000_11.i0));
        R1V.LIZIZ().storeString("extra_info", copyOnWriteArrayList.toString());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS46S0001000_11(int i, int i2) {
        super(0);
        this.$t = i2;
        this.i0 = i;
    }
}
