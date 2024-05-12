package X;

import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* loaded from: classes6.dex */
public final class CPA implements CPD {
    @Override // X.CPD
    public final boolean LIZ(EnterRoomConfig enterRoomConfig, EnterRoomConfig enterRoomConfig2, StackContext stackContext) {
        EnterRoomConfig.RoomsData roomsData;
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.mRoomsData) == null || roomsData.roomId <= 0) {
            return true;
        }
        return false;
    }
}
