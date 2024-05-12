package X;

import android.widget.PopupWindow;
import com.bytedance.tux.tooltip.popup.TuxTooltipPopupWindow;

/* renamed from: X.Wci, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82684Wci implements PopupWindow.OnDismissListener {
    public final /* synthetic */ TuxTooltipPopupWindow LJLIL;

    public C82684Wci(TuxTooltipPopupWindow tuxTooltipPopupWindow) {
        this.LJLIL = tuxTooltipPopupWindow;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        InterfaceC82688Wcm interfaceC82688Wcm = this.LJLIL.LJLILLLLZI.LJJIFFI;
        if (interfaceC82688Wcm != null) {
            interfaceC82688Wcm.onDismiss();
        }
    }
}
