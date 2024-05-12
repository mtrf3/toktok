package o3;

import X.AI8;
import X.AI9;
import X.APQ;
import X.AVN;
import X.C16120kC;
import X.C17720mm;
import X.C17760mq;
import X.C26231ARf;
import X.C29512Bi8;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDaS467S0100000_4 extends C16120kC {
    public final int $t;
    public Object l0;

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        switch (this.$t) {
            case 0:
                onInitializeAccessibilityNodeInfo$0(this, view, c17760mq);
                return;
            case 1:
                onInitializeAccessibilityNodeInfo$1(this, view, c17760mq);
                return;
            case 2:
                onInitializeAccessibilityNodeInfo$2(this, view, c17760mq);
                return;
            case 3:
                onInitializeAccessibilityNodeInfo$3(this, view, c17760mq);
                return;
            case 4:
                onInitializeAccessibilityNodeInfo$4(this, view, c17760mq);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, c17760mq);
                return;
        }
    }

    @Override // X.C16120kC
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        switch (this.$t) {
            case 1:
                return performAccessibilityAction$0(this, view, i, bundle);
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public IDaS467S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(IDaS467S0100000_4 iDaS467S0100000_4, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIJ(((APQ) iDaS467S0100000_4.l0).LIZ);
        info.LJIILJJIL(Button.class.getName());
        String str = ((APQ) iDaS467S0100000_4.l0).LIZIZ;
        if (str == null || str.length() == 0) {
            return;
        }
        info.LIZIZ(new C17720mm(16, ((APQ) iDaS467S0100000_4.l0).LIZIZ));
    }

    public static final void onInitializeAccessibilityNodeInfo$1(IDaS467S0100000_4 iDaS467S0100000_4, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIJ(((C26231ARf) iDaS467S0100000_4.l0).LJLIL.LJIIZILJ);
        if (((C26231ARf) iDaS467S0100000_4.l0).LJLLJ) {
            info.LJIILL(true);
            info.LIZIZ(new C17720mm(16, ((C26231ARf) iDaS467S0100000_4.l0).LJLIL.LJIILL));
        } else {
            info.LJIILL(false);
            info.LJII(C17720mm.LJI);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$2(IDaS467S0100000_4 iDaS467S0100000_4, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIJ(((AVN) iDaS467S0100000_4.l0).LJLJJI.getText());
        info.LJIILJJIL(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$3(IDaS467S0100000_4 iDaS467S0100000_4, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (((AI8) iDaS467S0100000_4.l0).LJLLLLLL != null) {
            info.LJIILJJIL(Button.class.getName());
        }
        AI9 accessory = ((AI8) iDaS467S0100000_4.l0).getAccessory();
        if (accessory != null) {
            ConstraintLayout cell_container = (ConstraintLayout) ((AI8) iDaS467S0100000_4.l0).LIZ(R.id.b86);
            o.LJIIIIZZ(cell_container, "cell_container");
            accessory.LJI(cell_container, info);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$4(IDaS467S0100000_4 iDaS467S0100000_4, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL(Button.class.getName());
        info.LJIJ(((C29512Bi8) iDaS467S0100000_4.l0).getContext().getResources().getString(R.string.k4_));
    }

    public static final boolean performAccessibilityAction$0(IDaS467S0100000_4 iDaS467S0100000_4, View host, int i, Bundle bundle) {
        o.LJIIIZ(host, "host");
        if (i == 16) {
            C26231ARf c26231ARf = (C26231ARf) iDaS467S0100000_4.l0;
            if (c26231ARf.LJLLJ) {
                c26231ARf.LIZIZ("a11y_click");
                return true;
            }
        }
        return super.performAccessibilityAction(host, i, bundle);
    }
}
