package X;

import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* loaded from: classes14.dex */
public final class TTY implements TYF {
    public final /* synthetic */ TTW LIZ;

    @Override // X.TYF
    public final void LIZ() {
        C74776TWi.LJII((Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class), this.LIZ.dataChannel, true);
        TTW ttw = this.LIZ;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) ttw.LJLJJI.LIZ(ttw, TTW.LJLJL[0]);
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJIJI("reply");
        }
        DataChannel dataChannel = this.LIZ.dataChannel;
        if (dataChannel != null) {
            TW6 tw6 = new TW6(1);
            tw6.LIZIZ = TXF.GO_LIVE;
            dataChannel.qv0(InteractStateChangeEvent.class, tw6);
        }
    }

    public TTY(TTW ttw) {
        this.LIZ = ttw;
    }
}
