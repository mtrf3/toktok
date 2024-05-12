package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U4I implements DialogInterface.OnClickListener {
    public static final U4I LJLIL = new U4I();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
    }
}
