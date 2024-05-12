package q03;

import X.C29847BnX;
import X.C98T;
import X.CQQ;
import X.InterfaceC29964BpQ;
import android.view.View;

/* loaded from: classes6.dex */
public class IDaS200S0200000_5 extends C98T {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void LIZ$0(IDaS200S0200000_5 iDaS200S0200000_5, View view) {
        C29847BnX LJJJJJL;
        if (view != null && (LJJJJJL = ((InterfaceC29964BpQ) iDaS200S0200000_5.l0).LJJJJJL()) != null) {
            LJJJJJL.LIZ(view, (CQQ) iDaS200S0200000_5.l1);
        }
    }

    public static final void LIZ$1(IDaS200S0200000_5 iDaS200S0200000_5, View view) {
        C29847BnX LJJJJJL;
        if (view != null && (LJJJJJL = ((InterfaceC29964BpQ) iDaS200S0200000_5.l0).LJJJJJL()) != null) {
            LJJJJJL.LIZ(view, (CQQ) iDaS200S0200000_5.l1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS200S0200000_5(InterfaceC29964BpQ interfaceC29964BpQ, CQQ cqq, int i) {
        super(300L);
        this.$t = i;
        this.l0 = interfaceC29964BpQ;
        this.l1 = cqq;
    }
}
