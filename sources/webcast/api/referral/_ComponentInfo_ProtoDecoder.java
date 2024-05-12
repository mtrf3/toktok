package webcast.api.referral;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ComponentInfo_ProtoDecoder implements InterfaceC31105CIr<ComponentInfo> {
    public static ComponentInfo LIZIZ(Q9H q9h) {
        ComponentInfo componentInfo = new ComponentInfo();
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
                                    componentInfo.threshold2 = q9h.LJIIJJI();
                                }
                            } else {
                                componentInfo.threshold1 = q9h.LJIIJJI();
                            }
                        } else {
                            componentInfo.scene = q9h.LJIIJ();
                        }
                    } else {
                        componentInfo.type = q9h.LJIIJ();
                    }
                } else {
                    componentInfo.id = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return componentInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ComponentInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
