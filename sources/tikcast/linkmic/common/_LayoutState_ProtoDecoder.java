package tikcast.linkmic.common;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LayoutState_ProtoDecoder implements InterfaceC31105CIr<LayoutState> {
    public static LayoutState LIZIZ(Q9H q9h) {
        LayoutState layoutState = new LayoutState();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    layoutState.layoutId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return layoutState;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LayoutState LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
