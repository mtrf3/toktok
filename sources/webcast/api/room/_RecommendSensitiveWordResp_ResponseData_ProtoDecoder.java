package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.room.RecommendSensitiveWordResp;

/* loaded from: classes6.dex */
public final class _RecommendSensitiveWordResp_ResponseData_ProtoDecoder implements InterfaceC31105CIr<RecommendSensitiveWordResp.ResponseData> {
    public static RecommendSensitiveWordResp.ResponseData LIZIZ(Q9H q9h) {
        RecommendSensitiveWordResp.ResponseData responseData = new RecommendSensitiveWordResp.ResponseData();
        responseData.wordList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.prompt = _CommentFlaggedPrompt_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.wordList.add(Q9J.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RecommendSensitiveWordResp.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
