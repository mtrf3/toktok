package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.api.AdjustVideoInteractStreamBottomEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.event.PlayerChangeLayoutParamEvent;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.o;

/* renamed from: X.TlH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75571TlH implements InterfaceC75580TlQ, OnMessageListener {
    public final ViewGroup LJLIL;
    public final DataChannel LJLILLLLZI;
    public IMessageManager LJLJI;
    public boolean LJLJJI;
    public final String LJLJJL;

    @Override // X.InterfaceC75580TlQ
    public final int LIZ() {
        return 2;
    }

    @Override // X.InterfaceC75580TlQ
    public final void LIZIZ(OSZ<Integer, Integer> osz) {
    }

    @Override // X.InterfaceC75580TlQ
    public final void init() {
        LJIIIIZZ(false);
    }

    @Override // X.InterfaceC75580TlQ
    public final int scene() {
        return 2;
    }

    @Override // X.InterfaceC75580TlQ
    public final void LIZLLL() {
        if (this.LJLJJI) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJL);
        LIZ.append("_onMessage receive  close or leave msg");
        C0NB.LIZIZ("1VNExperienceV1", X1D.LIZIZ(LIZ));
        LJIIIIZZ(true);
    }

    @Override // X.InterfaceC75580TlQ
    public final boolean LJI() {
        return !this.LJLJJI;
    }

    @Override // X.InterfaceC75580TlQ
    public final void release() {
        StringBuilder LIZ = X1D.LIZ();
        C12400eC.LIZIZ(LIZ, this.LJLJJL, "_release", LIZ, "1VNExperienceV1");
        IMessageManager iMessageManager = this.LJLJI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LJLJI = null;
    }

    @Override // X.InterfaceC75580TlQ
    public final void LIZJ(Room room) {
        o.LJIIIZ(room, "room");
        if (this.LJLJI != null) {
            StringBuilder LIZ = X1D.LIZ();
            C12400eC.LIZIZ(LIZ, this.LJLJJL, "_initMessageManager return messageManager has init or room is null", LIZ, "1VNExperienceV1");
            return;
        }
        IMessageManager iMessageManager = ((IMessageService) CN1.LIZ(IMessageService.class)).get(room.getId());
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), this);
        } else {
            iMessageManager = null;
        }
        this.LJLJI = iMessageManager;
    }

    @Override // X.InterfaceC75580TlQ
    public final void LJ(C76696U8e layout) {
        o.LJIIIZ(layout, "layout");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJL);
        LIZ.append("_updatePlayer");
        C0NB.LIZIZ("1VNExperienceV1", X1D.LIZIZ(LIZ));
        Rect playerRange = layout.getPlayerRange();
        B5A b5a = new B5A(playerRange.width(), playerRange.height(), playerRange.top, playerRange.left, playerRange.right - playerRange.width(), false);
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.qv0(PlayerChangeLayoutParamEvent.class, b5a);
        }
    }

    @Override // X.InterfaceC75580TlQ
    public final boolean LJFF(Room room) {
        o.LJIIIZ(room, "room");
        if (room.getLinkMicInfo() != null && room.getLinkMicInfo().channelId > 0 && room.getLinkMicInfo().rivalAnchorId > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC75580TlQ
    public final void LJII(Rect rect) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJL);
        LIZ.append("_updateContent contentRect = ");
        LIZ.append(rect);
        C0NB.LIZIZ("1VNExperienceV1", X1D.LIZIZ(LIZ));
        C32208CkW c32208CkW = new C32208CkW(0);
        c32208CkW.LIZIZ = rect.height() + rect.top;
        c32208CkW.LIZJ = C76265TwT.LJ();
        c32208CkW.LIZLLL = 0;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.rv0(LinkCrossRoomStateChangeEvent.class, c32208CkW);
        }
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 != null) {
            dataChannel2.rv0(AdjustVideoInteractStreamBottomEvent.class, new C31731Ccp(rect.top, rect.bottom));
        }
    }

    public final void LJIIIIZZ(boolean z) {
        this.LJLJJI = z;
        if (z) {
            IMessageManager iMessageManager = this.LJLJI;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(this);
            }
            this.LJLJI = null;
            release();
            B5A b5a = new B5A(-1, -1, 0, 0, 0, true);
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel != null) {
                dataChannel.qv0(PlayerChangeLayoutParamEvent.class, b5a);
            }
            DataChannel dataChannel2 = this.LJLILLLLZI;
            if (dataChannel2 != null) {
                dataChannel2.rv0(LinkCrossRoomStateChangeEvent.class, new C32208CkW(1));
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJL);
        LIZ.append("_updateIsLinkMicClose value = ");
        C19U.LIZJ(LIZ, this.LJLJJI, LIZ, "1VNExperienceV1");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof LinkMessage) {
            int i = ((LinkMessage) iMessage).messageType;
            if (i == 7 || i == 2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LJLJJL);
                LIZ.append("_onMessage receive  close or leave msg");
                C0NB.LIZIZ("1VNExperienceV1", X1D.LIZIZ(LIZ));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.LJLJJL);
                LIZ2.append("_updateLinkMicState2Close");
                C0NB.LIZIZ("1VNExperienceV1", X1D.LIZIZ(LIZ2));
                LJIIIIZZ(true);
            }
        }
    }

    public C75571TlH(ViewGroup viewGroup, DataChannel dataChannel) {
        o.LJIIIZ(viewGroup, "viewGroup");
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = dataChannel;
        this.LJLJJL = "MultiCoHostPreAdjustPlayerHandler";
    }
}
