package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _LiveGiftBoostCardRoomStatus_ProtoDecoder implements InterfaceC31105CIr<LiveGiftBoostCardRoomStatus> {
    public static LiveGiftBoostCardRoomStatus LIZIZ(Q9H q9h) {
        LiveGiftBoostCardRoomStatus liveGiftBoostCardRoomStatus = new LiveGiftBoostCardRoomStatus();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        liveGiftBoostCardRoomStatus.mIsBoosting = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        liveGiftBoostCardRoomStatus.mExpiredTime = q9h.LJIIJJI();
                        break;
                    case 3:
                        liveGiftBoostCardRoomStatus.mCardId = q9h.LJIIJJI();
                        break;
                    case 4:
                        liveGiftBoostCardRoomStatus.mCardIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        liveGiftBoostCardRoomStatus.mTaskId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        liveGiftBoostCardRoomStatus.mTaskSource = q9h.LJIIJ();
                        break;
                    case 7:
                        liveGiftBoostCardRoomStatus.mImagePath = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return liveGiftBoostCardRoomStatus;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveGiftBoostCardRoomStatus LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
