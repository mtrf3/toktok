package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.privilege.FansPrivilegeDetailResponse;
import webcast.data._FansPrivilege_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _FansPrivilegeDetailResponse_Data_ProtoDecoder implements InterfaceC31105CIr<FansPrivilegeDetailResponse.Data> {
    public static FansPrivilegeDetailResponse.Data LIZIZ(Q9H q9h) {
        FansPrivilegeDetailResponse.Data data = new FansPrivilegeDetailResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.fansPrivilege = _FansPrivilege_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansPrivilegeDetailResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
