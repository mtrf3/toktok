package webcast.data.multi_guest_play;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _ShowListUser_ProtoDecoder implements InterfaceC31105CIr<ShowListUser> {
    public static ShowListUser LIZIZ(Q9H q9h) {
        ShowListUser showListUser = new ShowListUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        showListUser.userId = q9h.LJIIJJI();
                        break;
                    case 2:
                        showListUser.status = q9h.LJIIJ();
                        break;
                    case 3:
                        showListUser.order = q9h.LJIIJ();
                        break;
                    case 4:
                        showListUser.showStartTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        showListUser.nickname = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        showListUser.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        showListUser.score = q9h.LJIIJJI();
                        break;
                    case 8:
                        showListUser.linkmicIdStr = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return showListUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ShowListUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
