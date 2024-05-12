package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class _AnchorFragmentListResult_ProtoDecoder implements InterfaceC31105CIr<AnchorFragmentListResult> {
    public static AnchorFragmentListResult LIZIZ(Q9H q9h) {
        AnchorFragmentListResult anchorFragmentListResult = new AnchorFragmentListResult();
        anchorFragmentListResult.fragmentList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            anchorFragmentListResult.hasMuted = Q9J.LIZ(q9h);
                        }
                    } else {
                        anchorFragmentListResult.generateStatus = q9h.LJIIJ();
                    }
                } else {
                    anchorFragmentListResult.fragmentList.add(_LiveFragmentDetail_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorFragmentListResult;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorFragmentListResult LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
