package X;

import android.view.ViewGroup;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.dataChannel.BroadcastDisableSubOnlyTrialLiveEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BIW<T> implements InterfaceC64592gB {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ C41071jL LJLILLLLZI;
    public final /* synthetic */ ViewGroup LJLJI;
    public final /* synthetic */ BIR LJLJJI;
    public final /* synthetic */ DataChannel LJLJJL;
    public final /* synthetic */ C41071jL LJLJJLL;

    public BIW(Room room, C41071jL c41071jL, ViewGroup viewGroup, BIR bir, DataChannel dataChannel, C41071jL c41071jL2) {
        this.LJLIL = room;
        this.LJLILLLLZI = c41071jL;
        this.LJLJI = viewGroup;
        this.LJLJJI = bir;
        this.LJLJJL = dataChannel;
        this.LJLJJLL = c41071jL2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (((BaseResponse) obj).statusCode == 0) {
            Room room = this.LJLIL;
            if (room != null) {
                room.disablePreviewSubOnly = 1L;
            }
            C41071jL c41071jL = this.LJLILLLLZI;
            if (c41071jL != null) {
                c41071jL.setChecked(false);
            }
            C29306Beo.LJI(this.LJLJI);
            this.LJLJJI.LJIIJ(this.LJLILLLLZI, false, BIZ.LJLIL);
            DataChannel dataChannel = this.LJLJJL;
            if (dataChannel != null) {
                dataChannel.pv0(BroadcastDisableSubOnlyTrialLiveEvent.class);
                return;
            }
            return;
        }
        C41071jL c41071jL2 = this.LJLILLLLZI;
        if (c41071jL2 != null) {
            c41071jL2.setChecked(true);
        }
        this.LJLJJI.LJIIJJI(this.LJLJJLL, true, null);
        C30868C9o.LIZJ(R.string.mg2);
    }
}
