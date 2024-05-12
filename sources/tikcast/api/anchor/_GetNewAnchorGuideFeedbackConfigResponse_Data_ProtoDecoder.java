package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.anchor.GetNewAnchorGuideFeedbackConfigResponse;

/* loaded from: classes6.dex */
public final class _GetNewAnchorGuideFeedbackConfigResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GetNewAnchorGuideFeedbackConfigResponse.Data> {
    public static GetNewAnchorGuideFeedbackConfigResponse.Data LIZIZ(Q9H q9h) {
        GetNewAnchorGuideFeedbackConfigResponse.Data data = new GetNewAnchorGuideFeedbackConfigResponse.Data();
        data.scene = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                data.displayInterval = q9h.LJIIJ();
                            }
                        } else {
                            data.scene.add(Q9J.LIZIZ(q9h));
                        }
                    } else {
                        data.guideStyle = q9h.LJIIJ();
                    }
                } else {
                    data.identity = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetNewAnchorGuideFeedbackConfigResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
