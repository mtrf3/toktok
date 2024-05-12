package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _PreviewRoom_ProtoDecoder implements InterfaceC31105CIr<PreviewRoom> {
    @Override // X.InterfaceC31105CIr
    public final PreviewRoom LIZ(Q9H q9h) {
        PreviewRoom previewRoom = new PreviewRoom();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        previewRoom.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        previewRoom.liveId = q9h.LJIIJJI();
                        break;
                    case 3:
                        previewRoom.identity = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        previewRoom.cursor = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        previewRoom.accountType = q9h.LJIIJJI();
                        break;
                    case 6:
                        previewRoom.enterUniqId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return previewRoom;
            }
        }
    }
}
