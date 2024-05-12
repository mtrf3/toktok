package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GJU implements DialogInterface.OnClickListener {
    public static final GJU LJLIL = new GJU();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
    }
}
