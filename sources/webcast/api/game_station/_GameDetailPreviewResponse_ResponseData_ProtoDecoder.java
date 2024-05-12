package webcast.api.game_station;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._GameStationGameInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameStationOuterActivityInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._ItemInfo_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.game_station.GameDetailPreviewResponse;

/* loaded from: classes17.dex */
public final class _GameDetailPreviewResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GameDetailPreviewResponse.ResponseData> {
    public static GameDetailPreviewResponse.ResponseData LIZIZ(Q9H q9h) {
        GameDetailPreviewResponse.ResponseData responseData = new GameDetailPreviewResponse.ResponseData();
        responseData.relatedVideos = new ArrayList();
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
                            responseData.relatedVideos.add(_ItemInfo_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        responseData.activityGroups.add(_GameStationOuterActivityInfo_ProtoDecoder.LIZIZ(q9h));
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
    public final GameDetailPreviewResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
