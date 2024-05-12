package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import X.X1D;

/* loaded from: classes11.dex */
public class AqS25S0010000_10 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public boolean z0;

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

    public static final Object invoke$0(AqS25S0010000_10 aqS25S0010000_10) {
        return Boolean.valueOf(aqS25S0010000_10.z0);
    }

    public static final Object invoke$1(AqS25S0010000_10 aqS25S0010000_10) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("needTrans, outOfFrequncy = ");
        LIZ.append(aqS25S0010000_10.z0);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS25S0010000_10(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
