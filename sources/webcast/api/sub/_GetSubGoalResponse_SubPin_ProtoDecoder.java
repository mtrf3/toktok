package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.sub.GetSubGoalResponse;

/* loaded from: classes6.dex */
public final class _GetSubGoalResponse_SubPin_ProtoDecoder implements InterfaceC31105CIr<GetSubGoalResponse.SubPin> {
    public static GetSubGoalResponse.SubPin LIZIZ(Q9H q9h) {
        GetSubGoalResponse.SubPin subPin = new GetSubGoalResponse.SubPin();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        subPin.pinStatus = q9h.LJIIJ();
                    }
                } else {
                    subPin.coolingDownTime = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return subPin;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetSubGoalResponse.SubPin LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}