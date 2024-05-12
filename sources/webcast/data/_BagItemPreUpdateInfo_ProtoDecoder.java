package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _BagItemPreUpdateInfo_ProtoDecoder implements InterfaceC31105CIr<BagItemPreUpdateInfo> {
    public static BagItemPreUpdateInfo LIZIZ(Q9H q9h) {
        BagItemPreUpdateInfo bagItemPreUpdateInfo = new BagItemPreUpdateInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        bagItemPreUpdateInfo.minExpireAt = q9h.LJIIJJI();
                    }
                } else {
                    bagItemPreUpdateInfo.count = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return bagItemPreUpdateInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BagItemPreUpdateInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
