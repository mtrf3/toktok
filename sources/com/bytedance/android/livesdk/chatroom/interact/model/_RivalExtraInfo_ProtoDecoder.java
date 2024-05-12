package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.interact._OptPairInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TagV2_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _RivalExtraInfo_ProtoDecoder implements InterfaceC31105CIr<RivalExtraInfo> {
    public static RivalExtraInfo LIZIZ(Q9H q9h) {
        RivalExtraInfo rivalExtraInfo = new RivalExtraInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        rivalExtraInfo.text = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        rivalExtraInfo.text_type = q9h.LJIIJ();
                        break;
                    case 3:
                        rivalExtraInfo.label = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        rivalExtraInfo.anchorLayer = q9h.LJIIJ();
                        break;
                    case 5:
                        rivalExtraInfo.linkerInfo = _LinkerInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        rivalExtraInfo.linkmicUserSettings = _AnchorLinkmicUserSettings_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                    case 10:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 8:
                        rivalExtraInfo.inviteBlockReason = q9h.LJIIJ();
                        break;
                    case 9:
                        rivalExtraInfo.showPlayType = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        rivalExtraInfo.tag = _RivalExtraInfo_Tag_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        rivalExtraInfo.reserveInfo = _RivalExtraInfo_ReserveInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        rivalExtraInfo.detailBlockReason = q9h.LJIIJ();
                        break;
                    case 14:
                        rivalExtraInfo.optPairInfo = _OptPairInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 15:
                        rivalExtraInfo.tagV2 = _TagV2_ProtoDecoder.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rivalExtraInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RivalExtraInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
