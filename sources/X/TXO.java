package X;

import android.app.Dialog;
import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;

/* loaded from: classes14.dex */
public final /* synthetic */ class TXO extends TBS implements InterfaceC88472Yns<DialogInterface.OnDismissListener, C76800UCe> {
    public TXO(LiveDialog liveDialog) {
        super(1, liveDialog, LiveDialog.class, "setOnDismissListener", "setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(DialogInterface.OnDismissListener onDismissListener) {
        ((Dialog) this.receiver).setOnDismissListener(onDismissListener);
        return C76800UCe.LIZ;
    }
}
