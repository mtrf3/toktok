package webcast.api.game_station;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._GameStationAttributionInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameStationGameInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameStationOuterActivityInfo_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.game_station.GameDetailBaseResponse;

/* loaded from: classes17.dex */
public final class _GameDetailBaseResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GameDetailBaseResponse.ResponseData> {
    public static GameDetailBaseResponse.ResponseData LIZIZ(Q9H q9h) {
        GameDetailBaseResponse.ResponseData responseData = new GameDetailBaseResponse.ResponseData();
        responseData.activityGroups = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.activityGroups.add(_GameStationOuterActivityInfo_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        responseData.attributionInfo = _GameStationAttributionInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.gameInfo = _GameStationGameInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameDetailBaseResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
