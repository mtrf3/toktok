package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SubscriberParam_ProtoDecoder implements InterfaceC31105CIr<SubscriberParam> {
    public static SubscriberParam LIZIZ(Q9H q9h) {
        SubscriberParam subscriberParam = new SubscriberParam();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        subscriberParam.level = q9h.LJIIJ();
                    }
                } else {
                    subscriberParam.anchorId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subscriberParam;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubscriberParam LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
