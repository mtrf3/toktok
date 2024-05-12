package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C35801E3h;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.os.Process;

/* loaded from: classes7.dex */
public class AqS9S0002000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i0;
    public int i1;

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

    public static final Object invoke$0(AqS9S0002000_6 aqS9S0002000_6) {
        C35801E3h.LIZ(aqS9S0002000_6.i0, -aqS9S0002000_6.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS9S0002000_6 aqS9S0002000_6) {
        C35801E3h.LIZ(aqS9S0002000_6.i0, -aqS9S0002000_6.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS9S0002000_6 aqS9S0002000_6) {
        C35801E3h.LIZ(aqS9S0002000_6.i0, aqS9S0002000_6.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS9S0002000_6 aqS9S0002000_6) {
        int i = aqS9S0002000_6.i0;
        try {
            C35801E3h.LIZIZ(i, Process.getThreadPriority(i), aqS9S0002000_6.i1);
        } catch (IllegalArgumentException unused) {
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS9S0002000_6(int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.i0 = i;
        this.i1 = i2;
    }
}
