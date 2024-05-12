package com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel;

import X.C012403c;
import X.C0NB;
import X.C15610jN;
import X.C199097rd;
import X.C29306Beo;
import X.C29927Bop;
import X.C47704Ins;
import X.C55749LuL;
import X.C72818Shy;
import X.C73411SrX;
import X.C76439TzH;
import X.C76450TzS;
import X.EnumC31509CYf;
import X.EnumC76178Tv4;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.X1D;
import Y.ARunnableS49S0100000_13;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsCurrentWinChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemSyncEnterRoomChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.android.play.core.appupdate.u;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS2S0011000_13;
import kotlin.jvm.internal.AqS37S0001000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MatchItemViewModel extends AssemViewModel<C76439TzH> implements IMatchItemAbility, OnMessageListener, InterfaceC72822Si2 {
    public IMessageManager LJLIL;
    public Room LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;
    public DataChannel LJLJJL;
    public C73411SrX LJLJL;
    public long LJLJLJ;
    public long LJLJLLL;
    public long LJLLI;
    public boolean LJLLILLLL;
    public final C55749LuL LJLJJLL = new C55749LuL(C47704Ins.LIZLLL(this, C76450TzS.class, null), true);
    public EnumC76178Tv4 LJLL = EnumC76178Tv4.NORMAL;
    public final ARunnableS49S0100000_13 LJLLJ = new ARunnableS49S0100000_13(this, 51);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C76439TzH defaultState() {
        return new C76439TzH(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C73411SrX c73411SrX;
        C0NB.LJ("MatchItemViewModel", "onClear");
        DataChannel dataChannel = this.LJLJJL;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        Boolean bool = null;
        this.LJLJJL = null;
        this.LJLLILLLL = false;
        IMessageManager iMessageManager = this.LJLIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        C15610jN.LIZLLL(this.LJLLJ);
        C72818Shy.LJII("EVENT_MATCH_ITEM_CLOSE_ALL", this);
        C73411SrX c73411SrX2 = this.LJLJL;
        if (c73411SrX2 != null) {
            bool = Boolean.valueOf(c73411SrX2.isDisposed());
        }
        if (!C29306Beo.LJIL(bool) && (c73411SrX = this.LJLJL) != null) {
            c73411SrX.dispose();
        }
        super.onCleared();
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void hA() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("remove Self card by type = ");
        LIZ.append(2);
        C0NB.LIZIZ("MatchItemViewModel", X1D.LIZIZ(LIZ));
        setState(new AqS37S0001000_13(6));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        IMessageManager iMessageManager;
        long j;
        User owner;
        super.onPrepared();
        C0NB.LJ("MatchItemViewModel", "onPrepared");
        this.LJLJJL = ((C76450TzS) this.LJLJJLL.getValue()).LJLILLLLZI;
        this.LJLJI = ((C76450TzS) this.LJLJJLL.getValue()).LJLIL;
        DataChannel dataChannel = this.LJLJJL;
        Room room = null;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LJLIL = iMessageManager;
        DataChannel dataChannel2 = this.LJLJJL;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.kv0(RoomChannel.class);
        }
        this.LJLILLLLZI = room;
        if (room != null && (owner = room.getOwner()) != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        this.LJLJJI = j;
        IMessageManager iMessageManager2 = this.LJLIL;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_ITEM_CARD.getIntType(), this);
        }
        C72818Shy.LIZLLL("EVENT_MATCH_ITEM_CLOSE_ALL", this);
        DataChannel dataChannel3 = this.LJLJJL;
        if (dataChannel3 != null) {
            dataChannel3.mv0(BattleStateChannel.class, this, new AqS179S0100000_13(this, 215));
            dataChannel3.mv0(BattleIsCurrentWinChannel.class, this, new AqS179S0100000_13(this, 216));
            dataChannel3.mv0(BattleItemSyncEnterRoomChannel.class, this, new AqS179S0100000_13(this, 217));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void Rh0(int i) {
        if (i <= 0) {
            return;
        }
        C012403c.LJ("remove Rival card by type = ", i, "MatchItemViewModel");
        if (i != 1) {
            if (i != 2) {
                return;
            }
            setState(new AqS37S0001000_13(i, 0));
            return;
        }
        setState(new AqS37S0001000_13(i, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x021e, code lost:
    
        if (r3 != null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ym0(com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse r29) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel.Ym0(com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0091, code lost:
    
        if (r6 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0154, code lost:
    
        if (r6 == false) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c8  */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE, java.lang.Object] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r22) {
        /*
            Method dump skipped, instructions count: 1111
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        Integer num;
        if (o.LJ(c199097rd.LJLIL, "EVENT_MATCH_ITEM_CLOSE_ALL")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                num = Integer.valueOf(u.LJJIJIIJI(interfaceC78280Uns, "item_type", 0));
            } else {
                num = null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("JS EVENT receive JS_EVENT_MATCH_ITEM_CLOSE_ALL cardType = ");
            LIZ.append(num);
            C0NB.LJIIIZ("MatchItemViewModel", X1D.LIZIZ(LIZ));
            if (num != null) {
                num.intValue();
                if (num.intValue() == 0) {
                    return;
                }
                al0(num.intValue(), true);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility
    public final void al0(int i, boolean z) {
        List<ItemInfo4FE> list;
        List<ItemInfo4FE> list2;
        if (z && i == 1) {
            List<ItemInfo4FE> list3 = getState().LJLIL.itemList;
            if (list3 == null || list3.isEmpty()) {
                return;
            }
        } else if (z) {
            if (i == 2 && ((list2 = getState().LJLILLLLZI.itemList) == null || list2.isEmpty())) {
                return;
            }
        } else if (i == 2) {
            List<ItemInfo4FE> list4 = getState().LJLJJI.itemList;
            if (list4 == null || list4.isEmpty()) {
                return;
            }
        } else if (i == 1 && ((list = getState().LJLJI.itemList) == null || list.isEmpty())) {
            return;
        }
        setState(new AqS2S0011000_13(i, z, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        if (r4 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE gv0(com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo r8, boolean r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel.gv0(com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo, boolean, boolean, boolean):com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e0, code lost:
    
        if (r3 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE hv0(com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel r6, com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo r7, boolean r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel.hv0(com.bytedance.android.live.liveinteract.multimatch.matchitem.viewmodel.MatchItemViewModel, com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo, boolean, boolean, boolean):com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE");
    }
}
