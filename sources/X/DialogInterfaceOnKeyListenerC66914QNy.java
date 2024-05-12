package X;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: X.QNy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class DialogInterfaceOnKeyListenerC66914QNy implements DialogInterface.OnKeyListener {
    public final /* synthetic */ DialogC66909QNt LJLIL;

    public DialogInterfaceOnKeyListenerC66914QNy(DialogC66909QNt dialogC66909QNt) {
        this.LJLIL = dialogC66909QNt;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (keyCode == 4 && action == 1) {
            if (this.LJLIL.LJLJJI.getVisibility() == 0) {
                this.LJLIL.LJZ = EnumC66913QNx.CLOSE_FB_SYSTEM;
                return false;
            }
            O5V o5v = this.LJLIL.LJLJI;
            if (o5v != null && o5v.canGoBack()) {
                this.LJLIL.LJLJI.goBack();
                return true;
            }
            this.LJLIL.LJZ = EnumC66913QNx.CLOSE_REASON_BACK;
            return false;
        }
        return false;
    }
}
