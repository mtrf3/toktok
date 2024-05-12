package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.BLD;
import X.InterfaceC65784Pro;

/* loaded from: classes20.dex */
public class IDqS4S0010000_31 extends AbstractC65781Prl implements InterfaceC65784Pro {
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
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS4S0010000_31 iDqS4S0010000_31) {
        return new BLD(iDqS4S0010000_31.z0 ? 1 : 0);
    }

    public static final Object invoke$1(IDqS4S0010000_31 iDqS4S0010000_31) {
        return new BLD(iDqS4S0010000_31.z0 ? 1 : 0);
    }

    public static final Object invoke$2(IDqS4S0010000_31 iDqS4S0010000_31) {
        return new BLD(iDqS4S0010000_31.z0 ? 1 : 0);
    }

    public static final Object invoke$3(IDqS4S0010000_31 iDqS4S0010000_31) {
        return new BLD(iDqS4S0010000_31.z0 ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS4S0010000_31(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
