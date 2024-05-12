package X;

import android.content.DialogInterface;

/* loaded from: classes6.dex */
public final class BCF implements DialogInterface.OnClickListener {
    public static final BCF LJLIL = new BCF();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
