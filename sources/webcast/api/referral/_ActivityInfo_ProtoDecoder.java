package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _ActivityInfo_ProtoDecoder implements InterfaceC31105CIr<ActivityInfo> {
    @Override // X.InterfaceC31105CIr
    public final ActivityInfo LIZ(Q9H q9h) {
        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.mentorLevelTasks = new ArrayList();
        activityInfo.menteeLevelTasks = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        activityInfo.activityId = q9h.LJIIJJI();
                        break;
                    case 2:
                        activityInfo.activityStatus = q9h.LJIIJ();
                        break;
                    case 3:
                        activityInfo.area = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        activityInfo.actStartSec = q9h.LJIIJJI();
                        break;
                    case 5:
                        activityInfo.actEndSec = q9h.LJIIJJI();
                        break;
                    case 6:
                        activityInfo.liveDurationSec = q9h.LJIIJJI();
                        break;
                    case 7:
                        activityInfo.relationDurationSec = q9h.LJIIJJI();
                        break;
                    case 8:
                        activityInfo.maxMenteeSpots = q9h.LJIIJJI();
                        break;
                    case 9:
                        activityInfo.maxBonus = q9h.LJIIJJI();
                        break;
                    case 10:
                        activityInfo.mentorLevelTasks.add(_LevelTask_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        activityInfo.menteeLevelTasks.add(_LevelTask_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 12:
                        activityInfo.extra = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return activityInfo;
            }
        }
    }
}
