package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.M4B;

/* loaded from: classes14.dex */
public class AqS14S2000000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;
    public String s1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS14S2000000_13 aqS14S2000000_13, Object obj) {
        M4B trackerConfig = (M4B) obj;
        o.LJIIIZ(trackerConfig, "$this$trackerConfig");
        trackerConfig.LIZ(aqS14S2000000_13.s0);
        trackerConfig.LIZIZ(aqS14S2000000_13.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS14S2000000_13 aqS14S2000000_13, Object obj) {
        M4B trackerConfig = (M4B) obj;
        o.LJIIIZ(trackerConfig, "$this$trackerConfig");
        trackerConfig.LIZ(aqS14S2000000_13.s0);
        trackerConfig.LIZIZ(aqS14S2000000_13.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS14S2000000_13 aqS14S2000000_13, Object obj) {
        M4B trackerConfig = (M4B) obj;
        o.LJIIIZ(trackerConfig, "$this$trackerConfig");
        trackerConfig.LIZ(aqS14S2000000_13.s0);
        trackerConfig.LIZIZ(aqS14S2000000_13.s1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S2000000_13(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
