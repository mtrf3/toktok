package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* loaded from: classes6.dex */
public final class _GetSubPrivilegeDetailResponse_Data_SubscribePermission_ProtoDecoder implements InterfaceC31105CIr<GetSubPrivilegeDetailResponse.Data.SubscribePermission> {
    public static GetSubPrivilegeDetailResponse.Data.SubscribePermission LIZIZ(Q9H q9h) {
        GetSubPrivilegeDetailResponse.Data.SubscribePermission subscribePermission = new GetSubPrivilegeDetailResponse.Data.SubscribePermission();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        subscribePermission.forbiddenToast = Q9J.LIZIZ(q9h);
                    }
                } else {
                    subscribePermission.canSubscribe = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subscribePermission;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetSubPrivilegeDetailResponse.Data.SubscribePermission LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
