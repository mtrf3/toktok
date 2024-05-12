package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BmV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29783BmV {
    public final InterfaceC30182Bsw LIZ;

    public C29783BmV(Fragment fragment, DataChannel dataChannel, InterfaceC30182Bsw mGestureDetectLayout) {
        Room room;
        boolean z;
        boolean z2;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(mGestureDetectLayout, "mGestureDetectLayout");
        this.LIZ = mGestureDetectLayout;
        if (LiveLikeDegradeSettings.INSTANCE.disableSelfLike(dataChannel) || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            return;
        }
        Boolean bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Object kv0 = dataChannel.kv0(BCW.class);
        o.LJI(kv0);
        boolean booleanValue = ((Boolean) kv0).booleanValue();
        if (z || (!((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk() && !((IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class)).lj())) {
            z2 = true;
        } else {
            z2 = false;
        }
        IBarrageService iBarrageService = (IBarrageService) CN1.LIZ(IBarrageService.class);
        iBarrageService.N60(fragment.mo49getActivity(), fragment, room, new C29785BmX(this), booleanValue, z2, dataChannel);
        InterfaceC29980Bpg hq0 = iBarrageService.hq0(room.getId());
        if (hq0 == null) {
            return;
        }
        hq0.LJ(new C29784BmW());
    }
}
