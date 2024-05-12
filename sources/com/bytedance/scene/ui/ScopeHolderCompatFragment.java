package com.bytedance.scene.ui;

import X.C1B3;
import X.C78685UuP;
import X.InterfaceC78896Uxo;
import X.V8O;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.a1;

/* loaded from: classes8.dex */
public class ScopeHolderCompatFragment extends Fragment implements InterfaceC78896Uxo {
    public final V8O LJLIL = V8O.LJ.Xk();

    @Override // X.InterfaceC78896Uxo
    public final V8O Xk() {
        return this.LJLIL;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public static ScopeHolderCompatFragment vl(Fragment fragment, boolean z, boolean z2) {
        String LJ = a1.LJ("LifeCycleCompatFragment", "_", "ScopeHolderCompatFragment");
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        ScopeHolderCompatFragment scopeHolderCompatFragment = (ScopeHolderCompatFragment) childFragmentManager.LJJJIL(LJ);
        if (scopeHolderCompatFragment != null) {
            if (z) {
                C1B3 c1b3 = new C1B3(childFragmentManager);
                c1b3.LJJI(scopeHolderCompatFragment);
                C78685UuP.LJIIIZ(c1b3, z2);
            } else {
                return scopeHolderCompatFragment;
            }
        }
        ScopeHolderCompatFragment scopeHolderCompatFragment2 = new ScopeHolderCompatFragment();
        C1B3 c1b32 = new C1B3(childFragmentManager);
        c1b32.LJIIIIZZ(0, 1, scopeHolderCompatFragment2, LJ);
        C78685UuP.LJIIIZ(c1b32, z2);
        return scopeHolderCompatFragment2;
    }
}
