package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;

/* loaded from: classes6.dex */
public final class B75 implements B7O {
    public final /* synthetic */ C28247B6t LIZ;
    public final /* synthetic */ Room LIZIZ;

    @Override // X.B7O
    public final void onCancel() {
    }

    @Override // X.B7O
    public final void LIZ() {
        C28247B6t c28247B6t = this.LIZ;
        Room room = this.LIZIZ;
        c28247B6t.getClass();
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        C28643BLz c28643BLz = B57.LIZ;
        roomsData.guestUser = c28643BLz.LIZ().mEnterRoomConfig.mRoomsData.guestUser;
        enterRoomConfig.mRoomsData.enterLiveSource = "";
        C28238B6k.LIZLLL(room, enterRoomConfig);
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        roomsData2.enterFromMerge = "live_detail";
        roomsData2.enterMethod = "guest_connection_distribution";
        c28643BLz.LIZJ(new EnterRoomLinkSession(enterRoomConfig));
        IHostWatch iHostWatch = (IHostWatch) CN1.LIZ(IHostWatch.class);
        if (iHostWatch != null) {
            iHostWatch.watchLive(c28247B6t.LIZ(), enterRoomConfig);
        }
    }

    public B75(C28247B6t c28247B6t, Room room) {
        this.LIZ = c28247B6t;
        this.LIZIZ = room;
    }
}
