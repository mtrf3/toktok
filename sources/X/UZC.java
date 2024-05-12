package X;

import android.content.DialogInterface;

/* loaded from: classes14.dex */
public final class UZC implements DialogInterface.OnDismissListener {
    public static final UZC LJLIL = new UZC();

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = UZ1.LIZJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        UZ1.LIZJ = null;
    }
}
