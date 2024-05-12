package webcast.api.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _UserRequestParams_ProtoDecoder implements InterfaceC31105CIr<UserRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final UserRequestParams LIZ(Q9H q9h) {
        UserRequestParams userRequestParams = new UserRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        userRequestParams.targetUid = q9h.LJIIJJI();
                        break;
                    case 2:
                        userRequestParams.packedLevel = q9h.LJIIJJI();
                        break;
                    case 3:
                        userRequestParams.currentRoomId = q9h.LJIIJJI();
                        break;
                    case 4:
                        userRequestParams.requestFrom = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        userRequestParams.anchorId = q9h.LJIIJJI();
                        break;
                    case 6:
                        userRequestParams.secTargetUid = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        userRequestParams.secAnchorId = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        userRequestParams.isAnonymous = Q9J.LIZ(q9h);
                        break;
                    case 9:
                        userRequestParams.requestFromScene = q9h.LJIIJ();
                        break;
                    case 10:
                        userRequestParams.userRole = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        userRequestParams.needBlockStatus = Q9J.LIZ(q9h);
                        break;
                    case 12:
                        userRequestParams.needPreloadRoom = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return userRequestParams;
            }
        }
    }
}
