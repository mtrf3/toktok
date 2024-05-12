package com.ss.android.ugc.aweme.favorites.business.base;

import X.AbstractC030309z;
import X.AbstractC51036K1g;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C186627Uc;
import X.C26045AKb;
import X.C29S;
import X.C2KF;
import X.C2NU;
import X.C3C5;
import X.C51031K1b;
import X.C65777Prh;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C79004UzY;
import X.C8HS;
import X.C8ZK;
import X.C90903hW;
import X.HG3;
import X.InterfaceC176266vu;
import X.InterfaceC191547fS;
import X.InterfaceC223218pR;
import X.InterfaceC51033K1d;
import X.InterfaceC56526MGk;
import X.InterfaceC57784Mm4;
import X.MGW;
import X.RBX;
import Y.ARunnableS39S0100000_3;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseCollectListFragment<T, D> extends ProfileListFragment implements InterfaceC223218pR<T>, InterfaceC51033K1d<T>, InterfaceC56526MGk, C8ZK {
    public RecyclerView LJLJJI;
    public C73305Spp LJLJJL;
    public C8HS<T> LJLJJLL;
    public String LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public C51031K1b<AbstractC51036K1g<T, D>> LJLL;

    public abstract void Hl();

    public abstract C8HS<T> Il();

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    public abstract void LJIIJJI();

    @Override // X.C8ZK
    public final void Od() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<? extends T> list, boolean z) {
    }

    @Override // X.InterfaceC51033K1d
    public final /* synthetic */ boolean onItemInsertedNew(C2KF c2kf) {
        return false;
    }

    public abstract void refreshData();

    public BaseCollectListFragment() {
        new LinkedHashMap();
        this.LJLJLJ = true;
        this.LJLJLLL = true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void I3() {
        C51031K1b<AbstractC51036K1g<T, D>> c51031K1b = this.LJLL;
        if (c51031K1b != null) {
            o.LJI(c51031K1b);
            if (c51031K1b.LJLIL != 0 && mo49getActivity() != null) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                o.LJI(mo49getActivity);
                mo49getActivity.runOnUiThread(new ARunnableS39S0100000_3(this, 50));
            }
        }
    }

    public final void Kl() {
        int LLILL;
        int LLILLJJLI;
        RecyclerView recyclerView = this.LJLJJI;
        if (recyclerView == null) {
            return;
        }
        o.LJI(recyclerView);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null && (LLILL = linearLayoutManager.LLILL()) <= (LLILLJJLI = linearLayoutManager.LLILLJJLI())) {
            int i = LLILL;
            while (true) {
                if (i >= 0 && i < linearLayoutManager.LJJJJZ()) {
                    RecyclerView recyclerView2 = this.LJLJJI;
                    o.LJI(recyclerView2);
                    View childAt = recyclerView2.getChildAt(i - LLILL);
                    if (childAt != null) {
                        RecyclerView recyclerView3 = this.LJLJJI;
                        o.LJI(recyclerView3);
                        if (recyclerView3.LJJJJJL(childAt) != null) {
                            RecyclerView recyclerView4 = this.LJLJJI;
                            o.LJI(recyclerView4);
                            if (recyclerView4.LJJJJJL(childAt) instanceof InterfaceC176266vu) {
                                RecyclerView recyclerView5 = this.LJLJJI;
                                o.LJI(recyclerView5);
                                Object LJJJJJL = recyclerView5.LJJJJJL(childAt);
                                o.LJII(LJJJJJL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.utils.FavoritesMobUtils.IViewHolderMob");
                                ((InterfaceC176266vu) LJJJJJL).onShowItem();
                            }
                        }
                    }
                }
                if (i != LLILLJJLI) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void Ll() {
        C73306Spq c73306Spq = new C73306Spq();
        String string = getString(R.string.g2t);
        o.LJIIIIZZ(string, "getString(R.string.empty_collect)");
        c73306Spq.LJI = string;
        C73305Spp c73305Spp = this.LJLJJL;
        o.LJI(c73305Spp);
        c73305Spp.setStatus(c73306Spq);
        C73305Spp c73305Spp2 = this.LJLJJL;
        o.LJI(c73305Spp2);
        c73305Spp2.setVisibility(0);
    }

    public void Jl() {
        this.LJLJJLL = Il();
        RecyclerView recyclerView = this.LJLJJI;
        o.LJI(recyclerView);
        recyclerView.setAdapter(this.LJLJJLL);
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        if (!isViewValid()) {
            return;
        }
        C73305Spp c73305Spp = this.LJLJJL;
        o.LJI(c73305Spp);
        c73305Spp.LJFF();
    }

    @Override // X.OGG
    public final View LJIJJ() {
        if (!isViewValid()) {
            return null;
        }
        RecyclerView recyclerView = this.LJLJJI;
        o.LJI(recyclerView);
        return recyclerView;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void LL() {
        if (isViewValid()) {
            RecyclerView recyclerView = this.LJLJJI;
            o.LJI(recyclerView);
            if (recyclerView.getChildCount() > 0) {
                RecyclerView recyclerView2 = this.LJLJJI;
                o.LJI(recyclerView2);
                recyclerView2.LJLIL(0);
            }
        }
    }

    public final boolean LLLZI() {
        boolean z;
        if (!isViewValid()) {
            return false;
        }
        mo49getActivity();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            if (!this.LJLJLJ) {
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIIZZ(R.string.img);
                c26045AKb.LJIIJ();
            }
            this.LJLJLJ = true;
            return false;
        }
        this.LJLJLJ = false;
        C73305Spp c73305Spp = this.LJLJJL;
        o.LJI(c73305Spp);
        c73305Spp.LJFF();
        C51031K1b<AbstractC51036K1g<T, D>> c51031K1b = this.LJLL;
        o.LJI(c51031K1b);
        boolean z2 = !c51031K1b.LJJIFFI();
        if (TextUtils.isEmpty(this.LJLJL)) {
            this.LJLJL = ((RBX) HG3.LJIILL()).getCurUserId();
        }
        if (!TextUtils.isEmpty(this.LJLJL)) {
            refreshData();
        }
        return z2;
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        if (!isViewValid()) {
            return;
        }
        Ll();
        RecyclerView recyclerView = this.LJLJJI;
        o.LJI(recyclerView);
        recyclerView.setVisibility(4);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Oi() {
        if (getUserVisibleHint()) {
            Kl();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        C8HS<T> c8hs;
        if (!isViewValid() || (c8hs = this.LJLJJLL) == null) {
            return false;
        }
        o.LJI(c8hs);
        if (c8hs.getItemCount() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.LJLJLJ = true;
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        if (!isViewValid()) {
            return;
        }
        C8HS<T> c8hs = this.LJLJJLL;
        o.LJI(c8hs);
        c8hs.showLoadMoreLoading();
    }

    @Override // X.InterfaceC56526MGk
    public final void LIZJ() {
        LJIIJJI();
    }

    @Override // X.C8Z7
    public final boolean LJJ() {
        return this.LJLJLJ;
    }

    @Override // X.C8Z7
    public final void LJJJJ() {
        LLLZI();
    }

    @Override // X.InterfaceC56526MGk
    public final boolean hasMore() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC56526MGk
    public final void A8(boolean z) {
        if (!z) {
            C8HS<T> c8hs = this.LJLJJLL;
            o.LJI(c8hs);
            c8hs.setLoadMoreListener((InterfaceC191547fS) null);
            C8HS<T> c8hs2 = this.LJLJJLL;
            o.LJI(c8hs2);
            c8hs2.setLoadEmptyText(R.string.ect);
            C8HS<T> c8hs3 = this.LJLJJLL;
            o.LJI(c8hs3);
            c8hs3.setShowFooter(false);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception e) {
        o.LJIIIZ(e, "e");
        if (!isViewValid()) {
            return;
        }
        C73305Spp c73305Spp = this.LJLJJL;
        o.LJI(c73305Spp);
        c73305Spp.setVisibility(0);
        C73305Spp c73305Spp2 = this.LJLJJL;
        o.LJI(c73305Spp2);
        C73306Spq c73306Spq = new C73306Spq();
        C73312Spw.LJI(c73306Spq, new AqS153S0100000_3((BaseCollectListFragment) this, 231));
        c73305Spp2.setStatus(c73306Spq);
        this.LJLJLJ = true;
    }

    public void initView(View view) {
        o.LJIIIZ(view, "view");
        this.LJLJJI = (RecyclerView) view.findViewById(R.id.bh3);
        this.LJLJJL = (C73305Spp) view.findViewById(R.id.kf_);
        RecyclerView recyclerView = this.LJLJJI;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        mo49getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.LLJJIII(1);
        RecyclerView recyclerView2 = this.LJLJJI;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(wrapLinearLayoutManager);
        }
        RecyclerView recyclerView3 = this.LJLJJI;
        if (recyclerView3 != null) {
            recyclerView3.LJII(new AbstractC030309z() { // from class: X.7r6
                public final int LJLIL = 1;

                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view2, RecyclerView recyclerView4, C0AC c0ac) {
                    T28.LJ(rect, "outRect", view2, "view", recyclerView4, "parent", c0ac, "state");
                    rect.bottom = this.LJLIL;
                }
            }, -1);
        }
        RecyclerView recyclerView4 = this.LJLJJI;
        MGW.LIZ(recyclerView4, this, 2, false);
        this.LJLJJI = recyclerView4;
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception e) {
        o.LJIIIZ(e, "e");
        if (!isViewValid()) {
            return;
        }
        C8HS<T> c8hs = this.LJLJJLL;
        o.LJI(c8hs);
        c8hs.showLoadMoreError();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC51033K1d
    public final void onItemDeleted(int i) {
        if (!isViewValid()) {
            return;
        }
        C8HS<T> c8hs = this.LJLJJLL;
        o.LJI(c8hs);
        c8hs.notifyItemRemoved(i);
        C8HS<T> c8hs2 = this.LJLJJLL;
        o.LJI(c8hs2);
        if (c8hs2.getBasicItemCount() == 0) {
            Ll();
        }
    }

    @Override // X.C8ZK
    public final void onPageSelected(int i) {
        if (this.LJLJLJ) {
            LLLZI();
        }
        Kl();
    }

    @Override // X.InterfaceC223218pR
    public void J5(List<T> list, boolean z) {
        if (isViewValid()) {
            C8HS<T> c8hs = this.LJLJJLL;
            o.LJI(c8hs);
            c8hs.resetLoadMoreState();
            C8HS<T> c8hs2 = this.LJLJJLL;
            o.LJI(c8hs2);
            c8hs2.setShowFooter(true);
            C8HS<T> c8hs3 = this.LJLJJLL;
            o.LJI(c8hs3);
            c8hs3.setData(list);
            this.LJLJLLL = z;
            C73305Spp c73305Spp = this.LJLJJL;
            o.LJI(c73305Spp);
            c73305Spp.setVisibility(4);
            RecyclerView recyclerView = this.LJLJJI;
            o.LJI(recyclerView);
            if (recyclerView.getVisibility() == 4) {
                RecyclerView recyclerView2 = this.LJLJJI;
                o.LJI(recyclerView2);
                recyclerView2.setVisibility(0);
            }
            A8(z);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<T> list, boolean z) {
        if (isViewValid()) {
            C8HS<T> c8hs = this.LJLJJLL;
            o.LJI(c8hs);
            c8hs.resetLoadMoreState();
            C8HS<T> c8hs2 = this.LJLJJLL;
            o.LJI(c8hs2);
            c8hs2.setDataAfterLoadMore(list);
            C73305Spp c73305Spp = this.LJLJJL;
            o.LJI(c73305Spp);
            c73305Spp.setVisibility(4);
            RecyclerView recyclerView = this.LJLJJI;
            o.LJI(recyclerView);
            if (recyclerView.getVisibility() == 4) {
                RecyclerView recyclerView2 = this.LJLJJI;
                o.LJI(recyclerView2);
                recyclerView2.setVisibility(0);
            }
            this.LJLJLLL = z;
            A8(z);
        }
    }

    @Override // X.InterfaceC51033K1d
    public final void onItemInserted(List<T> list, int i) {
        if (!isViewValid() || C79004UzY.LJJIFFI(list)) {
            return;
        }
        C8HS<T> c8hs = this.LJLJJLL;
        o.LJI(c8hs);
        if (c8hs.getBasicItemCount() == 0) {
            C8HS<T> c8hs2 = this.LJLJJLL;
            o.LJI(c8hs2);
            c8hs2.setData(C65777Prh.LIZIZ(list));
            return;
        }
        C8HS<T> c8hs3 = this.LJLJJLL;
        o.LJI(c8hs3);
        c8hs3.notifyItemInserted(i);
        RecyclerView recyclerView = this.LJLJJI;
        if (recyclerView == null) {
            return;
        }
        o.LJI(recyclerView);
        recyclerView.post(new ARunnableS39S0100000_3(this, 49));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        initView(view);
        Jl();
        C51031K1b<AbstractC51036K1g<T, D>> c51031K1b = new C51031K1b<>();
        this.LJLL = c51031K1b;
        c51031K1b.LJJI(this);
        C51031K1b<AbstractC51036K1g<T, D>> c51031K1b2 = this.LJLL;
        o.LJI(c51031K1b2);
        c51031K1b2.LJJIII(this);
        Hl();
        if (this.LJLIL) {
            LLLZI();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.v2, viewGroup, false);
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

    @Override // X.C8ZK
    public final void u7(InterfaceC57784Mm4 interfaceC57784Mm4, Lifecycle.State state, List<? extends Object> list) {
        C186627Uc.LIZ(interfaceC57784Mm4, state, list);
    }
}
