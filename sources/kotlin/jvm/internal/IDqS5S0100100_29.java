package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C34K;
import X.C76800UCe;
import X.EnumC91311ZsZ;
import X.InterfaceC88472Yns;
import X.InterfaceC91288ZsC;
import X.InterfaceC91289ZsD;

/* loaded from: classes22.dex */
public class IDqS5S0100100_29 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
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

    public static final Object invoke$0(IDqS5S0100100_29 iDqS5S0100100_29, Object obj) {
        InterfaceC91288ZsC it = (InterfaceC91288ZsC) obj;
        o.LJIIIZ(it, "it");
        C34K c34k = (C34K) iDqS5S0100100_29.l0;
        if (!c34k.element) {
            c34k.element = it.interceptSeek(iDqS5S0100100_29.j1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS5S0100100_29 iDqS5S0100100_29, Object obj) {
        InterfaceC91289ZsD it = (InterfaceC91289ZsD) obj;
        o.LJIIIZ(it, "it");
        it.onSeekStateChanged((EnumC91311ZsZ) iDqS5S0100100_29.l0, iDqS5S0100100_29.j1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS5S0100100_29(long j, C34K c34k, int i) {
        super(1);
        this.$t = i;
        this.l0 = c34k;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS5S0100100_29(EnumC91311ZsZ enumC91311ZsZ, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC91311ZsZ;
        this.j1 = j;
    }
}
