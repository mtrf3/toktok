package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C25859ACx;
import X.C30268BuK;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.android.live.toolbar.TBViewModel;

/* loaded from: classes6.dex */
public class AqS10S0010000_5 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public boolean z0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS10S0010000_5(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AqS10S0010000_5 aqS10S0010000_5, Object obj) {
        TBViewModel vm = (TBViewModel) obj;
        o.LJIIIZ(vm, "vm");
        vm.LJLJL.setValue(new C30268BuK(aqS10S0010000_5.z0, true));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS10S0010000_5 aqS10S0010000_5, Object obj) {
        C25859ACx it = (C25859ACx) obj;
        o.LJIIIZ(it, "it");
        return C25859ACx.LJIILJJIL(it, null, null, false, null, null, false, aqS10S0010000_5.z0, null, false, false, false, false, 8388095);
    }
}
