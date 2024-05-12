package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _GameStationOuterActivityInfo_ProtoDecoder implements InterfaceC31105CIr<GameStationOuterActivityInfo> {
    public static GameStationOuterActivityInfo LIZIZ(Q9H q9h) {
        GameStationOuterActivityInfo gameStationOuterActivityInfo = new GameStationOuterActivityInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        gameStationOuterActivityInfo.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        gameStationOuterActivityInfo.name = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        gameStationOuterActivityInfo.typeNum = q9h.LJIIJ();
                        break;
                    case 4:
                        gameStationOuterActivityInfo.seq = q9h.LJIIJ();
                        break;
                    case 5:
                        gameStationOuterActivityInfo.coverUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        gameStationOuterActivityInfo.coverThemeColor = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        gameStationOuterActivityInfo.linkType = q9h.LJIIJ();
                        break;
                    case 8:
                        gameStationOuterActivityInfo.link = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        gameStationOuterActivityInfo.introduction = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        gameStationOuterActivityInfo.startTime = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        gameStationOuterActivityInfo.endTime = q9h.LJIIJJI();
                        break;
                    case 12:
                        gameStationOuterActivityInfo.idStr = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return gameStationOuterActivityInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameStationOuterActivityInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
