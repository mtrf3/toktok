package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C82639Wbz;
import X.C82641Wc1;
import X.InterfaceC65784Pro;

/* loaded from: classes15.dex */
public class AqS0S1102001_14 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public float f4;
    public int i2;
    public int i3;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AqS0S1102001_14 aqS0S1102001_14) {
        ((C82639Wbz) aqS0S1102001_14.l1).LJLJI.LIZ(aqS0S1102001_14.i2, aqS0S1102001_14.i3, aqS0S1102001_14.f4, aqS0S1102001_14.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S1102001_14 aqS0S1102001_14) {
        ((C82641Wc1) aqS0S1102001_14.l1).LJLJI.LIZ(aqS0S1102001_14.i2, aqS0S1102001_14.i3, aqS0S1102001_14.f4, aqS0S1102001_14.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S1102001_14(C82639Wbz c82639Wbz, int i, int i2, float f, String str, int i3) {
        super(0);
        this.$t = i3;
        this.l1 = c82639Wbz;
        this.i2 = i;
        this.i3 = i2;
        this.f4 = f;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S1102001_14(C82641Wc1 c82641Wc1, int i, int i2, float f, String str, int i3) {
        super(0);
        this.$t = i3;
        this.l1 = c82641Wc1;
        this.i2 = i;
        this.i3 = i2;
        this.f4 = f;
        this.s0 = str;
    }
}
