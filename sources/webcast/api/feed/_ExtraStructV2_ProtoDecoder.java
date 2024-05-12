package webcast.api.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ExtraStructV2_ProtoDecoder implements InterfaceC31105CIr<ExtraStructV2> {
    public static ExtraStructV2 LIZIZ(Q9H q9h) {
        ExtraStructV2 extraStructV2 = new ExtraStructV2();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        extraStructV2.logid = Q9J.LIZIZ(q9h);
                    }
                } else {
                    extraStructV2.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return extraStructV2;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ExtraStructV2 LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
