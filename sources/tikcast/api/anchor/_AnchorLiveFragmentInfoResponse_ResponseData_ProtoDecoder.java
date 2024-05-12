package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.anchor.AnchorLiveFragmentInfoResponse;

/* loaded from: classes13.dex */
public final class _AnchorLiveFragmentInfoResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AnchorLiveFragmentInfoResponse.ResponseData> {
    public static AnchorLiveFragmentInfoResponse.ResponseData LIZIZ(Q9H q9h) {
        AnchorLiveFragmentInfoResponse.ResponseData responseData = new AnchorLiveFragmentInfoResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.clipInfo = _LiveFragmentDetail_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorLiveFragmentInfoResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
