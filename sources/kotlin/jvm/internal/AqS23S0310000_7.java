package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C41634GVq;
import X.C42897GsX;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.app.Activity;
import android.view.WindowManager;
import com.bytedance.tux.icon.TuxIconView;

/* loaded from: classes8.dex */
public class AqS23S0310000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AqS23S0310000_7 aqS23S0310000_7) {
        TuxIconView tuxIconView = ((C42897GsX) aqS23S0310000_7.l0).LJLJL;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
        if (!aqS23S0310000_7.z3) {
            ((InterfaceC88472Yns) aqS23S0310000_7.l1).invoke((TuxIconView) aqS23S0310000_7.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS23S0310000_7 aqS23S0310000_7) {
        C41634GVq c41634GVq = (C41634GVq) aqS23S0310000_7.l0;
        Activity activity = (Activity) aqS23S0310000_7.l1;
        WindowManager.LayoutParams layoutParams = c41634GVq.LJIIJ;
        c41634GVq.LIZ(activity, layoutParams.x, layoutParams.y, (InterfaceC88472Yns) aqS23S0310000_7.l2, true, aqS23S0310000_7.z3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS23S0310000_7(C41634GVq c41634GVq, C41634GVq c41634GVq2, Activity activity, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = c41634GVq;
        this.l1 = c41634GVq2;
        this.l2 = activity;
        this.z3 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS23S0310000_7(C42897GsX c42897GsX, boolean z, AqS111S0300000_7 aqS111S0300000_7, TuxIconView tuxIconView, int i) {
        super(0);
        this.$t = i;
        this.l0 = c42897GsX;
        this.z3 = z;
        this.l1 = aqS111S0300000_7;
        this.l2 = tuxIconView;
    }
}
