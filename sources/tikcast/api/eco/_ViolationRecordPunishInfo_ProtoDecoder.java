package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _ViolationRecordPunishInfo_ProtoDecoder implements InterfaceC31105CIr<ViolationRecordPunishInfo> {
    public static ViolationRecordPunishInfo LIZIZ(Q9H q9h) {
        ViolationRecordPunishInfo violationRecordPunishInfo = new ViolationRecordPunishInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        violationRecordPunishInfo.punishTitle = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        violationRecordPunishInfo.punishReason = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        violationRecordPunishInfo.punishStartTime = q9h.LJIIJJI();
                        break;
                    case 4:
                        violationRecordPunishInfo.punishEndTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        violationRecordPunishInfo.isPermanentPunish = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        violationRecordPunishInfo.detailUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        violationRecordPunishInfo.punishEndTimeType = q9h.LJIIJ();
                        break;
                    case 8:
                        violationRecordPunishInfo.guideLinkUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        violationRecordPunishInfo.moderationInfo = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        violationRecordPunishInfo.punishRecordId = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        violationRecordPunishInfo.guideLinkCanFeedback = Q9J.LIZ(q9h);
                        break;
                    case 12:
                        violationRecordPunishInfo.guideLinkHasFeedback = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        violationRecordPunishInfo.guideLinkEduId = q9h.LJIIJJI();
                        break;
                    case 14:
                        violationRecordPunishInfo.appealStatus = q9h.LJIIJ();
                        break;
                    case 15:
                        violationRecordPunishInfo.punishRecordIdStr = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return violationRecordPunishInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ViolationRecordPunishInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
