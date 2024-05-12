package o3;

import X.C16120kC;
import X.C17760mq;
import X.C44384HbQ;
import android.view.View;
import android.widget.Button;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDaS90S0000000_4 extends C16120kC {
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

    public IDaS90S0000000_4(int i) {
        this.$t = i;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(IDaS90S0000000_4 iDaS90S0000000_4, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL(Button.class.getName());
        info.LJIJ(C44384HbQ.LJJZ(R.string.amh));
    }

    public static final void onInitializeAccessibilityNodeInfo$1(IDaS90S0000000_4 iDaS90S0000000_4, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIL(true);
    }

    public static final void onInitializeAccessibilityNodeInfo$2(IDaS90S0000000_4 iDaS90S0000000_4, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$3(IDaS90S0000000_4 iDaS90S0000000_4, View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        c17760mq.LJIILJJIL(Button.class.getName());
        c17760mq.LJIILL(true);
    }

    public static final void onInitializeAccessibilityNodeInfo$4(IDaS90S0000000_4 iDaS90S0000000_4, View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        c17760mq.LJJIFFI(Button.class.getName());
    }
}
