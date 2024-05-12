package kotlin.jvm.internal;

import X.AbstractC36569EWv;
import X.AbstractC65781Prl;
import X.C47237IgL;
import X.C76800UCe;
import X.InterfaceC65784Pro;

/* loaded from: classes9.dex */
public class AqS13S1110000_8 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AqS13S1110000_8 aqS13S1110000_8) {
        ((AbstractC36569EWv) aqS13S1110000_8.l1).LJIIJ(aqS13S1110000_8.s0, aqS13S1110000_8.z2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS13S1110000_8 aqS13S1110000_8) {
        return new C47237IgL(aqS13S1110000_8.s0, aqS13S1110000_8.z2, aqS13S1110000_8.l1).LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S1110000_8(String str, Object obj, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.z2 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S1110000_8(AbstractC36569EWv abstractC36569EWv, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC36569EWv;
        this.s0 = str;
        this.z2 = z;
    }
}
