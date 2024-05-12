package X;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: X.Ahi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnKeyListenerC26938Ahi implements DialogInterface.OnKeyListener {
    public final /* synthetic */ C26936Ahg LJLIL;

    public DialogInterfaceOnKeyListenerC26938Ahi(C26936Ahg c26936Ahg) {
        this.LJLIL = c26936Ahg;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent == null || keyEvent.getAction() != 1) {
            return false;
        }
        boolean booleanValue = this.LJLIL.LJLILLLLZI.LJLJLJ.invoke().booleanValue();
        if (!booleanValue && this.LJLIL.LJLIL.getChildFragmentManager().LJJJJLI().size() > 1) {
            this.LJLIL.LJLILLLLZI.Kv0(EnumC26931Ahb.POP);
            return true;
        }
        return booleanValue;
    }
}
