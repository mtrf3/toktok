package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C58620MzY;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.NMB;

/* loaded from: classes11.dex */
public class AqS12S2000000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS12S2000000_10 aqS12S2000000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        NMB.LIZ.getClass();
        logAd.LJII(NMB.LJJI, aqS12S2000000_10.s0);
        logAd.LJII(NMB.LJIJJLI, aqS12S2000000_10.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS12S2000000_10 aqS12S2000000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        NMB.LIZ.getClass();
        logAd.LJII(NMB.LJJI, aqS12S2000000_10.s0);
        logAd.LJII(NMB.LJIJJLI, aqS12S2000000_10.s1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S2000000_10(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
