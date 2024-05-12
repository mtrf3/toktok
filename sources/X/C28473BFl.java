package X;

import Y.AfS17S0210000_5;
import Y.AfS9S0310000_5;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BFl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28473BFl implements C0K7 {
    public final /* synthetic */ BIR LJLIL;
    public final /* synthetic */ C41071jL LJLILLLLZI;
    public final /* synthetic */ Room LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ DataChannel LJLJJL;

    public C28473BFl(C41071jL c41071jL, BIR bir, Room room, DataChannel dataChannel, String str) {
        this.LJLIL = bir;
        this.LJLILLLLZI = c41071jL;
        this.LJLJI = room;
        this.LJLJJI = str;
        this.LJLJJL = dataChannel;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        Room room;
        long j;
        liveDialog.dismiss();
        BIR bir = this.LJLIL;
        C41071jL c41071jL = this.LJLILLLLZI;
        Room room2 = this.LJLJI;
        String str = this.LJLJJI;
        bir.getClass();
        DataChannel LIZJ = C30446BxC.LIZJ(C30446BxC.LIZ);
        Long l = null;
        if (LIZJ != null) {
            room = (Room) LIZJ.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_use_music_click");
        LIZ.LJIIZILJ();
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        }
        LIZ.LJIJJ(l, "anchor_id");
        LIZ.LJIJJ(str, "click_position");
        LIZ.LJIJJ("turn_on", "click_type");
        LIZ.LJJIIJZLJL();
        C65814PsI.LIZ().getClass();
        RoomSwitchApi roomSwitchApi = (RoomSwitchApi) C65814PsI.LIZJ(RoomSwitchApi.class);
        if (room2 != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        C1EW.LIZ(roomSwitchApi.updateSwitch(j, 12, true)).LJJJLIIL(new AfS9S0310000_5(room2, c41071jL, bir, 1), new AfS17S0210000_5(c41071jL, bir, 4));
        BIR bir2 = this.LJLIL;
        String str2 = this.LJLJJI;
        DataChannel dataChannel = this.LJLJJL;
        bir2.getClass();
        BIR.LJIIIIZZ(dataChannel, str2, true);
    }
}
