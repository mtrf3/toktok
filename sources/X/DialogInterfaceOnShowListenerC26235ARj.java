package X;

import android.content.DialogInterface;

/* renamed from: X.ARj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnShowListenerC26235ARj implements DialogInterface.OnShowListener {
    public final /* synthetic */ AbstractDialogInterfaceC26236ARk<AbstractC26238ARm<Object, ?>> LJLIL;

    public DialogInterfaceOnShowListenerC26235ARj(AbstractDialogInterfaceC26236ARk<AbstractC26238ARm<Object, ?>> abstractDialogInterfaceC26236ARk) {
        this.LJLIL = abstractDialogInterfaceC26236ARk;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        AbstractDialogInterfaceC26236ARk<AbstractC26238ARm<Object, ?>> abstractDialogInterfaceC26236ARk = this.LJLIL;
        abstractDialogInterfaceC26236ARk.LJLJJLL.onShow(abstractDialogInterfaceC26236ARk);
    }
}
