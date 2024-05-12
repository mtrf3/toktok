package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _GameStationGameInfo_ProtoDecoder implements InterfaceC31105CIr<GameStationGameInfo> {
    public static GameStationGameInfo LIZIZ(Q9H q9h) {
        GameStationGameInfo gameStationGameInfo = new GameStationGameInfo();
        gameStationGameInfo.introductionVideo = new ArrayList();
        gameStationGameInfo.introductionImage = new ArrayList();
        gameStationGameInfo.labels = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        gameStationGameInfo.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        gameStationGameInfo.idStr = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        gameStationGameInfo.name = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        gameStationGameInfo.androidAgeLimit = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        gameStationGameInfo.iosAgeLimit = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        gameStationGameInfo.androidPackage = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        gameStationGameInfo.androidPackageSize = q9h.LJIIJJI();
                        break;
                    case 8:
                        gameStationGameInfo.iosBundleId = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        gameStationGameInfo.iosPackageSize = q9h.LJIIJJI();
                        break;
                    case 10:
                        gameStationGameInfo.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        gameStationGameInfo.introductionImage.add(_ImageModel_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 12:
                        gameStationGameInfo.introduction = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        gameStationGameInfo.labels.add(Q9J.LIZIZ(q9h));
                        break;
                    case 14:
                        gameStationGameInfo.cpName = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        gameStationGameInfo.introductionVideo.add(_GameStationGameInfo_Video_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        gameStationGameInfo.topBackgroundImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 17:
                        gameStationGameInfo.iosDeepLink = Q9J.LIZIZ(q9h);
                        break;
                    case 18:
                        gameStationGameInfo.androidDeepLink = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return gameStationGameInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameStationGameInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
