package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.bytedance.android.livesdk.container.ui.HybridFragment;
import com.bytedance.android.livesdk.container.ui.PopupContainerFragment;

/* loaded from: classes6.dex */
public final class CNG implements DialogInterface.OnKeyListener {
    public final /* synthetic */ PopupContainerFragment LJLIL;

    public CNG(PopupContainerFragment popupContainerFragment) {
        this.LJLIL = popupContainerFragment;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        CNX cnx;
        CNX cnx2;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        if (!this.LJLIL.Dl().getDisableBackPress()) {
            HybridFragment hybridFragment = this.LJLIL.LJLJLLL;
            if (hybridFragment == null || (cnx = hybridFragment.LJLILLLLZI) == null || !cnx.LIZ()) {
                return false;
            }
            HybridFragment hybridFragment2 = this.LJLIL.LJLJLLL;
            if (hybridFragment2 != null && (cnx2 = hybridFragment2.LJLILLLLZI) != null) {
                cnx2.LIZLLL();
            }
        }
        return true;
    }
}
