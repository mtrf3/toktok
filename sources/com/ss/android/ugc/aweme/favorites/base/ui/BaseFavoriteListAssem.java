package com.ss.android.ugc.aweme.favorites.base.ui;

import X.C57939MoZ;
import X.C72808Sho;
import X.C7VK;
import X.C8YN;
import X.InterfaceC208718Hb;
import X.InterfaceC57784Mm4;
import X.SYL;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseFavoriteListAssem<S extends InterfaceC208718Hb<S, ITEM>, ITEM extends InterfaceC57784Mm4, CURSOR> extends BaseFavoritePageAssem {
    public SYL LJLJL;
    public Boolean LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public boolean LJLJLJ = true;

    public abstract AssemListViewModel<S, ITEM, CURSOR> H3();

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final SYL F3() {
        SYL syl = this.LJLJL;
        if (syl != null) {
            return syl;
        }
        o.LJIJI("list");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final void C3() {
        H3().manualListRefresh();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final void E3() {
        H3().manualListRefresh();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BasicFavoritePageAbilities
    public final SYL VN() {
        return F3();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem, com.ss.android.ugc.aweme.favorites.base.ui.VisibilityAware
    public final void LLLFZ(boolean z) {
        if (((Boolean) this.LJLILLLLZI.getValue()).booleanValue()) {
            H3().manualListRefresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL syl = new SYL(view.getContext(), null);
        syl.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        this.LJLJL = syl;
        ViewGroup fav_page_container = (ViewGroup) _$_findCachedViewById(R.id.d54);
        o.LJIIIIZZ(fav_page_container, "fav_page_container");
        fav_page_container.addView(F3());
        SYL F3 = F3();
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = !((Boolean) this.LJLILLLLZI.getValue()).booleanValue();
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZJ = DefaultFavoriteLoadingFooterCell.class;
        F3.setListConfig(c57939MoZ);
        AssemListViewModel<S, ITEM, CURSOR> H3 = H3();
        C72808Sho<InterfaceC57784Mm4> state = F3().getState();
        o.LJIIIIZZ(state, "list.state");
        H3.setListState(state);
        F3().LJLJLLL(H3().getConfig());
        AssemListViewModel<S, ITEM, CURSOR> H32 = H3();
        o.LJII(H32, "null cannot be cast to non-null type com.bytedance.assem.arch.viewModel.AssemViewModel<com.bytedance.ext_power_list.IAssemListVMState<S of com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem, ITEM of com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem>>");
        AssemViewModel.asyncSubscribe$default(H32, new TBT() { // from class: X.7VJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((InterfaceC2064888m) obj).getRefreshState();
            }
        }, null, new AqS169S0100000_3(this, (BaseFavoriteListAssem<InterfaceC208718Hb<Object, Object>, InterfaceC57784Mm4, Object>) 621), C7VK.LJLIL, new AqS134S0200000_3(this, H32, 183), 2, null);
        AssemListViewModel<S, ITEM, CURSOR> H33 = H3();
        o.LJII(H33, "null cannot be cast to non-null type com.bytedance.assem.arch.viewModel.AssemViewModel<com.bytedance.ext_power_list.IAssemListVMState<S of com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem, ITEM of com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoriteListAssem>>");
        C8YN.LJII(this, H33, new TBT() { // from class: X.7VF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((InterfaceC2064788l) obj).getListState();
            }
        }, null, new AqS185S0100000_3((BaseFavoriteListAssem) this, (BaseFavoriteListAssem<InterfaceC208718Hb<Object, Object>, InterfaceC57784Mm4, Object>) 141), 6);
        F3().setVisibility(8);
        F3().setLifecycleOwner(this);
        A3().setVisibility(8);
    }
}
