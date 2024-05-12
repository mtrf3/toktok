package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AAQ implements DialogInterface.OnKeyListener {
    public static final AAQ LJLIL = new AAQ();

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        if (4 == i) {
            event.getAction();
        }
        return false;
    }
}
