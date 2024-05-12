package X;

import android.content.DialogInterface;

/* renamed from: X.ARe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnDismissListenerC26230ARe implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterface.OnDismissListener LJLIL;
    public final /* synthetic */ C26231ARf LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public DialogInterfaceOnDismissListenerC26230ARe(DialogInterface.OnDismissListener onDismissListener, C26231ARf c26231ARf, int i) {
        this.LJLIL = onDismissListener;
        this.LJLILLLLZI = c26231ARf;
        this.LJLJI = i;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = this.LJLIL;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this.LJLILLLLZI);
        }
        AX9.LIZIZ.remove(Integer.valueOf(this.LJLJI));
    }
}
