package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.privilege.QueryUserPrivilegesResponse;

/* loaded from: classes6.dex */
public final class _QueryUserPrivilegesResponse_PrivilegeTab_ProtoDecoder implements InterfaceC31105CIr<QueryUserPrivilegesResponse.PrivilegeTab> {
    public static QueryUserPrivilegesResponse.PrivilegeTab LIZIZ(Q9H q9h) {
        QueryUserPrivilegesResponse.PrivilegeTab privilegeTab = new QueryUserPrivilegesResponse.PrivilegeTab();
        privilegeTab.privilegeList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            privilegeTab.privilegeList.add(_UserPrivilege_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        privilegeTab.tabName = Q9J.LIZIZ(q9h);
                    }
                } else {
                    privilegeTab.tabType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return privilegeTab;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QueryUserPrivilegesResponse.PrivilegeTab LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
