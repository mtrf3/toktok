package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* renamed from: X.K0u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC51024K0u implements DialogInterface.OnClickListener {
    public static final DialogInterfaceOnClickListenerC51024K0u LJLIL = new DialogInterfaceOnClickListenerC51024K0u();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
    }
}
