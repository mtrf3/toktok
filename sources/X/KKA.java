package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KKA implements DialogInterface.OnClickListener {
    public static final KKA LJLIL = new KKA();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
    }
}
