package X;

import android.widget.PopupWindow;
import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;

/* loaded from: classes10.dex */
public final class LR3 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ LR0 LJLIL;

    public LR3(LR0 lr0) {
        this.LJLIL = lr0;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        LR0 lr0 = this.LJLIL;
        lr0.getClass();
        if (C54362LVe.LJIILJJIL(275) > 0 && ((FollowLiveBubbleConfig) lr0.LJJIZ.getValue()).expGroup == 3) {
            C54246LQs c54246LQs = new C54246LQs();
            c54246LQs.LJLIL = 3;
            C2U8.LIZ(c54246LQs);
        }
    }
}
