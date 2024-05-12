package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _InteractionConflict_ProtoDecoder implements InterfaceC31105CIr<InteractionConflict> {
    public static InteractionConflict LIZIZ(Q9H q9h) {
        InteractionConflict interactionConflict = new InteractionConflict();
        interactionConflict.conflictlist = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            interactionConflict.prompts = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        interactionConflict.conflictlist.add(_InteractionConflictItem_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    interactionConflict.isconflict = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return interactionConflict;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final InteractionConflict LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
