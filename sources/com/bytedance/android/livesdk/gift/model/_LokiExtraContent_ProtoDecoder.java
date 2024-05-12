package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _LokiExtraContent_ProtoDecoder implements InterfaceC31105CIr<LokiExtraContent> {
    public static LokiExtraContent LIZIZ(Q9H q9h) {
        LokiExtraContent lokiExtraContent = new LokiExtraContent();
        lokiExtraContent.requirements = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        lokiExtraContent.giftType = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        lokiExtraContent.giftDuration = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        lokiExtraContent.needScreenShot = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        lokiExtraContent.ismultiFrame = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        lokiExtraContent.viewOverlay = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        lokiExtraContent.befViewRenderSize = _BEFViewRenderSize_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        lokiExtraContent.befViewRenderFPS = q9h.LJIIJ();
                        break;
                    case 8:
                        lokiExtraContent.befViewFitMode = q9h.LJIIJ();
                        break;
                    case 9:
                        lokiExtraContent.modelNames = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        lokiExtraContent.requirements.add(Q9J.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return lokiExtraContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LokiExtraContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
