package com.bytedance.android.livesdk.feed.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _ItemTabExtra_ProtoDecoder implements InterfaceC31105CIr<ItemTabExtra> {
    @Override // X.InterfaceC31105CIr
    public final ItemTabExtra LIZ(Q9H q9h) {
        ItemTabExtra itemTabExtra = new ItemTabExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    itemTabExtra.title = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return itemTabExtra;
            }
        }
    }
}
