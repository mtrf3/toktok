package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes16.dex */
public final class _RoomPrivateInfo_ProtoDecoder implements InterfaceC31105CIr<RoomPrivateInfo> {
    @Override // X.InterfaceC31105CIr
    public final RoomPrivateInfo LIZ(Q9H q9h) {
        RoomPrivateInfo roomPrivateInfo = new RoomPrivateInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        roomPrivateInfo.isSandbox = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 2:
                        roomPrivateInfo.enterRegionMatch = _EnterRegionMatch_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        roomPrivateInfo.locale = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                    case 5:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 6:
                        roomPrivateInfo.tagSet = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        roomPrivateInfo.deprecated3 = Double.valueOf(Double.longBitsToDouble(q9h.LJIIIZ()));
                        break;
                    case 8:
                        roomPrivateInfo.deprecated4 = Double.valueOf(Double.longBitsToDouble(q9h.LJIIIZ()));
                        break;
                    case 9:
                        roomPrivateInfo.deprecated5 = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        roomPrivateInfo.laneenv = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        roomPrivateInfo.preRecorded = q9h.LJIIJ();
                        break;
                    case 12:
                        roomPrivateInfo.region = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        roomPrivateInfo.recommendLevel = Integer.valueOf(q9h.LJIIJ());
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return roomPrivateInfo;
            }
        }
    }
}
