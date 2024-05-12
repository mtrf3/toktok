package X;

import android.content.DialogInterface;

/* renamed from: X.BJt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnDismissListenerC28585BJt implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ C72242sW LJLILLLLZI;

    public DialogInterfaceOnDismissListenerC28585BJt(C34K c34k, C72242sW c72242sW) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = c72242sW;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (this.LJLIL.element) {
            BZI LIZ = C28787BRn.LIZ("livesdk_opt_out_confirm_click");
            LIZ.LJIIZILJ();
            if (this.LJLILLLLZI.element == 1) {
                str = "cancel";
            } else {
                str = "confirm";
            }
            LIZ.LJIJJ(str, "click_type");
            LIZ.LJJIIJZLJL();
        }
        BKY.LIZIZ().LJ();
    }
}
