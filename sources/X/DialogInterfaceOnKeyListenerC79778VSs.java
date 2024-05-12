package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.bytedance.ies.xelement.overlay.LynxOverlayView;
import kotlin.jvm.internal.o;

/* renamed from: X.VSs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class DialogInterfaceOnKeyListenerC79778VSs implements DialogInterface.OnKeyListener {
    public final /* synthetic */ LynxOverlayView LJLIL;

    public DialogInterfaceOnKeyListenerC79778VSs(LynxOverlayView lynxOverlayView) {
        this.LJLIL = lynxOverlayView;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent event) {
        if (i == 4) {
            o.LJFF(event, "event");
            if (event.getAction() == 0) {
                this.LJLIL.LJIL("onRequestClose");
                return true;
            }
        }
        return false;
    }
}
