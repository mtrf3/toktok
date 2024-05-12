package X;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes11.dex */
public final class OOR extends C16120kC {
    public final /* synthetic */ OOS LIZ;

    public OOR(OOS oos) {
        this.LIZ = oos;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        if (this.LIZ.LJLJJL) {
            c17760mq.LIZ(1048576);
            c17760mq.LJIJI(true);
        } else {
            c17760mq.LJIJI(false);
        }
    }

    @Override // X.C16120kC
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            OOS oos = this.LIZ;
            if (oos.LJLJJL) {
                oos.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
