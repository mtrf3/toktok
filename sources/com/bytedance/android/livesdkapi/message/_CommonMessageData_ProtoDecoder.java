package com.bytedance.android.livesdkapi.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _CommonMessageData_ProtoDecoder implements InterfaceC31105CIr<CommonMessageData> {
    public static CommonMessageData LIZIZ(Q9H q9h) {
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.filterTags = new ArrayList();
        commonMessageData.toDids = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        commonMessageData.method = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        commonMessageData.messageId = q9h.LJIIJJI();
                        break;
                    case 3:
                        commonMessageData.roomId = q9h.LJIIJJI();
                        break;
                    case 4:
                        commonMessageData.createTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        commonMessageData.monitor = q9h.LJIIJ();
                        break;
                    case 6:
                        commonMessageData.showMsg = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        commonMessageData.describe = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        commonMessageData.displayText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        commonMessageData.foldType = q9h.LJIIJJI();
                        break;
                    case 10:
                        commonMessageData.anchorFoldType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        commonMessageData.priorityScore = q9h.LJIIJJI();
                        break;
                    case 12:
                        commonMessageData.logId = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        commonMessageData.msgProcessFilterK = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        commonMessageData.msgProcessFilterV = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        commonMessageData.fromIdc = Q9J.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        commonMessageData.toIdc = Q9J.LIZIZ(q9h);
                        break;
                    case 17:
                        commonMessageData.filterTags.add(Q9J.LIZIZ(q9h));
                        break;
                    case 18:
                        commonMessageData.messageSEI = _LiveMessageSEI_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 19:
                        commonMessageData.dependRootID = _LiveMessageID_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 20:
                        commonMessageData.dependID = _LiveMessageID_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 21:
                        commonMessageData.anchorPriorityScore = q9h.LJIIJJI();
                        break;
                    case 22:
                        commonMessageData.roomMessageHeatLevel = q9h.LJIIJJI();
                        break;
                    case 23:
                        commonMessageData.foldTypeForWeb = q9h.LJIIJJI();
                        break;
                    case 24:
                        commonMessageData.anchorFoldTypeForWeb = q9h.LJIIJJI();
                        break;
                    case 25:
                        commonMessageData.clientSendTime = q9h.LJIIJJI();
                        break;
                    case 26:
                        commonMessageData.dispatchStrategy = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return commonMessageData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CommonMessageData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
