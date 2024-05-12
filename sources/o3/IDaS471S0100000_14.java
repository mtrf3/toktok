package o3;

import X.C16120kC;
import X.C17760mq;
import X.C81556Vzc;
import X.C83230WlW;
import X.C85540Xhg;
import X.DialogC80574Vjm;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDaS471S0100000_14 extends C16120kC {
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
            case 5:
                onInitializeAccessibilityNodeInfo$5(this, view, c17760mq);
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
            default:
                return super.performAccessibilityAction(view, i, bundle);
            case 2:
                return performAccessibilityAction$1(this, view, i, bundle);
            case 3:
                return performAccessibilityAction$2(this, view, i, bundle);
        }
    }

    public IDaS471S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(IDaS471S0100000_14 iDaS471S0100000_14, View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        c17760mq.LIZ(1048576);
        c17760mq.LJIJI(true);
    }

    public static final void onInitializeAccessibilityNodeInfo$1(IDaS471S0100000_14 iDaS471S0100000_14, View host, C17760mq info) {
        String str;
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        Context context = ((PhoneLoginFragment) iDaS471S0100000_14.l0).getContext();
        if (context != null) {
            str = context.getString(R.string.a9v);
        } else {
            str = null;
        }
        info.LJJIFFI(str);
    }

    public static final void onInitializeAccessibilityNodeInfo$2(IDaS471S0100000_14 iDaS471S0100000_14, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (((C81556Vzc) iDaS471S0100000_14.l0).LJLLILLLL) {
            info.LIZ(1048576);
            info.LJIJI(true);
        } else {
            info.LJIJI(false);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$3(IDaS471S0100000_14 iDaS471S0100000_14, View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        if (((DialogC80574Vjm) iDaS471S0100000_14.l0).LJLJJI) {
            c17760mq.LIZ(1048576);
            c17760mq.LJIJI(true);
        } else {
            c17760mq.LJIJI(false);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$4(IDaS471S0100000_14 iDaS471S0100000_14, View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        if (c17760mq != null) {
            StringBuilder LIZ = X1D.LIZ();
            View itemView = ((C83230WlW) iDaS471S0100000_14.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            LIZ.append(itemView.getResources().getString(R.string.c58));
            TextView switchText = (TextView) ((C83230WlW) iDaS471S0100000_14.l0).LJLILLLLZI.getValue();
            o.LJIIIIZZ(switchText, "switchText");
            LIZ.append(switchText.getText());
            c17760mq.LJJIIJ(X1D.LIZIZ(LIZ));
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$5(IDaS471S0100000_14 iDaS471S0100000_14, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIJ(((C85540Xhg) iDaS471S0100000_14.l0).LJLJJI.getText());
        info.LJIILJJIL(Button.class.getName());
    }

    public static final boolean performAccessibilityAction$0(IDaS471S0100000_14 iDaS471S0100000_14, View view, int i, Bundle bundle) {
        if (i == 1048576) {
            ((BaseTransientBottomBar) iDaS471S0100000_14.l0).LIZ();
            return true;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    public static final boolean performAccessibilityAction$1(IDaS471S0100000_14 iDaS471S0100000_14, View host, int i, Bundle bundle) {
        o.LJIIIZ(host, "host");
        if (i == 1048576) {
            C81556Vzc c81556Vzc = (C81556Vzc) iDaS471S0100000_14.l0;
            if (c81556Vzc.LJLLILLLL) {
                c81556Vzc.LLJJ(false);
                return true;
            }
        }
        return super.performAccessibilityAction(host, i, bundle);
    }

    public static final boolean performAccessibilityAction$2(IDaS471S0100000_14 iDaS471S0100000_14, View view, int i, Bundle bundle) {
        if (i == 1048576) {
            DialogC80574Vjm dialogC80574Vjm = (DialogC80574Vjm) iDaS471S0100000_14.l0;
            if (dialogC80574Vjm.LJLJJI) {
                dialogC80574Vjm.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
