package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC114804ey;
import X.InterfaceC88472Yns;

/* loaded from: classes2.dex */
public class AqS2S0002000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;
    public int i1;

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

    public static final Object invoke$0(AqS2S0002000_1 aqS2S0002000_1, Object obj) {
        InterfaceC114804ey it = (InterfaceC114804ey) obj;
        o.LJIIIZ(it, "it");
        it.LIZLLL(aqS2S0002000_1.i0, aqS2S0002000_1.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S0002000_1 aqS2S0002000_1, Object obj) {
        InterfaceC114804ey it = (InterfaceC114804ey) obj;
        o.LJIIIZ(it, "it");
        it.LIZIZ(aqS2S0002000_1.i0, aqS2S0002000_1.i1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S0002000_1(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i0 = i;
        this.i1 = i2;
    }
}
