package X;

import Y.IDo0S413S0100000_13;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestJoinOrLeaveEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkAbnormalConnectionOptSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TRN extends TRM {
    public boolean LJLIL = true;
    public final /* synthetic */ MultiGuestV3GuestPresenter LJLILLLLZI;
    public final /* synthetic */ Room LJLJI;

    @Override // X.TUI
    public final void V(TZX provider) {
        Integer valueOf;
        boolean z;
        o.LJIIIZ(provider, "provider");
        LinkMessage linkMessage = (LinkMessage) provider.getSource();
        if (linkMessage != null && (valueOf = Integer.valueOf(linkMessage.messageType)) != null && (valueOf.intValue() == 19 || valueOf.intValue() == 21)) {
            int i = C74838TYs.LJ().LJJ;
            DataChannel dataChannel = this.LJLILLLLZI.mDataChannel;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            dataChannel.qv0(LinkInRoomGuestJoinOrLeaveEvent.class, new TRR(z));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = provider.LIZIZ().iterator();
        while (it.hasNext()) {
            arrayList.add(TV3.LIZ((LinkListUser) it.next()));
        }
        C74838TYs.LJ().LJJIJ = C76917UGr.LJJJJI(provider);
        InterfaceC74596TPk interfaceC74596TPk = (InterfaceC74596TPk) this.LJLILLLLZI.mView;
        if (interfaceC74596TPk != null) {
            interfaceC74596TPk.onPlayerListChange(arrayList);
        }
    }

    public TRN(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, Room room) {
        this.LJLILLLLZI = multiGuestV3GuestPresenter;
        this.LJLJI = room;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Integer, O] */
    @Override // X.TUI
    public final void LLILII(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> provider, int i) {
        LinkPlayerInfo linkPlayerInfo;
        int i2;
        MultiLiveGuestInfoList source;
        o.LJIIIZ(provider, "provider");
        DataChannel dataChannel = this.LJLILLLLZI.mDataChannel;
        Iterator<LinkPlayerInfo> it = provider.LIZIZ().iterator();
        do {
            linkPlayerInfo = null;
            if (!it.hasNext()) {
                break;
            } else {
                linkPlayerInfo = it.next();
            }
        } while (linkPlayerInfo.mFanTicketType != 1);
        LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
        if (linkPlayerInfo2 != null) {
            i2 = linkPlayerInfo2.mFanTicketType;
        } else {
            i2 = 0;
        }
        ((C32537Cpp) dataChannel.gv0(BDH.class)).LIZ = Integer.valueOf(i2);
        if (this.LJLIL) {
            if ((this.LJLILLLLZI.isNeedLeaveChannelWhenEnterRoom() || !LinkmicSdkAbnormalConnectionOptSetting.INSTANCE.isOpt()) && (source = provider.getSource()) != null) {
                Integer valueOf = Integer.valueOf(source.requestUserStatus);
                int intValue = valueOf.intValue();
                MultiGuestV3GuestPresenter.Companion.getClass();
                if (C47261Igj.LJJIJIIJI(2, 3, 4).contains(Integer.valueOf(intValue))) {
                    Room room = this.LJLJI;
                    valueOf.intValue();
                    BizLeaveParams bizLeaveParams = new BizLeaveParams(room.getOwner().getId());
                    InterfaceC75441TjB R6 = C8E.LJ().R6();
                    if (R6 != null) {
                        R6.LJJLIIIJ(new C76012TsO("leave_source_when_enter_room", 0L, bizLeaveParams, 10011, 2), new IDo0S413S0100000_13(provider, 1));
                    }
                }
            }
            this.LJLIL = false;
        }
        InterfaceC74596TPk interfaceC74596TPk = (InterfaceC74596TPk) this.LJLILLLLZI.mView;
        if (interfaceC74596TPk != null) {
            interfaceC74596TPk.onPlayerListChange(provider.LIZIZ());
        }
    }
}
