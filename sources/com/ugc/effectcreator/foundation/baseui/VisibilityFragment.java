package com.ugc.effectcreator.foundation.baseui;

import X.C03880Dg;
import X.C65300Pk0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class VisibilityFragment extends Fragment {
    public boolean LJLIL;
    public boolean LJLILLLLZI = true;

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void vl() {
        if (this.LJLIL) {
            this.LJLIL = false;
            FragmentManager childFragmentManager = getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            List<Fragment> LJJJJLI = childFragmentManager.LJJJJLI();
            o.LJIIIIZZ(LJJJJLI, "childFragmentManager.fragments");
            for (Fragment fragment : LJJJJLI) {
                if (fragment instanceof VisibilityFragment) {
                    ((VisibilityFragment) fragment).vl();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        vl();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        wl();
    }

    public final void wl() {
        Fragment parentFragment = getParentFragment();
        if ((parentFragment == null || !(parentFragment instanceof VisibilityFragment) || ((VisibilityFragment) parentFragment).LJLIL) && isResumed() && !isHidden() && getUserVisibleHint() && !this.LJLIL) {
            this.LJLIL = true;
            if (this.LJLILLLLZI) {
                this.LJLILLLLZI = false;
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            List<Fragment> LJJJJLI = childFragmentManager.LJJJJLI();
            o.LJIIIIZZ(LJJJJLI, "childFragmentManager.fragments");
            for (Fragment fragment : LJJJJLI) {
                if (fragment instanceof VisibilityFragment) {
                    ((VisibilityFragment) fragment).wl();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "1217987769598818704");
        if (c03880Dg.LIZJ(10501, "com/ugc/effectcreator/foundation/baseui/VisibilityFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ugc/effectcreator/foundation/baseui/VisibilityFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            vl();
        } else {
            wl();
        }
        c03880Dg.LIZIZ(10501, "com/ugc/effectcreator/foundation/baseui/VisibilityFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "1217987769598818704");
        if (c03880Dg.LIZJ(10502, "com/ugc/effectcreator/foundation/baseui/VisibilityFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ugc/effectcreator/foundation/baseui/VisibilityFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            wl();
        } else {
            vl();
        }
        c03880Dg.LIZIZ(10502, "com/ugc/effectcreator/foundation/baseui/VisibilityFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }
}
