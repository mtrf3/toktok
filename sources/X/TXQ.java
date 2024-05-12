package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes14.dex */
public final /* synthetic */ class TXQ extends TBS implements InterfaceC88472Yns<DialogInterface.OnDismissListener, C76800UCe> {
    public TXQ(DialogC77438UaI dialogC77438UaI) {
        super(1, dialogC77438UaI, DialogC77438UaI.class, "setOnDismissListener", "setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(DialogInterface.OnDismissListener onDismissListener) {
        ((Dialog) this.receiver).setOnDismissListener(onDismissListener);
        return C76800UCe.LIZ;
    }
}
