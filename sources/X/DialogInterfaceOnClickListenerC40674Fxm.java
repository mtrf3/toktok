package X;

import android.content.DialogInterface;
import com.ss.android.ShowDialogActivity;

/* renamed from: X.Fxm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC40674Fxm implements DialogInterface.OnClickListener {
    public final /* synthetic */ ShowDialogActivity LJLIL;

    public DialogInterfaceOnClickListenerC40674Fxm(ShowDialogActivity showDialogActivity) {
        this.LJLIL = showDialogActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.LJLIL.finish();
    }
}
