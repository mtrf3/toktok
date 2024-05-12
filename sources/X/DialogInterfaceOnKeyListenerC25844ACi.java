package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import kotlin.jvm.internal.AqS154S0100000_4;

/* renamed from: X.ACi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnKeyListenerC25844ACi implements DialogInterface.OnKeyListener {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public int LJLILLLLZI;

    public DialogInterfaceOnKeyListenerC25844ACi(AqS154S0100000_4 aqS154S0100000_4) {
        this.LJLIL = aqS154S0100000_4;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Integer valueOf;
        if (i != 4 || keyEvent == null || (valueOf = Integer.valueOf(keyEvent.getAction())) == null) {
            return false;
        }
        if (valueOf.intValue() == 1) {
            int i2 = this.LJLILLLLZI - 1;
            this.LJLILLLLZI = i2;
            if (i2 >= 0) {
                this.LJLIL.invoke();
                return true;
            }
            this.LJLILLLLZI = 0;
            return false;
        }
        if (valueOf.intValue() != 0) {
            return false;
        }
        this.LJLILLLLZI++;
        return false;
    }
}
