package com.bytedance.android.livesdk.model.message.linker.listchangemessage;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LinkListUser_ProtoDecoder implements InterfaceC31105CIr<LinkListUser> {
    public static LinkListUser LIZIZ(Q9H q9h) {
        LinkListUser linkListUser = new LinkListUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkListUser.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        linkListUser.modifyTime = q9h.LJIIJJI();
                        break;
                    case 3:
                        linkListUser.linkType = q9h.LJIIJ();
                        break;
                    case 4:
                        linkListUser.roleType = q9h.LJIIJ();
                        break;
                    case 5:
                        linkListUser.linkMicId = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        linkListUser.payedMoney = q9h.LJIIJJI();
                        break;
                    case 7:
                        linkListUser.fanTicket = q9h.LJIIJJI();
                        break;
                    case 8:
                        linkListUser.fanTicketType = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkListUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkListUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
