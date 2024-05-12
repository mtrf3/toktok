package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UDI implements DialogInterface.OnKeyListener {
    public static final UDI LJLIL = new UDI();

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialog, int i, KeyEvent event) {
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(event, "event");
        if (i == 4) {
            if (event.getAction() == 1) {
                dialog.cancel();
            }
            return true;
        }
        return false;
    }
}
