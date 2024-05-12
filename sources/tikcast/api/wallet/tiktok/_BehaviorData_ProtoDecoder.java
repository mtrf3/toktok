package tikcast.api.wallet.tiktok;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class _BehaviorData_ProtoDecoder implements InterfaceC31105CIr<BehaviorData> {
    public static BehaviorData LIZIZ(Q9H q9h) {
        BehaviorData behaviorData = new BehaviorData();
        behaviorData.scenarioToDisplay = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    long LIZJ2 = q9h.LIZJ();
                    String str = null;
                    Boolean bool = null;
                    while (true) {
                        int LJI2 = q9h.LJI();
                        if (LJI2 == -1) {
                            break;
                        }
                        if (LJI2 != 1) {
                            if (LJI2 == 2) {
                                bool = Boolean.valueOf(Q9J.LIZ(q9h));
                            }
                        } else {
                            str = Q9J.LIZIZ(q9h);
                        }
                    }
                    q9h.LJ(LIZJ2);
                    if (str != null) {
                        if (bool != null) {
                            behaviorData.scenarioToDisplay.put(str, bool);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                q9h.LJ(LIZJ);
                return behaviorData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BehaviorData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
