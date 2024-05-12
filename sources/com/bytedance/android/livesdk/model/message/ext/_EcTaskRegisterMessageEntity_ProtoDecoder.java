package com.bytedance.android.livesdk.model.message.ext;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _EcTaskRegisterMessageEntity_ProtoDecoder implements InterfaceC31105CIr<EcTaskRegisterMessageEntity> {
    public static EcTaskRegisterMessageEntity LIZIZ(Q9H q9h) {
        EcTaskRegisterMessageEntity ecTaskRegisterMessageEntity = new EcTaskRegisterMessageEntity();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        ecTaskRegisterMessageEntity.taskId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    ecTaskRegisterMessageEntity.interval = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return ecTaskRegisterMessageEntity;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EcTaskRegisterMessageEntity LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
