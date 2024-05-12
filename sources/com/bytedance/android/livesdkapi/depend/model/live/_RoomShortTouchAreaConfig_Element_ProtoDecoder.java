package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.RoomShortTouchAreaConfig;

/* loaded from: classes14.dex */
public final class _RoomShortTouchAreaConfig_Element_ProtoDecoder implements InterfaceC31105CIr<RoomShortTouchAreaConfig.Element> {
    public static RoomShortTouchAreaConfig.Element LIZIZ(Q9H q9h) {
        RoomShortTouchAreaConfig.Element element = new RoomShortTouchAreaConfig.Element();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        element.priority = Integer.valueOf(q9h.LJIIJ());
                    }
                } else {
                    element.type = Integer.valueOf(q9h.LJIIJ());
                }
            } else {
                q9h.LJ(LIZJ);
                return element;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomShortTouchAreaConfig.Element LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
