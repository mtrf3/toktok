package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.PdpV2Fragment;

/* renamed from: X.RmR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogInterfaceOnKeyListenerC70547RmR implements DialogInterface.OnKeyListener {
    public final /* synthetic */ PdpV2Fragment LJLIL;

    public DialogInterfaceOnKeyListenerC70547RmR(PdpV2Fragment pdpV2Fragment) {
        this.LJLIL = pdpV2Fragment;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            this.LJLIL.onBackPressed();
        }
        return false;
    }
}
