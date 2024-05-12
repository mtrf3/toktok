package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.bytedance.android.livesdk.ui.framework.DialogLeaf;
import kotlin.jvm.internal.o;

/* renamed from: X.CtQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnKeyListenerC32760CtQ implements DialogInterface.OnKeyListener {
    public final /* synthetic */ DialogLeaf LJLIL;

    public DialogInterfaceOnKeyListenerC32760CtQ(DialogLeaf dialogLeaf) {
        this.LJLIL = dialogLeaf;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        if (4 == i && 1 == event.getAction()) {
            this.LJLIL.LJIIJ();
            return true;
        }
        return false;
    }
}
