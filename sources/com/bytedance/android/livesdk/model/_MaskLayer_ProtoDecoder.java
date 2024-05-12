package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _MaskLayer_ProtoDecoder implements InterfaceC31105CIr<MaskLayer> {
    public static MaskLayer LIZIZ(Q9H q9h) {
        MaskLayer maskLayer = new MaskLayer();
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
                                maskLayer.punishInfo = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            maskLayer.maskLayerType = q9h.LJIIJ();
                        }
                    } else {
                        maskLayer.subTitle = _Text_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    maskLayer.title = _Text_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return maskLayer;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MaskLayer LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
