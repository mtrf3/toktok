package com.ugc.effectcreator.foundation.bottomdrawerviewpager;

import X.C03880Dg;
import X.C65300Pk0;
import X.InterfaceC36571c5;
import X.InterfaceC93952aZA;
import X.InterfaceC93955aZD;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class BottomDrawerFragment extends Fragment {
    public InterfaceC93955aZD LJLIL;

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final boolean vl() {
        InterfaceC93955aZD interfaceC93955aZD = this.LJLIL;
        if (interfaceC93955aZD != null) {
            return interfaceC93955aZD.goBack();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "6655146459811955797");
        if (c03880Dg.LIZJ(10501, "com/ugc/effectcreator/foundation/bottomdrawerviewpager/BottomDrawerFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ugc/effectcreator/foundation/bottomdrawerviewpager/BottomDrawerFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            onPause();
        } else {
            onResume();
        }
        c03880Dg.LIZIZ(10501, "com/ugc/effectcreator/foundation/bottomdrawerviewpager/BottomDrawerFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC36571c5 parentFragment = getParentFragment();
        InterfaceC93955aZD interfaceC93955aZD = null;
        if (!(parentFragment instanceof InterfaceC93952aZA)) {
            parentFragment = null;
        }
        InterfaceC93952aZA interfaceC93952aZA = (InterfaceC93952aZA) parentFragment;
        if (interfaceC93952aZA != null) {
            interfaceC93955aZD = interfaceC93952aZA.r5();
        }
        this.LJLIL = interfaceC93955aZD;
    }
}
