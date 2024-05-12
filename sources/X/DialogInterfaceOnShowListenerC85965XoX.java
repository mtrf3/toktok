package X;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* renamed from: X.XoX, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class DialogInterfaceOnShowListenerC85965XoX implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (dialogInterface instanceof AlertDialog) {
            AlertDialog alertDialog = (AlertDialog) dialogInterface;
            alertDialog.getButton(-1).setTextColor(-16777216);
            alertDialog.getButton(-2).setTextColor(-16777216);
        }
    }
}
