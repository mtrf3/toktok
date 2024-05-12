package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import X.X1D;

/* loaded from: classes2.dex */
public class AqS41S0001000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
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
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS41S0001000_1 aqS41S0001000_1) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showToastOpt:");
        LIZ.append(aqS41S0001000_1.i0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$1(AqS41S0001000_1 aqS41S0001000_1) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[moveViewPagerToIndex] ");
        LIZ.append(aqS41S0001000_1.i0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$2(AqS41S0001000_1 aqS41S0001000_1) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[scrollToNext] ");
        LIZ.append(aqS41S0001000_1.i0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$3(AqS41S0001000_1 aqS41S0001000_1) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[scrollToNext] ");
        LIZ.append(aqS41S0001000_1.i0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$4(AqS41S0001000_1 aqS41S0001000_1) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[movePagerByAweme] ");
        LIZ.append(aqS41S0001000_1.i0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$5(AqS41S0001000_1 aqS41S0001000_1) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onPageSelected] ");
        LIZ.append(aqS41S0001000_1.i0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$6(AqS41S0001000_1 aqS41S0001000_1) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onPageSelected] ");
        LIZ.append(aqS41S0001000_1.i0);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS41S0001000_1(int i, int i2) {
        super(0);
        this.$t = i2;
        this.i0 = i;
    }
}
