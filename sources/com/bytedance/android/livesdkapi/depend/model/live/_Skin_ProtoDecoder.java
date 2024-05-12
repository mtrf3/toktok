package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _Skin_ProtoDecoder implements InterfaceC31105CIr<Skin> {
    public static Skin LIZIZ(Q9H q9h) {
        Skin skin = new Skin();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            skin.scene = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        skin.drawerEntrance = _SkinDrawerEntrance_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    skin.account = _SkinHostAccount_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return skin;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Skin LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
