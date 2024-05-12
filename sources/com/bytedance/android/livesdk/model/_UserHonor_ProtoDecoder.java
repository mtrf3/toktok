package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class _UserHonor_ProtoDecoder implements InterfaceC31105CIr<UserHonor> {
    public static UserHonor LIZIZ(Q9H q9h) {
        UserHonor userHonor = new UserHonor();
        userHonor.gradeIconList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1001) {
                    switch (LJI) {
                        case 1:
                            userHonor.totalDiamond = q9h.LJIIJJI();
                            break;
                        case 2:
                            userHonor.diamondIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 3:
                            userHonor.currentHonorName = Q9J.LIZIZ(q9h);
                            break;
                        case 4:
                            userHonor.currentHonorIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 5:
                            userHonor.nextHonorName = Q9J.LIZIZ(q9h);
                            break;
                        case 6:
                            userHonor.level = (int) q9h.LJIIJJI();
                            break;
                        case 7:
                            userHonor.nextHonorIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            break;
                        default:
                            switch (LJI) {
                                case 9:
                                    userHonor.currentDiamond = q9h.LJIIJJI();
                                    break;
                                case 10:
                                    userHonor.thisGradeMinDiamond = q9h.LJIIJJI();
                                    break;
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                    userHonor.thisGradeMaxDiamond = q9h.LJIIJJI();
                                    break;
                                default:
                                    switch (LJI) {
                                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                            userHonor.gradeDescribe = Q9J.LIZIZ(q9h);
                                            break;
                                        case 14:
                                            userHonor.gradeIconList.add(_GradeIcon_ProtoDecoder.LIZIZ(q9h));
                                            break;
                                        case 15:
                                            userHonor.screenChatType = q9h.LJIIJJI();
                                            break;
                                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                            userHonor.imIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 17:
                                            userHonor.imIconWithLevel = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 18:
                                            userHonor.liveIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 19:
                                            userHonor.newImIconWithLevel = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 20:
                                            userHonor.newLiveIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 21:
                                            userHonor.upgradeNeedConsume = q9h.LJIIJJI();
                                            break;
                                        case 22:
                                            userHonor.nextPrivileges = Q9J.LIZIZ(q9h);
                                            break;
                                        case 23:
                                            userHonor.profileDialogBg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 24:
                                            userHonor.profileDialogBackBg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 25:
                                            userHonor.score = q9h.LJIIJJI();
                                            break;
                                        default:
                                            Q9J.LIZJ(q9h);
                                            break;
                                    }
                            }
                    }
                } else {
                    userHonor.gradeBanner = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return userHonor;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserHonor LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
