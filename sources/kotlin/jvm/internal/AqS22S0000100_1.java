package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;

/* loaded from: classes2.dex */
public class AqS22S0000100_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
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

    public static final Object invoke$0(AqS22S0000100_1 aqS22S0000100_1) {
        return Long.valueOf(aqS22S0000100_1.j0);
    }

    public static final Object invoke$1(AqS22S0000100_1 aqS22S0000100_1) {
        return Long.valueOf(aqS22S0000100_1.j0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS22S0000100_1(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
