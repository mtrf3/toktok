package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.bytedance.ies.xelement.overlay.ng.LynxOverlayViewNG;
import kotlin.jvm.internal.o;

/* renamed from: X.VSu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class DialogInterfaceOnKeyListenerC79780VSu implements DialogInterface.OnKeyListener {
    public final /* synthetic */ LynxOverlayViewNG LJLIL;

    public DialogInterfaceOnKeyListenerC79780VSu(LynxOverlayViewNG lynxOverlayViewNG) {
        this.LJLIL = lynxOverlayViewNG;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent event) {
        if (i == 4) {
            o.LJFF(event, "event");
            if (event.getAction() == 0) {
                LynxOverlayViewNG lynxOverlayViewNG = this.LJLIL;
                VNU lynxContext = lynxOverlayViewNG.mContext;
                o.LJFF(lynxContext, "lynxContext");
                lynxContext.LJLJJL.LIZIZ(new C49615Jdb(lynxOverlayViewNG.getSign(), "requestclose"));
                return true;
            }
        }
        return false;
    }
}
