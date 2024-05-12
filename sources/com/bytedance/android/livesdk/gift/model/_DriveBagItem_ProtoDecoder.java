package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DriveBagItem_ProtoDecoder implements InterfaceC31105CIr<DriveBagItem> {
    @Override // X.InterfaceC31105CIr
    public final DriveBagItem LIZ(Q9H q9h) {
        DriveBagItem driveBagItem = new DriveBagItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            driveBagItem.equipped = Boolean.valueOf(Q9J.LIZ(q9h));
                        }
                    } else {
                        driveBagItem.nextExpire = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    driveBagItem.item = _DriveItem_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return driveBagItem;
            }
        }
    }
}
