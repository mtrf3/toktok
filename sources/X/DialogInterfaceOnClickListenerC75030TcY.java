package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* renamed from: X.TcY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC75030TcY implements DialogInterface.OnClickListener {
    public static final DialogInterfaceOnClickListenerC75030TcY LJLIL = new DialogInterfaceOnClickListenerC75030TcY();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
    }
}
