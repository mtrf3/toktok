package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import java.util.HashMap;
import tikcast.api.anchor.AnchorLiveFragmentListResponse;

/* loaded from: classes16.dex */
public final class _AnchorLiveFragmentListResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AnchorLiveFragmentListResponse.ResponseData> {
    public static AnchorLiveFragmentListResponse.ResponseData LIZIZ(Q9H q9h) {
        AnchorLiveFragmentListResponse.ResponseData responseData = new AnchorLiveFragmentListResponse.ResponseData();
        responseData.postDetailList = new ArrayList();
        responseData.roomMap = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.postDetailList.add(_AnchorLiveFragmentPostDetail_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    long LIZJ2 = q9h.LIZJ();
                    String str = null;
                    AnchorFragmentListResult anchorFragmentListResult = null;
                    while (true) {
                        int LJI2 = q9h.LJI();
                        if (LJI2 == -1) {
                            break;
                        }
                        if (LJI2 != 1) {
                            if (LJI2 == 2) {
                                anchorFragmentListResult = _AnchorFragmentListResult_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            str = Q9J.LIZIZ(q9h);
                        }
                    }
                    q9h.LJ(LIZJ2);
                    if (str != null) {
                        if (anchorFragmentListResult != null) {
                            responseData.roomMap.put(str, anchorFragmentListResult);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorLiveFragmentListResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
