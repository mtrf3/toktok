package X;

import android.app.Dialog;
import android.content.DialogInterface;
import com.google.android.gms.cast.framework.media.TracksChooserDialogFragment;

/* renamed from: X.ZYx, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class DialogInterfaceOnClickListenerC90131ZYx implements DialogInterface.OnClickListener {
    public final /* synthetic */ TracksChooserDialogFragment LJLIL;

    public DialogInterfaceOnClickListenerC90131ZYx(TracksChooserDialogFragment tracksChooserDialogFragment) {
        this.LJLIL = tracksChooserDialogFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Dialog dialog = this.LJLIL.LJLJJL;
        if (dialog != null) {
            dialog.cancel();
            this.LJLIL.LJLJJL = null;
        }
    }
}
