package com.bytedance.android.livesdk.model.message.ext;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes13.dex */
public final class _EcDrawEntity_ProtoDecoder implements InterfaceC31105CIr<EcDrawEntity> {
    public static EcDrawEntity LIZIZ(Q9H q9h) {
        EcDrawEntity ecDrawEntity = new EcDrawEntity();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 11) {
                                if (LJI != 12) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    ecDrawEntity.incentiveRecordId = q9h.LJIIJJI();
                                }
                            } else {
                                ecDrawEntity.incentiveImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            ecDrawEntity.activityId = q9h.LJIIJJI();
                        }
                    } else {
                        ecDrawEntity.subType = q9h.LJIIJ();
                    }
                } else {
                    ecDrawEntity.type = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return ecDrawEntity;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EcDrawEntity LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
