package webcast.api.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _MultiUserResponse_ProtoDecoder implements InterfaceC31105CIr<MultiUserResponse> {
    @Override // X.InterfaceC31105CIr
    public final MultiUserResponse LIZ(Q9H q9h) {
        MultiUserResponse multiUserResponse = new MultiUserResponse();
        multiUserResponse.data = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        multiUserResponse.extra = _UserExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    multiUserResponse.data.add(_User_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return multiUserResponse;
            }
        }
    }
}
