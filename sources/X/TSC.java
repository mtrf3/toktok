package X;

import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestJoinOrLeaveEvent;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TSC extends TSD {
    public final /* synthetic */ GameLinkGuestPresenter LIZ;

    public TSC(GameLinkGuestPresenter gameLinkGuestPresenter) {
        this.LIZ = gameLinkGuestPresenter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC74708TTs
    public final void LJJIJLIJ(TU4 provider) {
        Integer valueOf;
        boolean z;
        o.LJIIIZ(provider, "provider");
        LinkMessage linkMessage = (LinkMessage) provider.LIZ;
        if (linkMessage != null && (valueOf = Integer.valueOf(linkMessage.messageType)) != null && (valueOf.intValue() == 19 || valueOf.intValue() == 21)) {
            int i = C74838TYs.LJ().LJJ;
            DataChannel dataChannel = this.LIZ.mDataChannel;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            dataChannel.qv0(LinkInRoomGuestJoinOrLeaveEvent.class, new TRR(z));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = provider.LIZLLL().iterator();
        while (it.hasNext()) {
            arrayList.add(TV2.LIZ((LinkListUser) it.next()));
        }
        C74838TYs.LJ().LJJIJ = C60903NvH.LJIJJ(provider);
        TSX tsx = (TSX) this.LIZ.mView;
        if (tsx != null) {
            tsx.onPlayerListChange(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC74708TTs
    public final void LJJIL(TU4 provider, boolean z) {
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        o.LJIIIZ(provider, "provider");
        if (z && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) provider.LIZ) != null) {
            Integer valueOf = Integer.valueOf(multiLiveGuestInfoList.requestUserStatus);
            int intValue = valueOf.intValue();
            GameLinkGuestPresenter.Companion.getClass();
            if (C47261Igj.LJJIJIIJI(2, 3, 4).contains(Integer.valueOf(intValue))) {
                GameLinkGuestPresenter gameLinkGuestPresenter = this.LIZ;
                valueOf.intValue();
                BizLeaveParams bizLeaveParams = new BizLeaveParams(gameLinkGuestPresenter.getRoom().getOwner().getId());
                InterfaceC75441TjB R6 = gameLinkGuestPresenter.getGamelinkManager().R6();
                if (R6 != null) {
                    R6.LJJLIIIJ(new C76012TsO("leave_source_when_enter_room", 0L, bizLeaveParams, 10011, 2), new TSF(provider, gameLinkGuestPresenter));
                }
            }
        }
        TSX tsx = (TSX) this.LIZ.mView;
        if (tsx != null) {
            tsx.onPlayerListChange(provider.LIZLLL());
        }
    }
}
