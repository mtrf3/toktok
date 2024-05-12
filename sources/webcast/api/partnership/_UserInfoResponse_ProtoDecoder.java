package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _UserInfoResponse_ProtoDecoder implements InterfaceC31105CIr<UserInfoResponse> {
    @Override // X.InterfaceC31105CIr
    public final UserInfoResponse LIZ(Q9H q9h) {
        UserInfoResponse userInfoResponse = new UserInfoResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    userInfoResponse.data = _UserInfoResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return userInfoResponse;
            }
        }
    }
}
