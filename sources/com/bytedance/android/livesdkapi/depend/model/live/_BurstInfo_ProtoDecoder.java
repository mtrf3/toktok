package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes16.dex */
public final class _BurstInfo_ProtoDecoder implements InterfaceC31105CIr<BurstInfo> {
    @Override // X.InterfaceC31105CIr
    public final BurstInfo LIZ(Q9H q9h) {
        BurstInfo burstInfo = new BurstInfo();
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
                                burstInfo.propertyIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            burstInfo.propertyDefinitionId = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        burstInfo.multiple = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    burstInfo.burstTimeRemainSeconds = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return burstInfo;
            }
        }
    }
}
