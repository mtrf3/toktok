package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _AnchorLevelPermission_ProtoDecoder implements InterfaceC31105CIr<AnchorLevelPermission> {
    public static AnchorLevelPermission LIZIZ(Q9H q9h) {
        AnchorLevelPermission anchorLevelPermission = new AnchorLevelPermission();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        anchorLevelPermission.beauty = q9h.LJIIJ();
                        break;
                    case 2:
                        anchorLevelPermission.effects = q9h.LJIIJ();
                        break;
                    case 3:
                        anchorLevelPermission.share = q9h.LJIIJ();
                        break;
                    case 4:
                        anchorLevelPermission.moderatorSetting = q9h.LJIIJ();
                        break;
                    case 5:
                        anchorLevelPermission.commentSetting = q9h.LJIIJ();
                        break;
                    case 6:
                        anchorLevelPermission.flip = q9h.LJIIJ();
                        break;
                    case 7:
                        anchorLevelPermission.donationSticker = q9h.LJIIJ();
                        break;
                    case 8:
                        anchorLevelPermission.liveCenter = q9h.LJIIJ();
                        break;
                    case 9:
                        anchorLevelPermission.topic = q9h.LJIIJ();
                        break;
                    case 10:
                        anchorLevelPermission.voiceEffect = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        anchorLevelPermission.liveIntro = q9h.LJIIJ();
                        break;
                    case 12:
                        anchorLevelPermission.liveGoal = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        anchorLevelPermission.promote = q9h.LJIIJ();
                        break;
                    case 14:
                        anchorLevelPermission.poll = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorLevelPermission;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorLevelPermission LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
