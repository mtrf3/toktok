package com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split;

import X.C73305Spp;
import X.C73306Spq;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DefaultNonSupportSectionFragment extends DefaultSectionFragment {
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DefaultSectionFragment, X.InterfaceC81204Vtw
    public final String F6() {
        return "default_non_support_section";
    }

    @Override // com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DefaultSectionFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DefaultSectionFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(R.id.kf_));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (view = view2.findViewById(R.id.kf_)) != null) {
                linkedHashMap.put(Integer.valueOf(R.id.kf_), view);
            } else {
                view = null;
            }
        }
        C73306Spq c73306Spq = new C73306Spq();
        String string = getString(R.string.t6s);
        o.LJIIIIZZ(string, "getString(R.string.tv_ta…nt_empty_body_horizontal)");
        c73306Spq.LJI = string;
        ((C73305Spp) view).setStatus(c73306Spq);
    }
}
