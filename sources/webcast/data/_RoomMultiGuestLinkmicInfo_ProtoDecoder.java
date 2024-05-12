package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _RoomMultiGuestLinkmicInfo_ProtoDecoder implements InterfaceC31105CIr<RoomMultiGuestLinkmicInfo> {
    public static RoomMultiGuestLinkmicInfo LIZIZ(Q9H q9h) {
        RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo = new RoomMultiGuestLinkmicInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            roomMultiGuestLinkmicInfo.linkmicRoomCreateAbParam = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        roomMultiGuestLinkmicInfo.multiGuestLinkmicInfo = _MultiGuestLinkmicInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    roomMultiGuestLinkmicInfo.packErrCode = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return roomMultiGuestLinkmicInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomMultiGuestLinkmicInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
