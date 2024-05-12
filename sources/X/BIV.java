package X;

import Y.AfS54S0200000_5;
import android.view.ViewGroup;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BIV implements C0K7 {
    public final /* synthetic */ BIR LJLIL;
    public final /* synthetic */ C41071jL LJLILLLLZI;
    public final /* synthetic */ ViewGroup LJLJI;
    public final /* synthetic */ ViewGroup LJLJJI;
    public final /* synthetic */ ViewGroup LJLJJL;
    public final /* synthetic */ DataChannel LJLJJLL;
    public final /* synthetic */ Room LJLJL;
    public final /* synthetic */ String LJLJLJ;

    public BIV(BIR bir, C41071jL c41071jL, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, DataChannel dataChannel, Room room, String str) {
        this.LJLIL = bir;
        this.LJLILLLLZI = c41071jL;
        this.LJLJI = viewGroup;
        this.LJLJJI = viewGroup2;
        this.LJLJJL = viewGroup3;
        this.LJLJJLL = dataChannel;
        this.LJLJL = room;
        this.LJLJLJ = str;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        long j;
        liveDialog.dismiss();
        BIR bir = this.LJLIL;
        C41071jL c41071jL = this.LJLILLLLZI;
        ViewGroup viewGroup = this.LJLJI;
        ViewGroup viewGroup2 = this.LJLJJI;
        ViewGroup viewGroup3 = this.LJLJJL;
        DataChannel dataChannel = this.LJLJJLL;
        Room room = this.LJLJL;
        bir.getClass();
        C65814PsI.LIZ().getClass();
        RoomSwitchApi roomSwitchApi = (RoomSwitchApi) C65814PsI.LIZJ(RoomSwitchApi.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        C1EW.LIZ(roomSwitchApi.updateSwitch(j, 10, true)).LJJJLIIL(new BQI(room, c41071jL, bir, viewGroup, viewGroup2, viewGroup3, dataChannel), new AfS54S0200000_5(c41071jL, bir, 80));
        BIR bir2 = this.LJLIL;
        DataChannel dataChannel2 = this.LJLJJLL;
        String str = this.LJLJLJ;
        Room room2 = this.LJLJL;
        bir2.getClass();
        BIR.LJI(room2, dataChannel2, str, "open");
    }
}
