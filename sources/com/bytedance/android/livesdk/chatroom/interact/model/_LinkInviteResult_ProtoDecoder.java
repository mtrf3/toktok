package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _LinkInviteResult_ProtoDecoder implements InterfaceC31105CIr<LinkInviteResult> {
    @Override // X.InterfaceC31105CIr
    public final LinkInviteResult LIZ(Q9H q9h) {
        LinkInviteResult linkInviteResult = new LinkInviteResult();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkInviteResult.channelId = q9h.LJIIJJI();
                        break;
                    case 2:
                        linkInviteResult.vendor = q9h.LJIIJ();
                        break;
                    case 3:
                        linkInviteResult.channelIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        linkInviteResult.scene = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        linkInviteResult.rtcJoinChannel = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        linkInviteResult.rtcExtInfo = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        linkInviteResult.linkMicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        linkInviteResult.rtcPushStream = Q9J.LIZ(q9h);
                        break;
                    case 9:
                        linkInviteResult.actionId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 10:
                        linkInviteResult.rivalsLinkMicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        linkInviteResult.perceptionStatus = q9h.LJIIJ();
                        break;
                    case 12:
                        linkInviteResult.perceptionMessage = _PerceptionMessage_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        linkInviteResult.extra = _InviteExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkInviteResult;
            }
        }
    }
}
