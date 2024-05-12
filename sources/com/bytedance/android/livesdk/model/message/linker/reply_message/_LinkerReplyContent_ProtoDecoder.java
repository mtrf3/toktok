package com.bytedance.android.livesdk.model.message.linker.reply_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message._LinkmicUserInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.mic_update._LinkerMicIdxUpdateInfo_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _LinkerReplyContent_ProtoDecoder implements InterfaceC31105CIr<LinkerReplyContent> {
    public static LinkerReplyContent LIZIZ(Q9H q9h) {
        LinkerReplyContent linkerReplyContent = new LinkerReplyContent();
        linkerReplyContent.linkedUsers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                Long l = null;
                switch (LJI) {
                    case 1:
                        linkerReplyContent.inviterUid = q9h.LJIIJJI();
                        break;
                    case 2:
                        linkerReplyContent.inviterRoomId = q9h.LJIIJJI();
                        break;
                    case 3:
                        linkerReplyContent.inviterLinkmicInfo = _LinkmicInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        linkerReplyContent.inviteeUid = q9h.LJIIJJI();
                        break;
                    case 5:
                        linkerReplyContent.inviteeLinkmicInfo = _LinkmicInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        linkerReplyContent.linkType = q9h.LJIIJJI();
                        break;
                    case 7:
                        linkerReplyContent.replyStatus = (int) q9h.LJIIJJI();
                        break;
                    case 8:
                        linkerReplyContent.linkerSetting = _LinkerSetting_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        linkerReplyContent.inviterUser = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        linkerReplyContent.inviteeUser = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        long LIZJ2 = q9h.LIZJ();
                        String str = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 != -1) {
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        str = Q9J.LIZIZ(q9h);
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ2);
                                if (l != null) {
                                    if (str != null) {
                                        linkerReplyContent.rtcExtInfoMap.put(l, str);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 12:
                        linkerReplyContent.inviteeMicIdxUpdateInfo = _LinkerMicIdxUpdateInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        long LIZJ3 = q9h.LIZJ();
                        Long l2 = null;
                        while (true) {
                            int LJI3 = q9h.LJI();
                            if (LJI3 != -1) {
                                if (LJI3 != 1) {
                                    if (LJI3 == 2) {
                                        l2 = Long.valueOf(q9h.LJIIJJI());
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                q9h.LJ(LIZJ3);
                                if (l != null) {
                                    if (l2 != null) {
                                        linkerReplyContent.applierMicIdxInfoMap.put(l, l2);
                                        break;
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    case 14:
                        linkerReplyContent.multiLiveLayoutEnable = q9h.LJIIJ();
                        break;
                    case 15:
                        linkerReplyContent.multiLiveSetting = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        linkerReplyContent.actionId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 17:
                        linkerReplyContent.linkedUsers.add(_LinkmicUserInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 18:
                        linkerReplyContent.sourceType = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerReplyContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerReplyContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
