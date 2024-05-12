package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import X.X1D;

/* loaded from: classes12.dex */
public class AqS2S2001000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS2S2001000_11 aqS2S2001000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("postInvoke id: ");
        LIZ.append(aqS2S2001000_11.i2);
        LIZ.append(" className: ");
        LIZ.append(aqS2S2001000_11.s0);
        LIZ.append(" memberName: ");
        LIZ.append(aqS2S2001000_11.s1);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$1(AqS2S2001000_11 aqS2S2001000_11) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preInvoke id: ");
        LIZ.append(aqS2S2001000_11.i2);
        LIZ.append(" className: ");
        LIZ.append(aqS2S2001000_11.s0);
        LIZ.append(" memberName: ");
        LIZ.append(aqS2S2001000_11.s1);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S2001000_11(int i, String str, String str2, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
