package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.service.IImInboxDmService;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.inbox.skylight.template.SkylightTemplateCell;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.vh.InboxTopSkeletonCell;
import com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS14S0010000_9;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MXs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56976MXs extends MMX<InboxHorizontalTopListCombinePod> implements KPL, InterfaceC56632MKm {
    public static final /* synthetic */ int LJLZ = 0;
    public int LJLJLLL;
    public long LJLL;
    public final String LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final MKT LJLLL;
    public final C62822Ol8 LJLLLL;
    public final InterfaceC100173wT LJLLLLLL;

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

    public final IInboxLiveService c0() {
        return (IInboxLiveService) this.LJLLILLLL.getValue();
    }

    public final boolean f0() {
        return ((Boolean) this.LJLLLL.getValue()).booleanValue();
    }

    public final InboxTopHorizontalListVM g0() {
        return (InboxTopHorizontalListVM) this.LJLLJ.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle;
        Context context = this.LJLLL.getContext();
        o.LJIIIIZZ(context, "list.context");
        LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(context);
        if (LIZIZ != null && (lifecycle = LIZIZ.getLifecycle()) != null) {
            return lifecycle;
        }
        throw new IllegalStateException("cannot get lifecycle from context");
    }

    public final void h0() {
        if (this.LJLJLLL > 0) {
            LiveOuterService.LJJJLL().LJJJJIZL();
            if (!C62046OWs.LIZIZ("livesdk_enter_message_window")) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("request_id", "");
            c188727au.LJ(currentTimeMillis - this.LJLL, "live_cell_load_time");
            c188727au.LJIIIZ("enter_from_merge", "message");
            c188727au.LJIIIZ("enter_method", "live_cover");
            int i = 1;
            if (!this.itemView.canScrollHorizontally(1) && !this.itemView.canScrollHorizontally(-1)) {
                i = 0;
            }
            c188727au.LIZLLL(i, "is_draw");
            FMX.LJIIL("livesdk_enter_message_window", c188727au.LIZ);
        }
    }

    @Override // X.InterfaceC56632MKm
    public final void LLJJJJJIL() {
        RecyclerView.ViewHolder LJJJJJL;
        if (f0()) {
            c0().resumeSyncController();
            return;
        }
        C0A2 layoutManager = this.LJLLL.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int LJJJI = layoutManager.LJJJI();
        for (int i = 0; i < LJJJI; i++) {
            View LJJJ = layoutManager.LJJJ(i);
            if (LJJJ != null && (LJJJJJL = this.LJLLL.LJJJJJL(LJJJ)) != null) {
                c0().callResumeAnimation(LJJJJJL);
            }
        }
    }

    @Override // X.InterfaceC56632MKm
    public final void LLLII() {
        if (f0()) {
            c0().endSyncController();
        }
    }

    @Override // X.InterfaceC56632MKm
    public final void LLLLZLL() {
        RecyclerView.ViewHolder LJJJJJL;
        if (f0()) {
            c0().pauseSyncController();
            return;
        }
        C0A2 layoutManager = this.LJLLL.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int LJJJI = layoutManager.LJJJI();
        for (int i = 0; i < LJJJI; i++) {
            View LJJJ = layoutManager.LJJJ(i);
            if (LJJJ != null && (LJJJJJL = this.LJLLL.LJJJJJL(LJJJ)) != null) {
                c0().callPauseAnimation(LJJJJJL);
            }
        }
    }

    @Override // X.InterfaceC56632MKm
    public final String LJIJ() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC56632MKm
    public final void LJLJJL(boolean z) {
        boolean z2;
        int LIZIZ;
        C34K c34k = new C34K();
        if (this.LJLLL.getLayoutParams() == null || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        c34k.element = z2;
        this.LJLLL.LJIIIZ(new C56982MXy(c34k));
        MKT mkt = this.LJLLL;
        if (z) {
            LIZIZ = -2;
        } else if (C48709J9t.LIZ) {
            LIZIZ = C7MY.LIZIZ(122);
        } else {
            LIZIZ = C7MY.LIZIZ(114);
        }
        if (mkt.getLayoutParams() == null) {
            mkt.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, LIZIZ));
        } else {
            if (mkt.getLayoutParams().height == LIZIZ) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = mkt.getLayoutParams();
            layoutParams.height = LIZIZ;
            mkt.setLayoutParams(layoutParams);
        }
    }

    @Override // X.InterfaceC56632MKm
    public final void LLJLL(boolean z) {
        if (z) {
            LLJJJJJIL();
        } else {
            LLLLZLL();
        }
    }

    @Override // X.MMX
    public final void U(boolean z) {
        super.U(z);
        InterfaceC100173wT interfaceC100173wT = this.LJLLLLLL;
        if (interfaceC100173wT != null) {
            interfaceC100173wT.onVisible();
        }
    }

    @Override // X.MMX
    public final void V(InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod) {
        boolean z;
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod2;
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod3 = inboxHorizontalTopListCombinePod;
        SystemClock.uptimeMillis();
        C56653MLh c56653MLh = C56652MLg.LIZIZ;
        c56653MLh.getClass();
        c56653MLh.LJ = System.currentTimeMillis();
        super.V(inboxHorizontalTopListCombinePod3);
        if (!o.LJ(g0().LLIIII, this.LJLLL)) {
            InboxTopHorizontalListVM g0 = g0();
            C72808Sho<InterfaceC57784Mm4> state = this.LJLLL.getState();
            o.LJIIIIZZ(state, "list.state");
            g0.setListState(state);
            InboxTopHorizontalListVM g02 = g0();
            MKT mkt = this.LJLLL;
            g02.LLIIII = mkt;
            mkt.LJLJLLL(g0().getConfig());
        }
        Long liveResponseTime = inboxHorizontalTopListCombinePod3.getLiveResponseTime();
        if (liveResponseTime != null) {
            this.LJLL = liveResponseTime.longValue();
        }
        this.LJLJLLL = inboxHorizontalTopListCombinePod3.getLiveNotices().size();
        InboxTopHorizontalListVM g03 = g0();
        int hashCode = hashCode();
        g03.getClass();
        g03.LLIFFJFJJ = hashCode;
        C34K c34k = new C34K();
        c34k.element = true;
        boolean z2 = false;
        if (inboxHorizontalTopListCombinePod3.isDefault() || ((inboxHorizontalTopListCombinePod2 = g03.LJLLI) != null && o.LJ(inboxHorizontalTopListCombinePod3, inboxHorizontalTopListCombinePod2))) {
            c34k.element = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isInit=");
        if (g03.LJLLI != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(",equals = ");
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod4 = g03.LJLLI;
        if (inboxHorizontalTopListCombinePod4 != null && o.LJ(inboxHorizontalTopListCombinePod3, inboxHorizontalTopListCombinePod4)) {
            z2 = true;
        }
        LIZ.append(z2);
        X1D.LIZIZ(LIZ);
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod5 = g03.LJLLI;
        if (inboxHorizontalTopListCombinePod5 == null || inboxHorizontalTopListCombinePod3 != inboxHorizontalTopListCombinePod5) {
            C114304eA.LIZIZ(new AqS159S0100000_9(inboxHorizontalTopListCombinePod3, 926));
            g03.LJLJLLL.clear();
            g03.LJLLL = true;
        }
        g03.LJLLI = inboxHorizontalTopListCombinePod3;
        g03.LLI = MYP.LIZ();
        g03.withState(new AqS140S0200000_9(c34k, g03, 77));
        SystemClock.uptimeMillis();
    }

    @Override // X.MMX
    public final void X(InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod) {
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod2 = inboxHorizontalTopListCombinePod;
        super.X(inboxHorizontalTopListCombinePod2);
        if (!o.LJ(g0().LLIIII, this.LJLLL)) {
            InboxTopHorizontalListVM g0 = g0();
            C72808Sho<InterfaceC57784Mm4> state = this.LJLLL.getState();
            o.LJIIIIZZ(state, "list.state");
            g0.setListState(state);
            InboxTopHorizontalListVM g02 = g0();
            MKT mkt = this.LJLLL;
            g02.LLIIII = mkt;
            mkt.LJLJLLL(g0().getConfig());
        }
        InboxTopHorizontalListVM g03 = g0();
        int hashCode = hashCode();
        g03.getClass();
        g03.LLIFFJFJJ = hashCode;
        g03.LJLLI = inboxHorizontalTopListCombinePod2;
        C72808Sho<ITEM> c72808Sho = g03.state;
        if (c72808Sho != 0) {
            C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
            StoryInboxItem storyInboxItem = new StoryInboxItem(c55723Ltv.LJIL().LJI(), 0, false, 6, null);
            boolean z = !C54838Lfe.LJIJI(storyInboxItem.getStoryCollection());
            boolean shouldShowShootingEntrance = g03.lv0().shouldShowShootingEntrance(true, z);
            ArrayList arrayList = new ArrayList();
            if (shouldShowShootingEntrance && (c55723Ltv.LJIILJJIL().LIZIZ() || z)) {
                arrayList.add(storyInboxItem);
            }
            List<InterfaceC57784Mm4> first = ((IAppWidgetService) g03.LJLJLJ.getValue()).LJII(arrayList).getFirst();
            int LIZJ = C53432Ky4.LIZJ();
            for (int size = first.size(); size < LIZJ; size++) {
                first.add(new M9J());
            }
            c72808Sho.LJIILLIIL(first);
            MutableLiveData<MZ9> mutableLiveData = c72808Sho.LIZ;
            o.LJII(mutableLiveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.bytedance.ies.powerlist.ListStateContent<*>>");
            mutableLiveData.setValue(new MZ9(first, false, false));
        }
        if (g03.LLII) {
            g03.LLII = false;
            g03.setState(new AqS14S0010000_9(false, 10));
        }
    }

    @Override // X.MMX
    public final void Y(boolean z) {
        super.Y(z);
        InterfaceC100173wT interfaceC100173wT = this.LJLLLLLL;
        if (interfaceC100173wT != null) {
            interfaceC100173wT.onInvisible();
        }
    }

    public final void i0(long j) {
        InboxLiveNotice LIZ;
        SlimRoom roomInfo;
        Iterator it = ((ArrayList) this.LJLLL.getState().LJII()).iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) it.next();
                if ((interfaceC57784Mm4 instanceof AbstractC54715Ldf) && (LIZ = ((AbstractC54715Ldf) interfaceC57784Mm4).LIZ()) != null && (roomInfo = LIZ.getRoomInfo()) != null && roomInfo.getId() == j) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        l0(i);
    }

    public final void l0(int i) {
        if (i >= 0 && i < this.LJLLL.getState().LJIIIIZZ()) {
            C0A2 layoutManager = this.LJLLL.getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).LJFF(i, 0);
        }
    }

    public C56976MXs(MKT mkt, boolean z) {
        super(mkt);
        InterfaceC100173wT LIZIZ;
        this.LJLLI = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().getUid();
        this.LJLLILLLL = C221108m2.LIZIZ(MY1.LJLIL);
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(MY7.LJLIL);
        C62822Ol8 LIZIZ3 = C221108m2.LIZIZ(C54266LRm.LJLIL);
        C62822Ol8 LIZIZ4 = C221108m2.LIZIZ(MYE.LJLIL);
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(mkt, 890));
        this.LJLLL = mkt;
        this.LJLLLL = C221108m2.LIZIZ(AnonymousClass937.LJLIL);
        IInboxLiveService c0 = c0();
        boolean z2 = C48709J9t.LIZ;
        c0.setInboxSkyLightUseBiggerAvatar(z2);
        if (f0()) {
            c0().initSyncController();
        }
        LJLJJL(z);
        mkt.getContext();
        mkt.setLayoutManager(new LinearLayoutManager(0, false));
        if (z2) {
            C26338AVi.LJIIIZ(mkt, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, 0, null, 26);
        } else {
            C26338AVi.LJIIIZ(mkt, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, 0, null, 26);
        }
        mkt.setClipToPadding(false);
        Class<? extends PowerCell<? extends AbstractC54715Ldf>>[] liveCells = c0().getLiveCells();
        Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] storyCell = ((IStoryInboxService) LIZIZ2.getValue()).getStoryCell();
        Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] dmCell = ((IImInboxDmService) LIZIZ3.getValue()).getDmCell();
        Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] LJIIIZ = ((IAppWidgetService) LIZIZ4.getValue()).LJIIIZ();
        Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] onThisDayCell = ((IStoryInboxService) LIZIZ2.getValue()).getOnThisDayCell();
        QSQ qsq = new QSQ(7);
        qsq.LIZ(InboxTopSkeletonCell.class);
        qsq.LIZ(SkylightTemplateCell.class);
        qsq.LJ(liveCells);
        qsq.LJ(storyCell);
        qsq.LJ(dmCell);
        qsq.LJ(LJIIIZ);
        qsq.LJ(onThisDayCell);
        mkt.LLLF.LJZL((Class[]) qsq.LJIIIZ(new Class[qsq.LJFF()]));
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        mkt.setListConfig(c57939MoZ);
        if (L03.LIZ()) {
            C40443Fu3.LIZ("inbox_skylight").LJIIIIZZ(mkt);
        }
        mkt.LJIIJJI(new LYX());
        C114304eA.LIZIZ(new AqS156S0200000_9(this, g0(), 79));
        InterfaceC100183wU activityStatusAccuracyAnalysis = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAccuracyAnalysis();
        EnumC112364b2 enumC112364b2 = EnumC112364b2.INBOX_TOP;
        Context context = mkt.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        LIZIZ = activityStatusAccuracyAnalysis.LIZIZ(enumC112364b2, mkt, C57434MgQ.LIZIZ(context), mkt.getContext(), null);
        this.LJLLLLLL = LIZIZ;
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
