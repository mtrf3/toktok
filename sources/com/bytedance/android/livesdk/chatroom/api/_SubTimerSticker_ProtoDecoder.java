package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _SubTimerSticker_ProtoDecoder implements InterfaceC31105CIr<SubTimerSticker> {
    public static SubTimerSticker LIZIZ(Q9H q9h) {
        SubTimerSticker subTimerSticker = new SubTimerSticker();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        subTimerSticker.type = q9h.LJIIJ();
                        break;
                    case 2:
                        subTimerSticker.timerId = q9h.LJIIJJI();
                        break;
                    case 3:
                        subTimerSticker.opType = q9h.LJIIJ();
                        break;
                    case 4:
                        subTimerSticker.timerStatus = q9h.LJIIJ();
                        break;
                    case 5:
                        subTimerSticker.anchorSideTitle = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        subTimerSticker.userSideTitle = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        subTimerSticker.subIncreaseCount = q9h.LJIIJ();
                        break;
                    case 8:
                        subTimerSticker.timeIncreasePerSub = q9h.LJIIJJI();
                        break;
                    case 9:
                        subTimerSticker.timeIncrease = q9h.LJIIJJI();
                        break;
                    case 10:
                        subTimerSticker.totalTime = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        subTimerSticker.remainingTime = q9h.LJIIJJI();
                        break;
                    case 12:
                        subTimerSticker.timestamp = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        subTimerSticker.stickerX = q9h.LJIIJJI();
                        break;
                    case 14:
                        subTimerSticker.stickerY = q9h.LJIIJJI();
                        break;
                    case 15:
                        subTimerSticker.screenW = q9h.LJIIJJI();
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        subTimerSticker.screenH = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return subTimerSticker;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubTimerSticker LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
