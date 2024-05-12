package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._FeedItemInfo_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.game.GetGameVideoListResponse;

/* loaded from: classes17.dex */
public final class _GetGameVideoListResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetGameVideoListResponse.ResponseData> {
    public static GetGameVideoListResponse.ResponseData LIZIZ(Q9H q9h) {
        GetGameVideoListResponse.ResponseData responseData = new GetGameVideoListResponse.ResponseData();
        responseData.items = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.items.add(_FeedItemInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetGameVideoListResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
