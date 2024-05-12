package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _ShortTouchInfo_ProtoDecoder implements InterfaceC31105CIr<ShortTouchInfo> {
    public static ShortTouchInfo LIZIZ(Q9H q9h) {
        ShortTouchInfo shortTouchInfo = new ShortTouchInfo();
        shortTouchInfo.subItemList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        shortTouchInfo.shortTouchUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        shortTouchInfo.shortTouchFallbackUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        shortTouchInfo.containerType = q9h.LJIIJ();
                        break;
                    case 4:
                        shortTouchInfo.width = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 5:
                        shortTouchInfo.height = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 6:
                        shortTouchInfo.imgUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        shortTouchInfo.jumpSchema = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        shortTouchInfo.showAnimation = q9h.LJIIJ();
                        break;
                    case 9:
                        shortTouchInfo.animationType = q9h.LJIIJ();
                        break;
                    case 10:
                        shortTouchInfo.subItemList.add(Q9J.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return shortTouchInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ShortTouchInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
