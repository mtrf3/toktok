package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _CohostListUser_ProtoDecoder implements InterfaceC31105CIr<CohostListUser> {
    public static CohostListUser LIZIZ(Q9H q9h) {
        CohostListUser cohostListUser = new CohostListUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        cohostListUser.userId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        cohostListUser.nickName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        cohostListUser.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        cohostListUser.linkedTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        cohostListUser.playType = q9h.LJIIJ();
                        break;
                    case 6:
                        cohostListUser.roomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        cohostListUser.linkmicUserStatus = q9h.LJIIJ();
                        break;
                    case 8:
                        cohostListUser.linkRemainingTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 9:
                        cohostListUser.permissionType = q9h.LJIIJ();
                        break;
                    case 10:
                        cohostListUser.displayId = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        cohostListUser.followStatus = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 12:
                        cohostListUser.isLowVersion = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        cohostListUser.rivalUserId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 14:
                        cohostListUser.rivalRoomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 15:
                        cohostListUser.isInitiator = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        cohostListUser.linkmicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 17:
                        cohostListUser.bestTeammateUid = q9h.LJIIJJI();
                        break;
                    case 18:
                        cohostListUser.hasTopicPerm = Q9J.LIZ(q9h);
                        break;
                    case 19:
                        cohostListUser.innerChannelId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return cohostListUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CohostListUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
