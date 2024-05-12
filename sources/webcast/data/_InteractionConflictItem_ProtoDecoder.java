package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _InteractionConflictItem_ProtoDecoder implements InterfaceC31105CIr<InteractionConflictItem> {
    public static InteractionConflictItem LIZIZ(Q9H q9h) {
        InteractionConflictItem interactionConflictItem = new InteractionConflictItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    interactionConflictItem.itemtype = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return interactionConflictItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final InteractionConflictItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
