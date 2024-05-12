package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.chatroom.model.interact._OptPairInfo_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _MGetUserLinkmicStatusResponse_LinkmicStatus_ProtoDecoder implements InterfaceC31105CIr<MGetUserLinkmicStatusResponse.LinkmicStatus> {
    public static MGetUserLinkmicStatusResponse.LinkmicStatus LIZIZ(Q9H q9h) {
        MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus = new MGetUserLinkmicStatusResponse.LinkmicStatus();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkmicStatus.playType = q9h.LJIIJ();
                        break;
                    case 2:
                        linkmicStatus.blockReason = q9h.LJIIJ();
                        break;
                    case 3:
                        linkmicStatus.linkerInfo = _LinkerInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        linkmicStatus.reserveInfo = _RivalExtraInfo_ReserveInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        linkmicStatus.detailBlockReason = q9h.LJIIJ();
                        break;
                    case 6:
                        linkmicStatus.optPairInfo = _OptPairInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkmicStatus;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MGetUserLinkmicStatusResponse.LinkmicStatus LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
