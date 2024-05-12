package o3;

import X.C16120kC;
import X.C17760mq;
import X.ViewOnClickListenerC1556568z;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDaS466S0100000_2 extends C16120kC {
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
            default:
                super.onInitializeAccessibilityNodeInfo(view, c17760mq);
                return;
        }
    }

    public IDaS466S0100000_2(ViewOnClickListenerC1556568z viewOnClickListenerC1556568z, int i) {
        this.$t = i;
        this.l0 = viewOnClickListenerC1556568z;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(IDaS466S0100000_2 iDaS466S0100000_2, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIJ(((ViewOnClickListenerC1556568z) iDaS466S0100000_2.l0).LLF);
    }

    public static final void onInitializeAccessibilityNodeInfo$1(IDaS466S0100000_2 iDaS466S0100000_2, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIJ(((ViewOnClickListenerC1556568z) iDaS466S0100000_2.l0).LLI);
    }
}
