package X;

import X.InterfaceC31336CRo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3DiffSetting;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tih, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC75411Tih<T extends InterfaceC31336CRo> extends AbstractC31497CXt<T> implements KPL {
    public final LifecycleOwner lifecycleOwner;
    public final C74649TRl linkMicEventListener;
    public final C5H3 rtcMessageReader$delegate;

    private final boolean isMute(int i, boolean z) {
        return i != 0 ? i != 1 : z;
    }

    @Override // X.KPL, X.C8YZ
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    public void onUserMediaStateListChanged(C74630TQs listState) {
        o.LJIIIZ(listState, "listState");
    }

    public final int toMediaState(int i) {
        return i == 1 ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TQ0 getRtcMessageReader() {
        return (TQ0) this.rtcMessageReader$delegate.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        return lifecycle;
    }

    @Override // X.AbstractC31497CXt, X.BY9
    public void detachView() {
        super.detachView();
        C8E.LJ().X3(this.linkMicEventListener);
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    public AbstractC75411Tih(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.lifecycleOwner = lifecycleOwner;
        this.rtcMessageReader$delegate = C221108m2.LIZIZ(TQN.LJLIL);
        this.linkMicEventListener = new C74649TRl(this);
    }

    @Override // X.AbstractC31497CXt
    public void attachView(T t) {
        super.attachView((AbstractC75411Tih<T>) t);
        UC0.LJJIZ("subscribe room message when attach View ..", "V3Guest");
        C8E.LJ().e3(this.linkMicEventListener);
    }

    public final boolean isAnchor(String linkMicId) {
        InterfaceC75973Trl interfaceC75973Trl;
        Long l;
        LinkUser LJJ;
        o.LJIIIZ(linkMicId, "linkMicId");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        Long l2 = null;
        if (R6 != null) {
            interfaceC75973Trl = R6.LLIIJI();
        } else {
            interfaceC75973Trl = null;
        }
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        if (interfaceC75973Trl != null && (LJJ = interfaceC75973Trl.LJJ(linkMicId)) != null) {
            l2 = LJJ.getUserId();
        }
        return o.LJ(l, l2);
    }

    public final OSZ<Boolean, Boolean> muteInfo(UserState userState) {
        o.LJIIIZ(userState, "<this>");
        if (isAnchor(userState)) {
            return new OSZ<>(Boolean.valueOf(isMute(userState.audioMuted, false)), Boolean.valueOf(isMute(userState.videoMuted, false)));
        }
        return new OSZ<>(Boolean.valueOf(isMute(userState.audioMuted, false)), Boolean.valueOf(isMute(userState.videoMuted, true)));
    }

    public void onLayoutChanged(String layoutId) {
        U8H LJJZZI;
        o.LJIIIZ(layoutId, "layoutId");
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            LJJZZI.A1(layoutId, false);
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T::Lcom/bytedance/android/live/liveinteract/platform/statemanager/iablility/ILinkStateAbility;>(TT;)V */
    public final void subscribeStateChange(ILinkStateAbility iLinkStateAbility) {
        o.LJIIIZ(iLinkStateAbility, "<this>");
        if (MultiGuestV3DiffSetting.INSTANCE.getValue()) {
            C75412Tii c75412Tii = new TBT() { // from class: X.Tii
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C75814TpC) obj).LJLILLLLZI;
                }
            };
            C56412MCa c56412MCa = new C56412MCa();
            c56412MCa.LIZ(C75408Tie.LJLIL);
            iLinkStateAbility.CQ(c75412Tii, c56412MCa, new AqS179S0100000_13(this, 588));
        } else {
            iLinkStateAbility.CQ(new TBT() { // from class: X.Tij
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C75814TpC) obj).LJLILLLLZI;
                }
            }, null, new AqS179S0100000_13(this, 589));
        }
        iLinkStateAbility.CQ(new TBT() { // from class: X.Tia
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C75814TpC) obj).LJLJI;
            }
        }, null, new AqS179S0100000_13(this, 590));
    }

    private final boolean isAnchor(UserState userState) {
        Player player = userState.user;
        if (player != null) {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room == null || player.uid != room.getOwnerUserId()) {
                return false;
            }
            return true;
        }
        return isAnchor(userState.linkMicId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC31497CXt, X.BY9
    public /* bridge */ /* synthetic */ void attachView(InterfaceC2301691o interfaceC2301691o) {
        attachView((AbstractC75411Tih<T>) interfaceC2301691o);
    }

    /* JADX WARN: Incorrect types in method signature: <T::LX/Lm3;>(TT;Ljava/lang/String;)Lcom/bytedance/android/live/liveinteract/platform/statemanager/iablility/UserState; */
    public UserState getUserState(InterfaceC55235Lm3 interfaceC55235Lm3, String linkMicId) {
        ILinkStateAbility iLinkStateAbility;
        o.LJIIIZ(linkMicId, "linkMicId");
        if (C74650TRm.LIZ()) {
            if (interfaceC55235Lm3 != null && (iLinkStateAbility = (ILinkStateAbility) UC0.LJIIL(interfaceC55235Lm3, ILinkStateAbility.class, null)) != null) {
                return iLinkStateAbility.fx(linkMicId);
            }
            UC0.LJJIZ("[StateManager] try getUserState and turn Media failed", "V3Guest");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[RTCManager]getUserState[");
        LIZ.append(linkMicId);
        LIZ.append(']');
        UC0.LJJIZ(X1D.LIZIZ(LIZ), "V3Guest");
        return null;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C212418Vh.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q> void withStateSafe(VM1 vm1, InterfaceC88472Yns<? super S1, C76800UCe> interfaceC88472Yns) {
        C212418Vh.LJIIL(vm1, interfaceC88472Yns);
    }

    /* JADX WARN: Incorrect types in method signature: <T::LX/Lm3;>(TT;II)Z */
    public boolean changeMediaState(InterfaceC55235Lm3 interfaceC55235Lm3, int i, int i2) {
        String str;
        ILinkStateAbility iLinkStateAbility;
        if (i == 4) {
            str = "video";
        } else {
            str = "audio";
        }
        if (C74650TRm.LIZ()) {
            if (interfaceC55235Lm3 != null && (iLinkStateAbility = (ILinkStateAbility) UC0.LJIIL(interfaceC55235Lm3, ILinkStateAbility.class, null)) != null) {
                if (i != 3) {
                    if (i == 4) {
                        iLinkStateAbility.tI(i2);
                    }
                } else {
                    iLinkStateAbility.Ga(i2);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[StateManager]change Media State[");
                LIZ.append(str);
                LIZ.append("_state:");
                LIZ.append(i2);
                LIZ.append(']');
                UC0.LJJIZ(X1D.LIZIZ(LIZ), "V3Guest");
                return true;
            }
            UC0.LJJIZ("[StateManager] try get linkStateAbility and turn Media failed", "V3Guest");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[RTCManager]change Media State[");
        LIZ2.append(str);
        LIZ2.append("_state:");
        LIZ2.append(i2);
        LIZ2.append(']');
        UC0.LJJIZ(X1D.LIZIZ(LIZ2), "V3Guest");
        return false;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, R> R withState(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C212418Vh.LJIIJ(vm1, vm2, interfaceC88471Ynr);
    }

    /* JADX WARN: Incorrect types in method signature: <T::LX/Lm3;>(TT;Ljava/lang/String;LX/Yns<-Lcom/bytedance/android/live/liveinteract/platform/statemanager/iablility/UserState;LX/UCe;>;)V */
    public void withUserState(InterfaceC55235Lm3 interfaceC55235Lm3, String linkMicId, InterfaceC88472Yns block) {
        ILinkStateAbility iLinkStateAbility;
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(block, "block");
        if (C74650TRm.LIZ()) {
            if (interfaceC55235Lm3 != null && (iLinkStateAbility = (ILinkStateAbility) UC0.LJIIL(interfaceC55235Lm3, ILinkStateAbility.class, null)) != null) {
                iLinkStateAbility.OJ(linkMicId, block);
            } else {
                UC0.LJJIZ("[StateManager] try withMediaState and turn Media failed", "V3Guest");
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[RTCManager]withMediaState[");
        LIZ.append(linkMicId);
        LIZ.append(']');
        UC0.LJJIZ(X1D.LIZIZ(LIZ), "V3Guest");
    }

    @Override // X.C8YM
    public <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, VM3 extends AssemViewModel<S3>, S3 extends C33Q, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C212418Vh.LJIIIZ(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    /* JADX WARN: Incorrect types in method signature: <T::LX/Lm3;>(TT;IIZZ)Z */
    public boolean changeMediaSource(InterfaceC55235Lm3 interfaceC55235Lm3, int i, int i2, boolean z, boolean z2) {
        String str;
        ILinkStateAbility iLinkStateAbility;
        if (i == 4) {
            str = "video";
        } else {
            str = "audio";
        }
        if (C74650TRm.LIZ()) {
            if (interfaceC55235Lm3 != null && (iLinkStateAbility = (ILinkStateAbility) UC0.LJIIL(interfaceC55235Lm3, ILinkStateAbility.class, null)) != null) {
                if (i == 3) {
                    iLinkStateAbility.aq0(i2, z, z2);
                }
                StringBuilder LJ = AnonymousClass028.LJ("[StateManager]change Media Source[", str, "_source:", i2, "]_");
                LJ.append(z);
                UC0.LJJIZ(X1D.LIZIZ(LJ), "V3Guest");
                return true;
            }
            UC0.LJJIZ("[StateManager] try get linkStateAbility and turn Media failed", "V3Guest");
        }
        StringBuilder LJ2 = AnonymousClass028.LJ("[RTCManager]change Media Source[", str, "_source:", i2, "]_");
        LJ2.append(z);
        UC0.LJJIZ(X1D.LIZIZ(LJ2), "V3Guest");
        return false;
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public <S extends C33Q, T> InterfaceC222288nw asyncSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends AbstractC72932td<? extends T>> tbw, C56412MCa<C213178Yf<AbstractC72932td<T>>> c56412MCa, InterfaceC88471Ynr<? super C3C8, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super C3C8, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C212418Vh.LIZ(this, assemViewModel, tbw, c56412MCa, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    public <S extends C33Q, A, B> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LJI(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
