package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestApplyEvent;
import com.bytedance.android.live.liveinteract.multilive.guset.util.MultiLiveInviteeShareHelper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;

/* loaded from: classes14.dex */
public final class TXN implements UC6 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ MultiLiveInviteeShareHelper LIZIZ;

    @Override // X.UC6
    public final void LIZ(Layout layout) {
        if (layout == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSendRequest return as there isn't a layout for layoutId:");
            C31811Ce7.LJ(LIZ, this.LIZ, LIZ, "MultiLiveInviteeShareHelper");
        } else {
            MultiLiveInviteeShareHelper multiLiveInviteeShareHelper = this.LIZIZ;
            multiLiveInviteeShareHelper.getClass();
            C0NB.LIZIZ("MultiLiveInviteeShareHelper", "sendRequest");
            C75017TcL.LJIILJJIL("outside_liveroom");
            multiLiveInviteeShareHelper.LIZ.qv0(GuestApplyEvent.class, new TWR(-1, 0, 2, 0, 58));
            C73943T0h.LIZ().LIZIZ(new C29423Bgh());
        }
    }

    public TXN(String str, MultiLiveInviteeShareHelper multiLiveInviteeShareHelper) {
        this.LIZ = str;
        this.LIZIZ = multiLiveInviteeShareHelper;
    }
}
