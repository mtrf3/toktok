package X;

import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.AoU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27358AoU implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C27355AoR<Object> LJLIL;

    public C27358AoU(C27355AoR<Object> c27355AoR) {
        this.LJLIL = c27355AoR;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        InterfaceC27359AoV<Object> interfaceC27359AoV;
        int i;
        WeakReference<InterfaceC27359AoV<Object>> weakReference = this.LJLIL.LJIIIZ;
        if (weakReference != null && (interfaceC27359AoV = weakReference.get()) != null) {
            List<C27356AoS<Object>> list = this.LJLIL.LJIIJ;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            interfaceC27359AoV.hg(i);
        }
    }
}
