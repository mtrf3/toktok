package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.sub.GetSubH5SharePageResponse;

/* loaded from: classes6.dex */
public final class _GetSubH5SharePageResponse_Data_SubscribePermission_ProtoDecoder implements InterfaceC31105CIr<GetSubH5SharePageResponse.Data.SubscribePermission> {
    public static GetSubH5SharePageResponse.Data.SubscribePermission LIZIZ(Q9H q9h) {
        GetSubH5SharePageResponse.Data.SubscribePermission subscribePermission = new GetSubH5SharePageResponse.Data.SubscribePermission();
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
    public final GetSubH5SharePageResponse.Data.SubscribePermission LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
