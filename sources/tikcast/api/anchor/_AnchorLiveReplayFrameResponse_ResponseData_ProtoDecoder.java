package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.anchor.AnchorLiveReplayFrameResponse;

/* loaded from: classes13.dex */
public final class _AnchorLiveReplayFrameResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AnchorLiveReplayFrameResponse.ResponseData> {
    public static AnchorLiveReplayFrameResponse.ResponseData LIZIZ(Q9H q9h) {
        AnchorLiveReplayFrameResponse.ResponseData responseData = new AnchorLiveReplayFrameResponse.ResponseData();
        responseData.frameList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.frameList.add(_FrameInfo_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    responseData.reqId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorLiveReplayFrameResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
