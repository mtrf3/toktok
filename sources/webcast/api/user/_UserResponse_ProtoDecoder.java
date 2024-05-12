package webcast.api.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _UserResponse_ProtoDecoder implements InterfaceC31105CIr<UserResponse> {
    @Override // X.InterfaceC31105CIr
    public final UserResponse LIZ(Q9H q9h) {
        UserResponse userResponse = new UserResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        userResponse.extra = _UserExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    userResponse.data = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return userResponse;
            }
        }
    }
}
