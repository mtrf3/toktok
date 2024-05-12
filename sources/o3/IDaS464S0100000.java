package o3;

import X.C16120kC;
import X.C17760mq;
import X.InterfaceC025608e;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;

/* loaded from: classes.dex */
public class IDaS464S0100000 extends C16120kC {
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

    @Override // X.C16120kC
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        switch (this.$t) {
            case 1:
                return performAccessibilityAction$0(this, view, i, bundle);
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public IDaS464S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(IDaS464S0100000 iDaS464S0100000, View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        InterfaceC025608e interfaceC025608e = (InterfaceC025608e) iDaS464S0100000.l0;
        if (interfaceC025608e != null) {
            interfaceC025608e.LIZ(view, c17760mq);
        }
    }

    public static final void onInitializeAccessibilityNodeInfo$1(IDaS464S0100000 iDaS464S0100000, View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        if (((LiveBottomSheetDialog) iDaS464S0100000.l0).LJLJL) {
            c17760mq.LIZ(1048576);
            c17760mq.LJIJI(true);
        } else {
            c17760mq.LJIJI(false);
        }
    }

    public static final boolean performAccessibilityAction$0(IDaS464S0100000 iDaS464S0100000, View view, int i, Bundle bundle) {
        if (i == 1048576) {
            LiveBottomSheetDialog liveBottomSheetDialog = (LiveBottomSheetDialog) iDaS464S0100000.l0;
            if (liveBottomSheetDialog.LJLJL) {
                liveBottomSheetDialog.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
