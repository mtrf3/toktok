package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C89468Z9k;
import X.InterfaceC65784Pro;
import X.InterfaceC83659WsR;

/* loaded from: classes17.dex */
public class AqS6S1102000_16 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
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

    public static final Object invoke$0(AqS6S1102000_16 aqS6S1102000_16) {
        InterfaceC83659WsR interfaceC83659WsR = ((C89468Z9k) aqS6S1102000_16.l1).LIZ;
        if (interfaceC83659WsR != null) {
            interfaceC83659WsR.LJI(aqS6S1102000_16.i2, aqS6S1102000_16.i3, aqS6S1102000_16.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS6S1102000_16 aqS6S1102000_16) {
        InterfaceC83659WsR interfaceC83659WsR = ((C89468Z9k) aqS6S1102000_16.l1).LIZ;
        if (interfaceC83659WsR != null) {
            interfaceC83659WsR.LIZIZ(aqS6S1102000_16.i2, aqS6S1102000_16.i3, aqS6S1102000_16.s0);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S1102000_16(C89468Z9k c89468Z9k, int i, int i2, String str, int i3) {
        super(0);
        this.$t = i3;
        this.l1 = c89468Z9k;
        this.i2 = i;
        this.i3 = i2;
        this.s0 = str;
    }
}
