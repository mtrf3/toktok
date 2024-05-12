package X;

import android.widget.PopupWindow;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;

/* loaded from: classes10.dex */
public final class LR2 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ LR1 LJLIL;

    public LR2(LR1 lr1) {
        this.LJLIL = lr1;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        LR1 lr1 = this.LJLIL;
        lr1.getClass();
        if (C54362LVe.LJIILJJIL(275) > 0 && ((FollowLiveBubbleConfig) lr1.LJIILJJIL.getValue()).expGroup == 3) {
            C54246LQs c54246LQs = new C54246LQs();
            c54246LQs.LJLIL = 3;
            C2U8.LIZ(c54246LQs);
        }
    }
}
