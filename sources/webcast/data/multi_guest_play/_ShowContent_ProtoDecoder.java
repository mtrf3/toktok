package webcast.data.multi_guest_play;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _ShowContent_ProtoDecoder implements InterfaceC31105CIr<ShowContent> {
    public static ShowContent LIZIZ(Q9H q9h) {
        ShowContent showContent = new ShowContent();
        showContent.showingAndReadyList = new ArrayList();
        showContent.finishedList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        showContent.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        showContent.channelId = q9h.LJIIJJI();
                        break;
                    case 3:
                        showContent.showId = q9h.LJIIJJI();
                        break;
                    case 4:
                        showContent.showStatus = q9h.LJIIJ();
                        break;
                    case 5:
                        showContent.version = q9h.LJIIJJI();
                        break;
                    case 6:
                        showContent.showCreateTime = q9h.LJIIJJI();
                        break;
                    case 7:
                        showContent.showConfig = _ShowConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 9:
                        showContent.showingAndReadyList.add(_ShowListUser_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 10:
                        showContent.finishedList.add(_ShowListUser_ProtoDecoder.LIZIZ(q9h));
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return showContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ShowContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
