package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PerksPinPanel_ProtoDecoder implements InterfaceC31105CIr<PerksPinPanel> {
    public static PerksPinPanel LIZIZ(Q9H q9h) {
        PerksPinPanel perksPinPanel = new PerksPinPanel();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            perksPinPanel.status = q9h.LJIIJ();
                        }
                    } else {
                        perksPinPanel.pinnedIdStr = Q9J.LIZIZ(q9h);
                    }
                } else {
                    perksPinPanel.coolingDownTime = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return perksPinPanel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PerksPinPanel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
