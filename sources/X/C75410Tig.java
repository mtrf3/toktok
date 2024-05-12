package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AudioStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.PlayerPauseLiveForAnchorDialogEvent;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AudioBeOccupiedSettings;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tig, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75410Tig implements KPL {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final LifecycleOwner LJLIL;
    public final DataChannel LJLILLLLZI;
    public final InterfaceC65784Pro<List<InterfaceC75252Tg8>> LJLJI;
    public final C31657Cbd LJLJJI = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
    public final String LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;

    static {
        TBT tbt = new TBT(C75410Tig.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt};
    }

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

    public final void LIZ() {
        MultiGuestDataHolder LIZJ;
        if (MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getShowNetworkTip()) {
            MultiGuestDataHolder LIZJ2 = LIZJ();
            if (LIZJ2 != null) {
                C0NB.LIZIZ("NetworkStateTips", "clearNetworkUserStateMap");
                ((ConcurrentHashMap) LIZJ2.LJIJJ).clear();
            }
            ((C75395TiR) this.LJLJJLL.getValue()).LIZ();
            for (InterfaceC75252Tg8 interfaceC75252Tg8 : this.LJLJI.invoke()) {
                if ((interfaceC75252Tg8 instanceof C75357Thp) && (LIZJ = LIZJ()) != null) {
                    C75357Thp c75357Thp = (C75357Thp) interfaceC75252Tg8;
                    c75357Thp.LJJIJIIJIL(Integer.valueOf(LIZJ.LJFF(c75357Thp.getInteractId())).intValue());
                }
            }
        }
    }

    public final MultiGuestDataHolder LIZJ() {
        return (MultiGuestDataHolder) this.LJLJJI.LIZ(this, LJLJLJ[0]);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLIL.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        return lifecycle;
    }

    public static void LIZIZ(String str) {
        UC0.LJJIZ(str, "StateProxy");
    }

    public final void LIZLLL(List<UserState> list) {
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (UserState userState : list) {
            OSZ osz = new OSZ(userState.linkMicId, Integer.valueOf(userState.audioMuted));
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        for (InterfaceC75252Tg8 interfaceC75252Tg8 : this.LJLJI.invoke()) {
            String LJJ = interfaceC75252Tg8.LJJ();
            Integer num = (Integer) linkedHashMap.get(LJJ);
            if (LJJ != null && num != null) {
                if (1 == MultiGuestV3AudioBeOccupiedSettings.getValue()) {
                    LJIIIZ(num.intValue(), LJJ, new AqS160S0200000_13(interfaceC75252Tg8, num, 101));
                } else if (C74650TRm.LIZ()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("[AudioState] call mask「");
                    LIZ.append(LJJ);
                    LIZ.append("」 audio state Changed");
                    UC0.LJJIZ(X1D.LIZIZ(LIZ), "StateProxy");
                    interfaceC75252Tg8.LJJII(num.intValue());
                }
            }
        }
    }

    public final void LJFF(List<UserState> list) {
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (UserState userState : list) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJJL);
            LIZ.append("_update map linkMicId = ");
            LIZ.append(userState.linkMicId);
            LIZ.append(" state = ");
            LIZ.append(userState.networkState);
            LIZIZ(X1D.LIZIZ(LIZ));
            OSZ osz = new OSZ(userState.linkMicId, userState);
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        List<InterfaceC75252Tg8> invoke = this.LJLJI.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : invoke) {
            if (obj instanceof InterfaceC75266TgM) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC75252Tg8 interfaceC75252Tg8 = (InterfaceC75252Tg8) it.next();
            String LJJ = interfaceC75252Tg8.LJJ();
            UserState userState2 = (UserState) linkedHashMap.get(LJJ);
            if (userState2 != null) {
                int i = userState2.networkState;
                ((C75395TiR) this.LJLJJLL.getValue()).LIZJ(i, userState2.linkMicId);
                ((InterfaceC75266TgM) interfaceC75252Tg8).LJJIJIIJIL(i);
                MultiGuestDataHolder LIZJ = LIZJ();
                if (LIZJ != null && LJJ != null) {
                    ((ConcurrentHashMap) LIZJ.LJIJJ).put(LJJ, Integer.valueOf(i));
                }
                StringBuilder LIZ2 = X1D.LIZ();
                YE1.LIZLLL(LIZ2, this.LJLJJL, "_update linkMicId = ", LJJ, " state = ");
                LIZ2.append(i);
                LIZIZ(X1D.LIZIZ(LIZ2));
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("on linkUserNetworkStateChanged: ");
            LIZ3.append(interfaceC75252Tg8.LJJ());
            LIZIZ(X1D.LIZIZ(LIZ3));
        }
    }

    public final void LJI(List<UserState> list) {
        int i;
        int i2;
        boolean z;
        DataChannel dataChannel;
        boolean z2;
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        int i3 = 16;
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (UserState userState : list) {
            OSZ osz = new OSZ(userState.linkMicId, Integer.valueOf(userState.onlineUserState));
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        int LJJIIZ2 = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        if (LJJIIZ2 >= 16) {
            i3 = LJJIIZ2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
        for (UserState userState2 : list) {
            OSZ osz2 = new OSZ(userState2.linkMicId, Integer.valueOf(userState2.rtcConnection));
            linkedHashMap2.put(osz2.getFirst(), osz2.getSecond());
        }
        String LJJJJLL = C78886Uxe.LJJJJLL(C8E.LJ());
        List<InterfaceC75252Tg8> invoke = this.LJLJI.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : invoke) {
            if (true ^ o.LJ(((InterfaceC75252Tg8) obj).LJJ(), LJJJJLL)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC75252Tg8 interfaceC75252Tg8 = (InterfaceC75252Tg8) it.next();
            String LJJ = interfaceC75252Tg8.LJJ();
            Integer num = (Integer) linkedHashMap2.get(LJJ);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            Integer num2 = (Integer) linkedHashMap.get(LJJ);
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 1;
            }
            MultiGuestDataHolder LIZJ = LIZJ();
            boolean z3 = false;
            if (LIZJ != null && i2 == LIZJ.LJI(LJJ)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (2 == i || 2 == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                interfaceC75252Tg8.LJJI(z2);
            }
            MultiGuestDataHolder LIZJ2 = LIZJ();
            if (LIZJ2 != null && LJJ != null) {
                ((ConcurrentHashMap) LIZJ2.LJIJI).put(LJJ, Integer.valueOf(i2));
            }
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            if (C74947TbD.LJIILLIIL(LJ) && (dataChannel = this.LJLILLLLZI) != null) {
                if (2 == i || 2 == i2) {
                    z3 = true;
                }
                if (LJJ == null) {
                    LJJ = "";
                }
                dataChannel.qv0(PlayerPauseLiveForAnchorDialogEvent.class, new C74641TRd(z3, LJJ));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("on linkUserStateChanged: ");
            LIZ.append(interfaceC75252Tg8.LJJ());
            LIZIZ(X1D.LIZIZ(LIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.util.List<com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState> r13) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75410Tig.LJII(java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (r1 != 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r3 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.util.List<com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState> r8) {
        /*
            r7 = this;
            r0 = 10
            int r0 = X.C32I.LJJL(r8, r0)
            int r1 = X.C51029K0z.LJJIIZ(r0)
            r0 = 16
            if (r1 >= r0) goto L10
            r1 = 16
        L10:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r1)
            java.util.Iterator r3 = r8.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r3.next()
            com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState r0 = (com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState) r0
            java.lang.String r2 = r0.linkMicId
            int r0 = r0.videoMuted
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.OSZ r0 = new X.OSZ
            r0.<init>(r2, r1)
            java.lang.Object r1 = r0.getFirst()
            java.lang.Object r0 = r0.getSecond()
            r5.put(r1, r0)
            goto L19
        L3e:
            X.Pro<java.util.List<X.Tg8>> r0 = r7.LJLJI
            java.lang.Object r0 = r0.invoke()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r6 = r0.iterator()
        L4a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb3
            java.lang.Object r4 = r6.next()
            X.Tg8 r4 = (X.InterfaceC75252Tg8) r4
            java.lang.String r2 = r4.LJJ()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "[VideoState] call mask「"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "」 video state Changed"
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "StateProxy"
            X.UC0.LJJIZ(r1, r0)
            if (r2 == 0) goto L9c
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L9c
            boolean r3 = r4 instanceof X.InterfaceC75376Ti8
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2 = 1
            if (r0 == 0) goto L97
            int r1 = r0.intValue()
            r0 = r3 ^ 1
            if (r1 == 0) goto L95
            if (r1 == r2) goto L9a
        L91:
            r4.LJJIFFI(r2)
            goto L4a
        L95:
            r2 = r0
            goto L91
        L97:
            if (r3 != 0) goto L9a
            goto L91
        L9a:
            r2 = 0
            goto L91
        L9c:
            java.lang.String r1 = "linkState missed mask["
            r0 = 93
            java.lang.String r4 = X.C0F0.LIZLLL(r1, r2, r0)
            X.Tuz r3 = X.C76173Tuz.LIZ
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r4)
            r1 = 0
            r0 = 51002(0xc73a, float:7.1469E-41)
            r3.LIZIZ(r0, r4, r2, r1)
            goto L4a
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75410Tig.LJIIIIZZ(java.util.List):void");
    }

    public C75410Tig(LifecycleOwner lifecycleOwner, DataChannel dataChannel, AqS163S0100000_13 aqS163S0100000_13) {
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = aqS163S0100000_13;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiGuestV3StateProxy_");
        LIZ.append(hashCode());
        this.LJLJJL = X1D.LIZIZ(LIZ);
        this.LJLJJLL = C221108m2.LIZIZ(TYO.LJLIL);
        this.LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 567));
    }

    public final void LJIIIZ(int i, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (!C74650TRm.LIZ() && i == 0) {
            return;
        }
        MultiGuestDataHolder LIZJ = LIZJ();
        if (LIZJ != null && i == LIZJ.LIZIZ(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("linkmicid:");
        LIZ.append(str);
        LIZ.append(", audioState:");
        LIZ.append(i);
        C0NB.LIZIZ("AudioState", X1D.LIZIZ(LIZ));
        MultiGuestDataHolder LIZJ2 = LIZJ();
        if (LIZJ2 != null) {
            ((ConcurrentHashMap) LIZJ2.LJJI).put(str, Integer.valueOf(i));
        }
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.qv0(AudioStateChangeEvent.class, new C75121Te1(i, str));
        }
        interfaceC65784Pro.invoke();
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
