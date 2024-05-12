package X;

import Y.AfS54S0200000_5;
import android.view.ViewGroup;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BIU implements C0K7 {
    public final /* synthetic */ BIR LJLIL;
    public final /* synthetic */ C41071jL LJLILLLLZI;
    public final /* synthetic */ C41071jL LJLJI;
    public final /* synthetic */ ViewGroup LJLJJI;
    public final /* synthetic */ DataChannel LJLJJL;
    public final /* synthetic */ Room LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public BIU(BIR bir, C41071jL c41071jL, C41071jL c41071jL2, ViewGroup viewGroup, DataChannel dataChannel, Room room, String str) {
        this.LJLIL = bir;
        this.LJLILLLLZI = c41071jL;
        this.LJLJI = c41071jL2;
        this.LJLJJI = viewGroup;
        this.LJLJJL = dataChannel;
        this.LJLJJLL = room;
        this.LJLJL = str;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        long j;
        liveDialog.dismiss();
        BIR bir = this.LJLIL;
        C41071jL c41071jL = this.LJLILLLLZI;
        C41071jL c41071jL2 = this.LJLJI;
        ViewGroup viewGroup = this.LJLJJI;
        DataChannel dataChannel = this.LJLJJL;
        Room room = this.LJLJJLL;
        bir.getClass();
        C65814PsI.LIZ().getClass();
        RoomSwitchApi roomSwitchApi = (RoomSwitchApi) C65814PsI.LIZJ(RoomSwitchApi.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        C1EW.LIZ(roomSwitchApi.updateSwitch(j, 11, true)).LJJJLIIL(new BIW(room, c41071jL, viewGroup, bir, dataChannel, c41071jL2), new AfS54S0200000_5(c41071jL2, bir, 81));
        BIR bir2 = this.LJLIL;
        DataChannel dataChannel2 = this.LJLJJL;
        String str = this.LJLJL;
        Room room2 = this.LJLJJLL;
        bir2.getClass();
        BIR.LJII(room2, dataChannel2, str, "continue");
    }
}
