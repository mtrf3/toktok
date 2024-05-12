package o3;

import X.C16120kC;
import X.C17730mn;
import X.C17760mq;
import X.C86V;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDaS91S0000000_9 extends C16120kC {
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
            default:
                super.onInitializeAccessibilityNodeInfo(view, c17760mq);
                return;
        }
    }

    public IDaS91S0000000_9(int i) {
        this.$t = i;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(IDaS91S0000000_9 iDaS91S0000000_9, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$1(IDaS91S0000000_9 iDaS91S0000000_9, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJJIFFI(C86V.LJFF(R.string.b25));
    }

    public static final void onInitializeAccessibilityNodeInfo$2(IDaS91S0000000_9 iDaS91S0000000_9, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$3(IDaS91S0000000_9 iDaS91S0000000_9, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        int childCount = ((ViewGroup) host).getChildCount();
        if (childCount > 0) {
            info.LJIILLIIL(new C17730mn(AccessibilityNodeInfo.CollectionInfo.obtain(1, childCount, false)));
        }
    }
}
