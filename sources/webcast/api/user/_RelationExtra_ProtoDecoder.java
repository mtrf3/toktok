package webcast.api.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _RelationExtra_ProtoDecoder implements InterfaceC31105CIr<RelationExtra> {
    @Override // X.InterfaceC31105CIr
    public final RelationExtra LIZ(Q9H q9h) {
        RelationExtra relationExtra = new RelationExtra();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return relationExtra;
    }
}
