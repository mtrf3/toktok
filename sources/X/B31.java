package X;

import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;

/* loaded from: classes6.dex */
public final class B31 implements B3W {
    public final /* synthetic */ LivePlayFragment LIZ;

    public B31(LivePlayFragment livePlayFragment) {
        this.LIZ = livePlayFragment;
    }

    @Override // X.B3W
    public final void LIZIZ(Room room) {
        B3K b3k;
        boolean z;
        this.LIZ.Sl().LIZIZ("after_info_by_user");
        EnterRoomConfig enterRoomConfig = this.LIZ.LLLZL;
        if (enterRoomConfig != null) {
            enterRoomConfig.mRoomsData.enterRoomId = room.getId();
            EnterRoomConfig.RoomsData roomsData = this.LIZ.LLLZL.mRoomsData;
            if (((IMicRoomService) CN1.LIZ(IMicRoomService.class)).jT(room) && room.getOfficialChannelInfo() != null && room.getOfficialChannelInfo().backupRoomId == room.getId()) {
                z = true;
            } else {
                z = false;
            }
            roomsData.curIsMicRoomFromOfficial = z;
            EnterRoomConfig.RoomsData roomsData2 = this.LIZ.LLLZL.mRoomsData;
            long j = roomsData2.enterRoomId;
            long j2 = roomsData2.enterUserId;
            BM1.LIZLLL = j;
            BM1.LJ = j2;
            BM1.LIZLLL(roomsData2.enterMethod, roomsData2.enterFromMerge);
            C28668BMy.LJ();
        }
        long id = room.getId();
        LivePlayFragment livePlayFragment = this.LIZ;
        long j3 = livePlayFragment.LLLZL.mStreamData.streamRoomId;
        if (id != j3 && j3 != -1 && (b3k = livePlayFragment.LLLLZI) != null) {
            b3k.LJIIIIZZ = true;
        }
        if (livePlayFragment.In(false, room)) {
            this.LIZ.Km(false);
        }
    }

    @Override // X.B3W
    public final void LIZ(int i, String str) {
        int i2;
        this.LIZ.Sl().LIZIZ("info_by_user_failed");
        if (i != 30003 && i != 30001) {
            if (i != 0) {
                i2 = i;
            } else {
                i2 = 103;
            }
            LivePlayFragment livePlayFragment = this.LIZ;
            livePlayFragment.LLLLLLL.LJIIJ(i2, str, livePlayFragment.LLJJIJIIJIL, livePlayFragment.LJLIL, livePlayFragment.LJLJL);
            LivePlayFragment livePlayFragment2 = this.LIZ;
            livePlayFragment2.Hl(i2, livePlayFragment2.LJLIL, str);
        }
        LivePlayFragment livePlayFragment3 = this.LIZ;
        long j = livePlayFragment3.LJLIL;
        if (j != 0) {
            livePlayFragment3.sn(j, false);
            return;
        }
        livePlayFragment3.qm(203L, i, "fetch room by userId failure");
        Event event = new Event("live_play_end_room_fetch_fail", 1026, EnumC28203B5b.ServerApiCall);
        event.LIZIZ("fetch room by userId failure");
        B57.LIZ.LIZ().LIZIZ(event);
        B5S.LIZLLL(this.LIZ.LLLZL, B5T.USER_FETCH_FAILED, "slide_next_room");
        this.LIZ.Ml(B5U.FETCH_FAILED);
        if (i != 30003) {
            BZI LIZ = C28787BRn.LIZ("rd_info_by_user_failed");
            LIZ.LJIILLIIL(this.LIZ.LLLIIL);
            LIZ.LJJIIJZLJL();
        } else {
            BZI LIZ2 = C28787BRn.LIZ("rd_enter_room_live_end");
            LIZ2.LJIILLIIL(this.LIZ.LLLIIL);
            LIZ2.LJJIIJZLJL();
        }
    }
}
