package com.bytedance.android.live.liveinteract.multimatch.widget;

import X.AbstractC76182Tv8;
import X.C0NB;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C28272B7s;
import X.C2L4;
import X.C30725C4b;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C65352Pkq;
import X.C75194TfC;
import X.C75511TkJ;
import X.C75622Tm6;
import X.C75806Tp4;
import X.C75832TpU;
import X.C76128TuG;
import X.C76244Tw8;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76272Twa;
import X.C76280Twi;
import X.C76288Twq;
import X.C76472Tzo;
import X.C76800UCe;
import X.C76965UIn;
import X.C79234V7u;
import X.C8E;
import X.C8VV;
import X.C8YZ;
import X.EnumC76178Tv4;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC31781Cdd;
import X.InterfaceC76359Txz;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchScope;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchBottomNoticeCard;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiMatchAudienceWidget extends MatchBaseWidget implements InterfaceC76359Txz, KPL, C2L4 {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public final C76288Twq LJLJL;
    public Room LJLJLJ;
    public final IMultiHostService LJLJLLL;
    public AbstractC76182Tv8 LJLL;
    public EnumC76178Tv4 LJLLI;

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return MultiMatchAudienceWidget.class.getName();
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(MatchScope.class);
    }

    @Override // X.InterfaceC76359Txz
    public final C76244Tw8 getViewModel() {
        return (C76244Tw8) LJZI(C76244Tw8.class);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        InterfaceC31781Cdd interfaceC31781Cdd;
        Fragment LJIIIZ;
        int i;
        EnumC76178Tv4 enumC76178Tv4 = this.LJLLI;
        EnumC76178Tv4 enumC76178Tv42 = EnumC76178Tv4.START;
        if (enumC76178Tv4.compareTo(enumC76178Tv42) >= 0 && this.LJLLI.compareTo(EnumC76178Tv4.END) < 0) {
            C75832TpU.LIZ.LJIJI(this.LJLL instanceof C76472Tzo, ((C76244Tw8) LJZI(C76244Tw8.class)).LJIILL, ((C76244Tw8) LJZI(C76244Tw8.class)).LJIILJJIL, this.LJLJLJ);
            C76271TwZ.LJJLL("leave_room", this.LJLL instanceof C76472Tzo);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("battle_id = ");
        C76280Twi c76280Twi = C76265TwT.LIZ;
        LIZ.append(c76280Twi.LIZIZ());
        C0NB.LIZIZ("match_widget_destroy", X1D.LIZIZ(LIZ));
        if (c76280Twi.LIZIZ() != 0) {
            if (this.LJLLI == enumC76178Tv42) {
                i = 1;
            } else {
                i = 2;
            }
            C75622Tm6.LJIILIIL(i);
        }
        if (C76128TuG.LIZIZ(this.dataChannel, false, 6) && (((interfaceC31781Cdd = this.widgetCallback) != null && (LJIIIZ = interfaceC31781Cdd.getFragment()) != null) || (LJIIIZ = C79234V7u.LJIIIZ(getView())) != null)) {
            C8VV.LJIIIIZZ(LJIIIZ, C65352Pkq.LIZ(MatchBottomNoticeCard.class));
            C8VV.LJIIIIZZ(LJIIIZ, C65352Pkq.LIZ(MatchItemAssem.class));
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        this.LJLJL.detachView();
        AbstractC76182Tv8 abstractC76182Tv8 = this.LJLL;
        if (abstractC76182Tv8 != null) {
            abstractC76182Tv8.LJJJJZI();
        }
        this.LJLL = null;
        C75511TkJ.LIZ = null;
        C76272Twa.LJIIL = -1L;
        C76272Twa.LJIILIIL = 0L;
        C76272Twa.LJIILJJIL = 0L;
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Room room;
        Fragment LJIIIZ;
        super.onCreate();
        C76265TwT.LJII(0, "create");
        C75194TfC.LJIILLIIL("match_widget");
        C30725C4b.LIZ();
        this.dataChannel.lv0(this, BattleStateChannel.class, new AqS179S0100000_13(this, 663));
        this.LJLJL.attachView(this);
        C75511TkJ.LIZ = this;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJLJ = room;
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if ((interfaceC31781Cdd != null && (LJIIIZ = interfaceC31781Cdd.getFragment()) != null) || (LJIIIZ = C79234V7u.LJIIIZ(getView())) != null) {
            C8VV.LIZ(LJIIIZ, false, new AqS144S0200000_13(LJIIIZ, this, 7));
        }
    }

    public MultiMatchAudienceWidget(View view) {
        super(view);
        this.LJLJL = new C76288Twq();
        this.LJLJLLL = C8E.LIZLLL();
        this.LJLLI = EnumC76178Tv4.NORMAL;
        o.LJIIIIZZ(UUID.randomUUID().toString(), "randomUUID().toString()");
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final void onSei(C28272B7s c28272B7s) {
        long j;
        if (c28272B7s == null) {
            return;
        }
        C76288Twq c76288Twq = this.LJLJL;
        if (c76288Twq.LJLJJI <= 0 && c76288Twq.LJLJJL < 10) {
            SeiAppData LJIIJ = C75806Tp4.LJIIJ(c28272B7s);
            if (LJIIJ != null) {
                j = LJIIJ.battleId;
            } else {
                j = 0;
            }
            if (c76288Twq.LJLJJI != j && j > 0) {
                c76288Twq.LJJJJJ(j);
            }
            c76288Twq.LJLJJI = j;
            c76288Twq.LJLJJL++;
        }
        AbstractC76182Tv8 abstractC76182Tv8 = this.LJLL;
        if (abstractC76182Tv8 != null) {
            abstractC76182Tv8.LJJLJLI(c28272B7s);
        }
    }

    @Override // X.InterfaceC76359Txz
    public final void p7(LinkMicBattleMessage message) {
        int i;
        o.LJIIIZ(message, "message");
        BattleSetting battleSetting = message.battleSetting;
        if (battleSetting != null) {
            i = battleSetting.battleType;
        } else {
            i = 0;
        }
        LLFF(i, "open_message");
        AbstractC76182Tv8 abstractC76182Tv8 = this.LJLL;
        if (abstractC76182Tv8 != null) {
            abstractC76182Tv8.LJJLIL(message);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fe, code lost:
    
        if (r14 != 1) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFF(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAudienceWidget.LLFF(int, java.lang.String):void");
    }

    @Override // X.InterfaceC76359Txz
    public final boolean b0(BattleInfoResponse battleInfoResponse, int i) {
        int i2;
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null) {
            i2 = battleSetting.battleType;
        } else {
            i2 = 0;
        }
        LLFF(i2, "room_enter");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleBattleInfo, matchViewDelegate = ");
        LIZ.append(this.LJLL);
        C0NB.LIZIZ("MultiMatchAudienceWidge", X1D.LIZIZ(LIZ));
        AbstractC76182Tv8 abstractC76182Tv8 = this.LJLL;
        if (abstractC76182Tv8 == null) {
            return false;
        }
        return abstractC76182Tv8.LJJLIIJ(battleInfoResponse, i);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget
    public final void LL(List<LinkUser> list, List<LinkUser> list2, CustomLinkMessage customLinkMessage) {
        AbstractC76182Tv8 abstractC76182Tv8 = this.LJLL;
        if (abstractC76182Tv8 != null) {
            abstractC76182Tv8.LJJLJ(list, list2);
        }
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
