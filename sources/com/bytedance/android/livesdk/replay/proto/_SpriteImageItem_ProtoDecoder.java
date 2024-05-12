package com.bytedance.android.livesdk.replay.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SpriteImageItem_ProtoDecoder implements InterfaceC31105CIr<SpriteImageItem> {
    public static SpriteImageItem LIZIZ(Q9H q9h) {
        SpriteImageItem spriteImageItem = new SpriteImageItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        spriteImageItem.url = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        spriteImageItem.spriteNum = q9h.LJIIJJI();
                        break;
                    case 3:
                        spriteImageItem.imageXNum = q9h.LJIIJJI();
                        break;
                    case 4:
                        spriteImageItem.imageYNum = q9h.LJIIJJI();
                        break;
                    case 5:
                        spriteImageItem.imageHeight = q9h.LJIIJJI();
                        break;
                    case 6:
                        spriteImageItem.imageWidth = q9h.LJIIJJI();
                        break;
                    case 7:
                        spriteImageItem.fps = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return spriteImageItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SpriteImageItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
