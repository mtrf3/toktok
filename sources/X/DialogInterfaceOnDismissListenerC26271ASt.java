package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* renamed from: X.ASt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnDismissListenerC26271ASt implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C26270ASs LJLIL;
    public final /* synthetic */ AS3 LJLILLLLZI;
    public final /* synthetic */ InterfaceC62486Ofi LJLJI;

    public DialogInterfaceOnDismissListenerC26271ASt(AS3 as3, C26270ASs c26270ASs, InterfaceC62486Ofi interfaceC62486Ofi) {
        this.LJLIL = c26270ASs;
        this.LJLILLLLZI = as3;
        this.LJLJI = interfaceC62486Ofi;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Dialog dialog;
        if (this.LJLIL.LJLJI && (dialog = (Dialog) this.LJLILLLLZI) != null && dialog.getContext() != null) {
            C26270ASs c26270ASs = this.LJLIL;
            if (!c26270ASs.LJLJJI) {
                c26270ASs.LJLIL.extras.putBoolean("ignore_version", true);
                InterfaceC62486Ofi interfaceC62486Ofi = this.LJLJI;
                Context context = ((Dialog) this.LJLILLLLZI).getContext();
                o.LJIIIIZZ(context, "dialog.context");
                interfaceC62486Ofi.LIZLLL(context, this.LJLIL.LJLIL);
            }
        }
    }
}
