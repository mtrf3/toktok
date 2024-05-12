package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizApplyParams_ProtoDecoder implements InterfaceC31105CIr<BizApplyParams> {
    @Override // X.InterfaceC31105CIr
    public final BizApplyParams LIZ(Q9H q9h) {
        BizApplyParams bizApplyParams = new BizApplyParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                bizApplyParams.follow = Q9J.LIZ(q9h);
                            }
                        } else {
                            bizApplyParams.userReturnType = q9h.LJIIJ();
                        }
                    } else {
                        bizApplyParams.anchorId = q9h.LJIIJJI();
                    }
                } else {
                    bizApplyParams.linkType = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizApplyParams;
            }
        }
    }
}
