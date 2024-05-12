package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C04Z;
import X.C76800UCe;
import X.InterfaceC88472Yns;

/* loaded from: classes.dex */
public class IDqS0S0000001 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public float f0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS0S0000001(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(IDqS0S0000001 iDqS0S0000001, Object obj) {
        C04Z $receiver = (C04Z) obj;
        o.LJIIIZ($receiver, "$this$$receiver");
        $receiver.LIZ.LIZ("fraction", Float.valueOf(iDqS0S0000001.f0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS0S0000001 iDqS0S0000001, Object obj) {
        C04Z $receiver = (C04Z) obj;
        o.LJIIIZ($receiver, "$this$$receiver");
        $receiver.LIZ.LIZ("fraction", Float.valueOf(iDqS0S0000001.f0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS0S0000001 iDqS0S0000001, Object obj) {
        C04Z $receiver = (C04Z) obj;
        o.LJIIIZ($receiver, "$this$$receiver");
        $receiver.LIZ.LIZ("fraction", Float.valueOf(iDqS0S0000001.f0));
        return C76800UCe.LIZ;
    }
}
