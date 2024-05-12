package webcast.api.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _WebcastRoomFeedCellStructV2_ProtoDecoder implements InterfaceC31105CIr<WebcastRoomFeedCellStructV2> {
    public static WebcastRoomFeedCellStructV2 LIZIZ(Q9H q9h) {
        WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2 = new WebcastRoomFeedCellStructV2();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 8) {
                    Q9J.LIZJ(q9h);
                } else {
                    webcastRoomFeedCellStructV2.rawdata = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return webcastRoomFeedCellStructV2;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final WebcastRoomFeedCellStructV2 LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
