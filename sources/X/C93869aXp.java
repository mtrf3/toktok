package X;

import android.view.View;
import android.widget.PopupWindow;
import com.ugc.effectcreator.layer.LayerImpl;

/* renamed from: X.aXp, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93869aXp implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C94855anj LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    public C93869aXp(C94855anj c94855anj, View view) {
        this.LJLIL = c94855anj;
        this.LJLILLLLZI = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        LayerImpl LIZ = C93425aQf.LIZ();
        if (LIZ != null && !LIZ.getLayerDetailStatus()) {
            C94855anj c94855anj = this.LJLIL;
            if (!c94855anj.LJLLI) {
                c94855anj.LLIIIJ(false);
                this.LJLIL.LLFZ(false, null);
            }
        }
    }
}
