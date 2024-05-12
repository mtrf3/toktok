package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.BkW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnKeyListenerC29660BkW implements DialogInterface.OnKeyListener {
    public static final DialogInterfaceOnKeyListenerC29660BkW LJLIL = new DialogInterfaceOnKeyListenerC29660BkW();

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        return 4 == i;
    }
}
