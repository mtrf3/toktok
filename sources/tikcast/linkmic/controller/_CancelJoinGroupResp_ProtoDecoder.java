package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _CancelJoinGroupResp_ProtoDecoder implements InterfaceC31105CIr<CancelJoinGroupResp> {
    @Override // X.InterfaceC31105CIr
    public final CancelJoinGroupResp LIZ(Q9H q9h) {
        CancelJoinGroupResp cancelJoinGroupResp = new CancelJoinGroupResp();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    cancelJoinGroupResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return cancelJoinGroupResp;
            }
        }
    }
}
