package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DriveItem_ProtoDecoder implements InterfaceC31105CIr<DriveItem> {
    public static DriveItem LIZIZ(Q9H q9h) {
        DriveItem driveItem = new DriveItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            driveItem.count = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        driveItem.type = Integer.valueOf(q9h.LJIIJ());
                    }
                } else {
                    driveItem.level = Integer.valueOf(q9h.LJIIJ());
                }
            } else {
                q9h.LJ(LIZJ);
                return driveItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DriveItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
