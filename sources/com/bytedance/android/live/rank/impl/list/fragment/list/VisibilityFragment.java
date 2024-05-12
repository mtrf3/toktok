package com.bytedance.android.live.rank.impl.list.fragment.list;

import X.C03880Dg;
import X.C65300Pk0;
import X.C73318Sq2;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class VisibilityFragment extends Fragment {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public boolean LJLILLLLZI = true;

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    public void wl(boolean z) {
    }

    public final boolean vl() {
        if (this.LJLILLLLZI && getUserVisibleHint()) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLIL.LIZLLL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (vl()) {
            wl(false);
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (vl()) {
            wl(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        boolean z2 = true;
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "388918600017431304");
        if (c03880Dg.LIZJ(10502, "com/bytedance/android/live/rank/impl/list/fragment/list/VisibilityFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/bytedance/android/live/rank/impl/list/fragment/list/VisibilityFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (z == getUserVisibleHint()) {
            z2 = false;
        }
        super.setUserVisibleHint(z);
        if (isResumed() && z2 && this.LJLILLLLZI) {
            wl(getUserVisibleHint());
        }
        c03880Dg.LIZIZ(10502, "com/bytedance/android/live/rank/impl/list/fragment/list/VisibilityFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
    }
}
