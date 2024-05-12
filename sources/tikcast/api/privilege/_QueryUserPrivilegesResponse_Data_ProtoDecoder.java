package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.privilege.QueryUserPrivilegesResponse;

/* loaded from: classes6.dex */
public final class _QueryUserPrivilegesResponse_Data_ProtoDecoder implements InterfaceC31105CIr<QueryUserPrivilegesResponse.Data> {
    public static QueryUserPrivilegesResponse.Data LIZIZ(Q9H q9h) {
        QueryUserPrivilegesResponse.Data data = new QueryUserPrivilegesResponse.Data();
        data.tabList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            data.tabList.add(_QueryUserPrivilegesResponse_PrivilegeTab_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        data.privilegeTabCount = q9h.LJIIJ();
                    }
                } else {
                    data.showEntrance = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QueryUserPrivilegesResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
