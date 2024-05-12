package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B7D implements DialogInterface.OnClickListener {
    public static final B7D LJLIL = new B7D();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
    }
}
