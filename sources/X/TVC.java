package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkControlWidget;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkWidget;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public class TVC extends C74624TQm {
    public final /* synthetic */ GameLinkControlWidget LJLIL;

    public TVC(GameLinkControlWidget gameLinkControlWidget) {
        this.LJLIL = gameLinkControlWidget;
    }

    @Override // X.C74624TQm, X.U62
    public final void LJJJI(InterfaceC75441TjB interfaceC75441TjB, DestroyChannelMessage destroyChannelMessage) {
        DataChannel dataChannel;
        EnumC74778TWk enumC74778TWk;
        C0NB.LJIIIZ("GameLinkControlWidget", "receive:DestroyChannelMessage");
        TTV.LIZ().LJII = false;
        TTV.LIZ().LJI.add(interfaceC75441TjB.LLLLLLIL());
        GameLinkControlWidget gameLinkControlWidget = this.LJLIL;
        gameLinkControlWidget.getClass();
        C0NB.LJIIIZ("GameLinkControlWidget", "onGameLinkTurnedOff");
        C74838TYs.LJ().LIZIZ(Boolean.FALSE);
        C74746TVe.LJII("other");
        C74746TVe.LJIIIIZZ("connection_over");
        if (C74740TUy.LIZLLL().LJ() && ((dataChannel = gameLinkControlWidget.dataChannel) == null || dataChannel.kv0(PIPStatusData.class) == null || !((Boolean) gameLinkControlWidget.dataChannel.kv0(PIPStatusData.class)).booleanValue())) {
            if (gameLinkControlWidget.LJLJLLL == null) {
                C47071t1 c47071t1 = new C47071t1(gameLinkControlWidget.context);
                c47071t1.LJFF(R.string.n_b);
                c47071t1.LJIIL(R.string.njj, new C78269Unh());
                gameLinkControlWidget.LJLJLLL = c47071t1.LIZ();
            }
            LiveDialog liveDialog = gameLinkControlWidget.LJLJLLL;
            if (liveDialog != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-7773179317100819097")).LIZ) {
                liveDialog.show();
            }
        }
        InterfaceC30177Bsr interfaceC30177Bsr = gameLinkControlWidget.LJLIL;
        if (interfaceC30177Bsr != null) {
            interfaceC30177Bsr.LIZ(gameLinkControlWidget.LJLJI);
            gameLinkControlWidget.LJLJI = null;
        }
        gameLinkControlWidget.LJLJJLL.LIZ(8);
        TVD LJ = TWL.LJ();
        if (LJ != null) {
            enumC74778TWk = LJ.LJIILJJIL;
        } else {
            enumC74778TWk = null;
        }
        if (enumC74778TWk == EnumC74778TWk.GRID_FIX || enumC74778TWk == EnumC74778TWk.FLOATING_FIX || enumC74778TWk == EnumC74778TWk.GRID || enumC74778TWk == EnumC74778TWk.FLOATING) {
            TWL.LJIJI("others", null);
            TWL.LJIJJ("others", EnumC74778TWk.NORMAL, null);
        }
        TTR ttr = gameLinkControlWidget.LJLILLLLZI;
        if (ttr != null) {
            ttr.LIZLLL();
        }
        TVD LIZ = TTV.LIZ();
        LIZ.getClass();
        C0NB.LIZIZ("GameLinkDataHolder", "onLinkMicDisconnect");
        LIZ.LJIIIIZZ = true;
        ((java.util.Map) LIZ.LJIIL.getValue()).clear();
        LIZ.LJIILIIL = 0;
        LIZ.LJIILL = null;
    }

    @Override // X.C74624TQm, X.U62
    public final void LJJJIL(InterfaceC75441TjB interfaceC75441TjB, KickOutMessage kickOutMessage) {
        MultiLiveAnchorPanelSettings LJI = TV2.LJI();
        if (TV2.LJIILIIL(LJI)) {
            if (!TV2.LJIIL(LJI)) {
                GameLinkControlWidget gameLinkControlWidget = this.LJLIL;
                if (!gameLinkControlWidget.LJLZ()) {
                    C0NB.LJIIIZ("GameLinkControlWidget", "onGameLinkEnable");
                    TV2.LIZLLL(gameLinkControlWidget.dataChannel);
                    return;
                }
                return;
            }
            return;
        }
        GameLinkControlWidget gameLinkControlWidget2 = this.LJLIL;
        TV2.LJIIIIZZ(gameLinkControlWidget2.dataChannel);
        GameLinkWidget gameLinkWidget = gameLinkControlWidget2.LJLJI;
        if (gameLinkWidget == null) {
            return;
        }
        gameLinkWidget.onMultiGuestPermissionOff(true, false);
    }

    @Override // X.C74624TQm, X.U62
    public final void LJLZ(InterfaceC75441TjB interfaceC75441TjB, CreateChannelMessage createChannelMessage) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreateChannelMessage:");
        LIZ.append(createChannelMessage);
        TYP.LIZJ("GameLinkControlWidget", X1D.LIZIZ(LIZ));
        TTV.LIZ().LJII = true;
        C74838TYs.LJ().LJIILIIL = createChannelMessage.getOwner().getLinkMicId();
        C74746TVe.LIZJ = "others";
        this.LJLIL.LJZ(EnumC74990Tbu.AUDIENCE_OPEN);
        GameLinkControlWidget gameLinkControlWidget = this.LJLIL;
        C74768TWa.LIZLLL(gameLinkControlWidget.LJLJJI, gameLinkControlWidget);
    }
}
