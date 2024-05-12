package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _SpotlightUpdateItem_ProtoDecoder implements InterfaceC31105CIr<SpotlightUpdateItem> {
    public static SpotlightUpdateItem LIZIZ(Q9H q9h) {
        SpotlightUpdateItem spotlightUpdateItem = new SpotlightUpdateItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            spotlightUpdateItem.isPinned = Q9J.LIZ(q9h);
                        }
                    } else {
                        spotlightUpdateItem.uri = Q9J.LIZIZ(q9h);
                    }
                } else {
                    spotlightUpdateItem.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return spotlightUpdateItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SpotlightUpdateItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
