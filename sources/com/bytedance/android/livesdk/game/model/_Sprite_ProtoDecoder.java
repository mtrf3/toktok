package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _Sprite_ProtoDecoder implements InterfaceC31105CIr<Sprite> {
    public static Sprite LIZIZ(Q9H q9h) {
        Sprite sprite = new Sprite();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        sprite.spriteUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        sprite.totalNum = q9h.LJIIJ();
                        break;
                    case 3:
                        sprite.xNum = q9h.LJIIJ();
                        break;
                    case 4:
                        sprite.yNum = q9h.LJIIJ();
                        break;
                    case 5:
                        sprite.imageHeight = q9h.LJIIJ();
                        break;
                    case 6:
                        sprite.imageWidth = q9h.LJIIJ();
                        break;
                    case 7:
                        sprite.url = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        sprite.spriteNum = q9h.LJIIJJI();
                        break;
                    case 9:
                        sprite.imageXNum = q9h.LJIIJJI();
                        break;
                    case 10:
                        sprite.imageYNum = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        sprite.fps = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return sprite;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Sprite LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
