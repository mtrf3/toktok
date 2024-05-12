package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _CapsuleBizParamsCohost_ProtoDecoder implements InterfaceC31105CIr<CapsuleBizParamsCohost> {
    public static CapsuleBizParamsCohost LIZIZ(Q9H q9h) {
        CapsuleBizParamsCohost capsuleBizParamsCohost = new CapsuleBizParamsCohost();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            capsuleBizParamsCohost.rivalUser = _User_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        capsuleBizParamsCohost.isFollowedByRival = Q9J.LIZ(q9h);
                    }
                } else {
                    capsuleBizParamsCohost.availableFriendNumber = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return capsuleBizParamsCohost;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CapsuleBizParamsCohost LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
