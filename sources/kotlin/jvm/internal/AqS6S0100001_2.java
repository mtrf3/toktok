package kotlin.jvm.internal;

import X.A90;
import X.AbstractC65781Prl;
import X.C126844yO;
import X.C162776a9;
import X.C56K;
import X.C76800UCe;
import X.InterfaceC65784Pro;

/* loaded from: classes3.dex */
public class AqS6S0100001_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
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

    public static final Object invoke$0(AqS6S0100001_2 aqS6S0100001_2) {
        A90 LJII;
        A90 LJII2 = ((C126844yO) aqS6S0100001_2.l0).LJII();
        if (LJII2 != null && LJII2.isShowing() && (LJII = ((C126844yO) aqS6S0100001_2.l0).LJII()) != null) {
            LJII.LIZLLL(aqS6S0100001_2.f1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS6S0100001_2 aqS6S0100001_2) {
        ((C162776a9) aqS6S0100001_2.l0).LIZ(aqS6S0100001_2.f1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS6S0100001_2 aqS6S0100001_2) {
        ((C56K) aqS6S0100001_2.l0).element += aqS6S0100001_2.f1;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS6S0100001_2 aqS6S0100001_2) {
        ((C56K) aqS6S0100001_2.l0).element += aqS6S0100001_2.f1;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S0100001_2(C126844yO c126844yO, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c126844yO;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S0100001_2(C56K c56k, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c56k;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S0100001_2(C162776a9 c162776a9, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c162776a9;
        this.f1 = f;
    }
}
