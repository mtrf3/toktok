package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C184077Kh;
import X.C213688a4;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C50947Jz5;
import X.C50948Jz6;
import X.C51420KGa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C78926UyI;
import X.C8DP;
import X.C8YN;
import X.C90903hW;
import X.KGR;
import X.KGT;
import X.KGU;
import X.KGV;
import X.KGW;
import X.KGY;
import X.KMR;
import X.KRC;
import X.TBT;
import X.Z9N;
import Y.IDrS47S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchResultFragment extends FFPBaseFragment {
    public KGR LJLJJI;
    public SearchKeywordPresenter LJLJJL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 99));
    public final int LJLJJLL = -1;

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Hl() {
        C8YN.LJII(this, (AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.KGX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C227438wF) obj).LJLJI;
            }
        }, C213688a4.LIZJ(), new AqS190S0100000_8(this, 12), 4);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int getLayoutRes() {
        return this.LJLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Gl(View view) {
        o.LJIIIZ(view, "view");
        if (!(view instanceof KGR)) {
            return;
        }
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        SearchKeywordPresenter searchKeywordPresenter = new SearchKeywordPresenter(requireActivity);
        KGR kgr = (KGR) view;
        KGW kgw = new KGW(requireActivity, kgr);
        if (!kgr.LJLJJL) {
            boolean z = true;
            kgr.LJLJJL = true;
            kgr.LJLJJI = requireActivity;
            kgr.LJLIL = searchKeywordPresenter;
            Z9N z9n = Z9N.LIZIZ;
            KGV LLLLLLLLL = z9n.LLLLLLLLL();
            kgr.LJLILLLLZI = LLLLLLLLL;
            if (LLLLLLLLL != null) {
                LLLLLLLLL.LJIILIIL(kgr);
                KGV kgv = kgr.LJLILLLLZI;
                if (kgv != null) {
                    kgv.LJIJ("find_friends_page");
                    C51420KGa c51420KGa = C51420KGa.LJLIL;
                    if (((FindFriendsPageVM) new C214378bB(C65352Pkq.LIZ(FindFriendsPageVM.class), c51420KGa, C214528bQ.LJLIL, C78926UyI.LJJII(requireActivity, false), C184077Kh.LJLIL, KGY.INSTANCE, null, null).getValue()).kv0().getPageStyle() != KMR.TT_NOW) {
                        z = false;
                    }
                    SearchResultParam searchResultParam = new SearchResultParam();
                    if (z) {
                        if (searchResultParam.getSearchEnterParam() == null) {
                            C50947Jz5 newBuilder = C50948Jz6.Companion.newBuilder();
                            newBuilder.LIZLLL = "now_find_friends_search";
                            searchResultParam.setSearchEnterParam(newBuilder.LIZIZ());
                        } else {
                            searchResultParam.getSearchEnterParam().setSourcePage("now_find_friends_search");
                        }
                    }
                    KGT LLFFF = z9n.LIZ.LLFFF(searchResultParam, searchKeywordPresenter, new KRC(searchKeywordPresenter, kgr, z));
                    kgr.LJLJI = LLFFF;
                    if (LLFFF != null) {
                        LLFFF.setLoadMoreListener(new KGU(kgr, searchKeywordPresenter));
                        KGT kgt = kgr.LJLJI;
                        if (kgt != null) {
                            kgt.setLoadEmptyTextColor(Integer.valueOf(kgr.getResources().getColor(R.color.cu)));
                            KGT kgt2 = kgr.LJLJI;
                            if (kgt2 != null) {
                                kgt2.setLoadEmptyText(kgr.getResources().getString(R.string.qdk));
                                C8DP.LIZ(6, (RecyclerView) kgr.LIZ(R.id.jgc));
                                RecyclerView recyclerView = (RecyclerView) kgr.LIZ(R.id.jgc);
                                kgr.getContext();
                                recyclerView.setLayoutManager(new WrapLinearLayoutManager());
                                RecyclerView recyclerView2 = (RecyclerView) kgr.LIZ(R.id.jgc);
                                Object obj = kgr.LJLJI;
                                if (obj != null) {
                                    recyclerView2.setAdapter((AbstractC029409q) obj);
                                    ((RecyclerView) kgr.LIZ(R.id.jgc)).LJIIJJI(new IDrS47S0100000_8(kgw, 13));
                                } else {
                                    o.LJIJI("searchUserAdapter");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("searchUserAdapter");
                                throw null;
                            }
                        } else {
                            o.LJIJI("searchUserAdapter");
                            throw null;
                        }
                    } else {
                        o.LJIJI("searchUserAdapter");
                        throw null;
                    }
                } else {
                    o.LJIJI("searchUserPresenter");
                    throw null;
                }
            } else {
                o.LJIJI("searchUserPresenter");
                throw null;
            }
        }
        ViewGroup.LayoutParams layoutParams = kgr.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            kgr.setLayoutParams(layoutParams);
            this.LJLJJI = kgr;
            this.LJLJJL = searchKeywordPresenter;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        KGR kgr;
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        if (vl().kv0().getDarkMode()) {
            kgr = new KGR(new ContextThemeWrapper(inflater.getContext(), R.style.uw));
        } else {
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            kgr = new KGR(requireContext);
        }
        try {
            ViewTreeLifecycleOwner.set(kgr, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(kgr, this);
            C10A.LIZIZ(kgr, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return kgr;
    }
}
