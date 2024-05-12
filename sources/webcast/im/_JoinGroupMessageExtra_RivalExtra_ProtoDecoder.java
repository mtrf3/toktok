package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TopHostInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Hashtag_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import webcast.im.JoinGroupMessageExtra;

/* loaded from: classes14.dex */
public final class _JoinGroupMessageExtra_RivalExtra_ProtoDecoder implements InterfaceC31105CIr<JoinGroupMessageExtra.RivalExtra> {
    public static JoinGroupMessageExtra.RivalExtra LIZIZ(Q9H q9h) {
        JoinGroupMessageExtra.RivalExtra rivalExtra = new JoinGroupMessageExtra.RivalExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 4:
                        rivalExtra.userCount = q9h.LJIIJJI();
                        break;
                    case 5:
                        rivalExtra.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        rivalExtra.displayId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        rivalExtra.authenticationInfo = _JoinGroupMessageExtra_RivalExtra_AuthenticationInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        rivalExtra.nickname = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        rivalExtra.followStatus = q9h.LJIIJJI();
                        break;
                    case 10:
                        rivalExtra.hashtag = _Hashtag_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rivalExtra.topHostInfo = _TopHostInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        rivalExtra.userId = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rivalExtra.isBestTeammate = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rivalExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final JoinGroupMessageExtra.RivalExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
