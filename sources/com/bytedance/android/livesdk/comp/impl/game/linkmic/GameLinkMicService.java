package com.bytedance.android.livesdk.comp.impl.game.linkmic;

import X.BJM;
import X.BZI;
import X.C0NB;
import X.C28787BRn;
import X.C74740TUy;
import X.C74838TYs;
import X.C75566TlC;
import X.C76800UCe;
import X.EnumC74778TWk;
import X.InterfaceC30177Bsr;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.TSY;
import X.TT0;
import X.TTR;
import X.TTV;
import X.TU4;
import X.TVD;
import X.TVH;
import X.TVI;
import X.TWL;
import X.TWS;
import X.TYP;
import X.X1D;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.TapToGoLiveEvent;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.settings.GameLinkMicSetting;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkControlWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.GameLinkMicFeedSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLiveStudioSupportCohostSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class GameLinkMicService implements IGameLinkMicService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    static {
        new TVI();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final C75566TlC qH() {
        if (GameLinkMicFeedSetting.INSTANCE.isDefault()) {
            return new C75566TlC();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final void sV() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        TSY tsy = TSY.LJIIJ;
        if (tsy != null && (interfaceC65784Pro = tsy.LIZLLL) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final boolean Sw(Room room) {
        Long l;
        if (!LiveGameLiveStudioSupportCohostSetting.INSTANCE.isExperimentGroup()) {
            return true;
        }
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        if (TVH.LIZ(String.valueOf(l)) == null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final int Yh0(String str) {
        TT0 LJ;
        TU4 LIZ;
        List LJ2;
        TTR LIZ2 = TVH.LIZ(str);
        if (LIZ2 == null || (LJ = LIZ2.LJ()) == null || (LIZ = LJ.LIZ()) == null || (LJ2 = LIZ.LJ()) == null) {
            return 0;
        }
        return LJ2.size() - 1;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final GameLinkControlWidget hE(InterfaceC30177Bsr interfaceC30177Bsr) {
        if (GameLinkMicSetting.isEnable()) {
            return new GameLinkControlWidget(interfaceC30177Bsr);
        }
        return null;
    }

    public static void LIZ(Room room, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reset data holder ");
        LIZ.append(str);
        TYP.LIZJ("GameLinkMicService", X1D.LIZIZ(LIZ));
        C74838TYs.LJ().LJFF(room, str);
        C74740TUy.LIZLLL().LJII();
        TVD LIZ2 = TTV.LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("GameLink_");
        LIZ3.append(str);
        String source = X1D.LIZIZ(LIZ3);
        LIZ2.getClass();
        o.LJIIIZ(source, "source");
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("reset: ");
        LIZ4.append(source);
        TYP.LIZJ("GameLinkDataHolder", X1D.LIZIZ(LIZ4));
        LIZ2.LJIIJJI = 0;
        LIZ2.LJ = false;
        LIZ2.LJIILLIIL = 0;
        LIZ2.LJIIZILJ = -1;
        LIZ2.LJIILJJIL = EnumC74778TWk.NORMAL;
        LIZ2.LJIJ = 0L;
        LIZ2.LJIJI = 0L;
        LIZ2.LJIJJ = null;
        C74838TYs.LJ().LJJII = 2;
        LIZ2.LJIILL = null;
        HashSet<Long> hashSet = LIZ2.LJIL;
        if (hashSet != null) {
            hashSet.clear();
        }
        LIZ2.LJJ = null;
        LIZ2.LJIIJ = null;
        LIZ2.LJII = false;
        LIZ2.LIZ = false;
        LIZ2.LIZIZ = 0;
        LIZ2.LJIIIIZZ = true;
        ((Map) LIZ2.LJIIL.getValue()).clear();
        LIZ2.LJI.clear();
        LIZ2.LJIILIIL = 0;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final int US(User user, String str) {
        TT0 LJ;
        TU4 LIZ;
        List LJ2;
        Object obj;
        TTR LIZ2 = TVH.LIZ(str);
        if (LIZ2 == null || (LJ = LIZ2.LJ()) == null || (LIZ = LJ.LIZ()) == null || (LJ2 = LIZ.LJ()) == null) {
            return 0;
        }
        Iterator it = LJ2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                User user2 = ((LinkListUser) obj).user;
                if (user2 != null && user2.getId() == user.getId()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LinkListUser linkListUser = (LinkListUser) obj;
        if (linkListUser == null) {
            return 0;
        }
        return linkListUser.LIZ;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final void WC(Fragment fragment, DataChannel dataChannel) {
        Long l;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dataChannel, "dataChannel");
        C0NB.LJIIIZ("GameLinkMicService", "onShowInteractionFragment");
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        TWS tws = new TWS(dataChannel);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set with roomId:");
        LIZ.append(valueOf);
        LIZ.append(", obj:");
        LIZ.append(tws);
        TYP.LIZJ("GameLinkManager", X1D.LIZIZ(LIZ));
        TWS.LJLLJ.put(valueOf, tws);
        LIZ(room, "onCreate");
        TWL.LJIJJ("live_play", EnumC74778TWk.NORMAL, null);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final void WG(Fragment fragment, Room room) {
        Long l;
        Long l2;
        String str;
        o.LJIIIZ(fragment, "fragment");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomStop:");
        LIZ.append(fragment);
        LIZ.append(", roomId=");
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ.append(l);
        TYP.LIZJ("GameLinkMicService", X1D.LIZIZ(LIZ));
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        } else {
            l2 = null;
        }
        TTR remove = TWS.LJLLJ.remove(String.valueOf(l2));
        if (remove != null) {
            remove.LJFF();
            TWL.LJIJI("live_over", null);
            boolean booleanValue = InterfaceC30442Bx8.LLJJIJIIJIL.LIZJ().booleanValue();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_status");
            if (booleanValue) {
                str = "open";
            } else {
                str = "close";
            }
            LIZ2.LJIJJ(str, "status");
            LIZ2.LJIJJ(TWL.LJFF().getFirst(), "layout_setting");
            LIZ2.LJIJJ(TWL.LJFF().getSecond(), "window_setting");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJIIZILJ();
                LIZ2.LJJIIJZLJL();
            } else {
                LIZ2.LJJIJ();
                LIZ2.LJI();
                LIZ2.LJIJJ(BJM.LJLIL.LIZJ(), "live_type");
                LIZ2.LJJIIJZLJL();
            }
            LIZ(room, "onDestroy");
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService
    public final boolean ws(Runnable runnable, String str) {
        DataChannel LJIIL;
        if (TTV.LIZ().LJ) {
            String str2 = TTV.LIZ().LJFF;
            if (str2 == null) {
                str2 = "";
            }
            TTR LIZ = TVH.LIZ(str2);
            if (LIZ != null && (LJIIL = LIZ.LJIIL()) != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onIntercept:");
                LIZ2.append(str);
                TYP.LIZJ("GameLinkMicService", X1D.LIZIZ(LIZ2));
                LJIIL.qv0(TapToGoLiveEvent.class, runnable);
                return true;
            }
            return false;
        }
        return false;
    }
}
