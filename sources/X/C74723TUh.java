package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.android.livesdk.model.message.LinkMicMessage;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TUh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74723TUh implements OnMessageListener, TV1 {
    public final boolean LJLIL;
    public final IMessageManager LJLILLLLZI;
    public final TRS LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(TU3.LJLIL);
    public final java.util.Map<Long, Long> LJLJJL = new LinkedHashMap();
    public final C74722TUg LJLJJLL = new C74722TUg(this);
    public final TRE LJLJL = new TRE(this);

    public final List<AbstractC74724TUi> LIZIZ() {
        return (List) this.LJLJJI.getValue();
    }

    public final long LIZJ(String str) {
        TQ8 tq8;
        AbstractC74727TUl LIZ;
        LinkListUser LJJIJIL;
        User user;
        InterfaceC31805Ce1 interfaceC31805Ce1;
        AbstractC74727TUl LIZ2;
        LinkPlayerInfo LJJIJIIJIL;
        User user2;
        if (this.LJLIL) {
            TRS trs = this.LJLJI;
            if ((trs instanceof InterfaceC31805Ce1) && (interfaceC31805Ce1 = (InterfaceC31805Ce1) trs) != null && (LIZ2 = interfaceC31805Ce1.LIZ()) != null && (LJJIJIIJIL = C76917UGr.LJJIJIIJIL(LIZ2, str)) != null && (user2 = LJJIJIIJIL.mUser) != null) {
                return user2.getId();
            }
        } else {
            TRS trs2 = this.LJLJI;
            if ((trs2 instanceof TQ8) && (tq8 = (TQ8) trs2) != null && (LIZ = tq8.LIZ()) != null && (LJJIJIL = C76917UGr.LJJIJIL(LIZ, str)) != null && (user = LJJIJIL.user) != null) {
                return user.getId();
            }
        }
        return 0L;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        LinkMicFanTicketMethod linkMicFanTicketMethod;
        FanTicketRoomNoticeContent fanTicketRoomNoticeContent;
        List<UserFanTicket> list;
        String str;
        AbstractC74727TUl LIZ;
        List<LinkListUser> LJJI;
        String str2;
        MultiGuestDataHolder multiGuestDataHolder;
        AbstractC74727TUl LIZ2;
        List<LinkPlayerInfo> LJJI2;
        U35 LIZ3;
        U35 LIZ4;
        if (!(iMessage instanceof LinkMicMessage) && (iMessage instanceof LinkMicFanTicketMethod) && (fanTicketRoomNoticeContent = (linkMicFanTicketMethod = (LinkMicFanTicketMethod) iMessage).fanTicketRoomNotice) != null && (list = fanTicketRoomNoticeContent.userFanTicket) != null) {
            for (UserFanTicket userTicket : list) {
                if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && (LIZ3 = TQA.LIZ()) != null && LIZ3.LJIIJJI() && (LIZ4 = TQA.LIZ()) != null) {
                    LIZ4.LJIILIIL(userTicket.userId, userTicket.matchTotalScore);
                }
                Iterator<AbstractC74724TUi> it = LIZIZ().iterator();
                while (true) {
                    str = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC74724TUi next = it.next();
                    if (userTicket.userId == next.LJFF()) {
                        FanTicketRoomNoticeContent fanTicketRoomNoticeContent2 = linkMicFanTicketMethod.fanTicketRoomNotice;
                        if (fanTicketRoomNoticeContent2 != null) {
                            str = fanTicketRoomNoticeContent2.fanTicketIconUrl;
                        }
                        next.LJIIJJI(str, userTicket.fanTicket);
                    }
                }
                o.LJIIIIZZ(userTicket, "userTicket");
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
                this.LJLJJL.put(Long.valueOf(userTicket.userId), Long.valueOf(userTicket.fanTicket));
                FanTicketRoomNoticeContent fanTicketRoomNoticeContent3 = linkMicFanTicketMethod.fanTicketRoomNotice;
                if (fanTicketRoomNoticeContent3 != null) {
                    str2 = fanTicketRoomNoticeContent3.fanTicketIconUrl;
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2) && (multiGuestDataHolder = (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER")) != null) {
                    FanTicketRoomNoticeContent fanTicketRoomNoticeContent4 = linkMicFanTicketMethod.fanTicketRoomNotice;
                    if (fanTicketRoomNoticeContent4 != null) {
                        str = fanTicketRoomNoticeContent4.fanTicketIconUrl;
                    }
                    multiGuestDataHolder.LJJIL = str;
                }
            }
        }
    }

    @Override // X.TV1
    public final LinkPlayerInfo LIZ(long j, String str) {
        TQ8 tq8;
        AbstractC74727TUl LIZ;
        List LJJI;
        Object obj;
        InterfaceC31805Ce1 interfaceC31805Ce1;
        AbstractC74727TUl LIZ2;
        List LJJI2;
        Object obj2 = null;
        if (this.LJLIL) {
            TRS trs = this.LJLJI;
            if (!(trs instanceof InterfaceC31805Ce1) || (interfaceC31805Ce1 = (InterfaceC31805Ce1) trs) == null || (LIZ2 = interfaceC31805Ce1.LIZ()) == null || (LJJI2 = LIZ2.LJJI()) == null) {
                return null;
            }
            Iterator it = LJJI2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) next;
                if (linkPlayerInfo.mUser.getId() == j && o.LJ(linkPlayerInfo.mInteractIdStr, str)) {
                    obj2 = next;
                    break;
                }
            }
            return (LinkPlayerInfo) obj2;
        }
        TRS trs2 = this.LJLJI;
        if (!(trs2 instanceof TQ8) || (tq8 = (TQ8) trs2) == null || (LIZ = tq8.LIZ()) == null || (LJJI = LIZ.LJJI()) == null) {
            return null;
        }
        Iterator it2 = LJJI.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                LinkListUser linkListUser = (LinkListUser) obj;
                User user = linkListUser.user;
                if (user != null && user.getId() == j && o.LJ(linkListUser.linkMicId, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LinkListUser linkListUser2 = (LinkListUser) obj;
        if (linkListUser2 == null) {
            return null;
        }
        return TV3.LIZ(linkListUser2);
    }

    public C74723TUh(Room room, boolean z, IMessageManager iMessageManager, TRS trs) {
        this.LJLIL = z;
        this.LJLILLLLZI = iMessageManager;
        this.LJLJI = trs;
    }
}
