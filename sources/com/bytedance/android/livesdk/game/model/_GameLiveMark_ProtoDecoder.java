package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _GameLiveMark_ProtoDecoder implements InterfaceC31105CIr<GameLiveMark> {
    @Override // X.InterfaceC31105CIr
    public final GameLiveMark LIZ(Q9H q9h) {
        GameLiveMark gameLiveMark = new GameLiveMark();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        gameLiveMark.markId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        gameLiveMark.markIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        gameLiveMark.roomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        gameLiveMark.roomIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        gameLiveMark.vid = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        gameLiveMark.coverUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        gameLiveMark.downloadUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        gameLiveMark.streamUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        gameLiveMark.ownerUserId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 10:
                        gameLiveMark.ownerUserIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        gameLiveMark.markTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 12:
                        gameLiveMark.startTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        gameLiveMark.endTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 14:
                        gameLiveMark.replayCreateTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 15:
                        gameLiveMark.title = Q9J.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        gameLiveMark.status = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 17:
                        gameLiveMark.isEdit = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 18:
                        gameLiveMark.opTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 19:
                        gameLiveMark.previewPicUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 20:
                        gameLiveMark.extra = Q9J.LIZIZ(q9h);
                        break;
                    case 21:
                        gameLiveMark.createTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 22:
                        gameLiveMark.updateTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return gameLiveMark;
            }
        }
    }
}
