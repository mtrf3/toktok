package X;

import android.widget.PopupWindow;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LR9 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ LR1 LJLIL;

    public LR9(LR1 lr1) {
        this.LJLIL = lr1;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        LR1 lr1 = this.LJLIL;
        lr1.LJIIJ = false;
        LRI lri = lr1.LJI;
        if (lri != null) {
            lri.onDismiss();
        } else {
            o.LJIJI("mNotificationCallback");
            throw null;
        }
    }
}
