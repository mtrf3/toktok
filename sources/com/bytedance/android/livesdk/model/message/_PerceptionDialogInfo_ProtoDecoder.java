package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.message.proto._PerceptionFeedbackOption_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _PerceptionDialogInfo_ProtoDecoder implements InterfaceC31105CIr<PerceptionDialogInfo> {
    public static PerceptionDialogInfo LIZIZ(Q9H q9h) {
        PerceptionDialogInfo perceptionDialogInfo = new PerceptionDialogInfo();
        perceptionDialogInfo.feedbackOptions = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        perceptionDialogInfo.iconType = q9h.LJIIJ();
                        break;
                    case 2:
                        perceptionDialogInfo.title = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        perceptionDialogInfo.subTitle = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        perceptionDialogInfo.adviceActionText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        perceptionDialogInfo.defaultActionText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        perceptionDialogInfo.violationDetailUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        perceptionDialogInfo.scene = q9h.LJIIJ();
                        break;
                    case 8:
                        perceptionDialogInfo.targetUserId = q9h.LJIIJJI();
                        break;
                    case 9:
                        perceptionDialogInfo.targetRoomId = q9h.LJIIJJI();
                        break;
                    case 10:
                        perceptionDialogInfo.countDownTime = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        perceptionDialogInfo.showFeedback = Q9J.LIZ(q9h);
                        break;
                    case 12:
                        perceptionDialogInfo.feedbackOptions.add(_PerceptionFeedbackOption_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        perceptionDialogInfo.policyTip = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return perceptionDialogInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PerceptionDialogInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
