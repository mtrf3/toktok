package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceVideoViewParams;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestShareBgRtlOptSetting;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.o;

/* renamed from: X.Tfv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75239Tfv implements InterfaceC75580TlQ, OnMessageListener {
    public final ViewGroup LJLIL;
    public final DataChannel LJLILLLLZI;
    public IMessageManager LJLJI;
    public boolean LJLJJI;
    public final String LJLJJL;
    public final FrameLayout LJLJJLL;
    public final InterfaceC75238Tfu LJLJL;

    @Override // X.InterfaceC75580TlQ
    public final int LIZ() {
        return 5;
    }

    @Override // X.InterfaceC75580TlQ
    public final void init() {
        LJIIIIZZ(false);
        C16880lQ.LJLLL(this.LJLJJLL, this.LJLIL);
        this.LJLIL.addView(this.LJLJJLL);
    }

    @Override // X.InterfaceC75580TlQ
    public final int scene() {
        return 4;
    }

    @Override // X.InterfaceC75580TlQ
    public final void LIZLLL() {
        if (this.LJLJJI) {
            return;
        }
        LJIIIIZZ(true);
    }

    @Override // X.InterfaceC75580TlQ
    public final boolean LJI() {
        return !this.LJLJJI;
    }

    @Override // X.InterfaceC75580TlQ
    public final void release() {
        if (this.LJLJJI) {
            this.LJLJL.LJFF();
        }
        C16880lQ.LJLLL(this.LJLJJLL, this.LJLIL);
    }

    @Override // X.InterfaceC75580TlQ
    public final void LIZIZ(OSZ<Integer, Integer> osz) {
        this.LJLJL.LIZIZ(osz);
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
            iMessageManager.addMessageListener(EnumC31509CYf.BASE_LINK_LAYER_MESSAGE.getIntType(), this);
        } else {
            iMessageManager = null;
        }
        this.LJLJI = iMessageManager;
    }

    @Override // X.InterfaceC75580TlQ
    public final void LJ(C76696U8e layout) {
        o.LJIIIZ(layout, "layout");
        Rect playerRange = layout.getPlayerRange();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJL);
        LIZ.append("_updatePlayer rect = ");
        LIZ.append(playerRange);
        C0NB.LIZIZ("1VNExperienceV1", X1D.LIZIZ(LIZ));
        int width = playerRange.width();
        int height = playerRange.height();
        int i = playerRange.top;
        int i2 = playerRange.left;
        int width2 = this.LJLIL.getWidth() - playerRange.right;
        String layoutName = layout.getLayoutName();
        if (layoutName == null) {
            layoutName = EnumC74991Tbv.NORMAL.name();
        }
        C28212B5k c28212B5k = new C28212B5k(width, height, i, i2, width2, false, EnumC74991Tbv.valueOf(layoutName), "pre adjust manager", null, 256);
        StringBuilder LIZ2 = X1D.LIZ();
        C12400eC.LIZIZ(LIZ2, this.LJLJJL, "_sendAdjustPlayerEvent", LIZ2, "1VNExperienceV1");
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.rv0(AudienceVideoViewParams.class, c28212B5k);
        }
    }

    @Override // X.InterfaceC75580TlQ
    public final boolean LJFF(Room room) {
        o.LJIIIZ(room, "room");
        return room.isWithLinkMic();
    }

    @Override // X.InterfaceC75580TlQ
    public final void LJII(Rect rect) {
        this.LJLJL.LIZJ(rect);
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
            C28212B5k c28212B5k = new C28212B5k(-1, -1, 0, 0, 0, true, EnumC74991Tbv.valueOf(EnumC74991Tbv.NORMAL.name()), "pre adjust manager", null, 256);
            StringBuilder LIZ = X1D.LIZ();
            C12400eC.LIZIZ(LIZ, this.LJLJJL, "_sendFullScreenEvent", LIZ, "1VNExperienceV1");
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel != null) {
                dataChannel.rv0(AudienceVideoViewParams.class, c28212B5k);
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJLJJL);
        LIZ2.append("_updateIsLinkMicClose value = ");
        C19U.LIZJ(LIZ2, this.LJLJJI, LIZ2, "1VNExperienceV1");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if ((iMessage instanceof LinkLayerMessage) && ((LinkLayerMessage) iMessage).messageType == 10) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJJL);
            LIZ.append("_onMessage receive destroy channel msg");
            C0NB.LIZIZ("1VNExperienceV1", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJLJJL);
            LIZ2.append("_updateLinkMicState2Close");
            C0NB.LIZIZ("1VNExperienceV1", X1D.LIZIZ(LIZ2));
            LJIIIIZZ(true);
        }
    }

    public C75239Tfv(ViewGroup viewGroup, DataChannel dataChannel) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(viewGroup, "viewGroup");
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = dataChannel;
        this.LJLJJL = "MultiGuestV3PreAdjustPlayerHandler";
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        if (MultiGuestShareBgRtlOptSetting.INSTANCE.isEnable()) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 3);
        }
        frameLayout.setLayoutParams(layoutParams);
        this.LJLJJLL = frameLayout;
        InterfaceC75238Tfu Mb = ((IInteractService) CN1.LIZ(IInteractService.class)).Mb(frameLayout, dataChannel);
        o.LJIIIIZZ(Mb, "getService(IInteractServ…(shadowView, dataChannel)");
        this.LJLJL = Mb;
        Mb.LJ(false);
    }
}
