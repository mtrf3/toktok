package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _AdminParam_ProtoDecoder implements InterfaceC31105CIr<AdminParam> {
    @Override // X.InterfaceC31105CIr
    public final AdminParam LIZ(Q9H q9h) {
        AdminParam adminParam = new AdminParam();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return adminParam;
    }
}
