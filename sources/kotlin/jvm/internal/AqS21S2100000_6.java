package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C39048FUe;
import X.C72972SkS;
import X.C76800UCe;
import X.InterfaceC39049FUf;
import X.InterfaceC65784Pro;
import X.OFI;
import X.X1D;

/* loaded from: classes7.dex */
public class AqS21S2100000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l2;
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

    public static final Object invoke$0(AqS21S2100000_6 aqS21S2100000_6) {
        C39048FUe.LIZIZ.getClass();
        InterfaceC39049FUf interfaceC39049FUf = C39048FUe.LIZ;
        if (interfaceC39049FUf != null) {
            Throwable th = (Throwable) aqS21S2100000_6.l2;
            String str = aqS21S2100000_6.s1;
            StringBuilder LJFF = C72972SkS.LJFF("HybridKit", '_');
            LJFF.append(aqS21S2100000_6.s0);
            interfaceC39049FUf.LIZIZ(str, X1D.LIZIZ(LJFF), th);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS21S2100000_6 aqS21S2100000_6) {
        OFI.LJIIIZ(aqS21S2100000_6.s0, "spark_end_to_end").put(aqS21S2100000_6.s1, aqS21S2100000_6.l2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS21S2100000_6(String str, Object obj, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS21S2100000_6(String str, String str2, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l2 = th;
        this.s1 = str2;
    }
}
