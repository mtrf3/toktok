package X;

import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B76 {
    public static EnterRoomConfig LIZ;

    public static long LIZ() {
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.TimeStamp timeStamp;
        EnterRoomLinkSession LIZ2 = B57.LIZ.LIZ();
        if (LIZ2 != null && (enterRoomConfig = LIZ2.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null && (timeStamp = roomsData.timeStamps) != null) {
            return timeStamp.enterRoomStarTimeReal;
        }
        return -1L;
    }

    public static String LIZIZ() {
        Boolean bool;
        IProgrammedLiveService iProgrammedLiveService = (IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class);
        Boolean bool2 = null;
        if (iProgrammedLiveService != null) {
            bool = Boolean.valueOf(iProgrammedLiveService.lj());
        } else {
            bool = null;
        }
        IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        if (iMicRoomService != null) {
            bool2 = Boolean.valueOf(iMicRoomService.rk());
        }
        Boolean bool3 = Boolean.TRUE;
        if (o.LJ(bool, bool3)) {
            return "programmedlive";
        }
        if (o.LJ(bool2, bool3)) {
            return "lineup";
        }
        return "normal";
    }

    public static final void LIZJ(Room room, String str) {
        Long l;
        EnterRoomConfig.RoomsData roomsData;
        long LIZ2 = LIZ();
        if (LIZ2 > 0 && room != null) {
            long currentTimeMillis = System.currentTimeMillis() - LIZ2;
            BZI LIZ3 = C28787BRn.LIZ("livesdk_live_frame_load_duration");
            LIZ3.LJIJJ(Long.valueOf(room.getId()), "room_id");
            InterfaceC05190Ih author = room.author();
            String str2 = null;
            if (author != null) {
                l = Long.valueOf(author.getId());
            } else {
                l = null;
            }
            LIZ3.LJIJJ(l, "anchor_id");
            LIZ3.LJIJJ(BJM.LJFF(), "enter_from_merge");
            LIZ3.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
            EnterRoomConfig enterRoomConfig = LIZ;
            if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                str2 = roomsData.enterType;
            }
            LIZ3.LJIJJ(str2, "action_type");
            LIZ3.LJIJJ(LIZIZ(), "room_type");
            C06530Nl.LIZLLL(LIZ3, str, "icon_type", currentTimeMillis, "duration_icon");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ3.LJIILL())) {
                LIZ3.LJJIIJZLJL();
            } else {
                LIZ3.LJJIJ();
                LIZ3.LJJIIZI();
            }
        }
    }

    public static final void LIZLLL(String str, Room room, Long l) {
        Long l2;
        EnterRoomConfig.RoomsData roomsData;
        long LIZ2 = LIZ();
        if (LIZ2 > 0 && l != null && room != null) {
            long currentTimeMillis = System.currentTimeMillis() - LIZ2;
            BZI LIZ3 = C28787BRn.LIZ("livesdk_live_frame_load_duration");
            LIZ3.LJIJJ(Long.valueOf(room.getId()), "room_id");
            InterfaceC05190Ih author = room.author();
            String str2 = null;
            if (author != null) {
                l2 = Long.valueOf(author.getId());
            } else {
                l2 = null;
            }
            LIZ3.LJIJJ(l2, "anchor_id");
            LIZ3.LJIJJ(BJM.LJFF(), "enter_from_merge");
            LIZ3.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
            EnterRoomConfig enterRoomConfig = LIZ;
            if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                str2 = roomsData.enterType;
            }
            LIZ3.LJIJJ(str2, "action_type");
            LIZ3.LJIJJ(LIZIZ(), "room_type");
            LIZ3.LJIJJ(str, "icon_type");
            LIZ3.LJIJJ(Long.valueOf(currentTimeMillis), "duration_icon");
            LIZ3.LJIJJ(Long.valueOf(l.longValue() - LIZ2), "duration_icon");
            LIZ3.LJIJJ(Long.valueOf(System.currentTimeMillis() - LIZ2), "duration_action");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ3.LJIILL())) {
                LIZ3.LJJIIJZLJL();
            } else {
                LIZ3.LJJIJ();
                LIZ3.LJJIIZI();
            }
        }
    }
}
