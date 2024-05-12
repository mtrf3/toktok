package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _KickOutBizContent_ProtoDecoder implements InterfaceC31105CIr<KickOutBizContent> {
    public static KickOutBizContent LIZIZ(Q9H q9h) {
        KickOutBizContent kickOutBizContent = new KickOutBizContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            kickOutBizContent.kickPlayerUserInfo = _User_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        kickOutBizContent.operatorLinkAdminType = q9h.LJIIJ();
                    }
                } else {
                    kickOutBizContent.operatorUserInfo = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return kickOutBizContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final KickOutBizContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
