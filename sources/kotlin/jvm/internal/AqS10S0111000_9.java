package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C47261Igj;
import X.C76800UCe;
import X.C78613UtF;
import X.InterfaceC65784Pro;
import X.LTN;
import X.UPK;
import X.XKX;
import androidx.lifecycle.LifecycleOwnerKt;

/* loaded from: classes10.dex */
public class AqS10S0111000_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS10S0111000_9 aqS10S0111000_9) {
        ((UPK) aqS10S0111000_9.l0).LIZJ(aqS10S0111000_9.i2);
        ((UPK) aqS10S0111000_9.l0).LJIILL(C47261Igj.LJJIJ(Integer.valueOf(aqS10S0111000_9.i2)), aqS10S0111000_9.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS10S0111000_9 aqS10S0111000_9) {
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(((UPK) aqS10S0111000_9.l0).LIZ), C78613UtF.LIZJ, null, new LTN(null), 2);
        ((UPK) aqS10S0111000_9.l0).LJIILL(C47261Igj.LJJIJIIJI(Integer.valueOf(aqS10S0111000_9.i2), 1), aqS10S0111000_9.z1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS10S0111000_9 aqS10S0111000_9) {
        ((UPK) aqS10S0111000_9.l0).LJIILL(C47261Igj.LJJIJ(Integer.valueOf(aqS10S0111000_9.i2)), aqS10S0111000_9.z1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS10S0111000_9(UPK upk, int i, boolean z, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = upk;
        this.i2 = i;
        this.z1 = z;
    }
}
