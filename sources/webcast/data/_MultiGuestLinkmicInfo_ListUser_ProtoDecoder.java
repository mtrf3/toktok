package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import webcast.data.MultiGuestLinkmicInfo;

/* loaded from: classes14.dex */
public final class _MultiGuestLinkmicInfo_ListUser_ProtoDecoder implements InterfaceC31105CIr<MultiGuestLinkmicInfo.ListUser> {
    public static MultiGuestLinkmicInfo.ListUser LIZIZ(Q9H q9h) {
        MultiGuestLinkmicInfo.ListUser listUser = new MultiGuestLinkmicInfo.ListUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 4) {
                            if (LJI != 5) {
                                if (LJI != 7) {
                                    if (LJI != 10) {
                                        Q9J.LIZJ(q9h);
                                    } else {
                                        listUser.fanTicketIconType = q9h.LJIIJ();
                                    }
                                } else {
                                    listUser.fanTicket = q9h.LJIIJJI();
                                }
                            } else {
                                listUser.linkmicIdStr = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            listUser.roleType = (int) q9h.LJIIJJI();
                        }
                    } else {
                        listUser.modifyTime = q9h.LJIIJJI();
                    }
                } else {
                    listUser.user = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return listUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiGuestLinkmicInfo.ListUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
