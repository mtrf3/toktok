package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC80047VbH;
import X.InterfaceC88472Yns;

/* loaded from: classes15.dex */
public class AqS21S0000100_14 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS21S0000100_14(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AqS21S0000100_14 aqS21S0000100_14, Object obj) {
        InterfaceC80047VbH it = (InterfaceC80047VbH) obj;
        o.LJIIJ(it, "it");
        it.onPlaybackTimeChanged(aqS21S0000100_14.j0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS21S0000100_14 aqS21S0000100_14, Object obj) {
        InterfaceC80047VbH it = (InterfaceC80047VbH) obj;
        o.LJIIJ(it, "it");
        it.LJIIJJI(aqS21S0000100_14.j0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS21S0000100_14 aqS21S0000100_14, Object obj) {
        InterfaceC80047VbH it = (InterfaceC80047VbH) obj;
        o.LJIIJ(it, "it");
        it.onPlaybackTimeChanged(aqS21S0000100_14.j0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS21S0000100_14 aqS21S0000100_14, Object obj) {
        InterfaceC80047VbH it = (InterfaceC80047VbH) obj;
        o.LJIIJ(it, "it");
        it.LJIIJJI(aqS21S0000100_14.j0);
        return C76800UCe.LIZ;
    }
}
