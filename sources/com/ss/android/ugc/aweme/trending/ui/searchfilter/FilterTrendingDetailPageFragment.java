package com.ss.android.ugc.aweme.trending.ui.searchfilter;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C5H3;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC51657KPd;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.trending.ui.TrendingDetailPageFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FilterTrendingDetailPageFragment extends TrendingDetailPageFragment {
    public Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final C5H3 LJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 346));

    @Override // com.ss.android.ugc.aweme.trending.ui.TrendingDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLLLL.clear();
    }

    @Override // com.ss.android.ugc.aweme.trending.ui.TrendingDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.trending.ui.TrendingDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return lm(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.trending.ui.TrendingDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.trending.ui.TrendingDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public DetailPageComponent Gl() {
        return new FilterTrendingDetailComponent();
    }

    @Override // com.ss.android.ugc.aweme.trending.ui.TrendingDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public DetailFragmentPanel Hl() {
        return new FilterTrendingDetailFragmentPanel(this, this.LJLJJI);
    }

    public final InterfaceC51657KPd mm() {
        return (InterfaceC51657KPd) this.LJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.trending.ui.TrendingDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment
    public void Pl() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "SCENE_DETAIL_TRENDING_FILTER");
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public boolean vl() {
        InterfaceC51657KPd mm = mm();
        if (mm != null && mm.LIZLLL()) {
            return true;
        }
        return super.vl();
    }

    @Override // com.ss.android.ugc.aweme.trending.ui.TrendingDetailPageFragment, com.ss.android.ugc.aweme.detail.ui.DetailPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC51657KPd mm = mm();
        if (mm != null) {
            mm.LIZIZ(view);
        }
    }

    public View km(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LJFF;
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        InterfaceC51657KPd mm = mm();
        if (mm == null || (LJFF = mm.LJFF(inflater, onCreateView)) == null) {
            return onCreateView;
        }
        return LJFF;
    }

    public static View lm(FilterTrendingDetailPageFragment filterTrendingDetailPageFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View km = filterTrendingDetailPageFragment.km(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(km instanceof View)) {
            km = null;
        }
        if (km != null) {
            try {
                ViewTreeLifecycleOwner.set(km, filterTrendingDetailPageFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(km, filterTrendingDetailPageFragment);
                C10A.LIZIZ(km, filterTrendingDetailPageFragment);
                ActivityC45651qj mo49getActivity = filterTrendingDetailPageFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return km;
    }
}
