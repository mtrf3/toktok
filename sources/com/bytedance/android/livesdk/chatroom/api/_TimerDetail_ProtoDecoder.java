package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _TimerDetail_ProtoDecoder implements InterfaceC31105CIr<TimerDetail> {
    public static TimerDetail LIZIZ(Q9H q9h) {
        TimerDetail timerDetail = new TimerDetail();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        timerDetail.timerId = q9h.LJIIJJI();
                        break;
                    case 2:
                        timerDetail.anchorId = q9h.LJIIJJI();
                        break;
                    case 3:
                        timerDetail.startTimestampS = q9h.LJIIJJI();
                        break;
                    case 4:
                        timerDetail.startCountdownTimeS = q9h.LJIIJJI();
                        break;
                    case 5:
                        timerDetail.anchorSideTitle = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        timerDetail.userSideTitle = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        timerDetail.timeIncreasePerSubS = q9h.LJIIJJI();
                        break;
                    case 8:
                        timerDetail.timeIncreaseCapS = q9h.LJIIJJI();
                        break;
                    case 9:
                        timerDetail.subCount = q9h.LJIIJ();
                        break;
                    case 10:
                        timerDetail.timeIncreaseReachCap = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        timerDetail.totalPauseTimeS = q9h.LJIIJJI();
                        break;
                    case 12:
                        timerDetail.lastPauseTimestampS = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        timerDetail.totalTimeS = q9h.LJIIJJI();
                        break;
                    case 14:
                        timerDetail.remainingTimeS = q9h.LJIIJJI();
                        break;
                    case 15:
                        timerDetail.timestampS = q9h.LJIIJJI();
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        timerDetail.stickerX = q9h.LJIIJJI();
                        break;
                    case 17:
                        timerDetail.stickerY = q9h.LJIIJJI();
                        break;
                    case 18:
                        timerDetail.screenW = q9h.LJIIJJI();
                        break;
                    case 19:
                        timerDetail.screenH = q9h.LJIIJJI();
                        break;
                    case 20:
                        timerDetail.timerStatus = q9h.LJIIJ();
                        break;
                    case 21:
                        timerDetail.antidirtStatus = q9h.LJIIJ();
                        break;
                    case 22:
                        timerDetail.auditStatus = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return timerDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TimerDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
