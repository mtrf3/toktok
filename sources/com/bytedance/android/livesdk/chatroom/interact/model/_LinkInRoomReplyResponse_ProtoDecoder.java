package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _LinkInRoomReplyResponse_ProtoDecoder implements InterfaceC31105CIr<LinkInRoomReplyResponse> {
    public static LinkInRoomReplyResponse LIZIZ(Q9H q9h) {
        LinkInRoomReplyResponse linkInRoomReplyResponse = new LinkInRoomReplyResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkInRoomReplyResponse.accessKey = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        linkInRoomReplyResponse.linkMicId = q9h.LJIIJJI();
                        break;
                    case 3:
                        linkInRoomReplyResponse.rtcExtInfo = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        linkInRoomReplyResponse.rtcAppId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        linkInRoomReplyResponse.rtcAppSign = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        linkInRoomReplyResponse.channelId = q9h.LJIIJJI();
                        break;
                    case 7:
                        linkInRoomReplyResponse.fromUid = q9h.LJIIJJI();
                        break;
                    case 8:
                        linkInRoomReplyResponse.toUid = q9h.LJIIJJI();
                        break;
                    case 9:
                        linkInRoomReplyResponse.fromRoomId = q9h.LJIIJJI();
                        break;
                    case 10:
                        linkInRoomReplyResponse.toRoomId = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        linkInRoomReplyResponse.linkMicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        linkInRoomReplyResponse.rivalLinkMicId = String.valueOf(q9h.LJIIJJI());
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        linkInRoomReplyResponse.rivalLinkMicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        long LIZJ2 = q9h.LIZJ();
                        Long l = null;
                        Long l2 = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        l2 = Long.valueOf(q9h.LJIIJJI());
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (l != null) {
                                    if (l2 != null) {
                                        linkInRoomReplyResponse.micIndexToUidMap.put(l, l2);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 15:
                        linkInRoomReplyResponse.userMultiLiveLayout = Q9J.LIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        linkInRoomReplyResponse.anchorNewLayout = q9h.LJIIJ();
                        break;
                    case 17:
                        linkInRoomReplyResponse.fixSwitchOn = q9h.LJIIJ();
                        break;
                    case 18:
                        linkInRoomReplyResponse.linkTypePermission = q9h.LJIIJJI();
                        break;
                    case 19:
                        linkInRoomReplyResponse.replyId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkInRoomReplyResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkInRoomReplyResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
