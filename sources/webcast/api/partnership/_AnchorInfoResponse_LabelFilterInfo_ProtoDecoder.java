package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.AnchorInfoResponse;

/* loaded from: classes6.dex */
public final class _AnchorInfoResponse_LabelFilterInfo_ProtoDecoder implements InterfaceC31105CIr<AnchorInfoResponse.LabelFilterInfo> {
    public static AnchorInfoResponse.LabelFilterInfo LIZIZ(Q9H q9h) {
        AnchorInfoResponse.LabelFilterInfo labelFilterInfo = new AnchorInfoResponse.LabelFilterInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            labelFilterInfo.gpppaBanToast = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        labelFilterInfo.gpppaBanText = Q9J.LIZIZ(q9h);
                    }
                } else {
                    labelFilterInfo.gpppaAccount = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return labelFilterInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorInfoResponse.LabelFilterInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
