package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowWithReviewEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TPq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74602TPq implements C0K7 {
    public final /* synthetic */ MultiGuestV3GuestPresenter LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C74602TPq(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, String str, int i) {
        this.LJLIL = multiGuestV3GuestPresenter;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GuestDisconnectByWindowWithReviewEvent.class, new OSZ(this.LJLILLLLZI, Integer.valueOf(this.LJLJI)));
        }
        liveDialog.dismiss();
    }
}
