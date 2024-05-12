package X;

import android.widget.PopupWindow;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class LRW implements PopupWindow.OnDismissListener {
    public final /* synthetic */ LRV LJLIL;

    public LRW(LRV lrv) {
        this.LJLIL = lrv;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        Iterator<PopupWindow.OnDismissListener> it = this.LJLIL.LJIIZILJ.iterator();
        while (it.hasNext()) {
            it.next().onDismiss();
        }
    }
}
