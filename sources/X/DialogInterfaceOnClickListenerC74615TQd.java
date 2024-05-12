package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* renamed from: X.TQd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC74615TQd implements DialogInterface.OnClickListener {
    public static final DialogInterfaceOnClickListenerC74615TQd LJLIL = new DialogInterfaceOnClickListenerC74615TQd();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
    }
}
