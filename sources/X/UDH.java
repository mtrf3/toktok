package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UDH implements DialogInterface.OnClickListener {
    public static final UDH LJLIL = new UDH();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.cancel();
    }
}
