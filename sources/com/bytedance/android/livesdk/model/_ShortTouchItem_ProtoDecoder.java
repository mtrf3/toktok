package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ShortTouchItem_ProtoDecoder implements InterfaceC31105CIr<ShortTouchItem> {
    public static ShortTouchItem LIZIZ(Q9H q9h) {
        ShortTouchItem shortTouchItem = new ShortTouchItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        shortTouchItem.schema = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        shortTouchItem.width = q9h.LJIIJJI();
                        break;
                    case 3:
                        shortTouchItem.height = q9h.LJIIJJI();
                        break;
                    case 4:
                        shortTouchItem.topMargin = q9h.LJIIJJI();
                        break;
                    case 5:
                        shortTouchItem.leftMargin = q9h.LJIIJJI();
                        break;
                    case 6:
                        shortTouchItem.fcSecond = q9h.LJIIJJI();
                        break;
                    case 7:
                        shortTouchItem.name = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        shortTouchItem.previewSetting = _ShortTouchPreviewSetting_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        shortTouchItem.animeType = q9h.LJIIJ();
                        break;
                    case 10:
                        shortTouchItem.iconSkin = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return shortTouchItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ShortTouchItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
