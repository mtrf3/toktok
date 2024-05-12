package com.ss.android.ugc.aweme.nows.feed.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184587Mg;
import X.C184597Mh;
import X.C184607Mi;
import X.C221108m2;
import X.C26338AVi;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C5H3;
import X.C62822Ol8;
import X.C62826OlC;
import X.C76800UCe;
import X.C7MY;
import X.C8VV;
import X.C90903hW;
import X.InterfaceC61213O0r;
import X.O6R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.router.arg.RouteArgExtension;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class NowDistributionFeedListFragment extends SocialNowsBaseDetailFragment {
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    public NowDistributionFeedListFragment() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLJJI = routeArgExtension.optionalArg(this, C184607Mi.LJLIL, "insert_user_ids", List.class);
        this.LJLJJL = routeArgExtension.optionalArg(this, C184597Mh.LJLIL, "enter_position", String.class);
        this.LJLJJLL = routeArgExtension.optionalArg(this, C184587Mg.LJLIL, "enter_from", String.class);
        this.LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 593));
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C62826OlC c62826OlC = (C62826OlC) this.LJLJL.getValue();
        if (c62826OlC != null) {
            c62826OlC.LIZLLL();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        SocialNowsDetailFragment.LJLLJ = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        SocialNowsDetailFragment.LJLLJ = true;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment
    public final void vl(View view) {
        C26338AVi.LJIIIZ(view, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(50))), null, null, 29);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 312));
        C62826OlC c62826OlC = (C62826OlC) this.LJLJL.getValue();
        if (c62826OlC != null) {
            c62826OlC.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.SocialNowsBaseDetailFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (onCreateView != null) {
            viewGroup2 = (ViewGroup) onCreateView.findViewById(R.id.c92);
        } else {
            viewGroup2 = null;
        }
        if (viewGroup2 != null) {
            C16880lQ.LLLLIILL(inflater, R.layout.bxk, viewGroup2, true);
        }
        if (viewGroup2 != null) {
            layoutParams = viewGroup2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = C7MY.LIZIZ(0);
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.rightMargin = C7MY.LIZIZ(0);
        }
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(marginLayoutParams);
        }
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
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
        return onCreateView;
    }
}
