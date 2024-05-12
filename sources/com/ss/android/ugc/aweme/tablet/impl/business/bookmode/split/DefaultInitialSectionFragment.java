package com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split;

import X.C73305Spp;
import X.C73306Spq;
import X.GHW;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class DefaultInitialSectionFragment extends DefaultSectionFragment {
    public static final GHW LJLJJLL = new GHW();
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DefaultSectionFragment, X.InterfaceC81204Vtw
    public final String F6() {
        return "default_initial_section";
    }

    @Override // com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DefaultSectionFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJL;
        Integer valueOf = Integer.valueOf(R.id.kf_);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.kf_)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DefaultSectionFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setStatus(new C73306Spq());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
    }
}
