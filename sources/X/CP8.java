package X;

import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CP8 implements CPD {
    @Override // X.CPD
    public final boolean LIZ(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2, StackContext stackContext) {
        Long l;
        EnterRoomConfig.RoomsData roomsData;
        Long l2 = null;
        if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            l = Long.valueOf(roomsData.roomId);
        } else {
            l = null;
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig2.mRoomsData;
        if (roomsData2 != null) {
            l2 = Long.valueOf(roomsData2.roomId);
        }
        return o.LJ(l, l2);
    }
}
