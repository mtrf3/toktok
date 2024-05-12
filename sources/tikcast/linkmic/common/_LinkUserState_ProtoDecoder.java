package tikcast.linkmic.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._MicPositionData_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LinkUserState_ProtoDecoder implements InterfaceC31105CIr<LinkUserState> {
    public static LinkUserState LIZIZ(Q9H q9h) {
        LinkUserState linkUserState = new LinkUserState();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkUserState.user = _Player_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        linkUserState.linkmicId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        linkUserState.pos = _MicPositionData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        linkUserState.linkedTimeNano = q9h.LJIIJJI();
                        break;
                    case 5:
                        linkUserState.onlineUserState = q9h.LJIIJ();
                        break;
                    case 6:
                        linkUserState.audioMuted = q9h.LJIIJ();
                        break;
                    case 7:
                        linkUserState.videoMuted = q9h.LJIIJ();
                        break;
                    case 8:
                        linkUserState.rtcConnection = q9h.LJIIJ();
                        break;
                    case 9:
                        linkUserState.networkState = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkUserState;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkUserState LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
