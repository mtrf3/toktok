package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.depend.model.live.RoomShortTouchAreaConfig;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _RoomShortTouchAreaConfig_ProtoDecoder implements InterfaceC31105CIr<RoomShortTouchAreaConfig> {
    @Override // X.InterfaceC31105CIr
    public final RoomShortTouchAreaConfig LIZ(Q9H q9h) {
        RoomShortTouchAreaConfig roomShortTouchAreaConfig = new RoomShortTouchAreaConfig();
        roomShortTouchAreaConfig.elements = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    long LIZJ2 = q9h.LIZJ();
                    Integer num = null;
                    RoomShortTouchAreaConfig.Element element = null;
                    while (true) {
                        int LJI2 = q9h.LJI();
                        if (LJI2 == -1) {
                            break;
                        }
                        if (LJI2 != 1) {
                            if (LJI2 == 2) {
                                element = _RoomShortTouchAreaConfig_Element_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            num = Integer.valueOf(q9h.LJIIJ());
                        }
                    }
                    q9h.LJ(LIZJ2);
                    if (num != null) {
                        if (element != null) {
                            roomShortTouchAreaConfig.elements.put(num, element);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                q9h.LJ(LIZJ);
                return roomShortTouchAreaConfig;
            }
        }
    }
}
