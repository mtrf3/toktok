package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _NewAnchorGuideConfig_ProtoDecoder implements InterfaceC31105CIr<NewAnchorGuideConfig> {
    public static NewAnchorGuideConfig LIZIZ(Q9H q9h) {
        NewAnchorGuideConfig newAnchorGuideConfig = new NewAnchorGuideConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        newAnchorGuideConfig.anchorId = q9h.LJIIJJI();
                        break;
                    case 2:
                        newAnchorGuideConfig.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        newAnchorGuideConfig.iconStyle = q9h.LJIIJ();
                        break;
                    case 4:
                        newAnchorGuideConfig.title = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        newAnchorGuideConfig.button = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        newAnchorGuideConfig.text = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        newAnchorGuideConfig.displayDuration = q9h.LJIIJ();
                        break;
                    case 8:
                        newAnchorGuideConfig.effectParams = _NewAnchorEffectParams_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return newAnchorGuideConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final NewAnchorGuideConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
