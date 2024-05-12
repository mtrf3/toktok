package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest.MultiLiveGuestUserInfoDialog;
import com.bytedance.android.livesdk.LiveDialogFragment;

/* loaded from: classes14.dex */
public final /* synthetic */ class TXP extends TBS implements InterfaceC88472Yns<DialogInterface.OnDismissListener, C76800UCe> {
    public TXP(MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog) {
        super(1, multiLiveGuestUserInfoDialog, MultiLiveGuestUserInfoDialog.class, "setOnDismissListener", "setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(DialogInterface.OnDismissListener onDismissListener) {
        ((LiveDialogFragment) this.receiver).setOnDismissListener(onDismissListener);
        return C76800UCe.LIZ;
    }
}
