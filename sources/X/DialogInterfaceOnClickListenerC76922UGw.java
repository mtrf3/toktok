package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* renamed from: X.UGw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC76922UGw implements DialogInterface.OnClickListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ UI8 LJLILLLLZI;

    public DialogInterfaceOnClickListenerC76922UGw(int i, UI8 ui8) {
        this.LJLIL = i;
        this.LJLILLLLZI = ui8;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        C77541Ubx.LJIILL(this.LJLIL, this.LJLILLLLZI, true, false);
        dialog.dismiss();
    }
}
