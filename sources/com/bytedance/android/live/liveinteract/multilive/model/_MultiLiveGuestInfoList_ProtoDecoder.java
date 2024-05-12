package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.interact._LinkPlayerInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._ListReachEnhancementUser_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _MultiLiveGuestInfoList_ProtoDecoder implements InterfaceC31105CIr<MultiLiveGuestInfoList> {
    public static MultiLiveGuestInfoList LIZIZ(Q9H q9h) {
        MultiLiveGuestInfoList multiLiveGuestInfoList = new MultiLiveGuestInfoList();
        multiLiveGuestInfoList.giftScoreAppliedUsers = new ArrayList();
        multiLiveGuestInfoList.reservedUsers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        multiLiveGuestInfoList.onLineUsers.add(_LinkPlayerInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 2:
                        multiLiveGuestInfoList.waitingUsers.add(_LinkPlayerInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        multiLiveGuestInfoList.viewerUsers.add(_LinkPlayerInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 4:
                        multiLiveGuestInfoList.notViewerFriends.add(_LinkPlayerInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 5:
                        multiLiveGuestInfoList.reachEnhancementUsers.add(_ListReachEnhancementUser_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 6:
                        multiLiveGuestInfoList.connectingUsers.add(_LinkPlayerInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 7:
                        long LIZJ2 = q9h.LIZJ();
                        String str = null;
                        String str2 = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        str2 = Q9J.LIZIZ(q9h);
                                    }
                                } else {
                                    str = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (str != null) {
                                    if (str2 != null) {
                                        multiLiveGuestInfoList.userTagMap.put(str, str2);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 8:
                        multiLiveGuestInfoList.requestUserStatus = q9h.LJIIJ();
                        break;
                    case 9:
                        multiLiveGuestInfoList.fanTicketIconUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        multiLiveGuestInfoList.reservedUsers.add(_ListByTypeResponse_ReservedUser_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        multiLiveGuestInfoList.multiGuestBonus = _ListByTypeResponse_MultiGuestBonus_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        multiLiveGuestInfoList.giftScoreAppliedUsers.add(_ListByTypeResponse_GiftScoreAppliedUser_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        multiLiveGuestInfoList.requestUserGiftScore = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return multiLiveGuestInfoList;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiLiveGuestInfoList LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
