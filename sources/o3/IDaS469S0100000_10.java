package o3;

import X.C16120kC;
import X.C17760mq;
import X.C60559Npj;
import X.C62490Ofm;
import X.C62491Ofn;
import X.C62680Oiq;
import X.C62681Oir;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDaS469S0100000_10 extends C16120kC {
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
            case 0:
                return performAccessibilityAction$0(this, view, i, bundle);
            case 1:
            case 2:
            default:
                return super.performAccessibilityAction(view, i, bundle);
            case 3:
                return performAccessibilityAction$1(this, view, i, bundle);
            case 4:
                return performAccessibilityAction$2(this, view, i, bundle);
        }
    }

    public IDaS469S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(IDaS469S0100000_10 iDaS469S0100000_10, View host, C17760mq info) {
        o.LJIIJ(host, "host");
        o.LJIIJ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (((C60559Npj) iDaS469S0100000_10.l0).LJFF()) {
            info.LIZ(1048576);
            info.LJIJI(true);
        } else {
            info.LJIJI(false);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$1(IDaS469S0100000_10 iDaS469S0100000_10, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIJ(((C62491Ofn) iDaS469S0100000_10.l0).LJLILLLLZI.getText());
        info.LJIILJJIL(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$2(IDaS469S0100000_10 iDaS469S0100000_10, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIJ(((C62490Ofm) iDaS469S0100000_10.l0).LJLILLLLZI.getText());
        info.LJIILJJIL(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$3(IDaS469S0100000_10 iDaS469S0100000_10, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (((C62680Oiq) iDaS469S0100000_10.l0).LJLIL) {
            info.LIZ(1048576);
            info.LJIJI(true);
        } else {
            info.LJIJI(false);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$4(IDaS469S0100000_10 iDaS469S0100000_10, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (((C62681Oir) iDaS469S0100000_10.l0).LJLIL) {
            info.LIZ(1048576);
            info.LJIJI(true);
        } else {
            info.LJIJI(false);
        }
    }

    public static final boolean performAccessibilityAction$0(IDaS469S0100000_10 iDaS469S0100000_10, View host, int i, Bundle args) {
        o.LJIIJ(host, "host");
        o.LJIIJ(args, "args");
        if (i == 1048576 && ((C60559Npj) iDaS469S0100000_10.l0).LJFF()) {
            ((C60559Npj) iDaS469S0100000_10.l0).LJI();
            return true;
        }
        return super.performAccessibilityAction(host, i, args);
    }

    public static final boolean performAccessibilityAction$1(IDaS469S0100000_10 iDaS469S0100000_10, View host, int i, Bundle bundle) {
        o.LJIIIZ(host, "host");
        if (i == 1048576 && ((C62680Oiq) iDaS469S0100000_10.l0).LJLIL) {
            return true;
        }
        return super.performAccessibilityAction(host, i, bundle);
    }

    public static final boolean performAccessibilityAction$2(IDaS469S0100000_10 iDaS469S0100000_10, View host, int i, Bundle bundle) {
        o.LJIIIZ(host, "host");
        if (i == 1048576 && ((C62681Oir) iDaS469S0100000_10.l0).LJLIL) {
            return true;
        }
        return super.performAccessibilityAction(host, i, bundle);
    }
}
