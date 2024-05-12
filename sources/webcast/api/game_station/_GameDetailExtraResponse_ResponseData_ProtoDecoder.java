package webcast.api.game_station;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._ItemInfo_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.game_station.GameDetailExtraResponse;

/* loaded from: classes17.dex */
public final class _GameDetailExtraResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GameDetailExtraResponse.ResponseData> {
    public static GameDetailExtraResponse.ResponseData LIZIZ(Q9H q9h) {
        GameDetailExtraResponse.ResponseData responseData = new GameDetailExtraResponse.ResponseData();
        responseData.relatedVideos = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.relatedVideos.add(_ItemInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameDetailExtraResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
