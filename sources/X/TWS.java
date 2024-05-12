package X;

import Y.ARunnableS17S0101000_13;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixInfo;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkControlWidget;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS73S0400000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TWS implements TTR, InterfaceC76620U5g {
    public static final HashMap<String, TTR> LJLLJ = new HashMap<>();
    public TVN LJLIL;
    public final DataChannel LJLILLLLZI;
    public Room LJLJJI;
    public InterfaceC75441TjB LJLJJL;
    public InterfaceC74805TXl LJLJJLL;
    public C75745To5 LJLJLJ;
    public boolean LJLJLLL;
    public InterfaceC88472Yns<? super SeiAppData, C76800UCe> LJLL;
    public C74710TTu LJLLI;
    public int LJLJI = 4;
    public final ArrayList<U62> LJLJL = new ArrayList<>();
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 560));

    @Override // X.TTR
    public final int LIZIZ() {
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJJL;
        if (interfaceC75441TjB != null) {
            return interfaceC75441TjB.LIZIZ();
        }
        return 0;
    }

    @Override // X.TTR
    public final void LIZLLL() {
        C74710TTu c74710TTu = this.LJLLI;
        if (c74710TTu != null) {
            c74710TTu.release();
        }
        this.LJLLI = null;
    }

    @Override // X.TTR
    public final void LJFF() {
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLinkControlDestroy: ");
        LIZ.append(this.LJLJJI);
        TYP.LIZJ("GameLinkManager", X1D.LIZIZ(LIZ));
        try {
            IMessageService iMessageService = (IMessageService) CN1.LIZ(IMessageService.class);
            Room room = this.LJLJJI;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            IMessageManager iMessageManager = iMessageService.get(j);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), (TWU) this.LJLLILLLL.getValue());
            }
        } catch (Exception e) {
            C0NB.LJFF("GameLinkManager", "", e);
        }
        LJIILL(this.LJLJJL, "dispose_GameLinkManager_detach");
        this.LJLJJL = null;
        InterfaceC74805TXl interfaceC74805TXl = this.LJLJJLL;
        if (interfaceC74805TXl != null) {
            interfaceC74805TXl.LJIIIIZZ(this);
        }
        InterfaceC74805TXl interfaceC74805TXl2 = this.LJLJJLL;
        if (interfaceC74805TXl2 != null) {
            interfaceC74805TXl2.dispose();
        }
        synchronized (this.LJLJL) {
            this.LJLJL.clear();
        }
        C74768TWa.LIZ = false;
        C74768TWa.LIZIZ = false;
        C74768TWa.LIZJ = null;
        ((C73318Sq2) C74768TWa.LIZLLL.getValue()).LIZLLL();
        C0NB.LJIIIZ("GameLinkPermissionManager", "onDetach");
    }

    @Override // X.TTR
    public final int scene() {
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJJL;
        if (interfaceC75441TjB != null) {
            return interfaceC75441TjB.scene();
        }
        return 4;
    }

    @Override // X.TTR
    public final Room LIZJ() {
        return this.LJLJJI;
    }

    @Override // X.TTR
    public final TT0 LJ() {
        return this.LJLLI;
    }

    @Override // X.TTR
    public final int LJII() {
        return this.LJLJI;
    }

    @Override // X.TTR
    public final DataChannel LJIIL() {
        return this.LJLILLLLZI;
    }

    @Override // X.TTR
    public final InterfaceC75441TjB R6() {
        return this.LJLJJL;
    }

    public TWS(DataChannel dataChannel) {
        this.LJLILLLLZI = dataChannel;
    }

    @Override // X.TTR
    public final void LIZ(C75745To5 c75745To5) {
        InterfaceC74695TTf LLIIJLIL;
        C75745To5 c75745To52 = this.LJLJLJ;
        if (c75745To52 != null) {
            if (!o.LJ(c75745To5, c75745To52)) {
                this.LJLJLJ = c75745To5;
                InterfaceC75441TjB interfaceC75441TjB = this.LJLJJL;
                if (interfaceC75441TjB != null && (LLIIJLIL = interfaceC75441TjB.LLIIJLIL()) != null) {
                    LLIIJLIL.LIZ(c75745To5);
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("liveConfig");
        throw null;
    }

    @Override // X.TTR
    public final void LJI(AqS179S0100000_13 aqS179S0100000_13) {
        this.LJLL = aqS179S0100000_13;
    }

    @Override // X.TTR
    public final void LJIIIIZZ(C28272B7s c28272B7s) {
        SeiAppData LJIIJ;
        InterfaceC75441TjB interfaceC75441TjB;
        if (c28272B7s != null && (LJIIJ = C75806Tp4.LJIIJ(c28272B7s)) != null && (interfaceC75441TjB = this.LJLJJL) != null && o.LJ(interfaceC75441TjB.LLLLLLIL(), LJIIJ.channelId)) {
            C29306Beo.LJJJ(new AqS73S0400000_13(interfaceC75441TjB, c28272B7s, LJIIJ, this, 2));
        }
    }

    @Override // X.TTR
    public final void LJIIJJI(TVL tvl) {
        this.LJLIL = tvl;
    }

    public final void LJIILIIL(InterfaceC75441TjB interfaceC75441TjB) {
        String str;
        String str2;
        InterfaceC74695TTf LLIIJLIL;
        StreamUrl streamUrl;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initLinkMicSession, channelId = ");
        if (interfaceC75441TjB != null) {
            str = interfaceC75441TjB.LLLLLLIL();
        } else {
            str = null;
        }
        JBR.LJIIJ(LIZ, str, LIZ, "GameLinkManager");
        Iterator<U62> it = this.LJLJL.iterator();
        while (it.hasNext()) {
            U62 next = it.next();
            if (interfaceC75441TjB != null) {
                interfaceC75441TjB.LJJJIL(next);
            }
        }
        MixInfo.Builder builder = new MixInfo.Builder();
        Room room = this.LJLJJI;
        if (room != null && (streamUrl = room.getStreamUrl()) != null) {
            str2 = streamUrl.LIZ();
        } else {
            str2 = null;
        }
        builder.setStreamUrl(str2);
        builder.setStreamMixer(null);
        this.LJLJLJ = new C75745To5(false, builder.build(), new TWT(), false, false, "#2F173A", null, false, null, null, 2008);
        if (interfaceC75441TjB != null && (LLIIJLIL = interfaceC75441TjB.LLIIJLIL()) != null) {
            C75745To5 c75745To5 = this.LJLJLJ;
            if (c75745To5 != null) {
                LLIIJLIL.LIZ(c75745To5);
            } else {
                o.LJIJI("liveConfig");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC76620U5g
    public final void LLJILJIL(InterfaceC75441TjB session) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSessionCreate, ");
        LIZ.append(session.LLLLLLIL());
        TYP.LIZJ("GameLinkManager", X1D.LIZIZ(LIZ));
        if (!o.LJ(this.LJLJJL, session) && session.scene() == 4) {
            this.LJLJJL = session;
            LJIILIIL(session);
        }
    }

    @Override // X.TTR
    public final void X3(U62 listener) {
        o.LJIIIZ(listener, "listener");
        synchronized (this.LJLJL) {
            this.LJLJL.remove(listener);
            InterfaceC75441TjB interfaceC75441TjB = this.LJLJJL;
            if (interfaceC75441TjB != null) {
                interfaceC75441TjB.LLIILII(listener);
            }
        }
    }

    @Override // X.TTR
    public final void e3(U62 listener) {
        o.LJIIIZ(listener, "listener");
        synchronized (this.LJLJL) {
            this.LJLJL.add(listener);
            InterfaceC75441TjB interfaceC75441TjB = this.LJLJJL;
            if (interfaceC75441TjB != null) {
                interfaceC75441TjB.LJJJIL(listener);
            }
        }
    }

    @Override // X.TTR
    public final void LJIIIZ(LifecycleOwner lifecycleOwner, DataChannel mDataChannel) {
        String str;
        long parseLong;
        o.LJIIIZ(mDataChannel, "mDataChannel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        IMessageManager iMessageManager = (IMessageManager) mDataChannel.kv0(C29927Bop.class);
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJJL;
        if (interfaceC75441TjB == null || (str = interfaceC75441TjB.LLLLLLIL()) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            parseLong = -1;
        } else {
            parseLong = CastLongProtector.parseLong(str);
        }
        Room room = this.LJLJJI;
        if (room != null) {
            this.LJLLI = new C74710TTu(room, parseLong, this, iMessageManager, lifecycleOwner);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    @Override // X.TTR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.content.Context r21, com.bytedance.android.livesdkapi.depend.model.live.Room r22) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TWS.LJIIJ(android.content.Context, com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }

    public final void LJIILJJIL(boolean z, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        TTV.LIZ().LJIIJ = multiLiveAnchorPanelSettings;
        C74838TYs.LJ().LJJI = multiLiveAnchorPanelSettings;
        TVN tvn = this.LJLIL;
        if (tvn != null) {
            TVL tvl = (TVL) tvn;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GameLinkAnchorSettingUpdate:");
            LIZ.append(multiLiveAnchorPanelSettings);
            TYP.LIZJ("GameLinkControlWidget", X1D.LIZIZ(LIZ));
            int i = 1;
            if (z) {
                C74746TVe.LIZJ = "live_play";
                tvl.LIZ.LJZ(EnumC74990Tbu.AUDIENCE_OPEN);
                Room room = tvl.LIZ.LJLJJI;
                if (room != null && room.getLinkMicInfo() != null) {
                    List<Long> list = tvl.LIZ.LJLJJI.getLinkMicInfo().audienceIdList;
                    if (list != null && list.size() > 0) {
                        C74838TYs.LJ().LJIIIIZZ(true);
                    } else {
                        C74838TYs.LJ().LJIIIIZZ(false);
                    }
                } else {
                    C74838TYs.LJ().LJIIIIZZ(false);
                }
            }
            if (TV2.LJIILIIL(multiLiveAnchorPanelSettings)) {
                GameLinkControlWidget gameLinkControlWidget = tvl.LIZ;
                if (!gameLinkControlWidget.LJLZ()) {
                    C0NB.LJIIIZ("GameLinkControlWidget", "onGameLinkEnable");
                    TV2.LIZLLL(gameLinkControlWidget.dataChannel);
                }
            } else {
                if (TV2.LJIIJJI()) {
                    GameLinkControlWidget gameLinkControlWidget2 = tvl.LIZ;
                    TV2.LJIIIIZZ(gameLinkControlWidget2.dataChannel);
                    GameLinkWidget gameLinkWidget = gameLinkControlWidget2.LJLJI;
                    if (gameLinkWidget != null) {
                        gameLinkWidget.onMultiGuestPermissionOff(false, false);
                    }
                }
                i = 0;
            }
            if (z) {
                ARunnableS17S0101000_13 aRunnableS17S0101000_13 = new ARunnableS17S0101000_13(i, tvl.LIZ.LJLJJI, 4);
                if (LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable) {
                    aRunnableS17S0101000_13.run();
                }
            }
        }
    }

    public final void LJIILL(InterfaceC75441TjB interfaceC75441TjB, String str) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("releaseLinkMicSession, channelId = ");
        if (interfaceC75441TjB != null) {
            str2 = interfaceC75441TjB.LLLLLLIL();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(", source=");
        LIZ.append(str);
        TYP.LIZJ("GameLinkManager", X1D.LIZIZ(LIZ));
        synchronized (this.LJLJL) {
            Iterator<U62> it = this.LJLJL.iterator();
            while (it.hasNext()) {
                U62 next = it.next();
                if (interfaceC75441TjB != null) {
                    interfaceC75441TjB.LLIILII(next);
                }
            }
        }
        if (interfaceC75441TjB != null) {
            interfaceC75441TjB.LJJLI(str);
        }
    }

    @Override // X.InterfaceC76620U5g
    public final void LJJLIIIIJ(InterfaceC75441TjB interfaceC75441TjB, Long l) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSessionDestroy, ");
        LIZ.append(interfaceC75441TjB.LLLLLLIL());
        TYP.LIZJ("GameLinkManager", X1D.LIZIZ(LIZ));
        LJIILL(interfaceC75441TjB, "dispose_on_session_destroy");
        if (o.LJ(this.LJLJJL, interfaceC75441TjB)) {
            this.LJLJJL = null;
        }
    }
}
