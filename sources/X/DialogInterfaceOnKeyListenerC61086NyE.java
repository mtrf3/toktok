package X;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: X.NyE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnKeyListenerC61086NyE implements DialogInterface.OnKeyListener {
    public static final DialogInterfaceOnKeyListenerC61086NyE LJLIL = new DialogInterfaceOnKeyListenerC61086NyE();

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4) {
            keyEvent.getAction();
        }
        return false;
    }
}
