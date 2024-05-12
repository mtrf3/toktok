package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import X.SVF;

/* loaded from: classes13.dex */
public class AqS50S1000000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;

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
                return this.s0;
            case 7:
                return this.s0;
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS50S1000000_12 aqS50S1000000_12) {
        return SVF.LIZIZ(new AqS35S1000000_12(aqS50S1000000_12.s0, 19));
    }

    public static final Object invoke$1(AqS50S1000000_12 aqS50S1000000_12) {
        return SVF.LIZIZ(new AqS35S1000000_12(aqS50S1000000_12.s0, 20));
    }

    public static final Object invoke$2(AqS50S1000000_12 aqS50S1000000_12) {
        return SVF.LIZIZ(new AqS35S1000000_12(aqS50S1000000_12.s0, 21));
    }

    public static final Object invoke$3(AqS50S1000000_12 aqS50S1000000_12) {
        return SVF.LIZIZ(new AqS35S1000000_12(aqS50S1000000_12.s0, 22));
    }

    public static final Object invoke$4(AqS50S1000000_12 aqS50S1000000_12) {
        return SVF.LIZIZ(new AqS35S1000000_12(aqS50S1000000_12.s0, 23));
    }

    public static final Object invoke$5(AqS50S1000000_12 aqS50S1000000_12) {
        return SVF.LIZIZ(new AqS35S1000000_12(aqS50S1000000_12.s0, 24));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS50S1000000_12(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
