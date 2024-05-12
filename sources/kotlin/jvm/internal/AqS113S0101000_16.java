package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C32801Cu5;
import X.C76800UCe;
import X.C89468Z9k;
import X.CLB;
import X.InterfaceC65784Pro;
import X.InterfaceC83659WsR;

/* loaded from: classes17.dex */
public class AqS113S0101000_16 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AqS113S0101000_16 aqS113S0101000_16) {
        CLB LJII = ((C32801Cu5) aqS113S0101000_16.l0).LJII();
        if (LJII != null) {
            LJII.LIZJ(aqS113S0101000_16.i1, "reject");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS113S0101000_16 aqS113S0101000_16) {
        CLB LJII = ((C32801Cu5) aqS113S0101000_16.l0).LJII();
        if (LJII != null) {
            LJII.LIZJ(aqS113S0101000_16.i1, "frequency");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS113S0101000_16 aqS113S0101000_16) {
        InterfaceC83659WsR interfaceC83659WsR = ((C89468Z9k) aqS113S0101000_16.l0).LIZ;
        if (interfaceC83659WsR != null) {
            interfaceC83659WsR.LJIIJ(aqS113S0101000_16.i1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS113S0101000_16 aqS113S0101000_16) {
        InterfaceC83659WsR interfaceC83659WsR = ((C89468Z9k) aqS113S0101000_16.l0).LIZ;
        if (interfaceC83659WsR != null) {
            interfaceC83659WsR.LIZLLL(aqS113S0101000_16.i1);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS113S0101000_16(C32801Cu5 c32801Cu5, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c32801Cu5;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS113S0101000_16(C89468Z9k c89468Z9k, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c89468Z9k;
        this.i1 = i;
    }
}
