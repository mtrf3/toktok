package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes16.dex */
public final class _AnchorLevel_ProtoDecoder implements InterfaceC31105CIr<AnchorLevel> {
    public static AnchorLevel LIZIZ(Q9H q9h) {
        AnchorLevel anchorLevel = new AnchorLevel();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        anchorLevel.level = (int) q9h.LJIIJJI();
                        break;
                    case 2:
                        anchorLevel.experience = q9h.LJIIJJI();
                        break;
                    case 3:
                        anchorLevel.lowestExperienceThisLevel = q9h.LJIIJJI();
                        break;
                    case 4:
                        anchorLevel.highestExperienceThisLevel = q9h.LJIIJJI();
                        break;
                    case 5:
                        anchorLevel.taskStartExperience = q9h.LJIIJJI();
                        break;
                    case 6:
                        anchorLevel.taskStartTime = q9h.LJIIJJI();
                        break;
                    case 7:
                        anchorLevel.taskDecreaseExperience = q9h.LJIIJJI();
                        break;
                    case 8:
                        anchorLevel.taskTargetExperience = q9h.LJIIJJI();
                        break;
                    case 9:
                        anchorLevel.taskEndTime = q9h.LJIIJJI();
                        break;
                    case 10:
                        anchorLevel.profileDialogBg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        anchorLevel.profileDialogBackBg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        anchorLevel.stageLevelIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        anchorLevel.levelIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorLevel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorLevel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
