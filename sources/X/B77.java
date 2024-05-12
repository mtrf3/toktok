package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* loaded from: classes6.dex */
public final class B77 implements InterfaceC75158Tec {
    public final /* synthetic */ LiveRoomUserInfoWidget LJLIL;

    @Override // X.InterfaceC75158Tec
    public final void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
    }

    public B77(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.LJLIL = liveRoomUserInfoWidget;
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        Long l;
        EnterRoomConfig.RoomsData roomsData;
        Room room = this.LJLIL.LLILIL;
        long LIZ = B76.LIZ();
        if (LIZ > 0 && room != null) {
            long currentTimeMillis = System.currentTimeMillis() - LIZ;
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_real_avatar_load_duration");
            LIZ2.LJIJJ(Long.valueOf(room.getId()), "room_id");
            InterfaceC05190Ih author = room.author();
            String str2 = null;
            if (author != null) {
                l = Long.valueOf(author.getId());
            } else {
                l = null;
            }
            LIZ2.LJIJJ(l, "anchor_id");
            LIZ2.LJIJJ(BJM.LJFF(), "enter_from_merge");
            LIZ2.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
            EnterRoomConfig enterRoomConfig = B76.LIZ;
            if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                str2 = roomsData.enterType;
            }
            LIZ2.LJIJJ(str2, "action_type");
            LIZ2.LJIJJ(B76.LIZIZ(), "room_type");
            LIZ2.LJIJJ(Long.valueOf(currentTimeMillis), "duration_icon");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJJIIJZLJL();
            } else {
                LIZ2.LJJIJ();
                LIZ2.LJJIIZI();
            }
        }
    }
}
