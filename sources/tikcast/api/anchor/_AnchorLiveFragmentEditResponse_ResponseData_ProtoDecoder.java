package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.anchor.AnchorLiveFragmentEditResponse;

/* loaded from: classes13.dex */
public final class _AnchorLiveFragmentEditResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AnchorLiveFragmentEditResponse.ResponseData> {
    public static AnchorLiveFragmentEditResponse.ResponseData LIZIZ(Q9H q9h) {
        AnchorLiveFragmentEditResponse.ResponseData responseData = new AnchorLiveFragmentEditResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.fragmentId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorLiveFragmentEditResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
