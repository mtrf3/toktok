package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.replay.proto._VideoMetaInfo_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _GameLiveFragment_ProtoDecoder implements InterfaceC31105CIr<GameLiveFragment> {
    public static GameLiveFragment LIZIZ(Q9H q9h) {
        GameLiveFragment gameLiveFragment = new GameLiveFragment();
        gameLiveFragment.spriteList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        gameLiveFragment.fragmentId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        gameLiveFragment.fragmentIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        gameLiveFragment.roomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        gameLiveFragment.fragmentType = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 5:
                        gameLiveFragment.vid = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        gameLiveFragment.downloadUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        gameLiveFragment.coverUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        gameLiveFragment.ownerUserId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 9:
                        gameLiveFragment.startTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 10:
                        gameLiveFragment.endTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        gameLiveFragment.extra = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        gameLiveFragment.createTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        gameLiveFragment.updateTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 14:
                        gameLiveFragment.title = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        gameLiveFragment.status = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        gameLiveFragment.markTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 17:
                        gameLiveFragment.opTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 18:
                        gameLiveFragment.streamUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 19:
                        gameLiveFragment.previewPicUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 20:
                        gameLiveFragment.roomIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 21:
                        gameLiveFragment.ownerUserIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 22:
                        gameLiveFragment.replayCreateTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 23:
                        gameLiveFragment.isEdit = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 24:
                        gameLiveFragment.spriteList.add(_Sprite_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 25:
                        gameLiveFragment.mp4VideoMetaInfo = _VideoMetaInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 26:
                        gameLiveFragment.encodeStatus = q9h.LJIIJ();
                        break;
                    case 27:
                        gameLiveFragment.isMuted = Q9J.LIZ(q9h);
                        break;
                    case 28:
                        gameLiveFragment.showInfo = _LiveFragmentShowInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return gameLiveFragment;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameLiveFragment LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
