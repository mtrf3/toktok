package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1547165j;
import X.C76800UCe;
import X.C82313WSf;
import X.C82454WXq;
import X.InterfaceC65784Pro;
import X.InterfaceC82311WSd;
import X.LDV;

/* loaded from: classes15.dex */
public class AqS8S0100001_14 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public float f1;
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

    public static final Object invoke$0(AqS8S0100001_14 aqS8S0100001_14) {
        LDV ldv;
        InterfaceC82311WSd interfaceC82311WSd = ((C82313WSf) aqS8S0100001_14.l0).LIZIZ;
        if (interfaceC82311WSd != null) {
            float f = aqS8S0100001_14.f1;
            if (f < 1.0E-5f) {
                ldv = LDV.LEFT;
            } else {
                ldv = LDV.RIGHT;
            }
            interfaceC82311WSd.LIZ(f, ldv);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS8S0100001_14 aqS8S0100001_14) {
        if (((C82454WXq) aqS8S0100001_14.l0).getSceneContext() != null) {
            C82454WXq c82454WXq = (C82454WXq) aqS8S0100001_14.l0;
            C1547165j c1547165j = c82454WXq.LJLJJI;
            if (c1547165j != null) {
                C82454WXq.LLJJIII(c82454WXq, c1547165j, aqS8S0100001_14.f1, c82454WXq.LJLLLL, c82454WXq.LJLLJ, c82454WXq.LJZI, 0.0f, 32);
            } else {
                o.LJIJI("innerBorder");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS8S0100001_14 aqS8S0100001_14) {
        C82454WXq c82454WXq = (C82454WXq) aqS8S0100001_14.l0;
        C1547165j c1547165j = c82454WXq.LJLJJI;
        if (c1547165j != null) {
            C82454WXq.LLJJIII(c82454WXq, c1547165j, aqS8S0100001_14.f1, c82454WXq.LJLLLL, c82454WXq.LJLLJ, c82454WXq.LJZI, 0.0f, 32);
            ((C82454WXq) aqS8S0100001_14.l0).LLJJ(true);
            return C76800UCe.LIZ;
        }
        o.LJIJI("innerBorder");
        throw null;
    }

    public static final Object invoke$3(AqS8S0100001_14 aqS8S0100001_14) {
        C82454WXq c82454WXq = (C82454WXq) aqS8S0100001_14.l0;
        C1547165j c1547165j = c82454WXq.LJLJJI;
        if (c1547165j != null) {
            C82454WXq.LLJJIII(c82454WXq, c1547165j, aqS8S0100001_14.f1, c82454WXq.LJLLLL, c82454WXq.LJLLJ, c82454WXq.LJZI, 0.0f, 32);
            ((C82454WXq) aqS8S0100001_14.l0).LLJJ(true);
            ((C82454WXq) aqS8S0100001_14.l0).getUiActions().LJLJI.invoke();
            return C76800UCe.LIZ;
        }
        o.LJIJI("innerBorder");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S0100001_14(float f, C82454WXq c82454WXq, int i) {
        super(0);
        this.$t = i;
        this.l0 = c82454WXq;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S0100001_14(C82313WSf c82313WSf, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c82313WSf;
        this.f1 = f;
    }
}
