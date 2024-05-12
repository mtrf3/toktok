package tikcast.linkmic.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _CohostUserInfo_ProtoDecoder implements InterfaceC31105CIr<CohostUserInfo> {
    public static CohostUserInfo LIZIZ(Q9H q9h) {
        CohostUserInfo cohostUserInfo = new CohostUserInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    switch (LJI) {
                                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                            cohostUserInfo.nickname = Q9J.LIZIZ(q9h);
                                            break;
                                        case 12:
                                            cohostUserInfo.displayId = Q9J.LIZIZ(q9h);
                                            break;
                                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                            cohostUserInfo.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                            break;
                                        case 14:
                                            cohostUserInfo.followStatus = q9h.LJIIJJI();
                                            break;
                                        default:
                                            Q9J.LIZJ(q9h);
                                            break;
                                    }
                                } else {
                                    cohostUserInfo.hasTopicPerm = Q9J.LIZ(q9h);
                                }
                            } else {
                                cohostUserInfo.bestTeammateUid = q9h.LJIIJJI();
                            }
                        } else {
                            cohostUserInfo.isLowVersion = Q9J.LIZ(q9h);
                        }
                    } else {
                        cohostUserInfo.sourceType = q9h.LJIIJ();
                    }
                } else {
                    cohostUserInfo.permissionType = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return cohostUserInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CohostUserInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
