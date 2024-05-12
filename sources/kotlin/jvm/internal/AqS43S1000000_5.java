package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C32472Com;
import X.C48458J0c;
import X.C76800UCe;
import X.InterfaceC65784Pro;

/* loaded from: classes6.dex */
public class AqS43S1000000_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return this.s0;
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$1(AqS43S1000000_5 aqS43S1000000_5) {
        ((C48458J0c) C32472Com.LIZ.getValue()).LIZ(aqS43S1000000_5.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS43S1000000_5(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
