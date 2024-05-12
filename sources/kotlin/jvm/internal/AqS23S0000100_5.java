package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;

/* loaded from: classes6.dex */
public class AqS23S0000100_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j0;

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

    public static final Object invoke$0(AqS23S0000100_5 aqS23S0000100_5) {
        boolean z;
        if (aqS23S0000100_5.j0 > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AqS23S0000100_5 aqS23S0000100_5) {
        boolean z;
        if (aqS23S0000100_5.j0 > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS23S0000100_5(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
