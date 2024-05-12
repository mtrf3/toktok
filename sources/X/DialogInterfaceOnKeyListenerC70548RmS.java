package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment;

/* renamed from: X.RmS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class DialogInterfaceOnKeyListenerC70548RmS implements DialogInterface.OnKeyListener {
    public final /* synthetic */ ECBaseSheetFragment LJLIL;

    public DialogInterfaceOnKeyListenerC70548RmS(ECBaseSheetFragment eCBaseSheetFragment) {
        this.LJLIL = eCBaseSheetFragment;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            return this.LJLIL.LJIIJ();
        }
        return false;
    }
}
