package com.ss.android.ugc.aweme.explore.ui;

import X.C61447O9r;
import X.C63081OpJ;
import X.C7MY;
import X.C8YN;
import X.FT5;
import X.TBT;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ExploreXTabFeedFragment extends BaseExploreFeedFragment {
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Gz() {
    }

    @Override // com.ss.android.ugc.aweme.explore.ui.BaseExploreFeedFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.explore.ui.BaseExploreFeedFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLILLLL;
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

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, X.InterfaceC91174ZqM
    public final String getEnterFrom() {
        return "homepage_explore";
    }

    @Override // com.ss.android.ugc.aweme.explore.ui.BaseExploreFeedFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.explore.ui.BaseExploreFeedFragment
    public final void initView(View view) {
        int LIZIZ;
        View findViewById;
        o.LJIIIZ(view, "view");
        super.initView(view);
        View view2 = this.LJLJLLL;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            View view3 = this.LJLJLLL;
            if (view3 != null) {
                Context context = view3.getContext();
                o.LJIIIIZZ(context, "vwTopSpace.context");
                int LJJJJLI = C63081OpJ.LJJJJLI(context);
                Activity LIZ = FT5.LIZ(view, "view.context");
                if (LIZ != null && (findViewById = LIZ.findViewById(R.id.j5x)) != null) {
                    LIZIZ = findViewById.getMeasuredHeight();
                } else {
                    LIZIZ = C7MY.LIZIZ(58);
                }
                layoutParams.height = LJJJJLI + LIZIZ;
                View view4 = this.LJLL;
                if (view4 != null) {
                    view4.getLayoutParams().height = C61447O9r.LJIILJJIL;
                    C8YN.LJII(this, Gl(), new TBT() { // from class: X.8DE
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            C8AS c8as = (C8AS) obj;
                            c8as.getClass();
                            return C208708Ha.LIZLLL(c8as);
                        }
                    }, null, new AqS185S0100000_3(this, 44), 6);
                    return;
                } else {
                    o.LJIJI("vwBottomSpace");
                    throw null;
                }
            }
            o.LJIJI("vwTopSpace");
            throw null;
        }
        o.LJIJI("vwTopSpace");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean ub(boolean z) {
        String str;
        ExploreFeedListViewModel Gl = Gl();
        if (z) {
            str = "click_button_icon";
        } else {
            str = "click_top_icon";
        }
        Gl.hv0(str);
        return true;
    }
}
