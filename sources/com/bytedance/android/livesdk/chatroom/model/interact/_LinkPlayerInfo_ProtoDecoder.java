package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _LinkPlayerInfo_ProtoDecoder implements InterfaceC31105CIr<LinkPlayerInfo> {
    public static LinkPlayerInfo LIZIZ(Q9H q9h) {
        LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.tagKeyList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkPlayerInfo.mUser = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        linkPlayerInfo.mModifyTime = q9h.LJIIJJI();
                        break;
                    case 3:
                        linkPlayerInfo.mLinkType = q9h.LJIIJ();
                        break;
                    case 4:
                        linkPlayerInfo.mRoleType = q9h.LJIIJ();
                        break;
                    case 5:
                        linkPlayerInfo.mInteractIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        linkPlayerInfo.paidMoney = (int) q9h.LJIIJJI();
                        break;
                    case 7:
                        linkPlayerInfo.mFanTicket = q9h.LJIIJJI();
                        break;
                    case 8:
                        linkPlayerInfo.sharedInvitationType = q9h.LJIIJ();
                        break;
                    case 9:
                        linkPlayerInfo.permissionAsViewer = q9h.LJIIJ();
                        break;
                    case 10:
                        linkPlayerInfo.mFanTicketType = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        linkPlayerInfo.appVersion = q9h.LJIIJ();
                        break;
                    case 12:
                        linkPlayerInfo.linkTypePermission = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        linkPlayerInfo.tagKeyList.add(Q9J.LIZIZ(q9h));
                        break;
                    case 14:
                        linkPlayerInfo.onlineStatus = q9h.LJIIJ();
                        break;
                    case 15:
                        linkPlayerInfo.isLastMeetGiftScoreThresholdApplier = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkPlayerInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkPlayerInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
