package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _ComponentTask_ProtoDecoder implements InterfaceC31105CIr<ComponentTask> {
    public static ComponentTask LIZIZ(Q9H q9h) {
        ComponentTask componentTask = new ComponentTask();
        componentTask.rewardComponents = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    componentTask.rewardComponents.add(_ComponentInfo_ProtoDecoder.LIZIZ(q9h));
                                }
                            } else {
                                componentTask.taskComponent = _ComponentInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            componentTask.taskScene = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        componentTask.order = q9h.LJIIJJI();
                    }
                } else {
                    componentTask.target = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return componentTask;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ComponentTask LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
