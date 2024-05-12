package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BgS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29408BgS implements InterfaceC29409BgT {
    @Override // X.InterfaceC29409BgT
    public final boolean LJIIIZ() {
        MultiLiveAnchorPanelSettings LJI = TV2.LJI();
        if (LJI == null || LJI.allowViewerReq != 4 || !TV2.LJIIJJI()) {
            return false;
        }
        C30868C9o.LIZJ(R.string.kgx);
        return true;
    }

    public C29408BgS(DataChannel dataChannel) {
    }
}
