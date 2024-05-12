package webcast.api.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AwemeStructV2_ProtoDecoder implements InterfaceC31105CIr<AwemeStructV2> {
    public static AwemeStructV2 LIZIZ(Q9H q9h) {
        AwemeStructV2 awemeStructV2 = new AwemeStructV2();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 30) {
                        if (LJI != 116) {
                            if (LJI != 126) {
                                Q9J.LIZJ(q9h);
                            } else {
                                awemeStructV2.cellRoom = _WebcastRoomFeedCellStructV2_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            awemeStructV2.commerceInfo = _AwemeCommerceStructV2_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        awemeStructV2.awemeType = q9h.LJIIJ();
                    }
                } else {
                    awemeStructV2.awemeId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return awemeStructV2;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AwemeStructV2 LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
