package q03;

import X.C98T;
import X.InterfaceC65784Pro;
import android.view.View;

/* loaded from: classes3.dex */
public class IDaS482S0100000_2 extends C98T {
    public final int $t;
    public Object l0;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS482S0100000_2(InterfaceC65784Pro interfaceC65784Pro, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = interfaceC65784Pro;
    }

    public static final void LIZ$0(IDaS482S0100000_2 iDaS482S0100000_2, View view) {
        if (view != null) {
            ((InterfaceC65784Pro) iDaS482S0100000_2.l0).invoke();
        }
    }

    public static final void LIZ$1(IDaS482S0100000_2 iDaS482S0100000_2, View view) {
        if (view != null) {
            ((InterfaceC65784Pro) iDaS482S0100000_2.l0).invoke();
        }
    }
}
