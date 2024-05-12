package X;

import Y.IDCListenerS49S0200000_5;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.LiveEventEnableChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BH7 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(RoomCreateInfo roomCreateInfo) {
        o.LJIIIZ(roomCreateInfo, "roomCreateInfo");
        String str = roomCreateInfo.mLiveEventInfo.title;
        o.LJIIIIZZ(str, "roomCreateInfo.mLiveEventInfo.title");
        if (str.length() <= 0 || roomCreateInfo.mLiveEventInfo.id <= 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        Boolean bool = (Boolean) dataChannel.kv0(LiveEventEnableChannel.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static void LIZJ(DataChannel dataChannel, String str) {
        Long l;
        User owner;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_event_end_early");
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "room_id");
        LIZ2.LJIJJ(DataChannelGlobal.LJLJJI.mv0(C29026BaI.class), "live_event_id");
        Room room2 = (Room) dataChannel.kv0(RoomChannel.class);
        if (room2 != null && (owner = room2.getOwner()) != null) {
            l2 = Long.valueOf(owner.getId());
        }
        LIZ2.LJIJJ(l2, "anchor_id");
        LIZ2.LJIJJ(str, "action_type");
        LIZ2.LJJIIJZLJL();
    }

    public static boolean LIZLLL(Context context, DataChannel dataChannel, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC65784Pro interfaceC65784Pro) {
        long j;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Long l = (Long) dataChannelGlobal.mv0(C29042BaY.class);
        long j2 = -1;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        if (j > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Long l2 = (Long) dataChannelGlobal.mv0(C29042BaY.class);
            if (l2 != null) {
                j2 = l2.longValue();
            }
            if (elapsedRealtime < j2 + 600000) {
                LIZJ(dataChannel, "show");
                C77437UaH c77437UaH = new C77437UaH(context);
                c77437UaH.LJI(R.string.ka0);
                c77437UaH.LIZIZ(R.string.mgo);
                c77437UaH.LJ(R.string.ka2, new IDCListenerS49S0200000_5(interfaceC88472Yns, dataChannel, 5), false);
                c77437UaH.LIZJ(R.string.ka1, new IDCListenerS49S0200000_5(interfaceC88471Ynr, dataChannel, 6), false);
                DialogC77438UaI LIZ2 = c77437UaH.LIZ();
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "-9189106457180983599")).LIZ) {
                    LIZ2.show();
                }
                interfaceC65784Pro.invoke();
                return true;
            }
        }
        return false;
    }
}
