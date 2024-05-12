package com.ss.android.ugc.aweme.explore.ui;

import X.ActivityC45651qj;
import X.C0A2;
import X.C10A;
import X.C116694i1;
import X.C118234kV;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C206978Aj;
import X.C206998Al;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C40517FvF;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C7MY;
import X.C8D7;
import X.C8D8;
import X.C8D9;
import X.C8DA;
import X.C8DB;
import X.C8DC;
import X.C8DG;
import X.C8VV;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.FMX;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC53896LDg;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.ORY;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedImpressionManager;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseExploreFeedFragment extends FeedFragment implements KPL, InterfaceC53896LDg {
    public final C214298b3 LJLJL;
    public final C214298b3 LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLI;
        Integer valueOf = Integer.valueOf(R.id.d1v);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.d1v)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
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

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public BaseExploreFeedFragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ExploreFeedListViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 196);
        C8D9 c8d9 = C8D9.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c8d9, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c8d9, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(ExploreFeedImpressionManager.class);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(LIZ2, 197);
        C8DA c8da = C8DA.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c8da, LIZ2);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c8da, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJLJ = c214298b32;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Dl() {
        if (this.LJLILLLLZI != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLILLLLZI;
            if (currentTimeMillis > 0) {
                getContext();
                FMX.LJIIIIZZ("stay_time", this.LJLJI, currentTimeMillis);
                xl(currentTimeMillis);
            }
            this.LJLILLLLZI = -1L;
        }
    }

    public final ExploreFeedListViewModel Gl() {
        return (ExploreFeedListViewModel) this.LJLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Al() {
        if (!Il()) {
            return;
        }
        super.Al();
    }

    public final boolean Il() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || !isVisible() || !getUserVisibleHint() || !Hox.LJLLI.LIZ(mo49getActivity).vv0("homepage_explore")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!Il()) {
            return;
        }
        Hl(C8DB.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (!Il()) {
            return;
        }
        Hl(C8DC.LJLIL);
        ExploreFeedImpressionManager exploreFeedImpressionManager = (ExploreFeedImpressionManager) this.LJLJLJ.getValue();
        exploreFeedImpressionManager.LJLIL.clear();
        ((LinkedHashMap) exploreFeedImpressionManager.LJLILLLLZI).clear();
        exploreFeedImpressionManager.LJLJI.clear();
    }

    public final void Hl(InterfaceC88472Yns<? super ExploreFeedCell, C76800UCe> interfaceC88472Yns) {
        C0A2 c0a2;
        int i;
        C0A2 c0a22;
        C0A2 c0a23;
        RecyclerView.ViewHolder viewHolder;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2;
        StaggeredGridLayoutManager staggeredGridLayoutManager3;
        if (_$_findCachedViewById(R.id.d1v) == null) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.d1v);
        if (recyclerView != null) {
            c0a2 = recyclerView.getLayoutManager();
        } else {
            c0a2 = null;
        }
        if ((c0a2 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager3 = (StaggeredGridLayoutManager) c0a2) != null) {
            i = staggeredGridLayoutManager3.LJLZ;
        } else {
            i = 2;
        }
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.d1v);
        if (recyclerView2 != null) {
            c0a22 = recyclerView2.getLayoutManager();
        } else {
            c0a22 = null;
        }
        if ((c0a22 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) c0a22) != null) {
            staggeredGridLayoutManager2.LLIL(iArr);
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = iArr[0];
        C118234kV it = new C40517FvF(1, i - 1).iterator();
        while (it.LJLJI) {
            int i3 = iArr[it.nextInt()];
            if (i2 > i3) {
                i2 = i3;
            }
        }
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.d1v);
        if (recyclerView3 != null) {
            c0a23 = recyclerView3.getLayoutManager();
        } else {
            c0a23 = null;
        }
        if ((c0a23 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) c0a23) != null) {
            staggeredGridLayoutManager.LLILII(iArr2);
        }
        int LJJL = ORY.LJJL(iArr2);
        if (i2 < 0 || LJJL < 0 || LJJL < i2 || i2 > LJJL) {
            return;
        }
        while (true) {
            RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(R.id.d1v);
            if (recyclerView4 != null) {
                viewHolder = recyclerView4.LJJJ(i2, false);
            } else {
                viewHolder = null;
            }
            if ((viewHolder instanceof ExploreFeedCell) && viewHolder != null) {
                interfaceC88472Yns.invoke(viewHolder);
            }
            if (i2 != LJJL) {
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        Dl();
        Hl(C8D7.LJLIL);
        ExploreFeedImpressionManager exploreFeedImpressionManager = (ExploreFeedImpressionManager) this.LJLJLJ.getValue();
        exploreFeedImpressionManager.LJLIL.clear();
        ((LinkedHashMap) exploreFeedImpressionManager.LJLILLLLZI).clear();
        exploreFeedImpressionManager.LJLJI.clear();
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        Al();
        Hl(C8D8.LJLIL);
    }

    public void initView(View view) {
        this.LJLJLLL = C7MY.LIZLLL(view, "view", R.id.lgd, "view.findViewById(R.id.top_space)");
        View findViewById = view.findViewById(R.id.arj);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.bottom_space)");
        this.LJLL = findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C206998Al c206998Al = (C206998Al) C206978Aj.LIZ.getValue();
        c206998Al.getClass();
        c206998Al.LIZ = SystemClock.elapsedRealtime();
        c206998Al.LJIIIIZZ = "enter_tab";
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C8DG c8dg = C8DG.LJLIL;
            C8DG.LJLILLLLZI = mo49getActivity;
            C116694i1.LIZ(mo49getActivity).hv0(c8dg);
        }
        this.LJLJI = "homepage_explore";
        this.LJLJJI = 35;
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 108));
        initView(view);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.auh, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
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
