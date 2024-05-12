package o3;

import X.C16120kC;
import X.C17760mq;
import android.view.View;
import android.widget.Button;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDaS92S0000000_14 extends C16120kC {
    public final int $t;

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        switch (this.$t) {
            case 0:
                onInitializeAccessibilityNodeInfo$0(this, view, c17760mq);
                return;
            case 1:
                onInitializeAccessibilityNodeInfo$1(this, view, c17760mq);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, c17760mq);
                return;
        }
    }

    public IDaS92S0000000_14(int i) {
        this.$t = i;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(IDaS92S0000000_14 iDaS92S0000000_14, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$1(IDaS92S0000000_14 iDaS92S0000000_14, View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        if (c17760mq != null) {
            c17760mq.LJIILJJIL(Button.class.getName());
        }
    }
}
