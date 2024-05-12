package com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment;

import X.C03880Dg;
import X.C07670Rv;
import X.C16880lQ;
import X.C49133JQb;
import X.C65300Pk0;
import X.InterfaceC50189Jmr;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.SearchResultStayHelper;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class SearchVisibilityDetectFragment extends AbsSearchBaseFragment implements View.OnAttachStateChangeListener {
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final ArrayList<InterfaceC50189Jmr> LJLJLJ = new ArrayList<>();

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        Hl(false);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.LJLJJLL = false;
        Hl(false);
        if (getUserVisibleHint()) {
            SearchResultStayHelper.Companion.LIZ(this).LIZ();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.LJLJJLL = true;
        Hl(true);
        SearchResultStayHelper LIZ = SearchResultStayHelper.Companion.LIZ(this);
        C49133JQb.LIZ("SRSH", new Object[0]);
        LIZ.LIZ = System.currentTimeMillis();
    }

    private final void Hl(boolean z) {
        boolean z2;
        if (z == this.LJLJL) {
            return;
        }
        boolean z3 = this.LJLJJLL;
        boolean isVisible = isVisible();
        boolean userVisibleHint = getUserVisibleHint();
        if (z3 && isVisible && userVisibleHint) {
            z2 = true;
        } else {
            z2 = false;
        }
        o.LJIIIIZZ(C16880lQ.LLLZ("==> checkVisibility = %s  ( parent = %s, super = %s, hint = %s )", Arrays.copyOf(new Object[]{Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(isVisible), Boolean.valueOf(userVisibleHint)}, 4)), "format(format, *args)");
        if (z2 != this.LJLJL) {
            this.LJLJL = z2;
            C07670Rv.LIZLLL("==> onVisibilityChanged = ", z2);
            Iterator<InterfaceC50189Jmr> it = this.LJLJLJ.iterator();
            while (it.hasNext()) {
                it.next().LIZ(z2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        Hl(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-3501385857473770428");
        if (c03880Dg.LIZJ(10501, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/SearchVisibilityDetectFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/SearchVisibilityDetectFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        Hl(!z);
        c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/SearchVisibilityDetectFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        Hl(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        v.removeOnAttachStateChangeListener(this);
        Hl(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        boolean z2 = true;
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-3501385857473770428");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/SearchVisibilityDetectFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/SearchVisibilityDetectFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (z == getUserVisibleHint()) {
            z2 = false;
        }
        super.setUserVisibleHint(z);
        Hl(z);
        if (!z2) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/SearchVisibilityDetectFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
            return;
        }
        if (z) {
            SearchResultStayHelper LIZ = SearchResultStayHelper.Companion.LIZ(this);
            C49133JQb.LIZ("SRSH", new Object[0]);
            LIZ.LIZ = System.currentTimeMillis();
        } else {
            SearchResultStayHelper.Companion.LIZ(this).LIZ();
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/SearchVisibilityDetectFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        view.addOnAttachStateChangeListener(this);
    }
}
