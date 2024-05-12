package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import defpackage.i0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS65S0110000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MoV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57935MoV implements InterfaceC57782Mm2, KPL {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public final C57859MnH LJLIL;
    public final String LJLILLLLZI;
    public final C57938MoY LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final C214298b3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public InterfaceC57932MoS LJLL;
    public final C62822Ol8 LJLLI;

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

    public final UserCardListViewModel LIZ() {
        return (UserCardListViewModel) this.LJLJJLL.getValue();
    }

    @Override // X.InterfaceC57782Mm2
    public final C57939MoZ LJLJJLL() {
        return (C57939MoZ) this.LJLJLJ.getValue();
    }

    @Override // X.InterfaceC25773A9p
    public final AbstractC030109x getItemAnimator() {
        return (AbstractC030109x) this.LJLLI.getValue();
    }

    @Override // X.InterfaceC57782Mm2
    public final LifecycleOwner getLifecycleOwner() {
        return (LifecycleOwner) this.LJLJL.getValue();
    }

    @Override // X.InterfaceC25773A9p
    public final void destroy() {
        LIZ().onCleared();
    }

    @Override // X.InterfaceC25773A9p
    public final C57778Mly getCurrentState() {
        return LIZ().iv0().getState();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = getLifecycleOwner().getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        return lifecycle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC25773A9p
    public final void o1() {
        C57949Moj c57949Moj = (C57949Moj) LIZ().getState();
        c57949Moj.getClass();
        if ((C208708Ha.LIZJ(c57949Moj) instanceof C72922tc) || !c57949Moj.LIZIZ() || (C208708Ha.LIZLLL(c57949Moj) instanceof C72922tc)) {
            return;
        }
        AssemSingleListViewModel.manualListLoadMore$default(LIZ(), null, 1, null);
    }

    @Override // X.InterfaceC25773A9p
    public final void reset() {
        LIZ().reset();
    }

    @Override // X.InterfaceC57782Mm2
    public final C57859MnH getConfig() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC25773A9p
    public final void K8(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        LIZ().iv0().K8(listener);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJIILL(AbstractC57774Mlu<RecUser> abstractC57774Mlu) {
        UserCardListViewModel LIZ = LIZ();
        LIZ.getClass();
        AYY ayy = AYY.LIZ;
        String str = LIZ.LJLJJL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("init ViewModel, value: ");
        LIZ2.append(abstractC57774Mlu);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        ayy.getClass();
        AYY.LIZIZ(str, LIZIZ);
        XKX.LIZLLL(LIZ.getAssemVMScope(), null, null, new C57961Mov(LIZ, abstractC57774Mlu, null), 3);
        this.LJLJI.LIZ(0, new AqS175S0100000_9(this, 521));
        LIZ().runOnWorkThread(new AqS175S0100000_9(this, 520));
    }

    @Override // X.InterfaceC25773A9p
    public final void LJIJJLI(RecyclerView recyclerView) {
        String type;
        String str;
        SYL syl;
        o.LJIIIZ(recyclerView, "recyclerView");
        if ((recyclerView instanceof SYL) && (syl = (SYL) recyclerView) != null) {
            syl.setListConfig(LJLJJLL());
        }
        C78646Utm c78646Utm = C78646Utm.LIZ;
        C57819Mmd trackerConfig = this.LJLIL.getTrackerConfig();
        c78646Utm.getClass();
        o.LJIIIZ(trackerConfig, "<this>");
        if (trackerConfig.LJ) {
            type = EnumC57366MfK.POP_UP.getType();
        } else {
            type = EnumC57366MfK.CARD.getType();
        }
        if (trackerConfig.LIZLLL.length() == 0) {
            str = "";
        } else if (o.LJ(trackerConfig.LIZLLL, HG3.LJIILL().getCurUserId())) {
            str = "self_";
        } else {
            str = "other_";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserCard_");
        LIZ.append(trackerConfig.LIZ);
        LIZ.append('_');
        LIZ.append(type);
        LIZ.append('_');
        LIZ.append(str);
        ((PerfMonitorService) ServiceManager.get().getService(PerfMonitorService.class)).LJ(recyclerView, X1D.LIZIZ(LIZ));
        this.LJLJI.LIZ(null, new AqS140S0200000_9(this, recyclerView, 81));
    }

    @Override // X.InterfaceC57782Mm2
    public final void LJJJIL(InterfaceC57932MoS section) {
        o.LJIIIZ(section, "section");
        this.LJLL = section;
        section.LJJJJZI(this.LJLJJL);
        C57938MoY c57938MoY = this.LJLJI;
        c57938MoY.getClass();
        c57938MoY.LIZ = section;
        section.LJJLIIIJLJLI(new AqS156S0200000_9(c57938MoY, section, 93));
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJLIIIJJIZ(InterfaceC88472Yns<? super C57819Mmd, C57819Mmd> interfaceC88472Yns) {
        C57819Mmd trackerConfig = LIZ().LJLIL.getTrackerConfig();
        C57819Mmd config = interfaceC88472Yns.invoke(trackerConfig);
        if (o.LJ(config, trackerConfig)) {
            return;
        }
        UserCardListViewModel LIZ = LIZ();
        LIZ.getClass();
        o.LJIIIZ(config, "config");
        AYY ayy = AYY.LIZ;
        String str = LIZ.LJLJJL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("update tracker config: ");
        LIZ2.append(config);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        ayy.getClass();
        AYY.LIZIZ(str, LIZIZ);
        LIZ.LJLIL = C57859MnH.copy$default(LIZ.LJLIL, null, null, null, null, config, null, null, 111, null);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJLIL(InterfaceC57917MoD interfaceC57917MoD) {
        ((CopyOnWriteArrayList) ((C57916MoC) LIZ().jv0().LJIIZILJ().LIZLLL.getValue()).LIZIZ).add(interfaceC57917MoD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC25773A9p
    public final void LJLJLJ(boolean z) {
        C57949Moj c57949Moj = (C57949Moj) LIZ().getState();
        c57949Moj.getClass();
        if (c57949Moj.getListState().LJLIL instanceof C72922tc) {
            return;
        }
        C57949Moj c57949Moj2 = (C57949Moj) LIZ().getState();
        c57949Moj2.getClass();
        if (c57949Moj2.getListState().LJLILLLLZI instanceof C72922tc) {
            return;
        }
        UserCardListViewModel LIZ = LIZ();
        if (!z) {
            LIZ.manualListRefresh();
        } else {
            XKX.LIZLLL(LIZ.getAssemVMScope(), null, null, new C57936MoW(LIZ, null), 3);
        }
    }

    @Override // X.InterfaceC25773A9p
    public final void W7(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        LIZ().iv0().W7(listener);
    }

    public C57935MoV(C57859MnH c57859MnH, boolean z) {
        C214298b3 c214298b3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C57898Mnu.LJ(c57859MnH));
        LIZ.append("|UI");
        String LIZIZ = X1D.LIZIZ(LIZ);
        C57938MoY c57938MoY = new C57938MoY(LIZIZ);
        this.LJLIL = c57859MnH;
        this.LJLILLLLZI = LIZIZ;
        this.LJLJI = c57938MoY;
        String LIZ2 = AnonymousClass629.LIZ("randomUUID().toString()");
        this.LJLJJI = LIZ2;
        this.LJLJJL = i0.LJFF("VAbility_", LIZ2);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(this, 941);
        AqS65S0110000_9 aqS65S0110000_9 = new AqS65S0110000_9(this, z, 7);
        Fragment hostFragment = c57859MnH.getHostFragment();
        if (hostFragment != null) {
            C9BE c9be = C9BE.LIZ;
            C65776Prg LIZ3 = C65352Pkq.LIZ(UserCardListViewModel.class);
            C57941Mob c57941Mob = C57941Mob.INSTANCE;
            if (o.LJ(c9be, C9BD.LIZ)) {
                c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(hostFragment, true), C78926UyI.LJJIIJZLJL(hostFragment, true), aqS65S0110000_9, C78926UyI.LJJ(hostFragment, true), C78926UyI.LJIILLIIL(hostFragment, true), c57941Mob, LIZ3);
            } else if (c9be == null || o.LJ(c9be, c9be)) {
                c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(hostFragment, false), C78926UyI.LJJIIJZLJL(hostFragment, false), aqS65S0110000_9, C78926UyI.LJJ(hostFragment, false), C78926UyI.LJIILLIIL(hostFragment, false), c57941Mob, LIZ3);
            } else {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
        } else {
            ActivityC45651qj hostActivity = c57859MnH.getHostActivity();
            if (hostActivity != null) {
                c214298b3 = new C214298b3(C65352Pkq.LIZ(UserCardListViewModel.class), aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(hostActivity, false), C78926UyI.LJJIIJZLJL(hostActivity, false), aqS65S0110000_9, C57942Moc.INSTANCE, (InterfaceC65784Pro) null, 384);
            } else {
                "relation user card not config any host!".toString();
                throw new IllegalStateException("relation user card not config any host!");
            }
        }
        this.LJLJJLL = c214298b3;
        this.LJLJL = C27484AqW.LJIIIIZZ(new AqS159S0100000_9(this, 939));
        this.LJLJLJ = C27484AqW.LJIIIIZZ(new AqS159S0100000_9(this, 940));
        this.LJLJLLL = C27484AqW.LJIIIIZZ(new AqS159S0100000_9(this, 942));
        this.LJLLI = C221108m2.LIZIZ(C58023Mpv.LJLIL);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJIJ(String str, String str2, List list) {
        UserCardListViewModel LIZ = LIZ();
        XKX.LIZLLL(LIZ.getAssemVMScope(), null, null, new C57937MoX(LIZ, list, str, str2, null), 3);
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
