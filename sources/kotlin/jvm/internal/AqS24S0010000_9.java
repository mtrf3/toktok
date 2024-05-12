package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C136775Yj;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.LA9;
import X.MM4;
import X.MS5;
import X.X1D;

/* loaded from: classes10.dex */
public class AqS24S0010000_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public boolean z0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS24S0010000_9 aqS24S0010000_9) {
        MS5.LJ(new AqS24S0010000_9(aqS24S0010000_9.z0, 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS24S0010000_9 aqS24S0010000_9) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("when edge speed up, disableSeekTouch = ");
        LIZ.append(aqS24S0010000_9.z0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$2(AqS24S0010000_9 aqS24S0010000_9) {
        int i;
        MM4 LIZIZ = LA9.LIZIZ();
        if (LIZIZ != null) {
            boolean z = aqS24S0010000_9.z0;
            C136775Yj c136775Yj = LIZIZ.LJLJI.LJLIL;
            if (c136775Yj != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                c136775Yj.setVisibility(i);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS24S0010000_9(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
