package X;

import android.content.DialogInterface;

/* renamed from: X.TyZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnDismissListenerC76395TyZ implements DialogInterface.OnDismissListener {
    public final /* synthetic */ boolean LJLIL;

    public DialogInterfaceOnDismissListenerC76395TyZ(boolean z) {
        this.LJLIL = z;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C76280Twi c76280Twi;
        if (this.LJLIL) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        if (c76280Twi.LJ() == EnumC76178Tv4.NORMAL) {
            c76280Twi.LJIIJ("not_send_invite", this.LJLIL);
        }
    }
}
