package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;

/* renamed from: X.Jjl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49997Jjl implements InterfaceC78468Uqu {
    @Override // X.InterfaceC78468Uqu
    public final void LIZ(Aweme aweme, EnterRoomConfig enterRoomConfig) {
    }

    @Override // X.InterfaceC78468Uqu
    public final void LIZJ(EnterRoomConfig enterRoomConfig) {
    }

    @Override // X.InterfaceC78468Uqu
    public final void LIZIZ(Object obj, EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        if (logData != null && logData.search_result_id_v2 == null) {
            if (obj instanceof LiveRoomStruct) {
                logData.search_result_id_v2 = String.valueOf(((LiveRoomStruct) obj).id);
            }
            if ((obj instanceof Aweme) && (roomsData = enterRoomConfig.mRoomsData) != null) {
                enterRoomConfig.mLogData.search_result_id_v2 = String.valueOf(roomsData.roomId);
            }
            enterRoomConfig.mLogData.search_result_type = 2;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("log callback ");
            String str = enterRoomConfig.mLogData.search_result_id_v2;
            if (str == null) {
                str = "";
            }
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
        }
    }
}
