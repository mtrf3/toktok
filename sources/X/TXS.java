package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;

/* loaded from: classes14.dex */
public final class TXS implements C0K7 {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ MultiGuestV3GuestWidget LJLILLLLZI;

    public TXS(int i, MultiGuestV3GuestWidget multiGuestV3GuestWidget) {
        this.LJLIL = i;
        this.LJLILLLLZI = multiGuestV3GuestWidget;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        C75017TcL.LJIJ(this.LJLIL, "appeal");
        this.LJLILLLLZI.gotoAppealPage();
    }
}
