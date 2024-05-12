package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestCreateChannelAdaptMicRoom;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes14.dex */
public class TX3 implements InterfaceC76620U5g {
    public final /* synthetic */ C75492Tk0 LJLIL;

    @Override // X.InterfaceC76620U5g
    public final void LLJILJIL(InterfaceC75441TjB interfaceC75441TjB) {
    }

    public TX3(C75492Tk0 c75492Tk0) {
        this.LJLIL = c75492Tk0;
    }

    @Override // X.InterfaceC76620U5g
    public final void LJJLIIIIJ(InterfaceC75441TjB interfaceC75441TjB, Long l) {
        boolean z;
        DataChannel dataChannel;
        MultiGuestDataHolder LIZ;
        if (interfaceC75441TjB.scene() == 4) {
            z = true;
        } else {
            z = false;
        }
        C75492Tk0 c75492Tk0 = this.LJLIL;
        if (!c75492Tk0.LJLJJL) {
            if (z && (LIZ = TRK.LIZ()) != null) {
                LIZ.LJIIJJI();
                return;
            }
            return;
        }
        if (!z || (dataChannel = c75492Tk0.dataChannel) == null || !CL8.LJ(dataChannel) || l == null || l.longValue() != 10002) {
            return;
        }
        this.LJLIL.dataChannel.pv0(MultiGuestCreateChannelAdaptMicRoom.class);
    }
}
