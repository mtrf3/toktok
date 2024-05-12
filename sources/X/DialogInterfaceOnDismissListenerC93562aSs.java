package X;

import android.content.DialogInterface;

/* renamed from: X.aSs, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class DialogInterfaceOnDismissListenerC93562aSs implements DialogInterface.OnDismissListener {
    public final /* synthetic */ InterfaceC93654aUM LJLIL;

    public DialogInterfaceOnDismissListenerC93562aSs(InterfaceC93654aUM interfaceC93654aUM) {
        this.LJLIL = interfaceC93654aUM;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        InterfaceC93654aUM interfaceC93654aUM = this.LJLIL;
        if (interfaceC93654aUM != null) {
            interfaceC93654aUM.LIZJ();
        }
    }
}
