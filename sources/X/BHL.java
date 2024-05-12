package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BHL implements DialogInterface.OnClickListener {
    public static final BHL LJLIL = new BHL();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
    }
}
