package X;

import android.content.DialogInterface;

/* loaded from: classes8.dex */
public final class GJV implements DialogInterface.OnClickListener {
    public static final GJV LJLIL = new GJV();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
