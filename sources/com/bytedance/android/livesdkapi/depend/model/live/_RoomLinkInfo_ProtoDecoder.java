package com.bytedance.android.livesdkapi.depend.model.live;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostTopic_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TopicSessionStatus_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleInfoResponse_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _RoomLinkInfo_ProtoDecoder implements InterfaceC31105CIr<RoomLinkInfo> {
    public static RoomLinkInfo LIZIZ(Q9H q9h) {
        RoomLinkInfo roomLinkInfo = new RoomLinkInfo();
        roomLinkInfo.linkedUsers = new ArrayList();
        roomLinkInfo.audienceIdList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 5) {
                            if (LJI != 6) {
                                if (LJI != 53) {
                                    if (LJI != 54) {
                                        switch (LJI) {
                                            case 9:
                                                roomLinkInfo.linkedUsers.add(_User_ProtoDecoder.LIZIZ(q9h));
                                                break;
                                            case 10:
                                                roomLinkInfo.battleInfo = _BattleInfoResponse_ProtoDecoder.LIZIZ(q9h);
                                                break;
                                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                roomLinkInfo.MultiLiveType = q9h.LJIIJJI();
                                                break;
                                            default:
                                                Q9J.LIZJ(q9h);
                                                break;
                                        }
                                    } else {
                                        roomLinkInfo.topicStatus = _TopicSessionStatus_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    roomLinkInfo.topicInfo = _CohostTopic_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                C29991Fr.LIZ(q9h, roomLinkInfo.audienceIdList);
                            }
                        } else {
                            roomLinkInfo.rivalAnchorId = q9h.LJIIJJI();
                        }
                    } else {
                        roomLinkInfo.channelInfo = _ChannelInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    roomLinkInfo.channelId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return roomLinkInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomLinkInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
