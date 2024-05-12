package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C94613ajp;
import X.C94855anj;
import X.EnumC93620aTo;
import X.InterfaceC65784Pro;

/* loaded from: classes34.dex */
public class IDqS21S0101000_42 extends AbstractC65781Prl implements InterfaceC65784Pro {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS21S0101000_42 iDqS21S0101000_42) {
        super/*android.view.ViewGroup*/.setVisibility(iDqS21S0101000_42.i1);
        C94613ajp c94613ajp = (C94613ajp) iDqS21S0101000_42.l0;
        c94613ajp.LLLFF = null;
        c94613ajp.LLLF = EnumC93620aTo.Dead;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS21S0101000_42 iDqS21S0101000_42) {
        ((C94855anj) iDqS21S0101000_42.l0).notifyItemChanged(iDqS21S0101000_42.i1, "tipsPayload");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS21S0101000_42(C94613ajp c94613ajp, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c94613ajp;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS21S0101000_42(C94855anj c94855anj, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c94855anj;
        this.i1 = i;
    }
}
