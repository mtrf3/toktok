package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C212988Xm;
import X.C34K;
import X.C3C8;
import X.C76800UCe;
import X.InterfaceC212978Xl;
import X.InterfaceC88472Yns;
import X.InterfaceC91288ZsC;

/* loaded from: classes22.dex */
public class IDqS14S0101000_29 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(IDqS14S0101000_29 iDqS14S0101000_29, Object obj) {
        InterfaceC91288ZsC it = (InterfaceC91288ZsC) obj;
        o.LJIIIZ(it, "it");
        C34K c34k = (C34K) iDqS14S0101000_29.l0;
        if (!c34k.element) {
            c34k.element = it.interceptSetStartPlayTime(iDqS14S0101000_29.i1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS14S0101000_29 iDqS14S0101000_29, Object newItem) {
        o.LJIIIZ(newItem, "newItem");
        C212988Xm c212988Xm = (C212988Xm) iDqS14S0101000_29.l0;
        int i = iDqS14S0101000_29.i1;
        InterfaceC212978Xl<R, ITEM> interfaceC212978Xl = c212988Xm.LIZIZ;
        if (interfaceC212978Xl != 0) {
            interfaceC212978Xl.LIZLLL(i, newItem);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS14S0101000_29(C34K c34k, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c34k;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS14S0101000_29(C212988Xm c212988Xm, C212988Xm<? extends C3C8, ? extends Object> c212988Xm2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c212988Xm;
        this.i1 = c212988Xm2;
    }
}
