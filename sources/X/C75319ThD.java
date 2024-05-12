package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ThD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75319ThD implements OnMessageListener {
    public final /* synthetic */ AbstractC75323ThH LJLIL;

    public C75319ThD(AbstractC75323ThH abstractC75323ThH) {
        this.LJLIL = abstractC75323ThH;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        List<UserFanTicket> list;
        AbstractC74727TUl LIZ;
        List<LinkListUser> LJJI;
        AbstractC74727TUl LIZ2;
        List<LinkPlayerInfo> LJJI2;
        if (iMessage instanceof LinkMicFanTicketMethod) {
            MutableLiveData<String> LJII = this.LJLIL.LJII();
            LinkMicFanTicketMethod linkMicFanTicketMethod = (LinkMicFanTicketMethod) iMessage;
            FanTicketRoomNoticeContent fanTicketRoomNoticeContent = linkMicFanTicketMethod.fanTicketRoomNotice;
            if (fanTicketRoomNoticeContent != null) {
                str = fanTicketRoomNoticeContent.fanTicketIconUrl;
            } else {
                str = null;
            }
            AbstractC75323ThH.LJIILJJIL(LJII, str);
            FanTicketRoomNoticeContent fanTicketRoomNoticeContent2 = linkMicFanTicketMethod.fanTicketRoomNotice;
            if (fanTicketRoomNoticeContent2 != null && (list = fanTicketRoomNoticeContent2.userFanTicket) != null) {
                AbstractC75323ThH abstractC75323ThH = this.LJLIL;
                for (UserFanTicket userTicket : list) {
                    o.LJIIIIZZ(userTicket, "userTicket");
                    abstractC75323ThH.getClass();
                    if (TV3.LIZJ()) {
                        InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                        if (interfaceC31805Ce1 != null && (LIZ2 = interfaceC31805Ce1.LIZ()) != null && (LJJI2 = LIZ2.LJJI()) != null) {
                            for (LinkPlayerInfo linkPlayerInfo : LJJI2) {
                                User user = linkPlayerInfo.mUser;
                                if (user != null && user.getId() == userTicket.userId) {
                                    linkPlayerInfo.mFanTicket = userTicket.fanTicket;
                                }
                            }
                        }
                    } else {
                        TQ8 tq8 = (TQ8) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                        if (tq8 != null && (LIZ = tq8.LIZ()) != null && (LJJI = LIZ.LJJI()) != null) {
                            for (LinkListUser linkListUser : LJJI) {
                                User user2 = linkListUser.user;
                                if (user2 != null && user2.getId() == userTicket.userId) {
                                    linkListUser.fanTicket = userTicket.fanTicket;
                                }
                            }
                        }
                    }
                    C75330ThO value = abstractC75323ThH.LJFF().getValue();
                    if (value != null && userTicket.userId == value.LJLIL) {
                        AbstractC75323ThH.LJIILJJIL(abstractC75323ThH.LJI(), Long.valueOf(userTicket.fanTicket));
                    }
                }
            }
        }
    }
}
